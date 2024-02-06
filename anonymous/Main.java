package anonymous;
public class Main {
 public static void main(String[] args) {
	 Employee employee = new Employee() {

		@Override
		public String getSalary() {
			// TODO Auto-generated method stub
			return "10";
		}

		@Override
		public String getDesignation() {
			// TODO Auto-generated method stub
			return "Software eng";
		}
		
		
	 };
     System.out.println(employee.getSalary());
     System.out.println(employee.getDesignation());
	 }		
}
