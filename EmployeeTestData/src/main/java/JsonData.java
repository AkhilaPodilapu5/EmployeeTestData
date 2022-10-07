import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.json.Json;
import javax.json.JsonWriter;
import javax.json.stream.JsonGenerator;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.rmi.server.UID;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class JsonData {

    private static List<String> firstname = Arrays.asList("Ram", "Shyam", "Alisha", "Robin", "vishwa", "Sita","Arha", "Ishu", "Mina", "Sai");

    private static List<String> lastname = Arrays.asList("Sk", "P", "R", "S", "T", "B","A", "I", "M", "MD");
    private static List<String> gender = Arrays.asList("male", "female", "other");
    private static List<Integer> emp_id = Arrays.asList(5067574, 5023145, 4040403, 2020231, 4098765, 4567821,5674121, 5432556, 567432, 4532782);


    private static List<String> department = Arrays.asList("BNFS", "TMT", "DU", "INSURANCE", "TRAINING", "FINANCE","R&D", "KPO", "CES", "BANKING");
    private static List<String> reportsto = Arrays.asList("Ram", "Shyam", "Alisha", "Robin", "vishwa", "Sita","Arha", "Ishu", "Mina", "Sai");
    private static List<String> city = Arrays.asList("Chennai", "Hyderabad", "Mumbai", "pune", "Banglore", "Mysore","Vijayawada", "Delhi", "Kerala", "Bhubaneswar");
    private static List<String> postalcode = Arrays.asList("522004", "42012", "5500125", "124892", "514235", "6677524","420045", "550076", "675398", "522007");
    private static List<String> country = Arrays.asList("India", "UK", "USA", "France", "Brazil", "UAE","China", "Japan", "Italy", "korea");
    private static List<String> address = Arrays.asList("Ramnagar", "Srinivasaraothota", "kothapeta", "SVNColony", "Indhira Nagar", "AT.Agraharm","Chuttugunta", "ITC,oldclub road", "60feet road", "Nallapadu");
    private static List<String> email = Arrays.asList("Ram@gmail.com", "Shyam651@outlook.com", "Alisha123@gmail.com", "Robintesla@gmail.com", "vishwa@gmail.com", "Sita24Pr@gmail.com","Arha@gmail.com", "Ishudar@gmail.com", "ishMina@gmail.com", "Sai2307@outlook.com");
    private static List<String> phonenum = Arrays.asList("9123546761", "8123546761", "6123546761", "7091235046", "9581467612", "9123522222","7291235046", "912350489", "9111235046", "8091235046");
    private static List<Integer> age = Arrays.asList(25, 30, 27, 28, 29,32, 35, 40, 45, 42);
    private static List<String> role = Arrays.asList("dev", "tester", "hr", "TL", "ops", "Ac1", "Ac2", "Ac3", "c1", "pc");
    private static List<String> skills = Arrays.asList("java", "c", "c#", ".NET", "Mulesoft", "Devops","Azure", "Aws", "GCP", "Docker");
    private static List<String> salary = Arrays.asList("25000", "30000", "35000", "40000", "55000", "23500","75000", "90000", "82000", "100000");
    private static List<String> doj = Arrays.asList("12-03-21","12-03-21","27-03-2005","19-02-2006","11-03-21","17-03-21","12-03-21","25-09-2002","02-04-2002","22-11-2001","12-03-1998");
    private static Random rand = new Random();
    private static Employee createGenerator() {
        Employee emp = new Employee();
        emp.setFirstname(firstname.get(rand.nextInt(firstname.size())));
        emp.setEmp_id(emp_id.get(rand.nextInt(emp_id.size())));
        emp.setDoj(doj.get(rand.nextInt(doj.size())));
        emp.setCountry(country.get(rand.nextInt(country.size())));
        emp.setAge(rand.nextInt( 43)+18);
        emp.setDepartment(department.get(rand.nextInt(department.size())));
        emp.setReportsto(reportsto.get(rand.nextInt(reportsto.size())));
        emp.setCity(city.get(rand.nextInt(city.size())));
        emp.setEmail(email.get(rand.nextInt(email.size())));
        emp.setPhnum(phonenum.get(rand.nextInt(phonenum.size())));
        emp.setPostalcode(postalcode.get(rand.nextInt(postalcode.size())));
        emp.setGender(gender.get(rand.nextInt(gender.size())));
        emp.setLastname(lastname.get(rand.nextInt(lastname.size())));
        emp.setAddress(address.get(rand.nextInt(address.size())));
        emp.setRole(role.get(rand.nextInt(role.size())));
        UUID uuid=UUID.randomUUID();
        emp.set_id(uuid.toString());
        emp.setSkills(skills.get(rand.nextInt(skills.size())));
        emp.setSalary((rand.nextInt(30)+5)*5000);
        return emp;

    }

    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        OutputStream fos = new FileOutputStream("sample.json");

        fos.write("{\"data\": [".getBytes(StandardCharsets.UTF_8));
        for(int i=0; i<10; i++){
            String emp = mapper.writeValueAsString(createGenerator());


            if(i > 0)
                fos.write(",".getBytes(StandardCharsets.UTF_8));
            fos.write(emp.getBytes(StandardCharsets.UTF_8));
        }
        fos.write("]}".getBytes(StandardCharsets.UTF_8));

    }




}
