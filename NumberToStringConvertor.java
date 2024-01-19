public class NumberToStringConvertor {
    /**
     * Implement a static String numberToString(int n) that converts a integer n between 1 (inclusive) and one billion
       (exclusive) into a String. The numberToString method can cover a larger range if you wish. It should take
       appropriate action if the argument is out of range.
     */
    static String[] unit = {"","one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine "};
    static String[] ten_en = {"ten ", "eleven ", "twelve ", "thirteen ", "fourteen ", "fifteen ", "sixteen ", "seventeen ","eighteen ", "nineteen "};
    static String[] ten_ty= {"","","twenty ", "thirty ", "forty ", "fifty ", "sixty ", "seventy ","eighty ", "ninty "};
    static String numberToString(int n){


        if (n>0 && n<10)
            return unit [n];
        else if (n>9 && n<100)
            return twoDigits(n);
        else if (n>99 && n<1000)
            return threeDigits(n);
        else if (n>999 && n<1000000)
            return thousands(n);
       /* else if (n>9999 && n<100000)
            return fiveDigits(n);
        else if (n>99999 && n<1000000)
            return sixDigits(n);
        */else if (n>999999 && n<10000000)
            return sevenDigits(n);
        else if (n>9999999 && n<100000000)
            return eightDigits(n);
        else if (n>99999999 && n<1000000000)
            return nineDigits(n);
        else
            return "Number out of range";

    }
    static String twoDigits (int n){
        int temp1=n/10;
        int temp2 =n%10;
       // Object numberToString;
        if (temp1==1)
            return ten_en[temp2];
        String concatString = ten_ty[temp1]+ unit [temp2];
        return concatString;
    }

    static String threeDigits(int n){
        int temp1=n/100;
        int temp2=n%100;
        String concatString= unit[temp1]+ "hundred " + twoDigits(temp2);
        if (temp2!=0 )
            concatString= unit[temp1]+ "hundred " + twoDigits(temp2);
        else
            concatString= unit[temp1] + "hundred ";
        return concatString;
    }
 static  String thousands(int n){
     int temp1=n/1000;
     int temp2=n%1000;
     String concatString;
     if (n<10000){
         if (temp2!=0)
            return concatString= unit[temp1]+"thousand " +threeDigits(temp2);
         else
            return concatString= unit[temp1]+"thousand ";
     }
     else if (n>9999 & n<100000){
         if (temp2!=0)
             return concatString= twoDigits(temp1)+"thousand "+ threeDigits(temp2);
         else
             return concatString= twoDigits(temp1)+"thousand ";
     }
     else{
         if (temp2!=0 )
             return concatString= threeDigits(temp1) +"thousand "+ threeDigits(temp2);
         else
            return concatString= threeDigits(temp1)+ "thousand " ;
     }
 }
    static String sevenDigits(int n){
        int temp1 = n/1000000;
        int temp2=  n % 1000000;
        String concatString;
        if (temp2!=0 )
            concatString= unit[temp1]+ "million " + thousands(temp2);
        else
            concatString= unit[temp1]+ "million " ;
        return concatString;
    }
    static String eightDigits(int  n){
        int temp1 = n/1000000;
        int temp2=  n % 1000000;
        String concatString;
        if (temp2!=0 )
            concatString= twoDigits(temp1)+ "million " + thousands(temp2);
        else
            concatString= twoDigits(temp1)+ "million " ;
        return concatString;
    }

    static String nineDigits(int  n){
        int temp1 = n/1000000;
        int temp2=  n % 1000000;
        String concatString;
        if (temp2!=0 )
            concatString= threeDigits(temp1)+ "million " + thousands(temp2);
        else
            concatString= threeDigits(temp1)+ "million ";
        return concatString;
    }
}
