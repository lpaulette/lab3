import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlace2() {
    int[] input1 = {1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, input1);
	}

   @Test 
	public void testReverseInPlace3() {
    int[] input1 = {1, 2, 3, 4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 4, 3, 2, 1}, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = {1, 2, 3, 4, 5};
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAvgWithoutLowest(){
    double[] ra = {5};
    double num1 = ArrayExamples.averageWithoutLowest(ra);
    assertEquals(0.0, num1, 0.1);
  }
  

  //Derek's test
  @Test
  public void dereksTest(){
    double[] numList = {1,1,1,4.5,6};
    double num2 = ArrayExamples.averageWithoutLowest(numList);
    assertEquals(3.125, num2, 0.1);
  }


}
