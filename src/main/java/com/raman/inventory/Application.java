package com.raman.inventory;


import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

import com.raman.resources.DynamoResource;
import com.raman.resources.InventoryResources;

/**
 * Main class 
 * dropwizard implementation
 *
 */
public class Application extends io.dropwizard.Application<Configuration>
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "running Application class" );
        new Application().run(new String[] {"server", "config.yml"}); 
    }

	@Override
	public void run(Configuration configuration, Environment environment)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("environment name: "+environment.getName()+"\nenvironment vallidator: "+environment.getValidator());
		System.out.println("registering rest resources");
		
		environment.jersey().register(new InventoryResources(environment.getValidator()));
		System.out.println("RAMAN:\n"+configuration.toString());
		environment.jersey().register(new DynamoResource(environment.getValidator()));
	}
}
