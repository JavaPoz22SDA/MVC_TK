package pl.sda.mvc;

public enum Health {
    HEALTHY("healthy"), DEAD("dead");

    private String title;

    Health(String title) {
        this.title = title;
    }
}
