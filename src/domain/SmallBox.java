package domain;

public class SmallBox extends Box{
	 	private Integer value;
	    
	 	public SmallBox() {}
	    
	 	public SmallBox(Integer value) { setValue(value); }
	   
	 	public Integer  getValue() { return value; }
	    
	 	public void setValue(Integer value) { this.value = value; }
}
