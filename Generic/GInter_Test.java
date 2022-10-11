package generic;

// generic 1-4
public interface GInter_Test<N1, N2> {
	public abstract N1 add(N1 num1, N1 num2);
	// 제네릭은 타입이 다르다고 확신할 수 없기 때문에 오버로딩 불가능
//	public abstract N2 add(N2 num1, N2 num2);
	public abstract N2 div(N2 num1, N2 num2);

}
