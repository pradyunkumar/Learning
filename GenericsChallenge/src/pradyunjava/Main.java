package pradyunjava;

public class Main {

    public static void main(String[] args) {
	    League<BaseballTeam> baseballTeamLeague = new League<>();
        BaseballTeam SFGiants = new BaseballTeam("Giants");
        BaseballTeam Athletics = new BaseballTeam("Okland");
        BaseballTeam NYGiants = new BaseballTeam("NYGiants");
        BaseballTeam ChicagoCubs = new BaseballTeam("Chicago Cubs");
        BasketballTeam LALakers = new BasketballTeam("Lakers");

        baseballTeamLeague.addTeam(SFGiants);
        baseballTeamLeague.addTeam(Athletics);
        baseballTeamLeague.addTeam(NYGiants);
        baseballTeamLeague.addTeam(ChicagoCubs);
        System.out.println();

        NYGiants.matchResult(ChicagoCubs, 2, 1);
        ChicagoCubs.matchResult(SFGiants,3,1);
        SFGiants.matchResult(Athletics,5,3);
        Athletics.matchResult(NYGiants,2,4);
        ChicagoCubs.matchResult(SFGiants,2,2);
        baseballTeamLeague.leaderboard();

    }
}
