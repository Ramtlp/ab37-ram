package assignment;

public class LocalVariableProgram {
	public void localmethod() {
		String lvar = "This is local variable"; // local var
		System.out.println(lvar);

	}

	public static void main(String[] args) {
		LocalVariableProgram obj = new LocalVariableProgram();
		obj.localmethod();
	}

}
