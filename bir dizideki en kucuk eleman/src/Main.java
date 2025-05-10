//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] array = {23, 5, 18, 7, 2, 40, 15};
        int min =min(array);
        System.out.println("dizinin min elemanı: " + min);

    }
    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];

            }

        }
        return min;
    }


        }




