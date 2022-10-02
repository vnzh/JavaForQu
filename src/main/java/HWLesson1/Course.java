package HWLesson1;

import java.util.ArrayList;

public class Course {
//    �������� ����� Course (������ �����������), � ������� ����� ����������:
//    ������ �����������;
//    �����, ������� ����� ������� ������� ������ ��� ������.

    private Team team;
    private BarrierGroup barrierGroup;

    ArrayList<String> resList = new ArrayList<>();

    public Course(Team team, BarrierGroup barrierGroup) {
        this.team = team;
        this.barrierGroup = barrierGroup;
        this.team.setCourse(this);
    }

    public void doIt() {
        for (TeamMember t : team.getTeamMembers()) {
            for (Barrier b : barrierGroup.getBarriers()) {
//                System.out.println(action(t, b));
                resList.add(action(t,b));

            }
        }
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
        return String.format("%s ����� ����� ����������� ������������", member.getName());
    }

    private String actionChoice(TeamMember member, Barrier barrier) {
        if (member.getJampForce() >= barrier.getHeigh())
            return ((CanJamp) member).jamp(((JampAble) barrier).getHeigh());
        return String.format("%s, %s", ((CanJamp) member).jamp(((JampAble) barrier).getHeigh()),
                ((CanDestroy) member).destroy(((Destroyable) barrier).getResistance()));
    }

    void showResults() {
        for (String s: resList) {
            System.out.println(s);
        }
    }

}
