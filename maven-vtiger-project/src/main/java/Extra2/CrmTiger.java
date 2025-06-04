package Extra2;

import org.testng.annotations.Test;

import Base_Utility.Base_class;

public class CrmTiger {
	public class CrmTest extends Base_class{

		@Test
		public void add() {
			System.out.print("Creating City Noida");
			
		}
		@Test(dependsOnMethods="add")
		public void modify() {
			System.out.print("Creating City Ranchi");
			
		}
		@Test(dependsOnMethods="modify")
		public void delete() {
			System.out.print("Deleting City Ranchi");
			
		}

	}
	

}

