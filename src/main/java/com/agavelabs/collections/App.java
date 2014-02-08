package com.agavelabs.collections;

import com.google.common.collect.Multimap;

/**
 * task #1 of agavelab
 * @author uriel isai rodriguez rivas
 *
 */
public class App 
{
    
    
    public App(){
    	MyCollectionsImp lista = new MyCollectionsImp();
    	lista.insert(5);

    	lista.insert(8);
    	lista.insert(10);
    	lista.insert(10);
    	lista.insert(8);
    	for(int i = 1;i<9999;i++){
    		lista.insert(i);
    		if(i == 987171 ){
    			lista.insert(i);
    		}
    	}
    	
    	System.out.println("termino de agregar elementos");
    	int eliminado = lista.removeLargest();
    	System.out.println("Eliminado:"+eliminado);
    	//System.out.println(lista.remove(987171));
    	print(lista);
    	System.out.println("fin");
    }
    
    private void print(MyCollectionsImp lista){
    	 Multimap<Integer, Integer> map = lista.get();
    	for(Object item: map.values()){
    		System.out.println(item);
    	}
    }
    
    public static void main( String[] args )
    {
        new App();
    }
    
}
