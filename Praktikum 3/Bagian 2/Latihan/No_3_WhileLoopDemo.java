
import java.util.concurrent.TimeUnit;
public class No_3_WhileLoopDemo {
    public static void main(String[] args) {
        int i = 3;
        while (true) {
            System.out.println("Hello ke-" + i);
            if(i==300) break;
            i+=3;
            try {
                TimeUnit.SECONDS.sleep(0);
            } catch (Exception x) {
                x.printStackTrace();
            }
        }
    }
}

/*Source code berikut ini akan menampilkan tulisan "Hello ke-" yang diulang-ulang sampai
program diterminate secara manual oleh user.
import java.util.concurrent.TimeUnit;
public class WhileLoopDemo {
public static void main(String[] args) {
int i = 0;
while (true) {
System.out.println("Hello ke-" + i);
i++;
try {
TimeUnit.SECONDS.sleep(2);
} catch (Exception x) {
x.printStackTrace();
}
}
}
}
Ubahlah source code tersebut agar :
- hanya menampilkan indeks bilangan kelipatan 3
"Hello ke-3"
"Hello ke-6"
"Hello ke-9"
...
- berhenti setelah menampilkan output "Hello ke-300" */