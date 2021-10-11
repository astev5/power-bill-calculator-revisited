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
        setRate(usage);
    } //End setUsage method

    /**
     * Method @getUsage: Method to get usage
     *
     * @return usage
     */
    public double getUsage() {
        return usage;
    } //End getUsage method

    /**
     * Method @setRate: Method to determine rate based on usage
     *
     * @param p
     * @param c
     */
    private void setRate(double usage) {
        if (usage <= 500) {
            rate = RATE_A;
        } else if (usage >= 501 && usage <= 900) {
            rate = RATE_B;
        } else {
            rate = RATE_C;
        }
        setSubtotal(usage, rate);
    } //End setRate method

    /**
     * Method @getRate: Method to get rate determined by usage
     *
     * @return rate
     */
    public double getRate() {
        return rate;
    } //End getRate method

    /**
     * Method @setSubtotal: Method to calculate subtotal
     *
     * @param usage
     * @param rate
     */
    private void setSubtotal(double usage, double rate) {
        subtotal = usage * rate;
        setTaxes(RATE_TAX, subtotal);
    } //End setSubtotal method

    /**
     * Method @getSubtotal: Method to get calculated subtotal
     *
     * @return subtotal
     */
    public double getSubtotal() {
        return subtotal;
    } //End getSubtotal method

    /**
     * Method @setTaxes: Method to calculate taxes based on subtotal
     *
     * @param RATE_TAX
     * @param subtotal
     */
    private void setTaxes(double RATE_TAX, double subtotal) {
        taxes = RATE_TAX * subtotal;
        setTotal(taxes, subtotal);
    } //End setTaxes method

    /**
     * Method getTaxes: Method to get taxes based on subtotal
     *
     * @return taxes
     */
    public double getTaxes() {
        return taxes;
    } //End getTaxes method

    /**
     * Method @setTotal: Method to calculate total bill
     *
     * @param taxes
     * @param subtotal
     */
    private void setTotal(double taxes, double subtotal) {
        total = taxes + subtotal;
    } //End setTotal method

    /**
     * Method @getTotal: Method to get total bill
     *
     * @return total
     */
    public double getTotal() {
        return total;
    } //End getTotal method
}
