//using the package members without importing it
package p1;

class WithoutImport{
	public static void main(String[] args){
		//using fully qualified names
		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
	}
}