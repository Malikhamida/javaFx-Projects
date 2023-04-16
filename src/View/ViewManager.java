/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;

/**
 *
 * @author Malik
 */
public class ViewManager {
    public static LoginPage  logPage;
    public static SystemPage  SystemPage;
    
    
    private ViewManager(){   
    }
    
    public static void openLoginPage(){
        if (logPage == null) {
            logPage = new LoginPage();
            logPage.show();
        } else {
            logPage.show();
        }
        
    }
    public static void closeLoginPage(){
        if(logPage != null)
            logPage.close();
    }
    
    public static void openSystemPage() throws IOException{
        if (SystemPage == null) {
            SystemPage = new SystemPage();
            SystemPage.show();
        } else {
            SystemPage.show();
        }
        
    }
    public static void closeSystemPage(){
        if(SystemPage != null)
            SystemPage.close();
    }
}
