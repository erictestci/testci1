package com.example.tutorial.pages.address;
 
import com.example.tutorial.entities.Address;
import com.example.tutorial.pages.Index;
import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.hibernate.annotations.CommitAfter;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.hibernate.Session;
 
public class CreateAddress
{
    @Property
    private Address address;
 
    @Inject
    private Session session;
 
    @InjectPage
    private Index index;
 
    @CommitAfter
    Object onSuccess()
    {
        session.persist(address);
 
        return index;
    }
}