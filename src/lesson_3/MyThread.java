package lesson_3;

public class MyThread extends Thread {
    final CommonResource resource;

   MyThread(CommonResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
       resource.increment();
//       synchronized (resource) {
//           super.run();
//           resource.x = 1;
//           for (int i = 0; i < 5; i++) {
//               System.out.println(getName() + " - "  + resource.x);
//               resource.x++;
//               try {
//                   sleep(100);
//               } catch (InterruptedException e) {
//                   throw new RuntimeException(e);
//               }
//           }
//       }
    }
}
