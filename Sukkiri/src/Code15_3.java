public class Code15_3 {
	public static void main(String[] args) {
		String s1 = "Java programming";
		System.out.println("文字列s1の4文字目以降は" + s1.substring(3));
		System.out.println("文字列s1の4~8文字目は" + s1.substring(3, 8));
		
		char c =s1.charAt(0);
		System.out.println(c);//J
		
		System.out.println("s1を全部小文字にします" + s1.toLowerCase());
		System.out.println("s1を全部大文字にします" + s1.toUpperCase());
		
		String s2 = " My name is John. ";
		System.out.println(s2.trim());//前後の半角スペースを除去
		System.out.println(s2.replace("John", "Paul"));
		System.out.println(s2.replace("　", " ").trim());

		String s3 = " My name is John. ";
		System.out.println(s3.trim().replace("John", "Paul"));
	}
}