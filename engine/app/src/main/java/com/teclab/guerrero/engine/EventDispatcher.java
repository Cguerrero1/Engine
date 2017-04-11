package com.teclab.guerrero.engine;


/**
 * Created by Heat on 01/11/2016.
 */
public class EventDispatcher {

    {
        if (e.target==null)
            e.target=this;
        for (int i=0;i<listeners.size();i++)
            if(((String)listeners.get(i)).equals(e.type))
                recieveEvent(e);

    }
    Public void dispatchEvent(String type)
    {
        Event e=newEvent(type);             /*CUANDO ME LLEGA UN EVENTO O EL TIPO DE EVENTO QUE SE ESTÁ LANZANDO*/
        if(e.target==null)
            e.target=this;
        for(inti=0;i<listeners.size();i++)
            if(((String)listeners.get(i)).equals(type))
                recieveEvent(e);
    }
    public void removeEventListener(String type)
        listeners.remove(type);
}
public void removeEventListener()
{
    listener-clear();
}
public void recieveEvent(Evento event)
{
                    /*esta funci´no revie el evento porque está en blanco, aún no se sabe para que se va a usar */
}
public void dispose()
{
    listeners.clear();
}
private List listeners;
}
