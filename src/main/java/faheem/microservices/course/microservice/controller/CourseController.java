package faheem.microservices.course.microservice.controller;

import faheem.microservices.course.microservice.model.Course;
import faheem.microservices.course.microservice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/add")
    public Course addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }

    @GetMapping("/get/{id}")
    public Course getCourseById(@PathVariable("id") Integer courseId) throws Exception {
        return courseService.getCourseById(courseId);
    }

    @GetMapping("/all")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }
}
