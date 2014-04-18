/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MainPack;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author Ranjith
 */

/*This class is used to embed details like names and comments on a image file*/

public class EmbedDetails {
    EmbedDetails() throws IOException
    {
     final BufferedImage image = ImageIO.read(new URL("http://upload.wikimedia.org/wikipedia/en/2/24/Lenna.png"));

    Graphics g = image.getGraphics();
    g.setFont(g.getFont().deriveFont(30f));
    g.drawString("Hello World!", 100, 100);
    g.dispose();

    ImageIO.write(image, "png", new File("test.png"));
    }
}
