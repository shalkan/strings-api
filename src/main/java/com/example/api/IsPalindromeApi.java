/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.7).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.example.api;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-07T18:00:46.030Z[GMT]")
@Api(value = "is-palindrome", description = "the is-palindrome API")
public interface IsPalindromeApi {

    @ApiOperation(value = "check for being palindrome", nickname = "isPalindrom", notes = "Checks is input string is palindrome ", response = Boolean.class, tags={"main"})
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "palindrome being check result", response = Boolean.class),
        @ApiResponse(code = 400, message = "bad input parameter") })
    @RequestMapping(value = "/is-palindrome",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Boolean> isPalindrom(@NotNull @ApiParam(value = "input string to inverse", required = true) @Valid @RequestParam(value = "inputString", required = true) String inputString);

}
