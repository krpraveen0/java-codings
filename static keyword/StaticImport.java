import static java.lang.Thread.*;//import all static members of the Thread class
import static java.lang.System.out;//only imports out class of System class of lang package.

class StaticImport{
	public static void main(String[] args){
		out.println(MIN_PRIORITY);
		out.println(MAX_PRIORITY);
		out.println(NORM_PRIORITY);
	}
}