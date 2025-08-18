package pl.coderslab.week1.week1;

public class MaxValue {
    public static void main(String[] args) {
        System.out.println(getMaxValue(new int[]{1, 2, 3, 4}));
    }

    public static int getMaxValue(int[] list) {
        int index;
        int max = list[0];

        if (list.length == 0) {
            throw new RuntimeException("Lista jest pusta");
        }

        for (index = 0; index < list.length; index++) {
            if (list[index] > max) {
                max = list[index];
            }
        }
        return max;
    }
}
