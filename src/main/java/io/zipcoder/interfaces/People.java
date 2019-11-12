package io.zipcoder.interfaces;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class People implements Iterable{
  List<Person> personList;

  public void add (Person person){
    personList.add(person);
  }
  public Person findById(long id){
    for (Person p : personList){
      if(p.getId() ==id){
        return p;
      }
    }return null;
  }

  public boolean contains (Person person){
    if (personList.contains(person)){
      return true;
    }return false;
  }

  public void remove (Person person){
    personList.remove(person);

  }

  public void remove(long id){
   personList.remove(findById(id));
  }

  public void removeAll (){
    personList.clear();
  }

  public Integer count(){
   return personList.size();
  }

  public Person[] toArray (){
   return (Person[]) personList.toArray();
  }

  @Override
  public Iterator iterator() {
    return personList.iterator();
  }
}
