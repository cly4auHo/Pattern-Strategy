package strategy_variable_of_state;

import java.util.Arrays;

public class StrategyB implements Strategy {

    @Override
    public void operation(int[] array) {
        System.out.println("Bubble sort");
        System.out.println("Before:\t" + Arrays.toString(array));
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("after:\t" + Arrays.toString(array));
    }
}
