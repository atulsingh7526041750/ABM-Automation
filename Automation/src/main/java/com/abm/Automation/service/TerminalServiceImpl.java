package com.abm.Automation.service;
import com.abm.Automation.dto.TerminalDto;
import com.abm.Automation.dto.Terminalbulkdata;
import com.abm.Automation.entity.Terminal;
import com.abm.Automation.repository.TerminalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TerminalServiceImpl implements TerminalService {

    @Autowired
    private TerminalRepository terminalRepository;

    @Override
    public void saveTerminalData(Terminalbulkdata terminalbulkdata) {

        List<List<String>> listString = terminalbulkdata.getEditableData();

        List<Terminal>terminalList = new ArrayList<>();


        for (List<String> stringList:listString){

            Terminal terminal = new Terminal();
            terminal.setBankName(terminalbulkdata.getBankName());
            terminal.setMonth(terminalbulkdata.getMonth());

                terminal.setCategory(stringList.get(1));
                terminal.setSubCategory(stringList.get(2));
                terminal.setRuPayAccepting(Long.valueOf(stringList.get(3)));
                terminal.setContactOnly(Long.valueOf(stringList.get((4))));
                terminal.setContactlessRuPay(Long.valueOf(stringList.get(5)));
                terminal.setOfflinePayments(Long.valueOf(stringList.get(6)));
                terminal.setInstalledBharatQR(Long.valueOf(stringList.get(7)));
                terminalList.add(terminal);
        }
        System.out.println(terminalList);
        terminalRepository.saveAll(terminalList);


    }

    @Override
    public List<Terminal> getAllTerminals() {
        return terminalRepository.findAll();
    }
}
