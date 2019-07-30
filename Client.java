package strategy_variable_of_state;

public class Client {

    Strategy strategy;

    public void executeStrategy(int[] array) {
        strategy.operation(array);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
