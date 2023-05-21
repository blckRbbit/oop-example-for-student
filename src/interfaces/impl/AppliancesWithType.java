package interfaces.impl;

import inheritance.Appliances;
import interfaces.Typeable;

public class AppliancesWithType extends Appliances implements Typeable {
    private String name;

    protected AppliancesWithType(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "Standard";
    }
}
