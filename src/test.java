
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WATCHARAPOL PLOYJAN
 */
public class test {
    static String username = "jackey";
    static String password = "12345";
    static String passwordcomfirm = "12345";
    static String nickname = "jack";
    static String tal = "1234567890";
    static String ban = "40/200";
    static String tum = "hrad";
    static String om = "hooooo";
    static String jung ="dsfdsf";
    static String zip = "1234568";
    
    public static void main(String[] args){
        //if(RegisterService.checkLength(username, password, nickname, tal)==true){
          //  System.out.println("good good");
        //}else{
          //  System.out.println("bad bad");
        //}
        
        // if(RegisterService.checkNull(ban, tum, om, jung, zip, tal)==true){
          //  System.out.println("good good");
        //}else{
          //  System.out.println("bad bad");
        //}
        
        if(RegisterService.checkPassword(password, passwordcomfirm)){
            System.out.println("ok");
        }else{
            System.out.println("no");
        }
         
         
        
        
    }
    
}



