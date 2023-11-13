package com.service.studentvueservice.controlers;

import com.service.studentvueservice.models.GradeBookModel;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class GradeBookController {
    @GetMapping(value="/gradebook")
    public List<GradeBookModel> getGradebooklist() {
        return Arrays.asList(
                new GradeBookModel(1, "A-", "spanish- Backend", "Mr.benjamin"),
                new GradeBookModel(2, "A", "Food science - Backend", "Chef Ramsey"),
                new GradeBookModel(3, "A+", "Comp sci - Backend","Ms.ratisha"),
                new GradeBookModel(4, "B", "science- Backend", "Mr.johnson"),
                new GradeBookModel(5, "F-", "Philosophy - Backend", "Mr.Kincade"),
                new GradeBookModel(6, "A+", "lunch-Backend",  "Lunchlady")
        );
    }



}