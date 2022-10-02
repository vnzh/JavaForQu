package HWLesson1;

public class Halk extends TeamMember implements CanDestroy{

    private final String name;
    private final  float force = 30f;

    public Halk() {
        this.name =  "Halk";
    }

    @Override
    public String destroy(float resistance) {
        if (force < resistance) return String.format("%s �� ���� ������� �����������", name);
        return String.format("%s ������ �����������", name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getForce() {
        return force;
    }
}
