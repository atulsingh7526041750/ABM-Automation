package com.abm.Automation.service;

import com.abm.Automation.dto.TerminalDto;
import com.abm.Automation.dto.Terminalbulkdata;
import com.abm.Automation.entity.Terminal;

import java.util.List;

public interface TerminalService {
    void saveTerminalData(Terminalbulkdata terminalbulkdata);
    List<Terminal> getAllTerminals();


}
