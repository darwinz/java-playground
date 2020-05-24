package com.johnsonb.generics.classes_and_interfaces;

import com.johnsonb.generics.Person;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person>
{
    @Override
    public int compare(Person left, Person right)
    {
        return Integer.compare(left.getAge(), right.getAge());
    }
}
