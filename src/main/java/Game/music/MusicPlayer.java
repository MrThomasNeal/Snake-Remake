package Game.music;

import java.io.BufferedInputStream;

import javazoom.jl.player.Player;

/**
 * This class is responsible for playing the music in the background of the game
 * whilst the user is playing.
 * @author Thomas Neal - modified
 */
public class MusicPlayer extends Thread
{

	/**
	 * This method is a getter for the variable containing the filename of the
	 * music to play in the game.
	 * @return
	 */
	private String getFileName() { return m_filename; }

	/**
	 * This method is a getter for the Player object which plays the music as
	 * a stream in the background of the game.
	 * @return
	 * This method returns the m_player variable which contains the object
	 * which will play the music as a stream.
	 */
	private Player getPlayer() {
		return m_player;
	}

	/**
	 * This method is a setter for the Player object which plays the music as
	 * a stream in the background of the game.
	 * @param m_player
	 * This method takes in m_player as a parameter which is the Player object
	 * which plays the music and sets it as a variable within this class.
	 */
	private void setPlayer(Player m_player) {
		this.m_player = m_player;
	}

	/**
	 * This method is a setter for the filename of the music that is going to
	 * play in the game.
	 * @param m_filename
	 * This method takes in the filename of the music that is going to be played
	 * in the game.
	 */
	private void setFileName(String m_filename) {this.m_filename = m_filename;}

	/**
	 * This method is a setter for the music state, which is used to determine
	 * whether music is currently playing or not.
	 * @param state
	 * This method takes in the state of the music and whether its playing or
	 * not
	 */
	private void setMusicState(boolean state) { this.musicState = state; }

	/**
	 * This method is a setter for the filename of the music that is going to
	 * be played. Once the filename has been set, this method will start the
	 * music thread and set the music state to true to show that music is now
	 * playing in the background.
	 * @param filename
	 * this variable is a container for the name of the file of the music
	 * that is going to be played.
	 */
	public void getMusicPlay(String filename)
	{
		setFileName(filename);
		play();
		setMusicState(true);
	}

	/**
	 * This method returns true or false depending on whether music is playing
	 * or not.
	 * @return
	 * This method returns true or false dependent on the state set using
	 * setFileName()
	 */
	public boolean isMusicPlaying() { return musicState; } // For Testing

	/**
	 * this variable is a container for the file name of the music that is
	 * going to be played in the game.
	 */
	private String m_filename;

	/**
	 * this variable is a container for the Player object which plays the music
	 * as a stream in the game.
	 */
	private Player m_player;

	/**
	 * this variable is a container for the state of the music, true if music
	 * is currently playing, false if not.
	 */
	private boolean musicState;

	/**
	 * This method is responsible for running the thread to allow the music
	 * the play as a stream in the background throughout the game.
	 */
	public void play()
	{
		new Thread()
		{
			@Override
			public void run()
			{
				super.run();
				try
				{
					setPlayer(new Player(new BufferedInputStream
							(getClass().getResourceAsStream(getFileName()))));
					getPlayer().play();

				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		}.start();
	}
}
