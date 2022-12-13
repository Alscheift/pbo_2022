public class ThreadPrint extends Thread{
    Object [] objectToPrint;

    ThreadPrint(Object [] object){
        objectToPrint = object;
    }

    @Override
    public void run() {
        for (Object object : objectToPrint) {
            System.out.println(object);
            try {
                this.wait(500);
            } catch (InterruptedException e) {
                System.out.println("!! Proses Terinterupsi !!");
                e.printStackTrace();
            }
        }
        super.run();
    }
}
