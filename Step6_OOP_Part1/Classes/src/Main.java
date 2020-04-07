public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();            //we created an object porsche based on template Car
        Car holden = new Car();             //we created another object

        System.out.println("Model is " + porsche.getModel());

        porsche.setModel("Carrera");

        System.out.println("Model is " + porsche.getModel());
    }
}
