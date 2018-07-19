package com.gabrieldutra.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.gabrieldutra.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
