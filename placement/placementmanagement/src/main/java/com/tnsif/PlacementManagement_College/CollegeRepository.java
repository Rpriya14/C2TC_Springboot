package com.tnsif.PlacementManagement_College;
import com.tnsif.placement.entity.College;


import org.springframework.data.jpa.repository.JpaRepository;

	public interface CollegeRepository extends JpaRepository<College,Long>
	{
		
	}

