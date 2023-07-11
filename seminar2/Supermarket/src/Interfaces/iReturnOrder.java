
package Interfaces;



public interface iReturnOrder{

    /* Причина возврата */
    public void returnOrder(String reasonForReturn);
    
    /*Возможен ли возврат */
    public boolean isReturnable(boolean canBeReturned);

    /*Возврат тоаров по id заказа */
    public boolean returnOrder(int orderId);

}