package shippingDAO;

import java.util.List;

import shippingDAO.bean.Shipper;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
//		t.test1();
//		t.test2();
//		t.test3();
//		t.test4();
		t.test5();
		}
//		public  void test1() {
//			ShippersDAO sDAO=new shippersDAOImpl();
//			List<Shipper> selectAllShipper = sDAO.selectAllShipper();
//			System.out.println(selectAllShipper);
//			System.out.println("-----------------");
//		}
//		public  void test2() {
//			ShippersDAO sDAO=new shippersDAOImpl();
//			Shipper s= sDAO.selectShipperById(1);
//			System.out.println(s);
//			}
//		public  void test3() {
//			//假資料
//			Shipper fakeShipper=new Shipper();
//			fakeShipper.setCompanyName("Test1");
//			fakeShipper.setPhone("0987654321");
//			
//			ShippersDAO sDAO=new shippersDAOImpl();
//			boolean succeed = sDAO.addShipper(fakeShipper);
//			System.out.println(succeed);
//			}
//		public  void test4() {
//			Shipper fakeShipper=new Shipper();
//			fakeShipper.setShipperID(4);
//			fakeShipper.setCompanyName("Test3");
//			fakeShipper.setPhone("0123456789");
//			
//			ShippersDAO sDAO=new shippersDAOImpl();
//			boolean succeed = sDAO.updateShipper(fakeShipper);
//			System.out.println(succeed);
//			}
		public  void test5() {
			ShippersDAO sDAO=new shippersDAOImpl();
			boolean succeed = sDAO.deleteShipper(4);
			System.out.println(succeed);
			}
	}


