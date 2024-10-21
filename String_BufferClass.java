class String_BufferClass{
	public static void main(String[] args) {
		String name = "12345";
		StringBuffer s=new StringBuffer(name);
		//s.append("6789");
		//s.insert(0, "0");
		s.delete(1, 4);
		System.out.println(s);
	}
}