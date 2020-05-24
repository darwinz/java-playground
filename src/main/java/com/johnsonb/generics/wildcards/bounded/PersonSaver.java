package com.johnsonb.generics.wildcards.bounded;

import com.johnsonb.generics.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;

public class PersonSaver
{
    private final RandomAccessFile file;

    public PersonSaver(final File file) throws FileNotFoundException
    {
        this.file = new RandomAccessFile(file, "rw");
    }

    public void save(Person person) throws IOException
    {
        file.writeUTF(person.getClass().getName());
        file.writeUTF(person.getName());
        file.writeInt(person.getAge());
    }

    public void saveAll(final List<? extends Person> people) throws IOException
    {
        for (Person person : people)
        {
            save(person);
        }
    }

    public void saveAll(final Person[] people) throws IOException
    {
        for (Person person : people)
        {
            save(person);
        }
    }
}
