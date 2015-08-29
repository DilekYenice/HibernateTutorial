package example_1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Personel {
    int emp_Id;
    String emp_Name;
    String emp_Surname;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    public int getEmp_Id() {
        return emp_Id;
    }

    public void setEmp_Id(int emp_Id) {
        this.emp_Id = emp_Id;
    }

    public String getEmp_Name() {
        return emp_Name;
    }

    public void setEmp_Name(String emp_Name) {
        this.emp_Name = emp_Name;
    }

    public String getEmp_Surname() {
        return emp_Surname;
    }

    public void setEmp_Surname(String emp_Surname) {
        this.emp_Surname = emp_Surname;
    }
}
