public class Testing {
    /**
     * Implement a test method that provides automated testing of the numberToString method.
       Here, “automated” means that the test method does not require human input. Think
       carefully about what test cases provide good automated testing.
     */
    public static final void main (String [] args){
        //testing all the edge values
        System.out.println(NumberToStringConvertor.numberToString(1));
        System.out.println(NumberToStringConvertor.numberToString(9));
        System.out.println(NumberToStringConvertor.numberToString(10));
        System.out.println(NumberToStringConvertor.numberToString(19));
        System.out.println(NumberToStringConvertor.numberToString(21));
        System.out.println(NumberToStringConvertor.numberToString(29));
        System.out.println(NumberToStringConvertor.numberToString(100));
        System.out.println(NumberToStringConvertor.numberToString(999));
        System.out.println(NumberToStringConvertor.numberToString(1000));
        System.out.println(NumberToStringConvertor.numberToString(9999));
        System.out.println(NumberToStringConvertor.numberToString(10000));
        System.out.println(NumberToStringConvertor.numberToString(99999));
        System.out.println(NumberToStringConvertor.numberToString(100000));
        System.out.println(NumberToStringConvertor.numberToString(999999));
        System.out.println(NumberToStringConvertor.numberToString(1000000));
        System.out.println(NumberToStringConvertor.numberToString(9999999));
        System.out.println(NumberToStringConvertor.numberToString(10000000));
        System.out.println(NumberToStringConvertor.numberToString(99999999));
        System.out.println(NumberToStringConvertor.numberToString(100000000));
        System.out.println(NumberToStringConvertor.numberToString(999999999));

    }
}
/**
 * one
 * nine
 * ten
 * nineteen
 * twenty one
 * twenty nine
 * one hundred
 * nine hundred ninty nine
 * one thousand
 * nine thousand nine hundred ninty nine
 * ten thousand
 * ninty nine thousand nine hundred ninty nine
 * one hundred thousand
 * nine hundred ninty nine thousand nine hundred ninty nine
 * one million
 * nine million nine hundred ninty nine thousand nine hundred ninty nine
 * ten million
 * ninty nine million nine hundred ninty nine thousand nine hundred ninty nine
 * one hundred million
 * nine hundred ninty nine million nine hundred ninty nine thousand nine hundred ninty nine
 */