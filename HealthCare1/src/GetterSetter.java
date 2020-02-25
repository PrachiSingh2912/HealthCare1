import java.util.ArrayList;

public class GetterSetter {
private String center_id;
 ArrayList<String> listOfTests=null;
public ArrayList<String> getListOfTests() {
	return listOfTests;
}
public void setListOfTests(ArrayList<String> listOfTests) {
	this.listOfTests = listOfTests;
}
public String getCenter_id() {
	return center_id;
}
public void setCenter_id(String center_id) {
	this.center_id = center_id;
}
public String getCenter_name() {
	return center_name;
}
public void setCenter_name(String center_name) {
	this.center_name = center_name;
}
private String center_name;
}
