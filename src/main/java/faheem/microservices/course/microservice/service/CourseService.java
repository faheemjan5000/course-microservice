package faheem.microservices.course.microservice.service;

import faheem.microservices.course.microservice.model.Course;
import faheem.microservices.course.microservice.repository.CourseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course addCourse(Course course){
        return courseRepository.save(course);
    }

    public Course getCourseById(Integer courseId) throws Exception {
        Optional<Course> optionalCourse = courseRepository.findById(courseId);
        if(optionalCourse.isPresent()){
            log.info("course with id : "+courseId+" found!");
            return optionalCourse.get();
        }
        else{
            log.error("course with id : "+courseId+" not found!");
            throw new Exception("Course not found Exception!");
        }
    }

    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }
}
