package domain;

public class BigBox extends Box{
	
		private Integer valueOne;
		private Integer valueTwo;
		
		public BigBox() {}
		
		public BigBox (Integer valueOne, Integer valueTwo) { 
        setValueOne(valueOne); 
        setValueTwo(valueTwo); 
		}
		
		public Integer  getValueOne() { return valueOne; }
	    
		public Integer  getValueTwo() { return valueTwo; }
	    
		public void setValueOne(Integer valueOne) {      
	        this.valueOne = valueOne; 
	    }
	    
		public void setValueTwo(Integer valueTwo) {      
	        this.valueTwo = valueTwo; 
	    }
}
