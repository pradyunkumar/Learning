package pradyunjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Team>
        implements LeagueTable{

    private ArrayList<Team> teamsList = new ArrayList<>();
    public League() {
    }


    public boolean addTeam(T team){
        if(teamsList.indexOf(team) < 0){
            teamsList.add(team);
            System.out.println(team.getName() + " successfully added.");
            return true;
        } else {
            System.out.println(team.getName() + " was not added.");
            return false;
        }
    }

    @Override
    public List<Team> write() {
        return teamsList;
    }

    @Override
    public void saved(List<Team> values) {
        for(int i = 0; i < teamsList.size(); i++){
            System.out.println(i+1 + ". " + teamsList.get(i).getName());
        }
    }
     public void leaderboard(){
        Collections.sort(teamsList);
        saved(teamsList);
     }
}
