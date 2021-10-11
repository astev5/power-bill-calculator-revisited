# power-bill-calculator-revisited
A program that calculates a power utility bill based on determined usage.

## Assignment
Write a program that will ask for the customer’s last and current meter reading in Kilowatt Hours (KwHs). Determine the amount of usage for the month and calculate a sub total (before tax) and a total amount due (tax included) using the following constraints.

## Constraints
- Rate A: For 500 KwHs or less = $0.0809 / KwH
- Rate B: For 501 to 900 KwHs = $0.091 / KwH
- Rate C: For greater than 900 KwHs = $0.109 / KwH
- Utilities Tax is 3.46% regardless of usage.

## Requirements
- Create a separate (external to the main class) subclass MyUtility().
- Rate and tax variables should be private to the subclass.
- Use a constructor to initialize the default reading values to 0.
- Use another constructor to set the reading values.
- Use set and get methods in MyUtility() to determine the usage, rate, subtotal, tax, and final bill.
- The set methods should be private.
- Format all output as follows:
  - Usage to 1 decimal place, KhWs
  - Rate to 4 decimal places, monetary
  - Subtotal to 2 decimal places, monetary
  - Taxes to 2 decimal places, monetary
  - Total to 2 decimal places, monetary
- Implement a loop to return and enter new values (run the program again) if the user wishes to.

## Notes
- Set methods should do all the computation.
- Set methods can call other set methods (method chaining).
