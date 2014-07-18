package br.org.sje.controllers;

import br.org.sje.business.services.ClienteService;
import br.org.sje.model.entities.Client;
import br.org.sje.model.entities.Message;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by drferreira on 18/07/14.
 */
@ViewScoped
@Named(value = "welcomeMessage")
public class WelcomeMessageController implements Serializable {

    @Inject
    private Client client;

    @Inject
    private Message message;

    @EJB
    private ClienteService clientServiceImp;


    public void sendMessage (){
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
