public class ThomasEdisonPhone extends AbstractPhone{
    public ThomasEdisonPhone(int year){
        super(year);
    }

    @Override
    public void call(String outputNumber){
        System.out.println("Вращайте ручку");
        System.out.println("Сообщите номер абонента");
        System.out.println("Набираем абонента номер "+outputNumber);

    }

    @Override
    public void ring(String inputNumber){
        System.out.println("Входящий звонок"+inputNumber);
    }
}
