package faheem.microservices.course.microservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue(generator = "sec_courseid", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sec_courseid", sequenceName = "so.sec_courseid",allocationSize=10,initialValue = 60)
    private Integer courseId;
    private String courseName;
    private String courseDescription;
}
