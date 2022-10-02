package HWLesson1;

public class Wall extends Barrier implements JampAble, Destroyable {

    private float heigh;
    private float resistance;

    public Wall(float heigh, float resistance) {
        this.heigh = heigh;
        this.resistance = resistance;
    }

    public float getHeigh() {
        return heigh;
    }

    @Override
    public float getResistance() {
        return resistance;
    }
}
