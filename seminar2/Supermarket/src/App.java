import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PensionerClient;
import Classes.SpecialClient;
import Classes.TaxService;
import Classes.PromoClient;
import Interfaces.iActorBehaviuor;
import Interfaces.iReturnOrder;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Market magnit = new Market();
        iActorBehaviuor client1 = new OrdinaryClient("Boris");
        iActorBehaviuor client2 = new SpecialClient("prezident",1001);
        iActorBehaviuor p = new PensionerClient("Sergey Nikolay",1111);
        iActorBehaviuor tax = new TaxService();
        //iReturnOrder brak = new ReturnSomeOrder();



        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(p);
        magnit.acceptToMarket(tax);

        magnit.update();


        iActorBehaviuor ktoto = new PromoClient("Ivanushka");
        ktoto.setPromoName("Летняя распродажа");
        ktoto.isMakeOrder();

        PromoClient sammerActionClient = new PromoClient("Ivan");
        sammerActionClient.setPromoName("Летняя распродажа");
        sammerActionClient.setIdClient(sammerActionClient.getIdClient()+1);
        sammerActionClient.isMakeOrder();





    }
}
