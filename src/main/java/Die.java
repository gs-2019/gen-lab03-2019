import java.util.Random;

public class Die {

    private int faceValue;

    Die(){
        this.faceValue = 0;
    }

    /*
    *
    * */
    public void throwDie(){
        int temp = 0;
        Random rand = new Random();
        //Generate a random number between 1-6
        this.faceValue = rand.nextInt(6) + 1;
    }

    public int getValue(){
        return this.faceValue;
    }
}
