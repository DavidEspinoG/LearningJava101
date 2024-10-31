public class LearningThreads {

    public static void main(String[] args) {
        createThreads();
    }

    public static void createThreads() {
        Runnable runnable = () -> {
            System.out.println("Here");
          for(int i = 0; i < 3; i++) {
              System.out.println(Thread.currentThread().getId() + " - " + i);
          }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread2 = new Thread(runnable);
        thread2.start();

        Thread thread3 = new Thread(runnable);
        thread3.start();
    }
}
