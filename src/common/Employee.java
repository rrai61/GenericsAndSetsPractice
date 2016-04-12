package common;

import java.util.Objects;
import org.apache.commons.lang3.builder.CompareToBuilder;

public class Employee implements Comparable{
    private String lastName;
    private String firstName;
    private String ssn;
    private int empId;

    public Employee(int empId, String lastName, String firstName, String ssn) {
        setLastName(lastName);
        setFirstName(firstName);
        setSsn(ssn);
        setEmpId(empId);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.ssn);
        hash = 37 * hash + this.empId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.empId != other.empId) {
            return false;
        }
        if (!Objects.equals(this.ssn, other.ssn)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Employee{" + "lastName=" + lastName + ", firstName=" + firstName + ", ssn=" + ssn + ", empId=" + empId + '}';
    }

    
    
    public final String getSsn() {
        return ssn;
    }

    public final void setSsn(String ssn) {
        this.ssn = ssn;
    }


    public final String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public final String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public final int getEmpId() {
        return empId;
    }

    public final void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public int compareTo(Object o) {
        Employee other = (Employee)o;
        
        return new CompareToBuilder()
               .append(this.ssn, other.ssn)
               .toComparison();
    }


    
}
