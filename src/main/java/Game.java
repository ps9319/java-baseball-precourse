public class Game {
    private static final int GAME_NUM = 3;
    private Computer computer;
    private User user;
    private Validator validator;

    public Game(Computer computer, User user, Validator validator) {
        this.computer = computer;
        this.user = user;
        this.validator = validator;
    }

    public void start(){
    }

    public void restart(){

    }

    public void end(){
    }


}