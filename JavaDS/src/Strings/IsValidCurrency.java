package Strings;
import java.util.*;
import java.util.regex.*;

public class IsValidCurrency {
    public boolean isCurrency(String strAmount) {
        StringBuilder sb = new StringBuilder(strAmount);
        int len = strAmount.length();
        List<Character> currency = Arrays.asList('\u0024', '\u20AC', '\uFFE5');
        
        // if len > 10 , invalid
        if(strAmount.length() > 10) return false;
        
        // Trying to reduce the string as much as possible
        // Remove negative chars
        if(strAmount.charAt(0) == '-') {
            sb.deleteCharAt(0);
            len--;
        }
        // Remove negative chars
        if( strAmount.charAt(0) == '(' && strAmount.charAt(len-1) == ')') {
            sb.deleteCharAt(0);
            len--;
            sb.deleteCharAt(len-1);
            len--;
        }
        System.out.println(sb.toString());
        System.out.println(currency.get(2));
        // Now validate first char (currency symbol) 
        if(currency.contains(sb.charAt(0))) { // Good, we have currency symbol
           
            if(sb.charAt(0) == currency.get(2)) { // Yen should now have decimals , so pattern should be different
                Pattern py = Pattern.compile("^(?:|[0-9]\\d{0,2}(?:\\,\\d{3})*)$");
                Matcher m = py.matcher(sb.toString());
                if(m.matches()) return true;
                else return false;
            } else {
                 // Now validate the remaining string
                sb.deleteCharAt(0); // lets remove the symbol as we already validated it
                
                Pattern p = Pattern.compile("^(?:|[0-9]\\d{0,2}(?:\\,\\d{3})*).\\d{2}$");
                Matcher m = p.matcher(sb.toString());
                if(m.matches()) return true;
                else return false;
            }
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        IsValidCurrency v = new IsValidCurrency();
        boolean isValid = v.isCurrency("(¥2400)");
        System.out.println(isValid);
    }
}
