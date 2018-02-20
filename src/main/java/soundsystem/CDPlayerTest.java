package soundsystem;

import static org.junit.Assert.*;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import com.springinaction.knights.BraveKnight;
import com.springinaction.knights.Knight;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class) //used to specify the config class
public class CDPlayerTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private MediaPlayer mediaPlayer;

    @Autowired
    private CDPlayer cdPlayer;

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
    }

    @Test
    public void testCDPlayer(){
      //cdPlayer = new CDPlayer(cd);
      cdPlayer.play();

    }

    @Test
    public void play(){
        mediaPlayer.play();
        assertEquals("Playing Peppers title by The Beatles\n",log.getLog());


    }


}
