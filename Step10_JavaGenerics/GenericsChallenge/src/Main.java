public class Main {
    public static void main(String[] args) {
       League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
//       League<Team<BaseballPlayer>> baseballLeague = new League<>("MLB");

        Team<FootballPlayer> adelaideCrows2 = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        hawthorn.gameResult(fremantle, 1, 0);
        hawthorn.gameResult(adelaideCrows2, 3, 8);
        adelaideCrows2.gameResult(fremantle, 2, 1);

        footballLeague.addTeam(adelaideCrows2);
        footballLeague.addTeam(melbourne);
        footballLeague.addTeam(hawthorn);
        footballLeague.addTeam(fremantle);

        //we cannot add a baseballTeam to a footballLeague due to the Generics that we applied to the League Class
//        footballLeague.addTeam(baseballTeam);

        footballLeague.showLeague();
        System.out.println("==========================");

        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        //Examples of the complications with using RAW types
        Team rawTeam = new Team("Raw Team");
        rawTeam.addPlayer(beckham);
        rawTeam.addPlayer(pat);

        footballLeague.addTeam(rawTeam);

        League<Team> rawLeague = new League<>("Raw");
        rawLeague.addTeam(adelaideCrows2);
        rawLeague.addTeam(baseballTeam);
        rawLeague.addTeam(rawTeam);

        League reallyRaw =  new League("Really raw");
        reallyRaw.addTeam(adelaideCrows2);
        reallyRaw.addTeam(baseballTeam);
        reallyRaw.addTeam(rawTeam);
    }
}
