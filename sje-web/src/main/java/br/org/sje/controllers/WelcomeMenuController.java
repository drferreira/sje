package br.org.sje.controllers;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by drferreira on 17/07/14.
 */
@ViewScoped
@Named
public class WelcomeMenuController implements Serializable{
    private static final String ADMIN_PAGE = "ADMIN_PAGE";

    public String openAdminSession(){
        return ADMIN_PAGE;
    }

}
