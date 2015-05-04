public class Goods {
    private String goodsID;
    private String goodsName;
    private int goodsQuatity;
    private double goodsPrice;

    public Goods(String goodsID, String goodsName, int goodsQuatity, double goodsPrice) {
        this.goodsID = goodsID;
        this.goodsName = goodsName;
        this.goodsQuatity = goodsQuatity;
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsID() {
        return goodsID;
    }
    public void setGoodsID(String goodsID) {
        this.goodsID = goodsID;
    }

    public String getGoodsName() {
        return goodsName;
    }
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getGoodsQuatity() {
        return goodsQuatity;
    }
    public void setGoodsQuatity(int goodsQuatity) {
        this.goodsQuatity = goodsQuatity;
    }

    public double getGoodsPrice() {
        return goodsPrice;
    }
    public void setGoodsPrice(double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }
}
