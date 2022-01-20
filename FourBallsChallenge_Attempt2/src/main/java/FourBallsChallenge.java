import processing.core.PApplet;
public class FourBallsChallenge extends PApplet{
    public static void main(String[] args) {
        PApplet.main("FourBallsChallenge", args);
    }
    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static final int DIAMETER = 10;
    public int BALL1 = 0;
    public int BALL2 = 0;
    public int BALL3 = 0;
    public int BALL4 = 0;
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        background(255);
    }

    public int drawCircle(int BALL,int Height, int Diameter, int step){
        ellipse(BALL,Height,10,10);
        BALL+=step;
        return BALL;
    }
    @Override
    public void draw() {
        BALL1 = drawCircle(BALL1, HEIGHT/5,DIAMETER,1);

    }
}

