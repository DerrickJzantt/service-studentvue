package com.service.studentvueservice.controlers;

import com.service.studentvueservice.models.FamilyNameModel;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class FamilyNameController {
    @RequestMapping(value="/allnames", method= RequestMethod.GET)
    public List<FamilyNameModel> getAllFamilyNames() {
        return Arrays.asList(
                new FamilyNameModel(1, "Judy", "Johnson - Backend"),
                new FamilyNameModel(2, "Kenneth", "Smith - Backend"),
                new FamilyNameModel(3, "Derrick", "Zantt - Backend"),
                new FamilyNameModel(4, "Mohamed", "Kings - Backend"),
                new FamilyNameModel(5, "Kincade", "Burroughs - Backend"),
                new FamilyNameModel(6, "Dan", "Daniels - Backend")
        );
    }

    @GetMapping("/hello")
    public String HelloWorld(){
        return "Hello Computeresdrga";
    }

}