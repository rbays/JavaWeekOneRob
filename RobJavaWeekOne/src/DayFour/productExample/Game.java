package DayFour.productExample;

/**
 * Created by student on 30-Jun-16.
 */
public class Game {
    private String title;
    private String genre;
    private String dev;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDev() {
        return dev;
    }

    public void setDev(String dev) {
        this.dev = dev;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Game(String title, String genre, String dev, double price) {

        this.title = title;
        this.genre = genre;
        this.dev = dev;
        this.price = price;
    }


}
