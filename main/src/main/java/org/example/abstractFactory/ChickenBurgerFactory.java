package org.example.abstractFactory;

public class ChickenBurgerFactory implements BurgerAbstractFactory {

    @Override
    public ClassicBurger createClassicBurger() {
        return new ClassicChickenBurger();
    }

    @Override
    public DoubleBurger createDoubleBurger() {
        return new DoubleChickenBurger();
    }
}
