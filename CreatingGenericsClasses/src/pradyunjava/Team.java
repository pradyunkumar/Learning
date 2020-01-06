package pradyunjava;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;
    byte played = 0;
    byte won = 0;
    byte lost = 0;
    byte tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName() + " is already on this team.");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public byte numPlayers(){
        return (byte)this.members.size();
    }

    public void matchResult(Team<T> opponent, short ourScore, short theirScore){
        if(ourScore > theirScore)
            won++;
        else if(ourScore == theirScore)
            tied++;
        else
            lost++;

        played++;
        if(opponent != null)
            opponent.matchResult(null,theirScore, ourScore);

    }

    public byte ranking(){
        return (byte)((won *2) + tied);
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()){
            return -1;
        } else if(this.ranking() < team.ranking()){
            return 1;
        } else {
            return 0;
        }
    }
}
