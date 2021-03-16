package addressbook_data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import Addressbook_domain.Country;

public abstract class FiledataAccessObject implements DataAccessObject {
ArrayList<Object> value =new ArrayList<Object>();
private String pathname;
private FileWriter fw;
private BufferedWriter bw;
private FileReader fr;
private BufferedReader br;

public FiledataAccessObject(String pathname) {
	super();
	this.pathname = pathname;
}

public String getPathname() {
	return pathname;
}

public void setPathname(String pathname) {
	this.pathname = pathname;
}
@Override
public void insert(Object object) {
String data=objectToCSVRecord(object);
 try {
	System.out.println("============writing data to the file==============");
	fw=new FileWriter(pathname,true);
	bw=new BufferedWriter(fw);
	bw.write(data);
	bw.newLine();
} catch (Exception e) {
	e.printStackTrace();
}
	finally {
		try {
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
public ArrayList<Object> findall(){
	
	System.out.println("======Reading from the file======");
	try {
		fr=new FileReader(pathname);
		br=new BufferedReader(fr);
		String s;
		while((s=br.readLine())!=null) {
		Object obj=csvRecordToObject(s);
		value.add(obj);
		}
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	finally {
		try {
			fr.close();
			br.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	return value;
	
}
protected abstract String objectToCSVRecord(Object object);
protected abstract Object csvRecordToObject(String cvsRecord);
}
