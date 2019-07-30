package strategy_variable_of_state;

public class StrategyApp {

    public static void main(String[] args) {
        Client c = new Client();

        int[] ar = {312, 41, 515};
        int[] ar2 = {12, 41, 15};
        int[] ar3 = {12, 0, 515};

        c.setStrategy(new StrategyA());
        c.executeStrategy(ar);

        c.setStrategy(new StrategyB());
        c.executeStrategy(ar2);

        c.setStrategy(new StrategyC());
        c.executeStrategy(ar3);
    }
}
