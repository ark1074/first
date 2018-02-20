package soundsystem;

import org.springframework.stereotype.Component;

@Component
//@Named("lonelyHeartClub") can also use Named instead of using named component
public class SgtPeppers implements CompactDisc{

    private String title = "Peppers title";
    private String artist ="The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " +  artist);

    }
}
