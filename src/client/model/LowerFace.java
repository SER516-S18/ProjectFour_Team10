package client.model;

/**
 * @author Group10
 * @version 1.0
 * LowerFace class : To store information about lower face
 */
public class LowerFace {

    private double smile;
    private double clench;
    private double smirkLeft;
    private double smirkRight;
    private double laugh;

    /**
     * Constructor for LowerFace class
     * @param smile : smiling frequency
     * @param clench : clench frequency
     * @param setSmirkLeft : left smirking frequency
     * @param setSmirkRight : right smirking frequency
     * @param laugh : laughing frequency
     */
    public LowerFace(double smile, double clench, double smirkLeft,
    					double smirkRight, double laugh) {
        this.smile = smile;
        this.clench = clench;
        this.smirkLeft = smirkLeft;
        this.smirkRight = smirkRight;
        this.laugh = laugh;
    }

    /**
     * @param smile the smile to set
     */
    public void setSmile(double smile) {
        this.smile = smile;
    }

    /**
     * @return the smile
     */
    public double getSmile() {
        return smile;
    }

    /**
     * @param clench the clench to set
     */
    public void setClench(double clench) {
        this.clench = clench;
    }

    /**
     * @return the clench
     */
    public double getClench() {
        return clench;
    }

    /**
     * @param smirkLeft the smirkLeft to set
     */
    public void setSmirkLeft(double smirkLeft) {
        this.smirkLeft = smirkLeft;
    }

    /**
     * @return the smirkLeft
     */
    public double getSmirkLeft() {
        return smirkLeft;
    }

    /**
     * @param smirkRight the smirkRight to set
     */
    public void setSmirkRight(double smirkRight) {
        this.smirkRight = smirkRight;
    }

    /**
     * @return the smirkRight
     */
    public double getSmirkRight() {
        return smirkRight;
    }

    /**
     * @param laugh the laugh to set
     */
    public void setLaugh(double laugh) {
        this.laugh = laugh;
    }

    /**
     * @return the laugh
     */
    public double getLaugh() {
        return laugh;
    }
}