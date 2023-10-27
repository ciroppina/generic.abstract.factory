package ciroppina.generic.factory.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import ciroppina.generic.factory.interfaces.GenericInterfaceAbstractImpl;

public class PlayWithIntegers extends GenericInterfaceAbstractImpl<Integer> 
{
	private List<Serializable> serializables = null;

	/**
	 * constructors
	 */
	public PlayWithIntegers() {
	}
	public PlayWithIntegers(Serializable... oneOrMany) {
		this.serializables  = new ArrayList<Serializable>(serializables);
	}

	@Override
	public Number getResult(Serializable input) {
		Integer safeInput = input instanceof Integer ? (Integer) input : 0;
		return safeInput;
	}

}
