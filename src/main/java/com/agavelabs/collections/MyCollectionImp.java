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
	
	public MyCollectionImp() {}

	/**
	 * insert an element
	 * @return index of the element
	 */
	public int insert(int item) {
		collection.add(item);		
		return collection.size()-1;
	}

	/**
	 * remove the element with identifier a index
	 * @return value of index
	 */
	public int remove(int item) {
		int valueRetorned = collection.get(item);
		collection.remove(item);
		return valueRetorned;
	}

	/**
	 * remove the element with maximum value 
	 * @return value of index with maximum value
	 */
	public int removeLargest() {
		if(collection.size() > 0){
			int max = Collections.max(collection);// get element with maximum value
			collection.remove((Object)max);
			return max;
		} else {
			return 0;
		}
	}

}
