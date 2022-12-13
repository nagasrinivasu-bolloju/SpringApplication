package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer2
{
		@Id
		private Integer cusId;
		private String name;
		public Customer2() {
			 
		}
		public Customer2(int id, String name) {
			 
			this.cusId = id;
			this.name = name;
		}
		
		public int getId() {
			return cusId;
		}
		public void setId(int id) {
			this.cusId = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
}
