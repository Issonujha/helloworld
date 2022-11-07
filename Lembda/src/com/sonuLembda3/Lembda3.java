package com.sonuLembda3;

import java.util.ArrayList;
import java.util.Collections;
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

public class Lembda3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Data> list = new ArrayList<>();
		list.add(new Data("Sonu"));
		list.add(new Data("Raj"));
		list.add(new Data("Rohit"));
		list.add(new Data("Neel"));
		list.add(new Data("Jhon"));
		list.add(new Data("Somya"));
		Collections.sort(list, (Data o1, Data o2) -> o1.getName().compareTo(o2.getName()));
		for (Data data : list) {
			System.out.println(data.getName());
		}

	}

}
