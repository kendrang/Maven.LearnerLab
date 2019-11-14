package io.zipcoder.interfaces;

import java.util.*;

public class People implements Iterable<Person>{
  List<Person> personList = new ArrayList<>();

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
    Person[] arr = new Person[personList.size()];
   return personList.toArray(arr);
  }

  @Override
  public Iterator<Person> iterator() {
    return personList.iterator();
  }
}
