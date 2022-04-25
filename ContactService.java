package contact;

import java.util.ArrayList;

public class ContactService {
	
// list of contacts 
private ArrayList<Contact> contacts;
  
public ContactService()
{
	
	// call for the array list
	contacts = new ArrayList<>();
}
  
//sets add contact
public boolean addContact(Contact contact){
	boolean contactAlready= false;
	//loop through all the contacts in the list made
	for (Contact contactList:contacts)
{
		//test to see if already a contact
		//if so make contactAlready true
		if (contactList.equals(contact))
{
			contactAlready = true;
}
}
		//if not a contact then make one
		if (!contactAlready)
{
			contacts.add(contact);
			//after adding this is now true
			return true;
}
		else
{
			return false;
}
}
  
//delete via contactID
public boolean deleteContact(String contactID)
{
//loop through list of contacts
for (Contact contactList:contacts)
{
	if (contactList.getContactID().equals(contactID))
{
		//remove and return true
		contacts.remove(contactList);
		return true;
}
}
	//else return false
	return false;
}
  
//if nothing then no change
public boolean updateContact(String contactID, String firstName, String lastName, String phoneNumber, String address)
{
//loop through loop again
for (Contact contactList:contacts)
{
	//if contactID matches, loop through each with making sure not "" and meets requirements
	//then return true
	if (contactList.getContactID().equals(contactID))
{
		if(!firstName.equals("") && !(firstName.length()>10))
{
			contactList.setFirstName(firstName);
}
		if(!lastName.equals("") && !(lastName.length()>10))
{
			contactList.setFirstName(lastName);
}
		if(!phoneNumber.equals("") && (phoneNumber.length()==10))
{
			contactList.setFirstName(phoneNumber);
}
		if(!address.equals("") && !(address.length()>30))
{
			contactList.setFirstName(address);
}
		return true;
}
}
	//else return false
	return false;
}
}