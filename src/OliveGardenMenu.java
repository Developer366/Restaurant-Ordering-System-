import java.util.ArrayList;

public class OliveGardenMenu {
	
	ArrayList<MenuItem> OGmenu = new ArrayList<MenuItem>();
	
	//Constructor
	public OliveGardenMenu(){
			
		populateMenu();
			
	}
	
		
		public void populateMenu(){
					
		MenuItem MainDish1 = new MenuItem("Chicken Piccata", 16.79);
		MenuItem MainDish2 = new MenuItem("Chicken Parmigiana", 16.29);
		MenuItem MainDish3 = new MenuItem("Create A Sampler Italiano ", 9.99);
		MenuItem MainDish4 = new MenuItem("Chicken Margherita", 16.29);

		MenuItem Appetizer1 = new MenuItem("Fried Mozzarella", 6.79);
		MenuItem Appetizer2 = new MenuItem("Calamari", 10.29);
		MenuItem Appetizer3 = new MenuItem("Spinach-Artichoke Dip", 9.99);
		MenuItem Appetizer4 = new MenuItem("Classic Shrimp Scampi Fritta", 8.49);

		MenuItem Beverage1 = new MenuItem("Spiked Strawberry Lemonade", 5.00);
		MenuItem Beverage2 = new MenuItem("Watermelon Margarita ", 5.00);
		MenuItem Beverage3 = new MenuItem("Bacardi & Coke ", 5.00);	
		
		OGmenu.add(0,null);
		OGmenu.add(1, MainDish1);
		OGmenu.add(2, MainDish2);
		OGmenu.add(3, MainDish3);
		OGmenu.add(4, MainDish4);
		
		OGmenu.add(5, Appetizer1);
		OGmenu.add(6, Appetizer2);
		OGmenu.add(7, Appetizer3);
		OGmenu.add(8, Appetizer4);
		
		OGmenu.add(9, Beverage1);
		OGmenu.add(10, Beverage2);
		OGmenu.add(11, Beverage3);		
		
		}//end of populate the menu method
		
		
		//get MenuItem from the Menu to add into order
		public MenuItem getMenuItem(int index){
			return OGmenu.get(index);
		}
				
		public void printMenu(){
			System.out.println("-------------------------OLIVE GARDEN MENU-------------------------");
			System.out.format("[Item]\t\t\t  [Food Item] \t\t\t     [Price]\n");
			for(int i= 1; i<OGmenu.size(); i++){
				System.out.format("Item[" + i + "]:\t" + "%-45s$%.2f%n", OGmenu.get(i).getItemName(), OGmenu.get(i).getItemPrice());
			}
			
		}//print menu
		
		
		public int size() {
			return OGmenu.size();
		}//get menu size
	
}//end of class





