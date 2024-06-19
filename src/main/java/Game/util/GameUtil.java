package Game.util;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

import javax.imageio.ImageIO;

/**
 * This class is responsible for getting images for use by other classes
 * and also responsible for rotating images.
 * @author Thomas Neal - modified
 */
public class GameUtil
{

	/**
	 * This method is responsible for translating the image path into a variable
	 * of type Image.
	 * @param imagePath
	 * this method takes in the path of the image needed.
	 * @return
	 * This method returns i, a variable of type Image which contains
	 * the image held at the path of the image which was passed into the
	 * method as a parameter.
	 */
	public Image getImage(String imagePath)
	{
		URL u = GameUtil.class.getResource(imagePath);
		BufferedImage i = null;
		try
		{
			assert u != null;
			i = ImageIO.read(u);
		} catch (Exception e)
		{
			System.err.println("ERROR: SPECIFIC IMAGE NOT FOUND !\n");
			e.printStackTrace();
		}
		return i;
	}

	/**
	 * This method takes in the name of an image file and returns true if it
	 * exists in the assets file and false if not.
	 * @param customBackgroundChoice
	 * this parameter contains the of the image file that is being checked
	 * for its existence.
	 * @return
	 * This method returns true if the file exists and false if not.
	 */
	public boolean imageExistence(String customBackgroundChoice) {
		if(Objects.equals(customBackgroundChoice, "")) {
			return false;
		}
		String filePath = "src/main/resources/assets/" + customBackgroundChoice;
		boolean exists = new File(filePath).exists();
		if(exists) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * This method is responsible for rotating an image.
	 * @param bufferedImage
	 * this parameter takes in the image to rotate.
	 * @param degree
	 * this parameter takes in how many degrees the user would like to rotate
	 * the image.
	 * @return
	 * This method returns the rotated image.
	 */
	public Image rotateImage(final BufferedImage bufferedImage,
							 final int degree)
	{
	int w = bufferedImage.getWidth();
	int h = bufferedImage.getHeight();
	int t = bufferedImage.getColorModel().getTransparency();
	BufferedImage i;
	Graphics2D graphics2d;
	(graphics2d = (i = new BufferedImage(w, h, t)).createGraphics()).
			setRenderingHint(RenderingHints.KEY_INTERPOLATION,
					RenderingHints.VALUE_INTERPOLATION_BILINEAR);
	graphics2d.rotate(Math.toRadians(degree), w / 2.0, h / 2.0);
	graphics2d.drawImage(bufferedImage, 0, 0, null);
	graphics2d.dispose();
	return i;

	}
}
