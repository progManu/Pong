public class Game {

    private static Game game = null;
    private Game(){}

    public static Game getInstance(){
        if(game == null)
            game = new Game();
        return game;
    }

    public int run(int state){
        System.out.println("Game is running...");
        while (state == 1)
        {

        }

        return 0;
    }
}
