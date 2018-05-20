package ListConcept;

public class FinalizeConcept {
	
	public void finalize() {//finalize is a method. always remember.
		System.out.println("finalize method");
	}

	public static void main(String[] args) {
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1=null;
		f2=null;
		
		System.gc();//garbage collector concept-finalize will be called before garbage collector just to cleanup the process of the object.

	}

}
