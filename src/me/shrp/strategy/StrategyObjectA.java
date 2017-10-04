package me.shrp.strategy;

/**
 * Description
 * Created by lynxs on 2017/10/4.
 */
public class StrategyObjectA extends StrategyBaseObject{
    StrategyFunction strategyFunction;

    /**
     * 可以给予默认的策略
     */
    public StrategyObjectA() {
        strategyFunction = new StrategyFunctionA();
    }

    /**
     * 允许初始化时给予策略
     * @param strategyFunction
     */
    public StrategyObjectA(final StrategyFunction strategyFunction) {
        this.strategyFunction = strategyFunction;
    }

    /**
     * 允许使用中随时更换策略
     * @param strategyFunction
     */
    public void setStrategyFunction(final StrategyFunction strategyFunction) {
        this.strategyFunction = strategyFunction;
    }

    @Override
    void function() {
        strategyFunction.function();
    }
}
