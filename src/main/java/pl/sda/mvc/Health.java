package pl.sda.mvc;

public enum Health {
    HEALTHY("healthy"), DEAD("dead");

    private String title;

    @Override
    public String toString() {
        return "Health{" +
                "title='" + title + '\'' +
                '}';
    }

    Health(String title) {
        this.title = title;
    }
}
