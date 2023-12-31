package ua.esu.ucu.apps.visitor;


import java.util.function.Consumer;

public class Signature<T> extends Task<T> {
    public Consumer<T> consumer;
    public Signature(Consumer<T> consumer) {
        this.consumer = consumer;
    }

    public void apply(T arg) {
        this.freeze();
        consumer.accept(arg);
    }

    @Override
    public void stamp(String Uuid) {
        this.setHeader("Group Uuid", Uuid);
    }
}
