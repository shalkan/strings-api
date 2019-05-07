package com.example.api;


import com.example.api.InverseApi;
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
public class InverseApiControllerIntegrationTest {

    @Autowired
    private InverseApi api;

    @Test
    public void inverseTest() throws Exception {
        String inputString = "inputString_example";
        ResponseEntity<String> responseEntity = api.inverse(inputString);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }
}
