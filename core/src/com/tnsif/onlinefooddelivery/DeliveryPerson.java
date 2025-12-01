package com.tnsif.onlinefooddelivery;

public class DeliveryPerson {
        private int deliveryPersonid;
        private String name;
        private long contactno;
        
        public void DeliveyPerson(int deliveryPersonid, String name, long contactno) {
        	this.deliveryPersonid =  deliveryPersonid;
            this.name = name;
            this.contactno = contactno;
            }
        
   public int getDeliveryPersonid() { return deliveryPersonid; }
    public String getName() { return name; }
    public long getContactNo() { return contactno; }
    
	@Override
	public String toString() {
		return "DeliveryPerson [deliveryPersonid=" + deliveryPersonid + ", name=" + name + ", contactno=" + contactno
				+ "]";
	}

	public int getOrderId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void assignOrder(Order foundOrder) {
		// TODO Auto-generated method stub
		
	}

}    
