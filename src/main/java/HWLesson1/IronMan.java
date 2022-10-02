package HWLesson1;

public class IronMan extends TeamMember implements CanJamp, CanDestroy {

    private final float jampForce = 12F;

    private final float force = 20f;

    private String name;

    public IronMan() {
        this.name = "noname";
    }

    public IronMan(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public String destroy(float resistance) {
        if (force < resistance) return String.format("%s �� ���� ������� �����������", name);
        return String.format("%s ������ �����������", name);
    }


    @Override
    public String jamp(float height) {
        if (jampForce < height) return String.format("%s  �� ���� ������������ �����", name);
        return String.format("%s  ���� ������������ �����", name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getJampForce() {
        return jampForce;
    }

    @Override
    public float getForce() {
        return   force;
    }
}

