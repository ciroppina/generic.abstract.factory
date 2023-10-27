package ciroppina.generic.factory.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import ciroppina.generic.factory.interfaces.GenericInterfaceAbstractImpl;

public class PlayWithDoubles extends GenericInterfaceAbstractImpl<Double> {
	
	private List<Serializable> serializables = null;
	
	/**
	 * constructors
	 */
	public PlayWithDoubles() {
	}
	public PlayWithDoubles(Serializable... oneOrMany) {
		this.serializables  = new ArrayList<Serializable>(serializables);
	}

	@Override
	public Number getResult(Serializable input) {
		Double safeInput = input instanceof Double ? (Double) input : 0;
		return safeInput;
	}

}
