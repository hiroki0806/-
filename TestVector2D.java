package jp.aoyama.a5817005;

public class TestVector2D {
	public static void main(String[] args){
		Vector2D u=new Vector2D(1,0);
		Vector2D v=new Vector2D(0,1);
		Vector2D w=new Vector2D();
		w.show();
		w=u.scale(3).add(v.scale(4));
		System.out.println(w.norm());
		w=u.rot(Math.PI/4);
		w.show();
		System.out.println(Vector2D.dot(u,v));
	}
}
class Vector2D{
	private double a;
	private double b;
	public Vector2D(double x,double y){
		a =x;
		b =y;
	}
	public Vector2D(){
		this(0.0,0.0);
	}
	public double norm(){ //ƒxƒNƒgƒ‹‚Ìƒmƒ‹ƒ€
		double z = Math.sqrt(a*a+b*b);
		a /= z;
		b /= z;
		return z;
	}
	public Vector2D add(Vector2D v){
		return new Vector2D(a+v.a, b+v.b);
	}
	public Vector2D scale(double sca){ 
		return new Vector2D(a*sca, b*sca);
		
	}
	public Vector2D rot(double s){
		return new Vector2D(Math.sqrt(a*a+b*b)*Math.cos(s),Math.sqrt(a*a+b*b)*Math.sin(s));
	}

	public void show(){
		System.out.println("("+a+ "," + b+")");
	}
	public static double dot(Vector2D u,Vector2D v){
		return u.a*v.a +u.b*v.b;
	}
}

