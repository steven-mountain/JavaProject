package MyString1_10_22;

public class MyString1 {
	char[] ch;

	public MyString1(char[] ch) {
		super();
		this.ch = ch;
	}
	
	public char charAt(int index) {
		return ch[index];
	}
	
	public int length() {
		int length = 0;
		while(ch[length++] != '\0');
		return length;
	}
	
	public MyString1 substring(int begin, int end) {
		char[] temp = new char[end - begin + 1];
		int index = 0;
		for(int i = begin; i <= end; ++i) {
			temp[index++] = ch[i];
		}
		return new MyString1(temp);
	}
	
	public MyString1 toUpperCase() {
		int length = 0;
		char[] temp = ch;
		while(temp[length] != '\0') {
			if(temp[length] >= 'a' && ch[length] <= 'z')
				temp[length] -= 32;
		}
		return new MyString1(temp);
	}
	
	public MyString1 toLowerCase() {
		int length = 0;
		char[] temp = ch;
		while(temp[length] != '\0') {
			if(temp[length] >= 'A' && ch[length] <= 'Z')
				temp[length] += 32;
		}
		return new MyString1(temp);
	}
	
	public boolean equals(MyString1 s) {
		if(s.ch.length != ch.length)
			return false;
		else {
			int index = 0;
			while(true) {
				if(index == ch.length)
					break;
				if(s.ch[index] != ch[index] || ch[index] == '\0' || s.ch[index] == '\0')
					return false;
				++index;
			}
				return true;
		}
	}
	
	public static MyString1 valueOf(int i) {
		int length = 0;
		int tem = i;
		while(tem> 0) {
			++length;
			tem /= 10;
		}
		
		char[] temp = new char[length];
		int index = 0;
	
		tem = i;
		while(tem> 0) {
			temp[index++] = (char) (tem % 10);
			tem /= 10;
		}
		
		return new MyString1(temp);
	}
	
}
