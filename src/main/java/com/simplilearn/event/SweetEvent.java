package com.simplilearn.event;

import org.springframework.context.ApplicationEvent;

public class SweetEvent extends ApplicationEvent{

	private static final long serialVersionUID = 1L;

	public SweetEvent(Object source) {
		super(source);
	}

}
