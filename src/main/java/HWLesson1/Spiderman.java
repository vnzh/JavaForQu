package HWLesson1;

public class Spiderman extends TeamMember implements CanJamp {

    private  String name;
    private final float jampForce = 10.5F;

    public Spiderman() {
        this.name =  "SpiderMan";

    }

    @Override
    public String jamp(float height) {
        if (jampForce < height) return String.format("%s  не смог перепрыгнуть стену", name);
        return String.format("%s  смог перепрыгнуть стену", name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getJampForce() {
        return jampForce;
    }
}
