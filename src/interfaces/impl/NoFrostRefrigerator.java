package interfaces.impl;

public class NoFrostRefrigerator extends Refrigerator {
    protected NoFrostRefrigerator(String name) {
        super(name);
    }

    @Override
    public String getType() {
        return "NO_FROST";
    }
}
