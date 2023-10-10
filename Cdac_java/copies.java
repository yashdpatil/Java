
class Date implements Cloneable{
	private int day;
	private int month;
	private int year;
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public Date clone( )  {
		try {
			Date other = (Date) super.clone();
			return other;
		} catch (CloneNotSupportedException e) {
			throw new InternalError(e);
		}
	}
	
	@Override
	public String toString() {
		return this.day+" / "+this.month+" / "+this.year;
	}
}
class Employee implements Cloneable{
	private int empid;
	private Date joinDate;
	public Employee( int empid, int day, int month, int year ) {
		this.empid = empid;
		this.joinDate = new Date( day, month, year );
	}
	@Override
	public Employee clone(){
		try {
			Employee other = (Employee) super.clone();
			other.joinDate =  this.joinDate.clone();
			return other;
		}catch( CloneNotSupportedException ex ) {
			throw new InternalError(ex);
		}
	}
}
public class Main {
	public static void main(String[] args) {
		Employee emp1 = new Employee(3778, 1, 9, 2021);
		Employee emp2 = emp1.clone();
		System.out.println(emp1 == emp2);
	}
// 	public static void main5(String[] args) {
// 		Employee emp1 = new Employee(3778, 1, 9, 2021);
// 		Employee emp2 = emp1;	//Shallow Copy of references
// 		System.out.println(emp1 == emp2);
// 	}
}
