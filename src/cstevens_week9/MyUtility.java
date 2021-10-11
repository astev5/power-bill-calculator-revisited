package cstevens_week9;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Chad Stevens
 * @Assignment Name: Week 9 Assignment
 * @Date: July 18, 2021
 * @Description: Classes & Objects
 */

//Begin Subclass MyUtility
public class MyUtility {

    // private constants
    private final double RATE_A = .0809;
    private final double RATE_B = .091;
    private final double RATE_C = .109;
    private final double RATE_TAX = .0346;

    private double usage;
    private double rate;
    private double subtotal;
    private double taxes;
    private double total;

    /**
     * Constructor - call to set values from Main
     *
     * @param prev
     * @param curr
     */
    public MyUtility(double prev, double curr) {
        setUsage(prev, curr);
        setRate(prev, curr);
        setSubtotal(usage, rate);
        setTaxes(RATE_TAX, subtotal);
        setTotal(taxes, subtotal);
    }

    /**
     * Constructor - Initializes default values of 0
     */
    public MyUtility() {
        this(0, 0);
    }

    /**
     * Method @setUsage: Method to calculate usage
     *
     * @param p
     * @param c
     */
    private void setUsage(double p, double c) {
        usage = (c - p);
    }

    /**
     * Method @getUsage: Method to get usage
     *
     * @return usage
     */
    public double getUsage() {
        return usage;
    }

    /**
     * Method @setRate: Method to determine rate based on usage
     *
     * @param p
     * @param c
     */
    private void setRate(double p, double c) {
        if (usage <= 500) {
            rate = RATE_A;
        } else if (usage >= 501 && usage <= 900) {
            rate = RATE_B;
        } else {
            rate = RATE_C;
        }
    }

    /**
     * Method @getRate: Method to get rate determined by usage
     *
     * @return rate
     */
    public double getRate() {
        return rate;
    }

    /**
     * Method @setSubtotal: Method to calculate subtotal
     *
     * @param usage
     * @param rate
     */
    private void setSubtotal(double usage, double rate) {
        subtotal = usage * rate;
    }

    /**
     * Method @getSubtotal: Method to get calculated subtotal
     *
     * @return subtotal
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * Method @setTaxes: Method to calculate taxes based on subtotal
     *
     * @param RATE_TAX
     * @param subtotal
     */
    private void setTaxes(double RATE_TAX, double subtotal) {
        taxes = RATE_TAX * subtotal;
    }

    /**
     * Method getTaxes: Method to get taxes based on subtotal
     *
     * @return taxes
     */
    public double getTaxes() {
        return taxes;
    }

    /**
     * Method @setTotal: Method to calculate total bill
     *
     * @param taxes
     * @param subtotal
     */
    private void setTotal(double taxes, double subtotal) {
        total = taxes + subtotal;
    }

    /**
     * Method @getTotal: Method to get total bill
     *
     * @return total
     */
    public double getTotal() {
        return total;
    }

}
