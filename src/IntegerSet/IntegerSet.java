package IntegerSet;

public class IntegerSet {
	private boolean[] v;

	public IntegerSet() {
		this.v = new boolean[101];
		for(int i=0; i < 101; i++) {
			v[i] = false;
		}
	}
	
	public void insertElement(int x) {
		this.v[x] = true;
	}
	
	public void deleteElement(int x) {
		this.v[x] = false;
	}
	
	public void toSetString() {
		for(int i=0; i < 101; i++) 
			if (this.v[i])
				System.out.print(i +" ");
		System.out.println("");
	}
	
	public void union(IntegerSet a, IntegerSet b) {		
		for(int i=0; i < 101; i++)
			if(a.v[i] || b.v[i])
				this.v[i] = true;		
	}
	
	public void intersection(IntegerSet a, IntegerSet b) {
		for(int i=0; i < 101; i++)
			if(a.v[i] && b.v[i])
				this.v[i] = true;
	}
	
	public boolean isEqualTo(IntegerSet b) {
		for(int i=0; i < 101; i++)
			if(this.v[i] != b.v[i])
				return false;
		return true;
	}
	
	

}
