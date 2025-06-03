// class downloadingFile{
//     public static void file(String file) {
//         for(int i=0;i<=5;i++) {
//             System.out.println(file + " " + "downloading..." + (i*20) + "%");
//             try {
//                 Thread.sleep(2000);
//             } catch (Exception e) {}
//         } System.out.println(file + " done ");
//     }
// }

// public class Multithreading2 {
//     public static void main(String[] args) {
//         downloadingFile obj = new downloadingFile();
//         obj.file("file A");
//         obj.file("file B");
//     }
// }



class FileDownloading extends Thread{
    String fileName;

    public FileDownloading(String fileName) {
        this.fileName = fileName;
    }
    public void run() {
        for(int i=0;i<=5;i++) {
            System.out.println(fileName + " " + "downloading..." + (i*20) + "%");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {}
        } System.out.println(fileName + " done ");
    }
}

public class Multithreading2 {
    public static void main(String[] args) {
        FileDownloading t1 = new FileDownloading("file A");
        FileDownloading t2 = new FileDownloading("file B");
        t1.start();
        t2.start();
    }
}
