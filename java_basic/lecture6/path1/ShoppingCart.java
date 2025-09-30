package java_basic.lecture6.path1;

public class ShoppingCart {
    private Item[] items;
    private int itemCount = 0;
    private int maxCount;

    public ShoppingCart(int maxCount){
        this.items = new Item[maxCount];
        this.maxCount = maxCount;
    }

    public void addItem(Item item){ //배열 items에 아이템을 넣는 함수 1. 배열리스트 활용 
        items[this.itemCount] = item;
        itemCount++;
    }

    public void displayItems(){ //배열의 길이를 파악하고 그 배열만큼 포문을 돌려 출력한다 for(Item i : items)
        System.out.println("장바구니 상품 출력");
        for(Item item : this.items) {
            item.itemDetail();
        }
        System.out.println(itemCount);
    }
}
