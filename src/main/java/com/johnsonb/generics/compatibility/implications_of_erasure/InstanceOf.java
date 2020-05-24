package com.johnsonb.generics.compatibility.implications_of_erasure;

public class InstanceOf<T>
{
    public boolean equals(Object o)
    {
        // Banned
        if (o instanceof InstanceOf/*<T>*/)
        {
            return true;
        }

        return false;
    }
}
