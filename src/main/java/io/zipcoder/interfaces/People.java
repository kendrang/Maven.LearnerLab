package io.zipcoder.interfaces;

import java.util.*;

public abstract class People <E extends Person> implements Iterable<E>{
  List<E> personList = new ArrayList<>();

  public void add (E person){
    personList.add(person);
  }
  public E findById(long id){
    for (E p : personList){
      if(p.getId() ==id){
        return p;
      }
    }return null;
  }

  public boolean contains (E person){
    if (personList.contains(person)){
      return true;
    }return false;
  }

  public void remove (E person){
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

  abstract E[] toArray ();

  @Override
  public Iterator<E> iterator() {
    return personList.iterator();
  }
}
