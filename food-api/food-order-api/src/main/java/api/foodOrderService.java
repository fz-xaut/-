package api;

import entity.MyOrder;
import entity.OrderOutDB;
import entity.Page;

import java.util.List;


public interface foodOrderService {

    Page<OrderOutDB> getOrderNotReceive(OrderOutDB or);

    boolean getOrderIsNotAlive(String order_id);

    List<MyOrder> getOrderByReceive(String receive);

    int consealOrder(String orderid);

    String bookMessage(String stuNo, String message);

    String competeOrder(String stuNo,String message);
}
