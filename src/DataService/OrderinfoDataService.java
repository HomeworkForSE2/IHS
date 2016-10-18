package DataService;

import po.OrderPO;

public interface OrderinfoDataService {
     public void delete(OrderPO po);
     public void insert(OrderPO po);
     public void modifyUndoToError(OrderPO po);
     public void modifyErrorToDo(OrderPO po);
     
}
