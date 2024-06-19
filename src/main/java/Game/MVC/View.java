package Game.MVC;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

/**
 * This class represents the visual layer of the game. It is used to visualise
 * the data that the game needs contained within the Model, controlled by
 * the Controller.
 * @author Thomas Neal
 */
public class View extends JPanel implements KeyListener  {

    /**
     * This method is a getter for the controller object for this class.
     * @return
     * This method returns the controller object that was passed into this
     * class.
     */
    private Controller getController() {return m_controller;}

    /**
     * This method is getter for the JFrame object initialised within this class.
     * @return
     * This method returns the m_frame variable which is a container for the
     * JFrame object initialised within this class.
     */
    private JFrame getFrame() {return m_jframe;}

    /**
     * This method is a setter for the Controller object.
     * @param controller
     * this parameter takes in the Controller object that is going to be set
     * in this class.
     */
    public void setController(Controller controller) {
        this.m_controller = controller;
    }

    /**
     * This variable is a container for the Controller object that is passed
     * into the constructor upon initialising the View object.
     */
    private Controller m_controller;

    /**
     * This variable contains the newly made JFrame object which is used to
     * create the GUI for the game.
     */
    private final JFrame m_jframe = new JFrame();

    /**
     * This variable contains the required width for the game window.
     */
    public static int WIDTH = 900;

    /**
     * This variable contains the required height for the game window
     */
    public static int HEIGHT = 600;

    /**
     * This method is the constructor for the View class. It takes in the
     * controller object which is used to control any data changes that may
     * occur throughout the duration of play. In addition to this, this
     * constructor sets all the options for the GUI and calls loop() to
     * start the game and keep it updating.
     * @param controller
     * this variable contains the Controller object which will be used to control
     * any data changed that may occur throughout the duration of play.
     */
    public View(Controller controller) {
        setController(controller);
        getController().setJFrame(getFrame());
        this.setDoubleBuffered(true);
        getFrame().add(this);
        getFrame().addKeyListener(this);

        getFrame().setTitle("Snake");
        getFrame().setSize(WIDTH, HEIGHT);
        getFrame().setLocationRelativeTo(null);
        getFrame().addWindowListener(new WindowAdapter()// loka
        {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
        getFrame().setVisible(true);
        loop();
    }

    /**
     * This method initially starts the game by calling super.run() and uses a
     * thread to repeatedly update the game by calling repaint() every REFRESH
     * milliseconds.
     */
    public void loop() {
        final int REFRESH = 30;
        new Thread() {
            @Override
            public void run() {
                super.run();
                while (true) {
                    repaint();
                    try {
                        sleep(REFRESH);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }

    /**
     * This method calls the Controller's paint() method in order to update
     * the games graphics based on any new I/O or logic changes within the
     * game.
     * @param g  the <code>Graphics</code> context in which to paint
     */
    @Override
    public void paint(Graphics g) {
        try {
            getController().paint(g);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * This method is called based on a KeyEvent when a key is typed.
     * @param e the event to be processed
     */
    @Override
    public void keyTyped(KeyEvent e) {}
    /**
     * This method is called based on a KeyEvent when a key is pressed.
     * @param e the event to be processed
     */
    @Override
    public void keyPressed(KeyEvent e) {
        getController().keyPressed(e);
    }
    /**
     * This is called based on a KeyEvent when a key is released.
     * @param e the event to be processed
     */
    @Override
    public void keyReleased(KeyEvent e) {}
}
