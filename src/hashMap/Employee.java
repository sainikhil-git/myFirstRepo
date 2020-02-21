package hashMap;

public class Employee {
private int acntnum;
private String name;
public int getAcntnum() {
	return acntnum;
}
public void setAcntnum(int acntnum) {
	this.acntnum = acntnum;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Employee(int acntnum, String name) {
	super();
	this.acntnum = acntnum;
	this.name = name;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + acntnum;
	//result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (acntnum != other.acntnum)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
		} /*
			 * else if (!name.equals(other.name)) return false;
			 */
	return true;
}

}
