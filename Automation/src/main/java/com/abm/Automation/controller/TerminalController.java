package com.abm.Automation.controller;

import com.abm.Automation.dto.Terminalbulkdata;
import com.abm.Automation.entity.Terminal;
import com.abm.Automation.service.TerminalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/terminals")
@CrossOrigin("http://localhost:3000/")
public class TerminalController {

    @Autowired
    private TerminalService terminalService;

    @PostMapping("/add")
    public ResponseEntity<String> addTerminalData(@RequestBody Terminalbulkdata terminalbulkdata)
    {
        System.out.println(terminalbulkdata);

        try {
            terminalService.saveTerminalData(terminalbulkdata);
            return ResponseEntity.ok("Data saved successfully.");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to save data.");
        }
    }

    @GetMapping("/list")
    public ResponseEntity<?> getAllTerminals() {

        try {
            List<Terminal> terminals = terminalService.getAllTerminals();
            return ResponseEntity.ok().body(terminals);

        }
        catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("unable to fetch data from database");
        }

    }
}
