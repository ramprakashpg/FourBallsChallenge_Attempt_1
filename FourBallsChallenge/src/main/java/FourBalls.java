import processing.core.PApplet;
public class FourBalls extends PApplet{

    public static final int HEIGHT = 480;
    public static final int Ball4Height = HEIGHT * 4 / 5;
    public static final int Ball3Height = HEIGHT * 3 / 5;
    public static final int Ball2Height = HEIGHT * 2 / 5;
    public static final int Ball1Height = HEIGHT / 5;
    public static final int WIDTH = 640;
    public static final int RGB1 = 255;
    public static final int DIAMETERX = 20;
    public static final int DIAMETERY = 20;
    public static int X = 0;
    public static int X2 = 0;
    public static int X3 = 0;
    public static int X4 = 0;

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
        text("Ball-1",0,Ball1Height,0);
        ellipse(X, Ball1Height, DIAMETERX, DIAMETERY);
        X++;
        text("Ball-2",0,Ball2Height,0);
        ellipse(X2, Ball2Height, DIAMETERX, DIAMETERY);
        X2+=2;
        text("Ball-3",0,Ball3Height,0);
        ellipse(X3, Ball3Height, DIAMETERX, DIAMETERY);
        X3+=3;
        text("Ball-4",0,Ball4Height,0);
        ellipse(X4, Ball4Height, DIAMETERX, DIAMETERY);
        X4+=4;

    }
}
