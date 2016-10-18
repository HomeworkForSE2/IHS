package BLService;

import vo.OrderVO;

public interface OrderBLService {
      public void createOrder(OrderVO vo);
      public void deleteOrder(int id);
      public OrderVO showUserOrder(int id);
      public OrderVO showUndoOrder(String orderState);
      public OrderVO showDoOrder(String orderState);
      public OrderVO showErrorOrder(String orderState);
      public OrderVO showdeleteOrder(String orderState);
      public void modifyUndoToError(int orderNum);
      public void modifyErrorToDo(int orderNum);
      public void endOrder(); 
}
