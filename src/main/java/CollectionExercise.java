import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

class VideoGame {
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

public class CollectionExercise {
    public static void main(String[] args) {
        VideoGame halo = new VideoGame("Halo", 1, "Shooter");
        VideoGame zelda = new VideoGame("Zelda", 1, "Adventure");
        VideoGame mario = new VideoGame("Mario 64", 1, "Adventure");
        VideoGame kirby = new VideoGame("Kirby", 1, "Adventure");

        List<VideoGame> videoGames = List.of(halo, zelda, mario, kirby);
        Predicate<VideoGame> isMultiplayer = videogame -> videogame.getPlayers() > 1;
        Predicate<VideoGame> areAllOnePlayer = videogame -> videogame.getPlayers() == 1;
        Predicate<VideoGame> isThereGTA = videogame -> Objects.equals(videogame.getName(), "GTA");
        boolean anyMultiplayer = videoGames.stream().anyMatch(isMultiplayer);
        boolean allOnePlayer = videoGames.stream().allMatch(areAllOnePlayer);
        boolean GTA = videoGames.stream().noneMatch(isThereGTA);
        System.out.println(anyMultiplayer);
        System.out.println("All the games are for one player: " + allOnePlayer);
        System.out.println("We don't have GTA: " + GTA);

    }



}
