import static org.mockito.Mockito.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Demo{

    @Test
    public void test(){
        List mockedList = mock(List.class);

        mockedList.add("one");
        mockedList.clear();

        verify(mockedList).add("one");
        verify(mockedList).clear();

        System.out.println(" Mockito Test");

        when(mockedList.get(0)).thenReturn("second");
        System.out.println(mockedList.get(0));
    }

}
