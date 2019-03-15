package samplepackage;

import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class TaskTest {
    private Task task;

   public TaskTest() {
        task = new Task("title", LocalDate.now(), "project2");
    }

    @Test
    public void testIsDone() {


    final String expected = "Done";
    task.setStatus(true);
    String result = task.isDone();

    assertEquals(expected,result);
}








}