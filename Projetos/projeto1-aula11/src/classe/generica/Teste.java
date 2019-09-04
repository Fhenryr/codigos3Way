package classe.generica;

public class Teste<T> {
	
	T obj;
	
	Teste(T obj){
		this.obj = obj;
	}
	
	public T getObject() {
		return this.obj;
	}
}
