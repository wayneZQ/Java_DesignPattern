package mashibing_AbstractFactory;

public class MagicFactory extends AbstractFactory {
    @Override
    Food createFood() {
        return new Mashroom();
    }

    @Override
    Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    Weapon createWeapon() {
        return new MagicStick();
    }
}
