public class VideoGame {
    private String name;
    private Integer players;
    private String genre;

    public VideoGame(String name, Integer players, String genre) {
        super();
        this.name = name;
        this.players = players;
        this.genre = genre;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPlayers() {
        return this.players;
    }

    public void setPlayers(Integer players) {
        this.players = players;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String toString() {
        return "VideoGame: " + this.name;
    }

}