package com.jakobmenke.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.io.IOException;

@ManagedBean
public class DialogView {
    public void destroyWorld() {
        addMessage("System Erorr", "Please Try Again");

        try {
            Runtime.getRuntime().exec("say dogs are cool");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_FATAL, summary, detail);

        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
