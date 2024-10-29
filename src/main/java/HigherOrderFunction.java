import java.util.function.Predicate;

public class HigherOrderFunction {
    public static void main(String[] args) {
        VideoGame zelda = new VideoGame("Zelda", 1, "Adventure");
        Predicate<VideoGame> myPredicate = hasMoreThanXPlayers(0);
        System.out.println(myPredicate.test(zelda));
    }
    public static Predicate<VideoGame> hasMoreThanXPlayers(int players) {
        return VideoGame -> VideoGame.getPlayers() > players;
    }

}
