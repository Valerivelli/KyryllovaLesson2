package hw4;

public class MinimalNumberInArray {
    public static void main(String[] args) {
        int array[] = new int[]{8, 5, 10, 13, 25, 38};
        int min = getmin(array);
        System.out.println("Minimal number in array is: " + min);
    }

    //getting a minimal value in array
    private static int getmin(int array[]) {
        int minvalue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minvalue) {
                minvalue = array[i];
            }
        }
        return minvalue;
    }
}
