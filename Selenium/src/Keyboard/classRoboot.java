package Keyboard;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class classRoboot {
	public static void main(String[] args) throws IOException, AWTException {
		Runtime.getRuntime().exec("Notepad");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_Q);
		r.keyRelease(KeyEvent.VK_SHIFT);
  	r.keyPress(KeyEvent.VK_S);
	r.keyPress(KeyEvent.VK_P);
		
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_J);
		r.keyRelease(KeyEvent.VK_SHIFT);
		//r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_SHIFT);
		
		
		
		
	}

}
