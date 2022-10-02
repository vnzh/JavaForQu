package HWLesson1;

public class Main {
    public static void main(String[] args) {

//        Team team = new Team("спергерои", new TeamMember[]{new Spiderman() });
//        BarrierGroup group = new BarrierGroup(new Barrier[]{new Wall(3f)});
//        Course course = new Course(team, group);
//        course.doIt();

//        Team team = new Team("супергерои", new TeamMember[]{new Spiderman(), new Halk(), });
//        BarrierGroup group = new BarrierGroup(new Barrier[]{new Wall(3f)});
//        Course course = new Course(team, group);
//        course.doIt();

        Team team = new Team("супергерои",
                new TeamMember[]{new Spiderman(), new Halk(),new IronMan(), new IronMan("IronMan") });
        BarrierGroup group = new BarrierGroup(
                new Barrier[]{new Wall(3f, 25f), new Wall(30f, 20f), new Wall(20f,40f)});
        Course course = new Course(team, group);
        course.doIt();
//        course.showResults();
        team.showResults();
    }
}
