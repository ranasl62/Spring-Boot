package bd.ac.seu.aj.springbootdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Name {
    String firstName;
    String middleName;
    String lastName;
}
