package com.devsuperior.work1.client.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

		private static final long serialVersionUID = 1L;
		
		public ResourceNotFoundException(String msg) {
			super(msg);
		}
}
	