package comp610labs;

public class Lab02Q2 {

    public static void main(String[] args) {
        int[] l = {1, 2, 3, 4, 5, 6};

        System.out.println(findInArray(l, 9));
    }

    private static int findInArray(int[] list, int targetValue) {
        int index = 0;

        for (; list[index] != targetValue && index < list.length; index++);

        if (index < list.length) {
            return index;
        }
        return -1; //not found
    }

}
