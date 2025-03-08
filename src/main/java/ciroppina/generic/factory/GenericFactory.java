package ciroppina.generic.factory;

import ciroppina.generic.factory.impl.PlayWithDoubles;
import ciroppina.generic.factory.impl.PlayWithIntegers;
import ciroppina.generic.factory.impl.PlayWithLongs;
import ciroppina.generic.factory.impl.PlayWithShorts;
import ciroppina.generic.factory.interfaces.AbstractFactoryInterface;
import ciroppina.generic.factory.interfaces.GenericInterfaceAbstractImpl;

public class GenericFactory implements AbstractFactoryInterface {
    /**
     * factory builder
     */
	@SuppressWarnings("unchecked")
	@Override
	public <T extends Number> GenericInterfaceAbstractImpl<T> 
		createGenericObject(Class<?> classe) {
		
		GenericInterfaceAbstractImpl<? extends Number> implementation = null;
		NumberType discriminante = null;
		try {
			discriminante = NumberType.valueOf(classe.getSimpleName().toUpperCase());
		} catch(Throwable t) {
			discriminante = NumberType.NULL;
		}
		System.err.println("\n\t discriminante: " + discriminante);
		
		switch(discriminante) {
		case INTEGER:
			implementation = new PlayWithIntegers(); //err
			System.err.println("\n\t factory instance: PlayWithIntegers");
			break;
		case LONG:
			implementation = new PlayWithLongs(); //err
			System.err.println("\n\t factory instance: PlayWithLongs");
			break;
		case SHORT:
			implementation = new PlayWithShorts(); //err
			System.err.println("\n\t factory instance: PlayWithShorts");
			break;
		case DOUBLE:
			implementation = new PlayWithDoubles(); //err
			System.err.println("\n\t factory instance: PlayWithDoubles");
			break;
        default:
        	implementation = null;
			System.err.println("\n\t factory instance: (null)");
		}
		
		return (GenericInterfaceAbstractImpl<T>) implementation;
   }
}

enum NumberType {
    INTEGER("Integer"), 
    DOUBLE("Double"), 
    SHORT("Short"),
    LONG("Long"), 
    NULL("null"),
    ;

	private NumberType(String clazz) {
	}
}
