package HWLesson1;

import java.util.ArrayList;

public class Team {
//    Добавить класс Team, который будет содержать:
//    название команды;
//    массив из четырех участников — в конструкторе можно сразу всех участников указывать);
//    метод для вывода информации о членах команды, прошедших дистанцию;
//    метод вывода информации обо всех членах команды.

    private String teamName;
    private ArrayList<String> resList;
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
            for (String s: resList) {
                System.out.println(s);
            }
    }

    public ArrayList<String> getResList() {
        return resList;
    }

    public void setResList(ArrayList<String> resList) {
        this.resList = resList;
    }
}
