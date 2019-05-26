package br.com.almirjr94.endpoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.almirjr94.core.model.Course;
import br.com.almirjr94.endpoint.service.CourseService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("v1/admin/course")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseController {

	private final CourseService courseService;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Iterable<Course>> list(Pageable pageable){
		return ResponseEntity.ok(courseService.list(pageable));
	}
	
	
}
