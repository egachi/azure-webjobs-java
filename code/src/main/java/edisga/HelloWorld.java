package edisga;
import java.time.LocalDateTime;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("------------------------------------------------------------");
		System.out.println("Hello World from WebJob: " + LocalDateTime.now());
		System.out.println("------------------------------------------------------------");
		System.out.println("Prints JVM memory utilization statistics");
		System.out.println("------------------------------------------------------------");
		int mb = 1024*1024;
		//Getting the runtime reference from system
		Runtime runtime = Runtime.getRuntime();
		System.out.println("##### Heap utilization statistics [MB] #####");
		//Print used memory
		System.out.println("Used Memory:" + (runtime.totalMemory() - runtime.freeMemory()) / mb);
		//Print free memory
		System.out.println("Free Memory:" + runtime.freeMemory() / mb);
		//Print total available memory
		System.out.println("Total Memory:" + runtime.totalMemory() / mb);
		//Print Maximum available memory
		System.out.println("Max Memory:" + runtime.maxMemory() / mb);
	}
}
