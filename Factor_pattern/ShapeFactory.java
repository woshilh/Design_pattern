public class ShapeFactory{
	public Shape getShape(String shapeType){
		if(shapeType == null){
			return null;
		}
		if(shapeType.equalsIgnoreCase("rectangle")){
			return new Rectangle();
		}else if(shapeType.equalsIgnoreCase("square")){
			return new Square();
		}
		return null;	
	}
}
