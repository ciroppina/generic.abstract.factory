package ciroppina.generic.factory.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import ciroppina.generic.factory.interfaces.GenericInterfaceAbstractImpl;

public class PlayWithShorts extends GenericInterfaceAbstractImpl<Short> {
	
	private List<Serializable> serializables = null;
	
	/**
	 * constructors
	 */
	public PlayWithShorts() {
	}
	public PlayWithShorts(Serializable... oneOrMany) {
		this.serializables  = new ArrayList<Serializable>(serializables);
	}

	@Override
	public Number getResult(Serializable input) {
		Short safeInput = input instanceof Short ? (Short) input : (short) 0;
		return safeInput; //new BigDecimal(safeInput.doubleValue()).shortValue();
	}

}
