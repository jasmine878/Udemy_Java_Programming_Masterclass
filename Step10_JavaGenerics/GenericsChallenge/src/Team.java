import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    int gamesPlayed = 0;
    int gamesWon = 0;
    int gamesTied = 0;
    int gamesLost = 0;

    //we're creating an arrayList using generics
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean addPlayer(T player) {
        if (!members.contains(player)) {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        } else {
            System.out.println(player.getName() + " is already on this team");
            return false;
        }
    }

    public int numPlayer() {
        return this.members.size();
    }

    public void gameResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;

        if (ourScore > theirScore) {
            gamesWon++;
            message = " beat ";
        } else if (ourScore < theirScore) {
            gamesLost--;
            message = " lost to ";
        } else {
            gamesTied++;
            message = " drew with ";
        }

        gamesPlayed++;

        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.gameResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return gamesWon * 2 + gamesTied;
    }

    //the Object Class already has the compareTo class built in.
    // We are overriding the built in method below
    //if this.ranking > team.ranking we're returning -1, because we want it to appear higher in the list
    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()) return -1;
        if(this.ranking() < team.ranking()) return 1;

        return 0;
    }
}
