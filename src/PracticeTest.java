import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls

  @Test
  void testMostCommonTimeEfficient(){

    int[] num = {1,2,3,3,3,2,2,2,2};

    int actual = Practice.mostCommonTimeEfficient(num);

    assertEquals(actual, 2);
  }
}
