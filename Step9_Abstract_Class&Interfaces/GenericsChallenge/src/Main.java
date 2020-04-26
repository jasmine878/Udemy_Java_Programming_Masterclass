public class Main {
    public static void main(String[] args) {
       League<Team<FootballPlayer>> footballLeague = new League<>("AFL");

        Team<FootballPlayer> adelaideCrows2 = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        footballLeague.addTeam(adelaideCrows2);
        footballLeague.addTeam(melbourne);
        footballLeague.addTeam(hawthorn);
        footballLeague.addTeam(fremantle);


    }
}
