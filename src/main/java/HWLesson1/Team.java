package HWLesson1;

public class Team {
//    �������� ����� Team, ������� ����� ���������:
//    �������� �������;
//    ������ �� ������� ���������� � � ������������ ����� ����� ���� ���������� ���������);
//    ����� ��� ������ ���������� � ������ �������, ��������� ���������;
//    ����� ������ ���������� ��� ���� ������ �������.

    private String teamName;

    private Course course;
    private TeamMember[] teamMembers = new TeamMember[4];


    public Team(String teamName, TeamMember first, TeamMember second,
                TeamMember third, TeamMember fourth) {
        this.teamName = teamName;
        this.teamMembers[0] = first;
        this.teamMembers[1] = second;
        this.teamMembers[2] = third;
        this.teamMembers[3] = fourth;
    }

    public Team(String teamName, TeamMember[] teamMembers) {
        this.teamName = teamName;
        this.teamMembers = teamMembers;
    }

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public TeamMember[] getTeamMembers() {
        return teamMembers;
    }

    void showResults() {
        course.showResults();

    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
