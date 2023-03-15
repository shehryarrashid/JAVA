package Week15;

public class Practice {

    public static void main(String[] args) {
        double[] myArray = {1.9, 2.9, 3.4, 3.5};
        myArray[3] = 5.0;
// Print all the array elements
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray [i] + " ");
        }

// Summing all elements
        double total = 0;
        for (int i = 0; i < myArray.length; i++) {
            total += myArray [i];
        }

        System.out.println("Total is " + total);
    }
}
