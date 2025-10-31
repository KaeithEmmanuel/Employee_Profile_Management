package edu.vnr.epms.employeeprofilemgmt;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EmployeeProfile {
    @Id
    private Integer employeeId;
    private String name;
    private String mobile;
    private String email;
    private String linkedinUrl;
}
