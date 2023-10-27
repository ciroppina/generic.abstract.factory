package ciroppina.generic.factory;

import java.math.BigDecimal;

public class SimpleMainApp {

	public static void main(String[] args)  {
		// TESTs
		Number result = null;
		GenericFactory factory = new GenericFactory();
		
		try {
			short s = 9;
			result = factory.createGenericObject(Short.class).getResult(s);
			System.err.println("\n\t Short result: " +(result==null ? "null" : result) +"\n");

			double d = 9.099d;
			result = factory.createGenericObject(Double.class).getResult(d);
			System.err.println("\n\t Double result: " +(result==null ? "null" : result) +"\n");

			Long l = (long) -1234567890;
			result = factory.createGenericObject(Long.class).getResult(l);
			System.err.println("\n\t Long result: " +(result==null ? "null" : result) +"\n");

			Integer i = (int) 9.099;
			result = factory.createGenericObject(Integer.class).getResult(i);
			System.err.println("\n\t Integer result: " +(result==null ? "null" : result) +"\n");

			result = factory.createGenericObject(BigDecimal.class).getResult(new BigDecimal(d));
			System.err.println("\n\t BigDecimal result: " +(result==null ? "null" : result) +"\n");
		} catch(Throwable t) {
			result = -999999d;
			System.err.println("\n\t Exception result: " +(result==null ? "null" : result) +"\n");
		}
	}

}
