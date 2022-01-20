import processing.core.PApplet;
public class FourBalls extends PApplet{

    public static final int HEIGHT = 480;
    public static final int ball4Height = HEIGHT * 4 / 5;
    public static final int ball3Height = HEIGHT * 3 / 5;
    public static final int ball2Height = HEIGHT * 2 / 5;
    public static final int ball1Height = HEIGHT / 5;
    public static final int WIDTH = 640;
    public static final int RGB1 = 255;
    public static final int DIAMETER = 20;
    public static int COORDINATE1 = 0;
    public static int COORDINATE2 = 0;
    public static int COORDINATE3 = 0;
    public static int COORDINATE4 = 0;

    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        background(RGB1);
    }
    public void drawBallToWindow(int ballCoordinate, int heightOfBall, int diameter){
        ellipse(ballCoordinate, heightOfBall, diameter, diameter);
    }
    @Override
    public void draw() {
        textSize(20f);

        drawBallToWindow(COORDINATE1, ball1Height, DIAMETER);
        COORDINATE1++;

        drawBallToWindow(COORDINATE2, ball2Height, DIAMETER);
        COORDINATE2+=2;

        drawBallToWindow(COORDINATE3, ball3Height, DIAMETER);
        COORDINATE3+=3;

        drawBallToWindow(COORDINATE4, ball4Height, DIAMETER);
        COORDINATE4+=4;

    }
}
