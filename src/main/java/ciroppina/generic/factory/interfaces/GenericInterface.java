package ciroppina.generic.factory.interfaces;

import java.io.Serializable;

public interface GenericInterface<T extends Number, I extends Serializable> {
	public T getResult(I input);
}
