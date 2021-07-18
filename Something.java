

abstract class Something {

	public byte b;
	
	public int i;

	public double d;

	public String s;


	abstract public boolean equals(Thing t);

	abstract public int hashcode();

	abstract public String toString();

}

class Thing extends Something{
	
	public byte b;
	public int i;
	public double d;
	public String s;
    
	public Thing(byte b,int i,double d,String s){
		this.b=b;
		this.i=i;
		this.d=d;
		this.s=s;
	}
    public boolean equals(Thing t) {
		
    	return (b==t.b && i==t.i && d==t.d && s.equals(t.s)) ; 
		
	}
	public int hashcode() {
		return i*(int)b;
		
	}
	public String toString() {
		return b + " " +  i + " " + d + " " + s;
	}
	
}

class Program {

	public static void main(String[] args) {
		
		Thing a=new Thing((byte) 12,65,0.5643,"test");
		
		Thing b=new Thing((byte) 12,65,0.5643,"test");
		
		Thing c=new Thing((byte) 12,65,0.5643,"tes");
		
		System.out.format("equals a=b?=%b ;equals a=c?=%b; hashcode of a =%d; a=%s",a.equals(b),a.equals(c),a.hashcode(),a.toString());
		

	}

}