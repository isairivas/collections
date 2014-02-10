package com.agavelabs.collections;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


/**
 * task #1 of agavelab
 * @author uriel isai rodriguez rivas
 *
 */
public class App 
{
    
    private final Logger log =  Logger.getLogger(com.agavelabs.collections.App.class.getName());
    
    public App(){
    	
    	MyCollections list = new MyCollectionImp();
    	
    	list.insert(40);
    	list.insert(25);
    	int c = list.insert(30);
    	
    	int r1 = list.remove(c);
    	log.info(r1);
    	
    	int r2 = list.removeLargest();
    	log.info(r2);
    	
    	list.insert(50);
    	
    	int r3 = list.removeLargest();
    	log.info(r3);
    	
    	int r4 = list.removeLargest();
    	log.info(r4);
    	
    	
    	/* insert elements, only millions not billions, depends on the memory */
    	for(int i = 1;i<30000000;i++){
    		list.insert(i);
    	} 
    	
    	log.info(list.removeLargest());
    }
    
    public static void main( String[] args )
    {
    	BasicConfigurator.configure(); // configure apache log4j
        new App(); // new instance of App
    }
    
}
