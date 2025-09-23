package com.tnsif.PlacementManagement_College;
import com.tnsif.placement.entity.College;
import com.tnsif.placement.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/college")

public class CollegeController {

	    @Autowired
	    private CollegeService collegeService;

	    // CREATE
	    @PostMapping
	    public College addCollege(@RequestBody College college) {
	        return collegeService.saveCollege(college);
	    }

	    // READ ALL
	    @GetMapping
	    public List<College> getAllColleges() {
	        return collegeService.getAllColleges();
	    }

	    // READ BY ID
	    @GetMapping("/{id}")
	    public College getCollegeById(@PathVariable Long id) {
	        return collegeService.getCollegeById(id);
	    }

	    // UPDATE
	    @PutMapping("/{id}")
	    public ResponseEntity<College> updateCollege(@PathVariable Long id, @RequestBody College newCollege) {
	        College updatedCollege = collegeService.updateCollege(id, newCollege);
	        if (updatedCollege != null) {
	            return ResponseEntity.ok(updatedCollege);
	        } else {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    // DELETE
	    @DeleteMapping("/{id}")
	    public String deleteCollege(@PathVariable Long id) { 
	        collegeService.deleteCollege(id);
	        return "College with id " + id + " deleted successfully!";
	    }

}
