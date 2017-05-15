package com.emp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map.Entry;
import java.util.Set;

public class ExamBooking {

	File f = new File("Emp_Exam.txt");
	ExamDetails ed = new ExamDetails();

	public int searchExam(String examCode)  {
		
		
		Set<Entry<String, Integer>> set = ed.hm.entrySet();
		boolean flag = false;
		int t = 0;

		for (Entry<String, Integer> entry : set) {
			if (entry.getKey().equals(examCode)) {
				flag = true;
				t = entry.getValue();
			}
		}
		if (flag) {
			return t;
		} else {
			try {
				
				throw new InvalidInputException("Code is Not Valid");
				
			} catch (InvalidInputException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return t;
		}
		
	}

	public int addBooking(String Ename, String ExamCode) throws FileNotFoundException {
		
		int fees=searchExam(ExamCode);
		Employee e= new Employee(Ename, "KJHYT");
		
		PrintWriter p = new  PrintWriter(new FileOutputStream(f,true));
		p.println(e+";"+ExamCode+";"+fees);
		p.close();
		/*PrintWriter pw = null;
		try {
			f.createNewFile();
			pw = new PrintWriter(new FileOutputStream(f, true));
			pw.println();
			pw.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		return 0;
	}

	public void examBooking() throws IOException {
		String s = null;
		
		BufferedReader br= new BufferedReader(new FileReader(f));
		while ((s=br.readLine())!=null) {
			String a[]=s.split(";");
			System.out.println(a[0]+"\t\t\t\t"+a[1]+"\t\t\t"+a[2]+"\t\t\t"+a[3]);
		}
		
		/*FileReader fr;
		try {
			fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}

}
