package assign6;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    //Bouncer movingSprite;
    ArrayList<Bouncer> movingSprite;
    /** Initializes this class for drawing. */
    public DrawGraphics() {
//        Rectangle box = new Rectangle(15, 20, Color.RED);
//        movingSprite = new Bouncer(100, 170, box);
//        movingSprite.setMovementVector(3, 1);
        movingSprite = new ArrayList<>();

        Rectangle graphic1 = new Rectangle(15, 20, Color.RED);
        Bouncer movingSprite1 = new Bouncer(100, 170, graphic1);
        movingSprite1.setMovementVector(3, 1);
        movingSprite.add(movingSprite1);

        Oral graphic2 = new Oral(30, 10, Color.BLUE);
        Bouncer movingSprite2 = new Bouncer(10, 270, graphic2);
        movingSprite2.setMovementVector(1, 3);
        movingSprite.add(movingSprite2);
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        //movingSprite.draw(surface);
        for (Bouncer sprite : movingSprite) {
            sprite.draw(surface);
        }
    }
}
