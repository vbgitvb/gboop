package Classes;

/*
 * 1) Добавить класс, описывающий акционного клиента. Включить поле название акции, id клиента и количество участников в акции(поле статическое)
 * 2) Добавить интерфейс iReturnOrder возврата товара. Продумать какие методы могут понадобиться и подключить интерфейс к классам клиентов.
 * 3) Добавить комментарии(javadoc) ко всем методам и интерфейсам.
 * 
 */

 /* Класс акционного клиента
  * Учитывает количество участников, название акции
  */
public class PromoClient extends Actor{

    /* Название акции */
    private String promoName;
    private static int idClient;
    private static int participantOfAction;
    

    public PromoClient(String name) {
        super(name);
        promoName = "";
        idClient = 0;
        participantOfAction = 10;

    }

    @Override
    public String getName() {
        return super.name;
    }

    public boolean isTakeOrder() {
      return super.isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        System.out.println("Клиент заказал акционный товар");
      return super.isMakeOrder;

    }

    public void setTakeOrder(boolean makeOder) {
        super.isMakeOrder = makeOder;
      }
      
      public void setMakeOrder(boolean pikUpOrder) {
        super.isTakeOrder = pikUpOrder;
      }
  
      public Actor getActor() {
        return this;
      }

    /* Определяет название акции */
    public void setPromoName(String promoName) {
        this.promoName = promoName;
    }

    /* Задает порядковый номер клиента в акции*/
    public void setIdClient(int idClient) {
        
        if(idClient <= participantOfAction) {
            PromoClient.idClient = idClient;
        }
        else {
            System.out.println("Кол-во участников в акции ограничено.");
        }
        
    }

    /*Задаёт максимальное количество участников в акции */
    public void setParticipantOfAction(int participantOfAction) {
        PromoClient.participantOfAction = participantOfAction;
    }

    /*Возвращает название акции */
    public String getPromoName() {
        return promoName;
    }

    /* Номер клиента в акции*/
    public int getIdClient() {
        return idClient;
    }

    /*Всего участвует в акции */
    public static int getParticipantOfAction() {
        return participantOfAction;
    }

}
