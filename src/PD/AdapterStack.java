package PD;

public class AdapterStack implements Stack  {
	public ListAdaptee myStack = new ListAdaptee();
	
	@Override
	public void push(int e) {
		// TODO Auto-generated method stub
		this.myStack.add(e);
		
	}

	@Override
	public int peek() {
		// TODO Auto-generated method stub
		return this.myStack.first();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.myStack.empty();
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		return this.myStack.removeLast();
	}

}
