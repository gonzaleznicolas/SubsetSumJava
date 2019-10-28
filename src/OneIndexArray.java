
public class OneIndexArray {
	private Integer[] array;
	
	public OneIndexArray(Integer[] input){
		array = input;
	}
	
	public int length(){ return array.length; }
	
	public Integer get(int index){
		return array[index - 1];
	}
	
	public void set(int index, Integer n){
		array[index - 1] = n;
	}
}
