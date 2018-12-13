/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WATCHARAPOL PLOYJAN
 */
public class LoginService {
    
    static public boolean checkLength(String username,String password){
        if(username.length()>3 && password.length()>3){
            return true;
        }else{
            return false;
        }
    }
    
    static public boolean checkUserexists(String username){
        return false;
    }
    
    static public boolean checkPassword(String username,String password){
        return false;
    }
    
    public void gotoMainPage(){
        
    }
}
