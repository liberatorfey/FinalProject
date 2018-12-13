/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WATCHARAPOL PLOYJAN
 */
public class RegisterService {
    
    static public boolean checkLength(String username,String password,String nickname,String tal){
        if(username.length() > 2 && password.length() > 2 && nickname.length() > 2 && 
           tal.length() == 10){
            return true;
        }else{
            return false;
        }
    }
    
    static public boolean checkNull(String ban,String tum,String om,String jung,String zip,String tal){
        if(ban==null || tum==null || om==null || jung==null || zip==null || tal==null){
            return false;
        }else{
            return true;
        }
    }
    
    static public boolean checkPassword(String password,String passwordcomfirm){
        if(password.equals(passwordcomfirm)){
            return true;
        }else{
            return false;
        }
    }
    
    static public boolean checkUsername(String username){
        return false;
    }
    
    static public void setUser(){
        
    }
}
