import java.util.Enumeration;

public class EnumerationToIterator implements Iterator{

	Enumeration enumeration;

	public EnumerationToIterator(Enumeration enumeration){
		this.enumeration = enumeration;
	}

	public boolean hasNext(){
		return enumeration.hasMoreElements();
	}

	public Object next(){
		return enumeration.nextElement();
	}

	public void remove(){
		throw new UnsupportedOperationException();
	}
}
