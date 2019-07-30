package strategy_variable_of_state;

import java.util.Arrays;

public class StrategyC implements Strategy {

    @Override
    public void operation(int[] array) {
        System.out.println("Selection sort");
        System.out.println("Before:\t" + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        System.out.println("after:\t" + Arrays.toString(array));
    }
}
