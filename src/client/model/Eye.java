package client.model;

/**
 * @author Group10
 * @version 1.0
 * Eye class : To store information about the eyes
 */
public class Eye {

    private boolean blink;
    private boolean winkLeft;
    private boolean winkRight;
    private boolean lookLeft;
    private boolean lookRight;
    
    /**
     * Constructor for Eye class
     * @param blink whether eye is blinking or not
     * @param winkLeft winking info of left eye
     * @param winkRight winking info of right eye
     * @param lookLeft whether looking at left
     * @param lookRight  whether looking at right
     */
    public Eye(boolean blink, boolean winkLeft, boolean winkRight, 
    		boolean lookLeft, boolean lookRight) {
        this.blink = blink;
        this.winkLeft = winkLeft;
        this.winkRight = winkRight;
        this.lookLeft = lookLeft;
        this.lookRight = lookRight;
    }

    /**
     * @param blink the blink to set
     */
    public void setBlink(boolean blink) {
        this.blink = blink;
    }
    
    /**
     * @return the blink
     */
    public boolean getBlink() {
        return blink;
    }

    /**
     * @param winkLeft the winkLeft to set
     */
    public void setWinkLeft(boolean winkLeft) {
        this.winkLeft = winkLeft;
    }

    /**
     * @return the left wink
     */
    public boolean getWinkLeft() {
        return winkLeft;
    }

    /**
     * @param winkRight the winkRight to set
     */
    public void setWinkRight(boolean winkRight) {
        this.winkRight = winkRight;
    }

    /**
     * @return the right wink
     */
    public boolean getWinkRight() {
        return winkRight;
    }

    /**
     * @param lookLeft the lookLeft to set
     */
    public void setLookLeft(boolean lookLeft) {
        this.lookLeft = lookLeft;
    }

    /**
     * @return the left look
     */
    public boolean getLookLeft() {
        return lookLeft;
    }

    /**
     * @param lookRight the lookRight to set
     */
    public void setLookRight(boolean lookRight) {
        this.lookRight = lookRight;
    }

    /**
     * @return the right look
     */
    public boolean getLookRight() {
        return lookRight;
    }
}