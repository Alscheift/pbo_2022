public class ThreadPrint extends Thread{
    Object [] objectToPrint;

    ThreadPrint(Object [] object){
        objectToPrint = object;
    }

    @Override
    public void run() {
        for (Object object : objectToPrint) {
            System.out.println(object);
        }
        super.run();
    }
}
