package contact;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Tests {

   //need to test add, delete and update
//templates
/*
* Contact("1413252", "Mary", "Jane", "1234567890", "Sample Address in NY");
Contact("1309403", "Peter", "Parker", "7418529630", "410 Chelsea Street");
Contact("9752319", "Stan", "Lee", "2581473690", "9940 Santa Monica Boulevard");
*/
  
@Test
public void testAdd()
{
ContactService cs = new ContactService();
Contact test1 = new Contact("9876543", "Mary", "Jane", "1234567890", "Sample Address in NY");
assertEquals(true, cs.addContact(test1));
}

@Test
public void testDelete()
{
   ContactService cs = new ContactService();
     
Contact test1 = new Contact("9876543", "Mary", "Jane", "1234567890", "Sample Address in NY");
Contact test2 = new Contact("3692581", "Peter", "Parker", "7418529630", "410 Chelsea Street");
Contact test3 = new Contact("7481592", "Stan", "Lee", "2581473690", "9940 Santa Monica Boulevard");

cs.addContact(test1);
cs.addContact(test2);
cs.addContact(test3);

assertEquals(true, cs.deleteContact("3692581"));
assertEquals(false, cs.deleteContact("3692518"));
assertEquals(false, cs.deleteContact("3692581"));
}

@Test
public void testUpdate()
{
ContactService cs = new ContactService();
     
Contact test1 = new Contact("9876543", "Mary", "Jane", "123456789", "Sample Address in NY");
Contact test2 = new Contact("3692581", "Peter", "Parker", "3692581470", "410 Chelsea Street");
Contact test3 = new Contact("7481592", "Stan", "Lee", "2581473690", "9940 Santa Monica Boulevard");

cs.addContact(test1);
cs.addContact(test2);
cs.addContact(test3);

assertEquals(true, cs.updateContact("7481592", "Stan", "Lee", "2581473690", "9940 Santa Monica Boulevard"));
assertEquals(false, cs.updateContact("7215948", "Stan", "Lee", "2581473690", "9940 Santa Monica Boulevard"));
}

}

