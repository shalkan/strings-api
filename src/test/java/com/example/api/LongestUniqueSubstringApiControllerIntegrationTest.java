package com.example.api;


import com.example.api.LongestUniqueSubstringApi;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LongestUniqueSubstringApiControllerIntegrationTest {

    @Autowired
    private LongestUniqueSubstringApi api;

    @Test
    public void longestUniqueSubstringTest() throws Exception {
        String inputString = "inputString_example";
        ResponseEntity<String> responseEntity = api.longestUniqueSubstring(inputString);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }

}
