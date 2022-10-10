import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Employee {
    private static final String DATE_FORMAT = "yyyy-MM-dd";

    private String _id;
    private String firstname;
    private String lastname;
    private String gender;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_FORMAT)
    private Date doj;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_FORMAT)
    private Date dob;
}