package br.com.almirjr94.endpoint.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.almirjr94.core.model.Course;
import br.com.almirjr94.core.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseService {

	private final CourseRepository courseRepository;
	
	public Iterable<Course> list(Pageable pageable){
		log.info("Listing all course");
		return courseRepository.findAll(pageable);
	}
}
