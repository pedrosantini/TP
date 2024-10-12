package IntegerSet;

public class App {

	public static void main(String[] args) {
		IntegerSet a = new IntegerSet();
		IntegerSet b = new IntegerSet();
		
		a.insertElement(5);
		
		a.insertElement(8);
		
		a.insertElement(15);
		
		a.insertElement(20);
		
		a.insertElement(45);
		
		a.insertElement(12);
		
		a.insertElement(100);
		
		a.deleteElement(12);
		
		a.toSetString();
		
		b.insertElement(15);
		
		b.insertElement(18);
		
		b.insertElement(7);
		
		b.insertElement(11);
		
		b.insertElement(28);
		
		b.insertElement(33);
		
		b.insertElement(8);
		
		b.toSetString();
		
		IntegerSet c = new IntegerSet();
		
		b.deleteElement(18);
		
		c.union(a, b);
		
		c.toSetString();
		
		IntegerSet d = new IntegerSet();
		
		d.intersection(a, b);
		
		d.toSetString();
		
		IntegerSet e = new IntegerSet();
		IntegerSet f = new IntegerSet();
		
		e.union(c, d);
		f.union(d, c);
		
		e.toSetString();
		f.toSetString();
		
		System.out.println(a.isEqualTo(b));
		System.out.println(f.isEqualTo(e));
		
		
	}

}
