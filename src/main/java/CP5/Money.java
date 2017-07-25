package CP5;

/**
 * Created by 10235 on 2017/7/25.
 */
public enum Money {
    One ("oen",1), Two("two",2);


    private String name ;
    private int index ;

    private Money( String name , int index ){
        this.name = name ;
        this.index = index ;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }

}
