package HWLesson1;

abstract class TeamMember {
    private String name;

    private float jampForce;

    private float force;

    public TeamMember(String name) {
        this.name = name;
    }

    public TeamMember() {

    }

    public String getName() {
        return name;
    }

    public float getJampForce() {
        return jampForce;
    }

    public float getForce() {
        return force;
    }
}

