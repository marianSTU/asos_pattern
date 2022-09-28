package org.example.abstractFactory;

public class BeefBurgerFactory implements BurgerAbstractFactory {

    @Override
    public ClassicBurger createClassicBurger() {
        return new ClassicBeefBurger();
    }

    @Override
    public DoubleBurger createDoubleBurger() {
        return new DoubleBeefBurger();
    }
}
