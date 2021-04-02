public class javaLesson3 {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        returnMassiv(5,4);
    }

    //Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;

            System.out.println(i + "-" + arr[i] + " ");
        }
    }

    //Задать пустой целочисленный массив длиной 100.
// С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void fillArray() {
        int[] arr = new int[101];
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = 1;

            System.out.print(i + " ");
        }
    }

    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    // и числа меньшие 6 умножить на 2;
    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] = arr[i] * 2;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "-" + arr[i] + " ");
        }
    }

    //Создать квадратный двумерный целочисленный массив
    // (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его
    // диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    // Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
    // то есть [0][0], [1][1], [2][2], …, [n][n];
    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
             {
                for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                    if (i == j || i == x) arr[i][j] = 1;
                    else arr[i][j] = 0;
                    System.out.print(arr[i][j] + " ");
                } System.out.println();
            }
        }
    }
    //Написать метод, принимающий на вход два аргумента: len и initialValue,
    // и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static int[] returnMassiv(int len, int initialValue){
                int [] result = new int [len];
                for (int i=0; i<result.length; i++){
                    result [i] = initialValue;
                }
                return result;
    }
}