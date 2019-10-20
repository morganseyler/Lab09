/**
 * Lab 9
 *
 * Test suite for the StackRestaurant class.
 *
 * @author Em Evans
 * @version 2019-10-14
 *
 */
public class StackRestaurantTest {

	private StackRestaurant<String> stack;
	
	public void initialize() throws AssertException
	{
		stack = new StackRestaurant<String>();
	}
	/**
	 * test addOrder()
	 * @throws AssertException
	 */
	public void testAddOrder() throws AssertException 
	{
		stack = new StackRestaurant<String>();
		Order<String> order = new Order<String>("Sandwich", 5);
		Assert.assertTrue(stack.addOrder(order));
		Assert.assertEquals(order,stack.completeOrder());
	}
	/**
	 * test completeOrder() using at least three orders
	 * show the ordering specific to stack
	 * 
	 * @throws AssertException
	 */
	public void testCompleteOrder() throws AssertException 
	{
		stack = new StackRestaurant<String>();
		//TODO: implement this
	}
	/**
	 * test numberRemainingOrder() with at least 2 orders
	 * 
	 * @throws AssertException
	 */
	public void testNumberRemainingOrder() throws AssertException 
	{
		stack = new StackRestaurant<String>();
		//TODO: implement this
		Order<String> order1 = new Order<String>("Mac", 1);
		Order<String> order2 = new Order<String>("Cheese", 1);
		stack.addOrder(order1);
		stack.addOrder(order2);
		Assert.assertEquals(2, stack.numberRemainingOrder());
		stack.completeOrder();
		stack.completeOrder();
	}
	/**
	 * test both cases of completeOrder
	 * @throws AssertException
	 */
	public void testCheckNextCompletedOrder() throws AssertException 
	{
		stack = new StackRestaurant<String>();
		//TODO: implement this
		Assert.assertNull(stack.checkNextCompletedOrder());
		Order<String> order = new Order<String>("Sandwich", 5);
		stack.addOrder(order);
		Assert.assertEquals(order, stack.checkNextCompletedOrder());
		stack.completeOrder();
	}
}

