package br.org.sje.business.services;

import br.org.sje.model.entities.Client;

import javax.ejb.Local;
import javax.ejb.Stateless;
import java.io.Serializable;

/**
 * Created by drferreira on 18/07/14.
 */
@Stateless
@Local(ClienteService.class)
public class ClientServiceImp implements Serializable, ClienteService{

    public Client fetchByEmail(String email){
        // TODO
        return null;
    }

}
