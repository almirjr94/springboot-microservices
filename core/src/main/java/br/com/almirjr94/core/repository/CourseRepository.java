package br.com.almirjr94.core.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.almirjr94.core.model.Course;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long>{

}
