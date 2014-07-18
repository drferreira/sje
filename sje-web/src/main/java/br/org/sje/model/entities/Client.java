package br.org.sje.model.entities;

import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

/**
 * Created by drferreira on 18/07/14.
 */
public class Client implements Serializable{

    private String fullName;

    private String email;

    private String phone;

    @OneToMany
    private List<Message> messages;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
