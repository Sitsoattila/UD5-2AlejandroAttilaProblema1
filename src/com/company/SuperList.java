package com.company;

import java.util.Collections;
import java.util.Iterator;

public class SuperList <T> extends ListManager{

    @Override
    public void addElement(Object element) {
        list.add(element);

    }

    @Override
    public Object removeElement(int position) {
        return list.remove(position);
    }

    @Override
    public void showElements() {
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    @Override
    public void showReversedElements() {
        Iterator<String> iterator = list.iterator();
        for ( int i = list.size(); i > 0; i--) {
            System.out.println(i);

        }


    }


}
