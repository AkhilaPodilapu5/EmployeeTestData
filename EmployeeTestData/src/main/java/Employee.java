import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Employee {



    private String _id;
    private String firstname;
    private String lastname;
    private int emp_id;
    private int age;
    private String doj;

    public String getDoj() {
        return doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String gender;
    private String city;
    private String country;
    private String department;
    private String reportsto;
    private String postalcode;
    private String address;
    private String email;
    private String phonenum;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getReportsto() {
        return reportsto;
    }

    public void setReportsto(String reportsto) {
        this.reportsto = reportsto;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhnum(String phonenum) {
        this.phonenum = phonenum;
    }




    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }





    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    private String role;
    private String skills;
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public Employee() {
        super();
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String  _id) {
        this._id = _id;
    }

    public String getFirstname() {
        return firstname;
    }



    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}