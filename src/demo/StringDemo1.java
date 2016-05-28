package demo;

import java.io.ObjectStreamField;
import java.util.Arrays;

public class StringDemo1 implements java.io.Serializable, Comparable<String>, CharSequence{

	private final char value[];
    private int hash; // Default to 0
    private static final long serialVersionUID = -6849794470754667710L;
    private static final ObjectStreamField[] serialPersistentFields =
            new ObjectStreamField[0];
    public StringDemo1() {
        this.value = new char[0];
    }
    public StringDemo1(StringDemo1 original) {
        this.value = original.value;
        this.hash = original.hash;
    }
    public StringDemo1(char value[]) {
        this.value = Arrays.copyOf(value, value.length);
    }
    public StringDemo1(char value[], int offset, int count) {
        if (offset < 0) {
            throw new StringIndexOutOfBoundsException(offset);
        }
        if (count < 0) {
            throw new StringIndexOutOfBoundsException(count);
        }
        // Note: offset or count might be near -1>>>1.
        if (offset > value.length - count) {
            throw new StringIndexOutOfBoundsException(offset + count);
        }
        this.value = Arrays.copyOfRange(value, offset, offset+count);
    }
    
	 
	public static void main(String[] args) {

	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int compareTo(String o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public int compare(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int min = Math.min(n1, n2);
        for (int i = 0; i < min; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 != c2) {
                c1 = Character.toUpperCase(c1);
                c2 = Character.toUpperCase(c2);
                if (c1 != c2) {
                    c1 = Character.toLowerCase(c1);
                    c2 = Character.toLowerCase(c2);
                    if (c1 != c2) {
                        // No overflow because of numeric promotion
                        return c1 - c2;
                    }
                }
            }
        }
        return n1 - n2;
    }

}
class Str extends StringDemo1{
	StringDemo1 第三方;
	StringDemo1 sd;
	String 的速度;
	String m1 = "东方时代";
	
	
}
