package concurrency;

class Reasoning extends Thread {
    //set up this class so it can become a valid thread. 
    void distinguish() {
        System.out.println("A process is an executing program, such as a web browser. It might contain multiple threads." +
                "A thread is a piece of an executing program, such as a web browser tab.");
        System.out.println("If you invoke run instead of start it will not create a new thread but will simply execute on the existing thread.");
    }
    public void run() {
        distinguish();
    }
}

