package com.agavelabs.collections;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;




import java.util.Collections;
import java.util.List;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multiset;




public class MyCollectionsImp implements MyCollections {
	
	
	private final Multimap<Integer,Integer> map = ArrayListMultimap.create();
	private int pointer;
	
	public MyCollectionsImp() {
		pointer = 0;
	}

	public int insert(int item) {
		
		map.put(item, item);

		 
		return item;
	}

	public int remove(int item) {
		List<Integer> values = (List<Integer>) map.get(item);
		int value =0;
		int originalValue = 0;
		if ( values.size() > 1  ){
			value = values.get(values.size() - 1);
			map.remove(item, value);
		} else {
			map.removeAll(item);
			value = item;
		}
		
		return value;
	}
	
	public int removeLargest() {
	    Object[] values = map.values().toArray();
		int pointerArrayMaximo = map.values().size() - 1;
		int indice = (Integer) values[pointerArrayMaximo];
		remove(indice);
		return indice;
	}
	

	public Multimap<Integer, Integer> get(){
		return map;
	}
}
