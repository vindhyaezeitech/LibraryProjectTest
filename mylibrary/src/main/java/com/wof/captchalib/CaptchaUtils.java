package com.wof.captchalib;

import java.util.Random;

public class CaptchaUtils {

    private static CaptchaUtils captchaUtils = null;

    private char[] character = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    private int[] number = {1,2,3,4,5,6,7,8,9,0};

    public static CaptchaUtils getInstance(){
        if(captchaUtils == null){
            captchaUtils = new CaptchaUtils();
        }
        return captchaUtils;
    }

    private CaptchaUtils(){

    }

    public String getCaptcha(){
        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <6 ; i++) {
            if(i%2 == 0){
                builder.append(getRandomChar());
            }else {
                builder.append(getRandomNumber());
            }
        }
        return builder.toString();
    }

    char getRandomChar(){
        int rnd = new Random().nextInt(character.length);
        return character[rnd];
    }

    int getRandomNumber(){
        int rnd = new Random().nextInt(number.length);
        return number[rnd];
    }
}
