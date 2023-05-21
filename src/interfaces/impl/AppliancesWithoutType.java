package interfaces.impl;

import inheritance.Appliances;

public class AppliancesWithoutType extends Appliances {
    private String name;

    protected AppliancesWithoutType(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
