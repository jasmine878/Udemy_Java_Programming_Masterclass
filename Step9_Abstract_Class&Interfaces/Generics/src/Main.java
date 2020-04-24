import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);

        printDoubled(items);
        System.out.println("==========================");

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        System.out.println("Team WITHOUT Generic Class Type");
        System.out.println();
        Team adelaideCrows = new Team("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        adelaideCrows.addPlayer(pat);
        adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayer());
        System.out.println("==========================");

        FootballPlayer joe2 = new FootballPlayer("Joe");
        BaseballPlayer pat2 = new BaseballPlayer("Pat");
        SoccerPlayer beckham2 = new SoccerPlayer("Beckham");

        System.out.println("Team WITH Generic Class Type");
        System.out.println();
        Team<FootballPlayer> adelaideCrows2 = new Team<>("Adelaide Crows");
        adelaideCrows2.addPlayer(joe2);
//        adelaideCrows2.addPlayer(pat2);
//        adelaideCrows2.addPlayer(beckham2);

        System.out.println(adelaideCrows2.numPlayer());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat2);

        //Unfortunately, we can put any Generic Type here, even STRING
        //there are no compile errors
        //but when we run the code, it will break, because of the <Player> caste we have in the Class method addPlayer
        Team<String> brokenTeam = new Team<>("this won't work");
        brokenTeam.addPlayer("no-one");
    }

    private static void printDoubled(ArrayList<Integer> arr) {
        for (int ele : arr) {
            System.out.println(ele * 2);
        }
    }



}
