package com.simplilearn.listeners;

import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.simplilearn.event.SweetEvent;

@Component
public class AppListeners {
	
	@EventListener
	public void contextStartedEvent(ContextStartedEvent e) {
		System.out.println("Context started ...");
	}
	
	@EventListener
	public void contextStartedEvent(ContextStoppedEvent e) {
		System.out.println("Context stopped ...");
	}
	
	
	@EventListener
	public void ashishReceivedSweet(SweetEvent event) {
		System.out.println("Ashish received sweet...");
	}
	
	@EventListener
	public void ParveenReceivedSweet(SweetEvent event) {
		System.out.println("Parveen received sweet...");
	}
	
	
	@EventListener
	public void gaganReceivedSweet(SweetEvent event) {
		System.out.println("Gagan received sweet...");
	}
	
	@EventListener
	public void truptiReceivedSweet(SweetEvent event) {
		System.out.println("Trupti received sweet...");
	}
	
	

}
