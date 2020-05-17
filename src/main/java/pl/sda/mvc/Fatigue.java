package pl.sda.mvc;

public enum Fatigue {

    TIRED("tired"), SLEEPING("sleeping");

    Fatigue(String title) {
        this.title = title;
    }

    private String title;

    @Override
    public String toString() {
        return "Fatigue{" +
                "title='" + title + '\'' +
                '}';
    }
}
