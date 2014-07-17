package com.example.tutorial.pages;

import java.util.List;
import java.util.Random;

import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;

import com.example.tutorial.entities.Address;

public class Index
{
	@Inject
	private Session session;
	 
	@SuppressWarnings("unchecked")
	public List<Address> getAddresses()
	{
	    return session.createCriteria(Address.class).list();
	}
}