package HWLesson1;

import java.util.ArrayList;

public class Course {
//    Добавить класс Course (полоса препятствий), в котором будут находиться:
//    массив препятствий;
//    метод, который будет просить команду пройти всю полосу.

    private Team team;
    private BarrierGroup barrierGroup;

    ArrayList<String> resalt = new ArrayList<>();



    public Course(Team team, BarrierGroup barrierGroup) {
        this.team = team;
        this.barrierGroup = barrierGroup;
    }

    public void doIt() {
        for (TeamMember t : team.getTeamMembers()) {
            for (Barrier b : barrierGroup.getBarriers()) {
//                System.out.println(action(t, b));
                resalt.add(action(t,b));
            }
        }
        team.setResList(resalt);
    }

    String action(TeamMember member, Barrier barrier) {
        if ((barrier instanceof JampAble && barrier instanceof Destroyable &&
                member instanceof CanJamp && member instanceof CanDestroy)) {
            return actionChoice(member, barrier);
        }

        if (barrier instanceof JampAble && member instanceof CanJamp) {
            return ((CanJamp) member).jamp(((JampAble) barrier).getHeigh());
        }
        if (barrier instanceof Destroyable && member instanceof CanDestroy) {
            return ((CanDestroy) member).destroy(((Destroyable) barrier).getResistance());
        }
        return String.format("%s стоит перед неизвестным препятствием", member.getName());
    }

    private String actionChoice(TeamMember member, Barrier barrier) {
        if (member.getJampForce() >= barrier.getHeigh())
            return ((CanJamp) member).jamp(((JampAble) barrier).getHeigh());
        return String.format("%s, %s", ((CanJamp) member).jamp(((JampAble) barrier).getHeigh()),
                ((CanDestroy) member).destroy(((Destroyable) barrier).getResistance()));
    }
}
