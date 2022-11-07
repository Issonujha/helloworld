package come.sonuVariabl.lembda;

import java.util.ArrayList;
import java.util.List;

class Data {
	private String name;

	public Data(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Data [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class WithVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int x = 10;
//		x++;
		new Thread(() -> System.out.println("Welcome here the value of x is " + x)).start();
		List<Data> list = new ArrayList<>();
		list.add(new Data("Sonu"));
		list.add(new Data("Raj"));
		list.add(new Data("Mukesh"));
		list.add(new Data("Suresh"));
		list.add(new Data("Madan"));
		list.add(new Data("Mala"));

//		for (int data : list) {
//			if (data >= 10) {
//				System.out.println(data);
//			}
//		}

//		list.forEach(data -> {
//			if (data >= 10) {
//				System.out.println(data);
//			}
//
//		});

		list.forEach(temp -> {
			System.out.println(temp.getName());
		});

	}

}
