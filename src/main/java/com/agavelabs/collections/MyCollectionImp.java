package com.agavelabs.collections;

import java.util.Collections;
import java.util.List;
import com.google.common.collect.Lists;

/**
 * task #1 of agavelab
 * @author uriel isai rodriguez rivas
 *
 */
public class MyCollectionImp implements MyCollections {
	
	private final List<Integer> collection = Lists.newArrayList();
	
	public MyCollectionImp() {
	}

	public int insert(int item) {
		collection.add(item);		
		return collection.size()-1;
	}

	public int remove(int item) {
		int valueRetorned = collection.get(item);
		collection.remove(item);
		return valueRetorned;
	}

	public int removeLargest() {
		int max = Collections.max(collection);
		collection.remove((Object)max);
		return max;
	}

}
