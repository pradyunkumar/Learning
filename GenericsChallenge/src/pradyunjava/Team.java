package pradyunjava;

public abstract class Team implements Comparable<Team>{
    private String name;
    private byte wins;
    private byte losses;
    private byte ties;
    private short games;

    public Team(String name){
        this.name = name;
    }

    public short total(){
        return (short)((wins * 2) + ties);
    }

    public String getName(){
        return this.name;
    }
    public void matchResult(Team opponent, int ourScore, int theirScore){
        String message;
        if(ourScore > theirScore) {
            wins++;
            message = getName() + " won against ";
        }
        else if(ourScore == theirScore) {
            ties++;
            message = getName() + " tied against ";
        }
        else {
            losses++;
            message = getName() + " lost against ";
        }
        games++;
        if(opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
            System.out.println(message + opponent.getName() + ".");
        }
    }
    @Override
    public int compareTo(Team team) {
        if(this.total() > team.total()){
            return -1;
        } else if(this.total() < team.total()){
            return 1;
        } else {
            return 0;
        }
    }
}



class BasketballTeam extends Team {
    public BasketballTeam(String name) {
        super(name);
    }
}

class BaseballTeam extends Team {
    public BaseballTeam(String name) {
        super(name);
    }
}

class FootballTeam extends Team {
    public FootballTeam(String name) {
        super(name);
    }
}