public class PrototypePatternDemo{
	public static void main(String[] args){
		ShapeCache.loadCache();
		
		Shape cloneShape2 = (Shape)ShapeCache.getShape("2");
		System.out.println("shape : " + cloneShape2.getType());

		Shape cloneShape3 = (Shape)ShapeCache.getShape("3");
		System.out.println("shape : " + cloneShape3.getType());
		
	}
}
