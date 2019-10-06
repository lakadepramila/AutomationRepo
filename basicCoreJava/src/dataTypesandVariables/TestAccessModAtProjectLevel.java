package dataTypesandVariables;

import Functions.Accessmodifier;

public class TestAccessModAtProjectLevel extends Accessmodifier{

	public static void main(String[] args) {
		Accessmodifier obj=new Accessmodifier();
		obj.publicFunction();
		
		TestAccessModAtProjectLevel obj2=new TestAccessModAtProjectLevel();
		obj2.protectedFunction();
	}

}
