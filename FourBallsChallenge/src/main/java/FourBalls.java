import processing.core.PApplet;
public class FourBalls extends PApplet{

    public static final int HEIGHT = 480;
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

        text("Ball-1",0,HEIGHT/5,0);
        ellipse(X,HEIGHT/5, DIAMETERX, DIAMETERY);
        X++;
        text("Ball-2",0,HEIGHT*2/5,0);
        ellipse(X2,HEIGHT*2/5, DIAMETERX, DIAMETERY);
        X2+=2;
        text("Ball-3",0,HEIGHT*3/5,0);
        ellipse(X3,HEIGHT*3/5, DIAMETERX, DIAMETERY);
        X3+=3;
        text("Ball-4",0,HEIGHT*4/5,0);
        ellipse(X4,HEIGHT*4/5, DIAMETERX, DIAMETERY);
        X4+=4;

    }
}
