package FlatLander;

import java.awt.Color;
import Constructs.Construct;
import Constructs.Point;




public abstract class FlatLander  implements FlatLanderContract {

	protected Color myColor;
	public  int x;
	public  int y;
	protected  int moveX = 0;
	protected  int moveY = 0;

	protected int time;
	protected int actionsPerTimeUnit;

	protected FlatLanderMemory memory;
	public double direction;
	
	protected String name;
	public boolean collidable;
	protected boolean shouldPhysicsApply;
	protected TypeOfEntity entityType;
	protected int previousX;
	protected int previousY;
	protected FlatLanderClassification classification = FlatLanderClassification.UNDETERMINED;

	public FlatLander( int x, int y, String name, double startingDir,
			boolean collidable, boolean shouldPhysicsApply, TypeOfEntity entityType, Color myColor) {
		this.myColor = myColor;
		this.x = x;
		this.y = y;
		this.name = name;
		this.collidable = collidable;
		this.shouldPhysicsApply = shouldPhysicsApply;
		this.entityType = entityType;
		actionsPerTimeUnit = 1;
		time = 0;

//		memory = new FlatLanderMemory();

		direction = startingDir;// 1.5708 + 1.5708;


	}



	public Color getColor() {
		return myColor;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	
	public void update() {
		moveX();
		moveY();
		time++;
	}


	


	
	public void pushtoMemory(Point point) {
		memory.pushConstruct(point);
	}

	public Construct popMemory() {
		return memory.popConstruct();
	}

	public Construct peekMemory() {
		return memory.peekConstruct();
	}

	public String getName() {
		return name;
	}

	public void setMoveX(int moveX) {
		this.moveX = moveX;
	}

	public void setMoveY(int moveY) {

		this.moveY = moveY;
	}

	public void moveX() {
		
		x = x + moveX;
	}

	public void moveY() {
		
		y = y + moveY;
		
	}

	public void setX(int i) {
		x = i;
	}

	public void setY(int i) {
	
		y = i;
	}









	public int getMoveY() {

		return moveY;
	}

	public int getMoveX() {

		return moveX;
	}

	public boolean shouldPhysicsApply() {

		return shouldPhysicsApply;
	} 

	public TypeOfEntity getEntityType() {
		return entityType;
	}

	public int getPreviousX() {
		return previousX;
	}

	public int getPreviousY() {
		return previousY;
	}

	public void setPreviousX(int previousX) {
		this.previousX = previousX;
	}

	public void setPreviousY(int previousY) {
		this.previousY = previousY;
	}

	public void changeMoveYBy(int i) {
		moveY = moveY+i;
		
		
		
		
		
	}

	public void changeMoveXBy(int i) {
		moveX = moveX+i;
	}



	public FlatLanderClassification getClassification() {
		return classification;
	}

	public void setClassification(FlatLanderClassification classification) {
		this.classification = classification;
	}







}
