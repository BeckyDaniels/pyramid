
public class own {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pyramid(9);

	}

	public static void pyramid(int size) {
		
		for (int a = 1; a <= size; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print(b + " ");
			}
			System.out.println("");
		}
		for (int a = 1; a <= size; a++) {
			for (int b = 1; b <= size + 1 - a; b++) {
				System.out.print(b + " ");
			}
			System.out.println("");
		}
	}

	}


