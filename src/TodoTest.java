package samplepackage;

import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class TodoTest
{
    @Test
    public void testRemoveTask()
    {
        Todo todo = new Todo();
        Task task1 = new Task("title", LocalDate.now(), "project2");
        ArrayList<Task> list1 = new ArrayList<>();

        task1.setProject("project");
        task1.setTask_title("title");
        task1.setLocalDate(LocalDate.now());
        task1.setStatus(true);
        list1.add(task1);
    }



}