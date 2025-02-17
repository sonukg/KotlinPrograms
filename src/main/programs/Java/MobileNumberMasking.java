package Java;

public class MobileNumberMasking {
    public static void main(String[] args){

        //1st way of showing last two digit of mobile number
        String mobileNumber="9817327816";
        String regex=mobileNumber.replaceAll(".(?=.{2})","#");
        System.out.println("Masked Mobile Number: " + regex);

        //2nd way mobile number masking
        String maskedNumber = maskMobileNumber(mobileNumber);
        System.out.println("Masked Mobile Number: " + maskedNumber);
    }

    private static String maskMobileNumber(String number) {
        int length = number.length();
        int lastTwoDigitsStartIndex = Math.max(length - 2, 0);

        String maskedDigits = new String(new char[length - 2]).replace("\0", "#");
        String lastTwoDigits = number.substring(lastTwoDigitsStartIndex);

        return maskedDigits + lastTwoDigits;
    }

}
