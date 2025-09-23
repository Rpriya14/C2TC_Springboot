package com.tnsif.PlacementManagement_College;
import com.tnsif.placement.entity.College;
import com.tnsif.placement.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CollegeService 
{
	
	

	    @Autowired
	    private CollegeRepository collegeRepository;

	    public College saveCollege(College college) {
	        return collegeRepository.save(college);
	    }

	    public List<College> getAllColleges() {
	        return collegeRepository.findAll();
	    }

	    public College getCollegeById(Long id) {
	        return collegeRepository.findById(id).orElse(null);
	    }

	    public College updateCollege(Long id, College newCollege) {
	        return collegeRepository.findById(id).map(existingCollege -> {
	            existingCollege.setName(newCollege.getName());
	            existingCollege.setLocation(newCollege.getLocation());
	            return collegeRepository.save(existingCollege);
	        }).orElse(null);
	    }

	    public void deleteCollege(Long id) {
	        collegeRepository.deleteById(id);
	    }

}
