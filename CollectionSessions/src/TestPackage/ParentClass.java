package TestPackage;

public /*final*/ class ParentClass {//to prevent ParentClass properties to get inherited we will declare the class as final(final is keyword)
	//to prevent inheritance we use final keyword.
	//to prevent method overriding also we use final keyword.
	
	public /*final*/ void start() {// in method also we can declare it as final.  
		System.out.println("Parent---- start method");
	}

}
