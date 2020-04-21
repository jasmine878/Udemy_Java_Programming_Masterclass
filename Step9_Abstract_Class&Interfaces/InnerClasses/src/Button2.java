//we're attaching a Listener to our Button class so that the code executes when the button is clicked

import java.util.Scanner;

public class Button2 {
    private String title;
    private OnClickListener onClickListener;

    public Button2(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    private static Scanner scanner = new Scanner(System.in);
    private static Button2 btnPrint = new Button2("Print");

    public static void main(String[] args) {

        //we can create an anonymous inner class that implements the OnClickListener Interface and assign an instance of it to our button
        btnPrint.setOnClickListener(new OnClickListener() {
            @Override
            public void handleOnClick(String title) {
                System.out.println(title + " was clicked");
            }
        });
        listen();
    }

    //This is an Interface for the setOnClickListener method
    public interface OnClickListener {
        public void handleOnClick(String title);
    }

    //function to set our onClick listener
    //it assigns an object to the button in order to be able to handle those clicks
    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    //function to handle a Click action on the button itself
    public void handleOnClick() {
        this.onClickListener.handleOnClick(this.title);
    }

    //a method that simulates a listen method and clicks the button for us
    //by invoking the handleOnClick method
    private static void listen() {
        boolean quit = false;

        while(!quit) {
            System.out.println("Enter 0 to quit or 1 to handle onClick");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.handleOnClick();
            }
        }
    }
}
