package me.shrp.state;

/**
 * Description
 * Created by lynxs on 2018/1/18.
 */
public class Order {
    private int total;
    private int paid = 0;
    private OrderState state = new OrderState.WaitingPay(this);

    public Order(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public int getPaid() {
        return paid;
    }

    public void setPaid(final int paid) {
        this.paid = paid;
    }

    public void setTotal(final int total) {
        this.total = total;
    }

    public void setState(final OrderState state) {
        this.state = state;
    }

    public void paid(final int i) {
        state.paid(i);
    }

    public void checkout() {
        state.checkout();
    }

    public boolean success() {
        return state.success();
    }

    public int getChange() {
        return state.getChange();
    }
}
