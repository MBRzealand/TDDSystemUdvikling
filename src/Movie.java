import java.time.LocalDate;
import java.util.Date;

public class Movie {

    private final String title;
    private final String description;
    private final int playtimeInMinutes;
    private String location;
    private LocalDate startTime;

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public int getPlaytimeInMinutes() {
        return playtimeInMinutes;
    }

    public LocalDate getStartTime() {
        return startTime;
    }


    public void setLocation(String location) {
        this.location = location;
    }

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }


    Movie(String title, String location, String description, int playtimeInMinutes, LocalDate startTime){
        this.title = title;
        this.location = location;
        this.description = description;
        this.playtimeInMinutes = playtimeInMinutes;
        this.startTime = startTime;
    }



}
