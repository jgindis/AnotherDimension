public class ArrayOps {

  public static void main(String[] args) {

  }

  public static void printArray(int[] a) {
    String arrA = "[";
    for (int i = 0; i < a.length; i++) {
      if (i < a.length-1) arrA += a[i] + ", ";
      else arrA += a[i];
      }
    arrA += "]";
    System.out.print("\n");
    System.out.println(arrA);
  }

  public static void print2DArray(int[][] b) {
      String arrB = "[ [";
      for (int i = 0; i < b.length; i++) {
         for (int j = 0; j < b[i].length; j++) {
            if (i == 2 && j == 3) arrB += "] [";
            if (i < b.length-1) arrB += b[i][j] + ", ";
            else arrB += b[i][j];
         }
      }
      arrB += "] ]";
      System.out.print("\n");
      System.out.println(arrB);
    }

  public static int sum(int[] arr) {
    if (arr.length == 0) return 0;
    int sum = 0;
    for (int pos = 0; pos < arr.length; pos++) {
      sum += arr[pos];
    }
    return sum;
  }

  public static int largest(int[]arr) {
    int max = 0;
    for (int pos = 0; pos < arr.length; pos++) {
      if (arr[pos] > max) max = arr[pos];
    }
    return max;
  }

  public static int[] sumRows(int[][] matrix) {
     int[] a = new int[matrix.length];
     for (int i = 0; i < a.length; i++) {
       int var = sum(matrix[i]);
       a[i] = var;
     }
     return a;
   }

  public static int[] largestInRows(int[][] matrix) {
    int a[] = new int[matrix.length];
    for (int i = 0; i < a.length; i++) {
      int var = largest(matrix[i]);
      a[i] = var;
    }
    return a;
  }

  public static int sum(int[][] arr) {
    int[] a = sumRows(arr);
    return(sum(a));
  }

  public static int[] sumCols(int[][] matrix) {
    int[] a = new int[matrix[0].length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
      a[j] += matrix[i][j];
      }
    }
    return a;
  }

  public static boolean isRowMagic(int[][] matrix) {
    int[] a = sumRows(matrix);
    for (int i = 0; i < a.length-1; i++) {
      if (a[i] != a[i+1]) return false;
    }
    return true;
  }

  public static boolean isColMagic(int[][] matrix) {
    int[] a = sumCols(matrix);
    for (int i = 0; i < arr.length-1; i++) {
      if (a[i] != a[i+1]) return false;
    }
    return true;
  }
  }

  public static boolean isLocationMagic(int[][] matrix, int row, int col) {
    return false;
  }

}
