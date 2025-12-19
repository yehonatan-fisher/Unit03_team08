public class Unit03{
    
    public static int shiftRight(int num)    {
        return -1;
    }
    // (פישר)
    //method 2
    public static int shiftRight(int num, int k){
       if (num > 9999 || num < 1000){
            return -1;
            }
        if (k > 4 || k < 0){
            return -1;
        }
        for (int p = 0; k>p ; k--){
             int last = num % 10;
             num = num / 10;
             num += last * 1000;
         }
        return num;
    }
    //(פישר)
    //method 3
    public static int shiftRight2(int num, int k){
         if (num <= 0 || num > 9999)
            return -1;
        int digits = 0;
        for (int temp = num; temp > 0; temp /= 10) {
            digits++;
        }
        if (k < 0 || k > digits)
            return -1;
        int multiplier = 1;
        if (digits == 2)
            multiplier = 10;
        if (digits == 3)
            multiplier = 100;
        if (digits == 4)
            multiplier = 1000;
        for (int p = 0; k>p ; k--){
             int last = num % 10;
             num = num / 10;
             num += last * multiplier;
         }
        return num;
    }
   
    public static int shiftLeft(int num)    {
        return -1;
    }
    public static int shiftLeft(int num, int k){
        return -1;
    }
    public static String shiftRight(String s)    {
        return "";
    }
    public static String shiftLeft(String s)    {
        return "";
    }
    public static String shiftLeft(String s, int k)    {
        return "";
    }
    public static String shiftRight(String s, int k)    {
        return "";
    }
    public static int countWords(String s)    {
        return -1;
    }
    public static int countParts(String s, char separator)    {
        return -1;
    }
    public static String getParts(String s, char separator)    {
        return "";
    }
    public static void printParts(String s, char separator)    {
        
    } 
    
}
