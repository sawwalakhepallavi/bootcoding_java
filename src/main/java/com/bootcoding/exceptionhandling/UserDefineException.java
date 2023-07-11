package com.bootcoding.exceptionhandling;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class UserDefineException {
    public static void main(String[] args) {
        int i=5;
        try{
            if(i<10){
                throw new MyException("User Define Exception");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
