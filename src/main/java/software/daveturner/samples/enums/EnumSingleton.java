package software.daveturner.samples.enums;

public enum EnumSingleton {
    INSTANCE;
    private String name;
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
