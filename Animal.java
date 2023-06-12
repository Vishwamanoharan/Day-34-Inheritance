package Inheritance2;

public class Animal {
	 
	
		String name;
		String type;

		Animal(){
			//L.I
		}
		
		Animal(String name,String type){
		
			this.name=name;
			this.type=type;
		}
		public void Details_animal(){

			System.out.println("Animal name: "+name);
			System.out.println("Animal Type: "+type);
			
			
		}



		

		
	}

class Animaldriver extends Animal{
	public static void main(String[]args){
		Animal A1=new Animal("Tiger","carniviours");
		Animal A2=new Animal("Dog","Omniouers");
		A1.Details_animal();
		A2.Details_animal();
	}

	
}

	
