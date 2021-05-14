package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobTittle;

public interface JobTittleDao extends JpaRepository<JobTittle, Integer> {
	
}
