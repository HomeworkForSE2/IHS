package BL;

import vo.OrderVO;

public class OrderBLService_driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderBLService_stub a=new OrderBLService_stub();
		OrderBLService_driver b=new OrderBLService_driver();
		b.drive(a);
	}

	private void drive(OrderBLService_stub a) {
		// TODO Auto-generated method stub
		OrderVO createordervo =new OrderVO("2016/8/20","2016/8/21","2016/8/12",2,1,2,0);
		OrderVO showUserOrdervo=new OrderVO("seasidehotel",2,100, 1,"nice","undo"); 
		OrderVO showUndoOrdervo=new OrderVO("lay",1,"2016/8/16" ,"undo"); 
		OrderVO showDoOrdervo=new OrderVO("lay",1,"2016/8/15","do"); 
		OrderVO showErrorOrdervo=new OrderVO("lay",1,"2016/8/15","error"); 
		OrderVO showdeleteOrdervo=new OrderVO("lay",1,"2016/8/15","delete"); 
		int id=createordervo.getOrderNum();
		a.createOrder(createordervo);
		a.deleteOrder(id);
		a.modifyErrorToDo(id);
		a.modifyUndoToError(id);
		a.endOrder();
		if(a.showUserOrder(00000001)==showUserOrdervo){
			System.out.println("�û�������Ϣ����ɹ���");
		}else{
			System.out.println("�û�������Ϣ���ʧ�ܣ�");
		}
		if(a.showUserOrder(00000002)==showUndoOrdervo){
			System.out.println("δִ�ж�����Ϣ����ɹ���");
		}else{
			System.out.println("δִ�ж�����Ϣ���ʧ�ܣ�");
		}
		if(a.showUserOrder(00000003)==showDoOrdervo){
			System.out.println("��ִ�ж�����Ϣ����ɹ���");
		}else{
			System.out.println("��ִ�ж�����Ϣ���ʧ�ܣ�");
		}
		if(a.showUserOrder(00000004)==showErrorOrdervo){
			System.out.println("�쳣������Ϣ����ɹ���");
		}else{
			System.out.println("�쳣������Ϣ���ʧ�ܣ�");
		}
		if(a.showUserOrder(00000005)==showdeleteOrdervo){
			System.out.println("�ѳ���������Ϣ����ɹ���");
		}else{
			System.out.println("�ѳ���������Ϣ���ʧ�ܣ�");
		}
	}

}
