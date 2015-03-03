package Swing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Setup.GameObjects;

public class objectTest {

	private FileOutputStream create;
	private FileInputStream load;

	private boolean fileCheck(String text) {
		File f = new File(text + ".txt");
		if(!f.exists()){
			try {
				create = new FileOutputStream(f);
				ObjectOutputStream output = new ObjectOutputStream(create);
				Akatar.f = f;
				Akatar.create();
				output.close();
			} catch (FileNotFoundException e) {
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			try {
				load = new FileInputStream(f);
				ObjectInputStream output = new ObjectInputStream(load);
				GameObjects stuff = (GameObjects)output.readObject();
				Akatar.stuff = stuff;
				Akatar.create();
				output.close();

			} catch (FileNotFoundException e1) {
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			return false;
		
	}
}
