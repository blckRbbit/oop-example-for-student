package inheritance.impl;

import inheritance.Appliances;

public class AppliancesWithType extends Appliances {
    private String name;
    private String type;

    protected AppliancesWithType(String name, String type) {
        super(name);
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
