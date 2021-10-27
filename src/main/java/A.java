public class A {

    private final static A instance = new A();

    private A() {

    }

    public void save() {

    }

    public static A getInstance() {
        return instance;
    }
}
