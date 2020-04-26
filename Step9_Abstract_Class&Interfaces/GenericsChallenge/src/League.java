import java.util.ArrayList;

public class League<T extends Team> {
    public String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        if(league.contains(team)) {
            return false;
        }

        league.add(team);
        return true;
    }


}
