package Exercises12_11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class Exercises12_11 {
	public static void main(String[] args) throws FileNotFoundException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(new FileInputStream(new File("args[0]")))); 		
	}
}
