package strategy_variable_of_state;

import java.util.Arrays;

public class StrategyA implements Strategy {

    @Override
    public void operation(int[] array) {
        System.out.println("Insertion sort"); //вставками
        System.out.println("Before:\t" + Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            int index = i;
            while (index - 1 >= 0 && array[index] < array[index - 1]) {
                int temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;
                index--;
            }
        }
        System.out.println("after:\t" + Arrays.toString(array));
    }
}
