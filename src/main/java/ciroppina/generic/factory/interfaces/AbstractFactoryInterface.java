package ciroppina.generic.factory.interfaces;

public interface AbstractFactoryInterface {
    public <T extends Number> GenericInterfaceAbstractImpl<T> createGenericObject(Class<?> clazz);
}
