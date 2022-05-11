package ds.anosov;

public class Task03 {
    public static void main(String[] args) {
        int[] array = new int[20];
        int minPositive = Integer.MAX_VALUE;
        int maxNegative = Integer.MIN_VALUE;
        int nMax = 0;
        int nMin = 0;
        int temp;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 20) - 10);
            System.out.print(array[i] + " ");
            if (array[i] < minPositive && array[i] > 0) {
                minPositive = array[i];
                nMax = i;
            }
            if (array[i] > maxNegative && array[i] < 0) {
                maxNegative = array[i];
                nMin = i;
            }
        }
        System.out.println();
        System.out.println("Максимально отрицательный элемент массива: " + maxNegative);
        System.out.println("Максимально положительный элемент массива: " + minPositive);

        temp = array[nMax];
        array[nMax] = array[nMin];
        array[nMin] = temp;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
