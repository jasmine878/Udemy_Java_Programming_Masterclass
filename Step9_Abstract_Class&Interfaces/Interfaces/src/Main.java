public class Main {
    public static void main(String[] args) {
        ITelephone timsPhone = new DeskPhone(123456);

        timsPhone.powerOn();
        timsPhone.callPhone(555-555-5555);
        timsPhone.answer();

        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();;
    }
}
