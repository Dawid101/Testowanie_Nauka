package pl.coderslab.week3;
import java.util.logging.Logger;

public class Person {
    private String firstName;
    private String lastName;
    Logger logger = Logger.getLogger(getClass().getName());

    public String getFirstName() {
        logger.info("Getting firstName");
        return this.firstName;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInitials() {
        return this.firstName.charAt(0) + "." + this.lastName.charAt(0) + ".";
    }
}
