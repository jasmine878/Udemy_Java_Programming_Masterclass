public class Main {

    public static void main(String[] args) {
	    int value = 1;

	    if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

	    int switchValue = 4;

	    switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3, 4, or 5");
                break;
            default:
                System.out.println("Was not 1 or 2");
        }

        char value2 = 'A';

	    switch(value2) {
            case 'A':
                System.out.println("Value equals 'A'");
                break;
            case 'B':
                System.out.println("Value equals 'B'");
                break;
            case 'C':
                System.out.println("Value equals 'C'");
            case 'D':
                System.out.println("Value equals 'D'");
            case 'E':
                System.out.println("Value equals 'E'");
            default:
                System.out.println("Value was not A, B, C, D, or E");
        }
    }
}
