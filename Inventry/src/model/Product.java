package model;

public class Product {
	private int PRODUCTID;
	private String PRODUCTNAME;
	private int MINSELL;
	private int PRICE;
	private int QUANTITY;
	public int getPRODUCTID() {
		return PRODUCTID;
	}
	public void setPRODUCTID(int PRODUCTid) {
		PRODUCTID = PRODUCTid;
	}
	public String getPRODUCTNAME() {
		return PRODUCTNAME;
	}
	public void setPRODUCTNAME(String PRODUCTname) {
		PRODUCTNAME = PRODUCTname;
	}
	public int getMINSELL() {
		return MINSELL;
	}
	public void setMINSELL(int mINSELL) {
		MINSELL = mINSELL;
	}
	public int getPRICE() {
		return PRICE;
	}
	public void setPRICE(int pRICE) {
		PRICE = pRICE;
	}
	public int getQUANTITY() {
		return QUANTITY;
	}
	public void setQUANTITY(int qUANTITY) {
		QUANTITY = qUANTITY;
	}
}
