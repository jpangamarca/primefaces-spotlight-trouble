package com.example.pfspdemo;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.omnifaces.cdi.ViewScoped;

@Named
@ViewScoped
public class ViewBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String nickname;
	private String email;
	private String blog;

	private Boolean panelRendered = false;

	public void showPanel() {
		this.panelRendered = true;

		this.setName(null);
		this.setNickname(null);
	}

	public void send() {
		String message = String.format("Registered! Name %s, nickname %s, email %s, blog %s",
				this.getName(), this.getNickname(), this.getEmail(), this.getBlog());
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, message, message));
		this.panelRendered = false;
	}

	public String getName() {
		return name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Boolean getPanelRendered() {
		return panelRendered;
	}

	public void setPanelRendered(Boolean panelRendered) {
		this.panelRendered = panelRendered;
	}

	public String getEmail() {
		return email;
	}

	public String getBlog() {
		return blog;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setBlog(String blog) {
		this.blog = blog;
	}

}
