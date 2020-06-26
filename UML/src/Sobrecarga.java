
public class Sobrecarga {
	public int calcula(int x,int y){
	       return y+x;
	 }
	  public double calcula(double x,double y){
	        return x+y;
	   }
	  public String calcula(String x,String y){
	        return x+y;
	  }
	   public static void main(String args[]){
	     Sobrecarga calc= new Sobrecarga();
	     System.out.println(calc.calcula(1,1));
	    System.out.println(calc.calcula(2.0,6.1));
	    
	  }
}
