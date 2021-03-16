package addressbook_data;

import java.util.ArrayList;

public interface DataAccessObject {
void insert(Object object); 
public abstract ArrayList<Object> findall(); 
}
