package me.shrp.state;

/**
 * Description
 * Created by lynxs on 2018/1/18.
 */
public interface OrderState {
    void paid(int amount);
    void checkout();
    boolean success();
    int getChange();

    class WaitingPay implements OrderState{

        private Order order;
        public WaitingPay(Order order){
            this.order = order;
        }
        @Override
        public void paid(final int amount) {
            order.setPaid(order.getPaid() + amount);
        }
        @Override
        public void checkout() {
            order.setState(new CheckoutState(order));
        }
        @Override
        public boolean success() {
            return false;
        }
        @Override
        public int getChange() {
            throw new RuntimeException("this order didn't finish yet!");
        }
    }

    class CheckoutState implements OrderState {
        private Order order;
        public CheckoutState(Order order){

            this.order = order;
        }
        @Override
        public void paid(final int amount) {
            throw new RuntimeException("Can't pay any more!");
        }
        @Override
        public void checkout() {
            throw new RuntimeException("Checkout already!");
        }
        @Override
        public boolean success() {
            return order.getPaid() >= order.getTotal();
        }
        @Override
        public int getChange() {
            order.setState(new FinishState(order));
            if (success()){
                return order.getPaid() - order.getTotal();
            } else {
                return order.getPaid();
            }
        }
    }

    class FinishState implements OrderState {
        private Order order;
        public FinishState(Order order){
            this.order = order;
        }
        @Override
        public void paid(final int amount) {
            throw new RuntimeException("Can't pay any more!");
        }
        @Override
        public void checkout() {
            throw new RuntimeException("Checkout already!");
        }
        @Override
        public boolean success() {
            return order.getPaid() >= order.getTotal();
        }
        @Override
        public int getChange() {
            throw new RuntimeException("returned change Already!");
        }
    }
}
