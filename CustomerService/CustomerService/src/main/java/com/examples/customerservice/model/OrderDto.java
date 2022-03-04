package com.examples.customerservice.model;

import javax.persistence.Id;

public class OrderDto {
			
		int cid;
		
		
		String order;
		
		public OrderDto() {
			
		}

		public int getCid() {
			return cid;
		}

		public void setCid(int cid) {
			this.cid = cid;
		}
		

		public String getOrder() {
			return order;
		}

		public void setOrder(String order) {
			this.order = order;
		}

		public OrderDto(int cid ) {
			super();
			this.cid = cid;
			
			
			
		}
		

	

}

