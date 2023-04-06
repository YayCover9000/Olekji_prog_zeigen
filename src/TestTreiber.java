public class TestTreiber {
    public static void main (String [] args) {
        int[][] testArray = new int[5][10];
        IIDimZugriff.ArrayBuild(testArray);
        System.out.println("------------");
        int[][] test2Array =new int[2][10];
        IIDimZugriff.ArrayBuild(test2Array);
    }
}
