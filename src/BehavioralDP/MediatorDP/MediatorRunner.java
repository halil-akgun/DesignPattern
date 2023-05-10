package BehavioralDP.MediatorDP;

public class MediatorRunner {

    void mediatorDemo() {
        // danisman objesi olusturma
        MessageDispatcher dispatcher = new MessageDispatcher();

        // actorler olusturma
        Actor actor1 = new MessageActor("Actor 1", dispatcher);
        Actor actor2 = new MessageActor("Actor 2", dispatcher);
        Actor actor3 = new MessageActor("Actor 3", dispatcher);
        Actor actor4 = new MessageActor("Actor 4", dispatcher);

        // dispatcher uzerinden actorlein alanlari setleniyor
        dispatcher.register("Topic 1", actor1);
        dispatcher.register("Topic 2", actor2);
        dispatcher.register("Topic 3", actor3);
        dispatcher.register("Topic 4", actor4);

        // actorlerin birbirlerine sordugu sorular
        actor1.sendMessage("Topic 2", "message for topic 2"); // Actor 2 karsilayacak
        actor1.sendMessage("Topic 3", "message for topic 3"); // Actor 3 karsilayacak
        actor1.sendMessage("Topic 4", "message for topic 4"); // Actor 4 karsilayacak

        actor2.sendMessage("Topic 1", "message for topic 1"); // Actor 1 karsilayacak
        actor2.sendMessage("Topic 5", "message for topic 5"); // uyari mesaji
    }

    public static void main(String[] args) {

        MediatorRunner mediator = new MediatorRunner();
        mediator.mediatorDemo();

    }
}
