package inheritance;

public abstract class Appliances {
    private String name;

    protected Appliances(String name) {
        this.name = name;
    }

    public abstract String getName();
}
