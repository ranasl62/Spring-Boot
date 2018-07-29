package bd.ac.seu.aj.springbootdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="students")
public class Student {
    @Id
    private long id;
    @Enumerated
    Name name;
    private double cgpa;
    @OneToMany
    List<Phone> phoneList;
}
