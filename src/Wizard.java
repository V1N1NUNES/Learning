public class Wizard implements Character {
    @Override
    public String getName(String name) {
        return "The Wizard name is: " + name + "!!!\n";
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getpower() {
        return "";
    }

    @Override
    public int getlife() {
        return 0;
    }

    @Override
    public float damage() {
        return 0;
    }

}


