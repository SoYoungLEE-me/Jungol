package q508;

class Item{
	private String item_name;
	private int count;
	private int price;
	
	public Item(String item_name, int count, int price){
		this.item_name = item_name;
		this.count = count;
		this.price = price;
	}
	public String getName() {
		return item_name;
	}
	public int getCount() {
		return count;
	}
	public int getPrice() {
		return price;
	}
}

public class Main {

	public static void main(String[] args) {
		Item[] item = {
				new Item("pen", 20, 100),
				new Item("note", 5, 95),
				new Item("eraser", 110, 97)
		};
		
		System.out.printf("%10s%10s%10s \n", "item", "count", "price");
		for(int i=0; i<item.length; i++) {
			System.out.printf("%10s%10s%10s \n", item[i].getName(), item[i].getCount(), item[i].getPrice());
		} //좌측 정렬은 -붙이면 된대.
		//이중 배열로 만들어서 이중 for 문으로 돌리는 방법도 있었음.

	}

}
