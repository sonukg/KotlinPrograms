package Java;

import java.util.Random;

public class GenerateOtp {
    public static void main(String[] args){

        // 1st way generating otp
        int random= (int) (Math.random()*9000+1000);
        String otpValue=String.valueOf(random);
        System.out.println("Otp is: "+otpValue);

        // 2nd way of creating otp
        int otpLength=6;
        String otp=generateOTP(otpLength);
        System.out.println("Otp is: "+otp);
    }

    private static String generateOTP(int length) {
        String numbers = "0123456789"; // Possible characters for the OTP

        Random random = new Random();
        StringBuilder otpBuilder = new StringBuilder();

        // Generate random digits for OTP
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(numbers.length());
            char digit = numbers.charAt(index);
            otpBuilder.append(digit);
        }

        return otpBuilder.toString();
    }
}

