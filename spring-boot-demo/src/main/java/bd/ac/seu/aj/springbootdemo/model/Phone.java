package bd.ac.seu.aj.springbootdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Phone {
        @Id
        @GeneratedValue
        private int id;
        private String countryCode;
        private String areaCode;
        private String number;
}
