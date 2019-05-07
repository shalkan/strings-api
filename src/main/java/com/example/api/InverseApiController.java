package com.example.api;

import com.example.service.StringsService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-07T18:00:46.030Z[GMT]")
@Controller
public class InverseApiController implements InverseApi {


    @Autowired
    private StringsService stringsService;
    private static final Logger log = LoggerFactory.getLogger(InverseApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public InverseApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<String> inverse(@NotNull @ApiParam(value = "input string to inverse", required = true) @Valid @RequestParam(value = "inputString", required = true) String inputString) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<String>(stringsService.inverseString(inputString), HttpStatus.OK);
    }

}
