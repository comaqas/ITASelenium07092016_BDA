package helpers;

import java.util.Arrays;
import java.util.List;

public class RegistrationData {
    public String username;
    public String email;
    public String password;
    public String confirmPassword;
    public String firstName;
    public String lastName;
    public String currentPosition;
    public String company;
    public boolean isAgree;

    private static List<String> itCompanies = Arrays.asList("itransition", "issoft", "epam", "viber", "belhard");
    private String randompassword = Random.getPassword();

    public RegistrationData(){
        this.username = Random.getUsername();
        this.email = Random.getRandomEmail();
        this.password = randompassword;
        this.confirmPassword = randompassword;
        this.firstName = Random.getFirstName();
        this.lastName = Random.getLastName();
        this.currentPosition = Random.getRandomString();
        this.company = Random.GetRandomCompany(itCompanies);
        this.isAgree = true;



    }


}
