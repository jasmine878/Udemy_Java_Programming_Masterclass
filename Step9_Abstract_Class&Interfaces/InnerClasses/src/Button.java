public class Button {
    private String title;
    private OnClickListener onClickListener;

    public Button (String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
