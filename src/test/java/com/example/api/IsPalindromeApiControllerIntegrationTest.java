package com.example.api;


import com.example.api.IsPalindromeApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IsPalindromeApiControllerIntegrationTest {

    @Autowired
    private IsPalindromeApi api;

    @Test
    public void isPalindromTestFalse() throws Exception {
        String inputString = "inputString_example";
        ResponseEntity<Boolean> responseEntity = api.isPalindrom(inputString);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertFalse(responseEntity.getBody());
    }

}
