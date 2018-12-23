package Question5;

import java.util.HashMap;
import java.util.Map;

public class Store
{
    private HashMap<Goods,Integer> goodsnum=new HashMap<>();
    private Store store=null;
    //添加商品，及进货量
    public void addgoods(Goods goods,int num)
    {
        if(goodsnum.containsKey(goods)){
            int value=goodsnum.get(goods);
            goodsnum.put(goods,value+num);
        }else{
            goodsnum.put(goods,num);
        }
    }
    //学员兑换商品
    public void buygoods(Goods goods,Student student,int num)
    {
        double tempscore=student.getScore();
        //当商品存在并且积分够买时
        if(goodsnum.containsKey(goods)&&tempscore>=goods.getScore()*num){
            int value=goodsnum.get(goods);
            goodsnum.put(goods,value-num);
            student.setScore(store,goods.getScore()*num);  //购买后积分变化
            System.out.println("兑换成功！！！");
        }else{
            System.out.println("兑换失败！！！");
        }
    }
    //展示商品信息
    public void  displayGoods()
    {
        for (Map.Entry<Goods, Integer> entry : this.goodsnum.entrySet()) {
           System.out.println("商品：" + entry.getKey() + "，库存：" + entry.getValue());
       }
    }
}
