import org.junit.Assert;
import org.junit.Test;

public class TestCases {
    @Test
    public void TestCase1(){
        int[][] inputMatrix = {{0,1,1},{1,1,1},{1,1,1}};
         ChangeMatrix.modifyFirstRowFirstColumn(inputMatrix);
        int[][] outputMatrix = {{0,0,0},{0,1,1},{0,1,1}};
        Assert.assertArrayEquals(inputMatrix, outputMatrix);
    }

    @Test
    public void TestCase2(){
        int[][] inputMatrix = {{1,0,1,0},{1,0,0,1},{1,1,0,1},{1,0,1,0}};
        ChangeMatrix.modifyFirstRowFirstColumn(inputMatrix);
        int[][] outputMatrix = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        Assert.assertArrayEquals(inputMatrix, outputMatrix);
    }

    @Test
    public void TestCase3(){
        int[][] inputMatrix = {{0,1},{1,1}};
        ChangeMatrix.modifyFirstRowFirstColumn(inputMatrix);
        int[][] outputMatrix = {{0,0},{0,1}};
        Assert.assertArrayEquals(inputMatrix, outputMatrix);
    }

    @Test
    public void TestCase4(){
        int[][] inputMatrix = {{0,1,2},{1,1,0}};
        ChangeMatrix.modifyFirstRowFirstColumn(inputMatrix);
        int[][] outputMatrix = {{0,0,0},{0,0,0}};
        Assert.assertArrayEquals(inputMatrix, outputMatrix);
    }

    @Test
    public void TestCase5(){
        int[][] inputMatrix = {{1,1,1,1,0},{1,1,0,1,1},{1,1,1,1,1,}};
        ChangeMatrix.modifyFirstRowFirstColumn(inputMatrix);
        int[][] outputMatrix = {{0,0,0,0,0},{0,0,0,0,0},{1,1,0,1,0}};
        Assert.assertArrayEquals(inputMatrix, outputMatrix);
    }
}
