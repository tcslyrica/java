package com.tcs.abstraction;

public abstract class Staff {
	private String name;

	public void fillTimesheet() {
		System.out.println(name + "has filled the ts");
	}
	public abstract void work();

}	
	class HR extends Staff {
		
		@Override 
		public void work() {
			System.out.println("Hr is w3orking");
		}
	}
	
	class Guard extends Staff {
		public void work() {
			System.out.println("guard is working");
		}
		
	}
	
	
	

