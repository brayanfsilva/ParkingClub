/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.parkingclub.web.view;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import org.omnifaces.cdi.ViewScoped;

/**
 *
 * @author BrayanFSilvaR
 */
@Named(value = "inicioSesionViewController")
@ViewScoped
public class InicioSesionViewController implements Serializable {

    private String user;
    private String password;

    /**
     * Creates a new instance of InicioSesionViewController
     */
    public InicioSesionViewController() {

    }

    @PostConstruct
    public void init() {

    }

}
