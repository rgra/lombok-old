//version 7:
import java.io.PrintWriter;
public class TryWithResources {
	{
		try (final PrintWriter pw = new PrintWriter(System.out);) {
			pw.println();
		}
	}
}
