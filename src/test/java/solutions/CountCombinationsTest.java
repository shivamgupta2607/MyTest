package solutions;

import exam.CountCombinations;
import org.junit.Assert;
import org.junit.Test;

public class CountCombinationsTest {

  @Test
  public void testCount() {

    final CountCombinations obj = new CountCombinations();
    int[][] validationArr = new int[][] {
        {3, 2, 2},
        {6, 2, 4},
        {6, 3, 7},
        {5, 2, 3},
        {5, 3, 5},
        {100, 17, 64684584}
    };


    for (int i=0; i < validationArr.length; i++) {
      int result = obj.getNumberOfWays(validationArr[i][0], validationArr[i][1]);
      int expected = validationArr[i][2];

      Assert.assertEquals(
          String.format("[index = %d] : Expected value {%d} does not match with actual value {%d}", i, expected, result),
          expected, result);
    }


  }
    @Test
    public void testCountSuccess() {
      Assert.assertEquals("sucess", 1, 1);
    }

}
