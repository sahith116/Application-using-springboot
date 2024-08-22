package spring_boot_demo.myCoolApplication.Rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestContoller {

    //injecting properties for coach.name team.name
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "coachName: " + coachName + ", teamName: " + teamName;
    }


    //expose endpoint of team info


    @GetMapping("/")
    public String home() {
        return "Hello Wolrd";
    }
    @GetMapping("/World")
    public String World() {
        return "You are in World page";
    }
    @GetMapping("/country")
    public String country() {
        return "You are in country page";
    }
    @GetMapping("/country/Hyderabad")
    public String City(){
        return "You are in City page Hyderabad";
    }
    @GetMapping("/country/Mumbai")
    public String city(){
        return "You are in City page Mumbai";
    }
}
