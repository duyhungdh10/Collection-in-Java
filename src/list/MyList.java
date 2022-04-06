package list;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;


public class MyList<T> extends AbstractList<T> {
	
	private T[] node;
	
	MyList(T[] array) {
		node = array;
	}
	
	@Override
	public T get(int index) throws ArrayIndexOutOfBoundsException {
		if (index >= size()) throw new ArrayIndexOutOfBoundsException();
		else return (T) node[index];
	}

	@Override
	public boolean add(T element) {
		T[] newArr = (T[]) new Object[size() + 1];
		System.arraycopy(node, 0, newArr, 0, size());

		newArr[newArr.length - 1] = element;

		node = (T[]) new Object[newArr.length];
		System.arraycopy(newArr, 0, node, 0, newArr.length);

		return true;
	}
	
	public void insert(int index, T element) { 
		T[] newArr = (T[]) new Object[size() + 1];
		System.arraycopy(node, 0, newArr, 0, size() - index - 1);

		newArr[index] = element;

		System.arraycopy(node, index, newArr, index + 1, size() - index);

		node = (T[]) new Object[newArr.length];
		System.arraycopy(newArr, 0, node, 0, newArr.length);

	}
	
	@Override
	public boolean addAll(Collection<? extends T> c) {
        Object[] a = c.toArray();
        int numNew = a.length;

        T[] newArr = (T[]) new Object[size()];
		System.arraycopy(node, 0, newArr, 0, size());
		
		node = (T[]) new Object[size() + numNew];
		System.arraycopy(newArr, 0, node, 0, newArr.length);
		System.arraycopy(a, 0, node, newArr.length, numNew);
		
		return numNew != 0;
    }
	
	public boolean removeByIndex(int index) {
		T[] newArr = (T[]) new Object[size() - 1];
		System.arraycopy(node, 0, newArr, 0, index);
		System.arraycopy(node, index + 1, newArr, index, size() - index - 1);

		node = (T[]) new Object[newArr.length];
		System.arraycopy(newArr, 0, node, 0, newArr.length);

		return true;
	}

	@Override
	public boolean remove(Object o) {
		if (o == null) {
			for (int index = 0; index < size(); index++) {
				if (node[index] == null) {
					removeByIndex(index);
					index--;
				}
			}
			return true;
		} else {
			for (int index = 0; index < size(); index++) {
				if (o.equals(node[index])) {
					removeByIndex(index);
					index--;
				}
			}
			return true;
		}
	}

	public int indexOf(Object o) {
		if (o == null) {
			for (int i = 0; i < size(); i++)
				if (node[i] == null)
					return i;
		} else {
			for (int i = 0; i < size(); i++)
				if (o.equals(node[i]))
					return i;
		}
		return -1;
	}

	public int lastIndexOf(Object o) {
		if (o == null) {
			for (int i = size() - 1; i >= 0; i--)
				if (node[i] == null)
					return i;
		} else {
			for (int i = size() - 1; i >= 0; i--)
				if (o.equals(node[i]))
					return i;
		}
		return -1;
	}
	
	@Override
	public int size() {
		return node.length;
	}
	
	@Override
	public boolean isEmpty() {
		return size() == 0;
	}
	
	@Override
	public T[] toArray() {
		return node.clone();
	}
	
	
	public static void main(String[] args) {
		String[] arr = { "four", "zezo", "one", "two", "three", "four", "four", "five", "six", "four" };

		MyList<String> list = new MyList<String>(arr);

		System.out.println(list.get(1));
		System.out.println("-----");

		
		// Test
		list.add("tennnn");
		list.removeByIndex(2);
		list.remove("four");
		list.insert (2, "testAddByIndex");
		
		for (String str : list) {
			System.out.println(str);
		}

		String[] template = new String[list.size()];
		for (int i = 0; i < list.size(); i ++) {
			template[i] = list.get(i);
		}
		
		System.out.println("-------------");
		
		/* SORT
		Sort.InsertionSort(new Compara(),  template);
		
		
				Sort.InsertionSort(( str1, str2) -> {
					return ((String) str1).compareTo((String) str2);
				},  template);
		
		
		list = new MyList<String>(template);
		*/
		
		list.sort();
		
		for (String str : list) {
			System.out.println(str);
		}
		
		
		
	}
	public void sort() {
		if( node !=null && node.length!=0) {
			
			for(int i = 0; i < node.length-1 ;i++) {
				for(int j = i+1; j < node.length ;j++) {
					if(((Comparable) node[i]).compareTo(((Comparable) node[j]))>0) {
						Comparable temp = (Comparable) node[i];
						node[i] = (T) node[j];
						node[j] = (T) temp;
					}
				}
			}
		}
	
	}
}
	
class Compara implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {
		return str1.compareTo(str2);
	}

}
