class Dog {
	private int size;
	String breed;
	String name;

	public void setSize(int sz){
		size = sz;
	}

	public int getSize(){
		return size;
	}

	public boolean isBigger(Dog d) {
		if (d.getSize() > size) {
			return true;
		} else {
			return false;
		}
	}

	void bark() {
		System.out.println("Ruff! Ruff!");
	}
}