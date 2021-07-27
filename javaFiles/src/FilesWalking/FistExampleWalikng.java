package FilesWalking;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FistExampleWalikng {

	public static void main(String[] args) {
		Path path =Paths.get("c:/temp");
		try {
			long count=Files.walk(path)
			      .filter(p->p.toString().endsWith(".java"))
			      .count();
			System.out.println("count file="+count);
		}
		
		catch(IOException e) {}
		

		}

	}



