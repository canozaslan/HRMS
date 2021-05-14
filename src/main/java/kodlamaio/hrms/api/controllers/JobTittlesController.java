package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobTittleService;
import kodlamaio.hrms.entities.concretes.JobTittle;

@RestController
@RequestMapping("/api/jobtittles")
public class JobTittlesController {
	
	private JobTittleService jobTittleService;
	
	@Autowired
	public JobTittlesController(JobTittleService jobTittleService) {
		super();
		this.jobTittleService = jobTittleService;
	}

	@GetMapping("/getall")
	public List<JobTittle> getAll(){
		return this.jobTittleService.getAll();
	}
}
