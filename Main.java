public class Main {
    public static void main(String[] args) {
        int count = 0;              // хранит число элементов массива
        int positiv = 0;            // хранит число положительных элементов массива
        int[][] matrix = {{1, 2, 3, 6, 89, 45}, {-58, -56, -4, -36, -5, -9}, {-5, 3, -8, 78, 0, -5}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                ++count;
                if (matrix[i][j] >= 0) {
                    ++positiv;
                }
            }
        }
        if ((count - positiv) < count / 2) {
            System.out.println("Число положительных чисел больше числа отрицательных чисел");
        } else if ((count - positiv) == count / 2) {
            System.out.println("Число отрицательных чисел равно числу положительных чисел");
        } else {
            System.out.println("Число положительных чисел меньше числа отрицательных чисел");
        }
    }
}