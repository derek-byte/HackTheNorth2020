import org.w3c.dom.events.Event;

import java.util.ArrayList;


public class Todolist {

    private ArrayList<Event> todolist = new ArrayList<Event>();

    public Todolist() {

    }


    public void addEvent(Event event) {
        todolist.add(event);
    }

    public static boolean isTodoEvent(Event event) {
        return event.getType().equals("assignment");
    }

    public ArrayList<Event> getToDos(ArrayList<Event> calendar) {

        ArrayList<Event> result = new ArrayList<Event>();

        for (Event element : calendar) {
            if (isTodoEvent(element)) {
                result.add(element);
            }
        }

        return result;
    }


}

