package Game.util;

import java.awt.Image;
import java.io.File;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

/**
 * This class is responsible for storing the required images in a hashmap for
 * other classes to use.
 * @author Thomas Neal - modified
 */
public class ImageUtil
{

	/**
	 * This method is a getter for images stored in the HashMap m_images.
	 * @return
	 * This method returns m_images, the HashMap object.
	 */
	public Map<String, Image> getImages() {
		return m_images;
	}

	/**
	 * This variable is a container for the HashMap which holds the images
	 * that will be required for the game.
	 */
	private final Map<String, Image> m_images = new HashMap<>();

	/**
	 * This constructor puts necessary images into the getImages() getter.
	 * @param util
	 * this parameter takes in the GameUtil object which is used to get images
	 * from their file path as a variable.
	 * @throws URISyntaxException
	 * thrown if the image path is not a correct URI reference.
	 */
	public ImageUtil(GameUtil util) throws URISyntaxException {
		int i = 0;
		getImages().put("snake-head-right",util.getImage
				("/assets/snake-head-right.png"));
		getImages().put("snake-body", util.getImage
				("/assets/snake-body.png"));
		getImages().put("whitesquare", util.getImage
				("/assets/whitesquare.png"));
		// obstacles
		FileImplementation FI = new FileImplementation
				(new File(getClass().getResource("/assets/sprites").
						toURI()).list());
		for(FileIterator Fi = FI.getFileIterator(); Fi.m_empty();){
			getImages().put(Integer.toString(i),
					util.getImage("/assets/sprites/"+Fi.m_value()));
			i++;
		}
		getImages().put("UI-background", util.getImage
				("/assets/UI-background.png"));
		getImages().put("game-scene-01", util.getImage
				("/assets/game-scene-01.jpg"));
		getImages().put("obstacle", util.getImage("/assets/" +
				"wall.png"));
	}
}
