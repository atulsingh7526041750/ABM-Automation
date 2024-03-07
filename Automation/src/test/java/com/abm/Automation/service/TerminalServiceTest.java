package com.abm.Automation.service;

import com.abm.Automation.entity.Terminal;
import com.abm.Automation.repository.TerminalRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TerminalServiceTest {

    @Mock
    private TerminalRepository terminalRepository;

    @InjectMocks
    private TerminalService terminalService;

    @Test
    void testGetAllTerminals() {
        // Arrange
        List<Terminal> expectedTerminals = Arrays.asList(
                new Terminal(1L, "Bank 1", new Date(), "Retail", "PoS Terminal", 100, 200, 300, 400, 500)
                // Add more terminals as needed
        );
        when(terminalRepository.findAll()).thenReturn(expectedTerminals);

        // Act
        List<Terminal> actualTerminals = terminalService.getAllTerminals();

        // Assert
        assertEquals(expectedTerminals.size(), actualTerminals.size());
        // Add more assertions as needed
    }


//    @Test
//    void testGetTerminalByIdNotFound() {
//        // Arrange
//        Long terminalId = 3L;
//        when(terminalRepository.findById(terminalId)).thenReturn(Optional.empty());
//
//        // Act
//        Optional<Terminal> actualTerminalOptional = terminalService.getTerminalById(terminalId);
//
//        // Assert
//        assertFalse(actualTerminalOptional.isPresent());
//    }

    // Add more test methods for other service methods
}
