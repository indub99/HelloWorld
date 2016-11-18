public class loopAListWithforEach {

	public static void main(String[] args) {
		
		List<String> items = new ArrayList<>();
		@Before
	    public void setUp() {
		items.add("H");
		items.add("E");
		items.add("L");
		items.add("L");
		items.add("O");
		}
		//lambda
		//Output : H,E,L,L,O
		items.forEach(item->System.out.println(item));

		//Output : L
		items.forEach(item->{
			if("L".equals(item)){
				System.out.println(item);
			}
		});

		//method reference
		//Output : H,E,L,L,O
		items.forEach(System.out::println);

		@Test
		public void filterItem(){
		//Stream and filter
		//Output : E
		items.stream()
			.filter(s->s.contains("E"))
			.forEach(System.out::println);
		}
	}

}
