package api;


import entity.MyOrder;
import entity.QueryVo;
import entity.food;
import entity.Page;


import java.util.List;

public interface foodFoodService {

    Page<food> getFoodByQueryVo(QueryVo vo);

    Page<food> getFoodByRecommend(String stu_no,int n);

    List<MyOrder> getOrderByUser(String user);

    List<String> getWindow(QueryVo vo);

    List<String> getTaste(QueryVo vo);

    List<String> getPrice(QueryVo vo);

    void confirmOrder(String orderid);

    int consealFood(String orderid);

    String sentMeaasge(String message);

    void receMessage(int food_id);
}
