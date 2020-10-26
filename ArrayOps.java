public class ArrayOps {

  public static void main(String[] args) {

  }

  public static int sum(int[] arr) {
    if (arr.length == 0) return 0;
    int sum = 0;
    for (int pos = 0; pos < arr.length; pos++) {
      sum += arr[pos];
    }
    return sum;
  }

  public static  int largest(int[]arr) {
    int max = 0;
    for (int pos = 0; pos < arr.length; pos++) {
      if (arr[pos] > max) max = arr[pos];
    }
    return max;
  }

  public static int[] sumRows(int[][] matrix) {
    int[] a = new int[0];
    return a;
  }

  public static  int[] largestInRows(int[][] matrix) {
    int[] a = new int[0];
    return a;
  }

  public static  int sum(int[][] arr) {
    return 0;
  }

  public static int[] sumCols(int[][] matrix) {
    int[] a = new int[0];
    return a;
  }

  public static boolean isRowMagic(int[][] matrix) {
    return false;
  }

  public static boolean isColMagic(int[][] matrix) {
    return false;
  }

  public static boolean isLocationMagic(int[][] matrix, int row, int col) {
    return false;
  }

}
