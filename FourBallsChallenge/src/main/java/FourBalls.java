import processing.core.PApplet;
public class FourBalls extends PApplet{

    public static final int HEIGHT = 480;
    public static final int Ball4Height = HEIGHT * 4 / 5;
    public static final int Ball3Height = HEIGHT * 3 / 5;
    public static final int Ball2Height = HEIGHT * 2 / 5;
    public static final int Ball1Height = HEIGHT / 5;
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

    @Override
    public void draw() {
        textSize(20f);

        ellipse(COORDINATE1, Ball1Height, DIAMETER, DIAMETER);
        COORDINATE1++;

        ellipse(COORDINATE2, Ball2Height, DIAMETER, DIAMETER);
        COORDINATE2+=2;

        ellipse(COORDINATE3, Ball3Height, DIAMETER, DIAMETER);
        COORDINATE3+=3;

        ellipse(COORDINATE4, Ball4Height, DIAMETER, DIAMETER);
        COORDINATE4+=4;

    }
}
