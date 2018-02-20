import static org.mockito.Mockito.*;

import com.springinaction.knights.BraveKnight;
import org.junit.Test;
import com.springinaction.knights.Quest;

public class BraveKnightTest {

    @Test
    public void KnightShouldEmbarkQuest(){
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest,times(1)).embark();

    }
}
