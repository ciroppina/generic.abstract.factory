package ciroppina.generic.factory.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import ciroppina.generic.factory.interfaces.GenericInterfaceAbstractImpl;

public class PlayWithLongs extends GenericInterfaceAbstractImpl<Long> {
	
	private List<Serializable> serializables = null;
	
	/**
	 * constructors
	 */
	public PlayWithLongs() {
	}
	public PlayWithLongs(Serializable... oneOrMany) {
		this.serializables  = new ArrayList<Serializable>(serializables);
	}

	@Override
	public Number getResult(Serializable input) {
		Long safeInput = input instanceof Long ? (Long) input : 0;
		return safeInput;
	}

}
