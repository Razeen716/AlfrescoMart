import java.util.*;

class home{
    Scanner sc = new Scanner(System.in);

    void display() 
    {

        System.out.println("\n\t\t\t\t\t\t\t\t--HOME--\n");
        System.out.print("\t\t\t\t\t\t\t\t1) Groceries\n\t\t\t\t\t\t\t\t2) Fruits\n\t\t\t\t\t\t\tPlease enter which type of item you want. ");
        //Scanner S = new Scanner(System.in);
        int p;
        int opt1 = sc.nextInt();
        
        
        switch(opt1) 
        {
            case 1:
                System.out.println(
                        "\t\t\t\t\t\t\tBread\n\t\t\t\t\t\t\tMeat\n\t\t\t\t\t\t\tRice\n\t\t\t\t\t\t\tOils\n\t\t\t\t\t\t\tFrozen Foods\n\t\t\t\t\t\t\tEggs\n\t\t\t\t\t\t\tCheese ");
                        int inopt = sc.nextInt();
                       switch(inopt){
                            case 1:
                            System.out.println("\t\t\t\t\t\t\tYou've selected bread");
                            System.out.println("\t\t\t\t\t\t\tPrice:40");
                            System.out.println("\t\t\t\t\t\t\tGST:12%");
                            p=(40*12)/100;
                            System.out.println("\t\t\t\t\t\t\tthe GST is : "+p+" Rupees");
                            break;

                            case 2:
                            System.out.println("\t\t\t\t\t\t\tYou've selected Meat");
                            System.out.println("\t\t\t\t\t\t\tPrice:500");
                            System.out.println("\t\t\t\t\t\t\tThere is no GST");
                            // p=(40*28)/100;
                            System.out.println("\t\t\t\t\t\t\tthe Cost is 500 Rupees");
                            break;

                            case 3:
                            System.out.println("\t\t\t\t\t\t\tYou've selected Rice");
                            System.out.println("\t\t\t\t\t\t\tPrice:75 per kg");
                            System.out.println("\t\t\t\t\t\t\tGST:5%");
                            p=(75*5)/100;
                            System.out.println("\t\t\t\t\t\t\tthe GST is : "+p+" Rupees");
                            break;

                            case 4:
                            System.out.println("\t\t\t\t\t\t\tYou've selected Oil");
                            System.out.println("\t\t\t\t\t\t\tPrice:194 per litre");
                            System.out.println("\t\t\t\t\t\t\tGST:5%");
                            p=(194*5)/100;
                            System.out.println("\t\t\t\t\t\t\tthe GST is : "+p+" Rupees");
                            break;

                            case 5:
                            System.out.println("\t\t\t\t\t\t\tYou've selected Frozen Food");
                            System.out.println("\t\t\t\t\t\t\tPrice:190");
                            System.out.println("\t\t\t\t\t\t\tGST:18%");
                            p=(190*18)/100;
                            System.out.println("\t\t\t\t\t\t\tthe GST is : "+p+" Rupees");
                            break;

                            case 6:
                            System.out.println("\t\t\t\t\t\t\tYou've selected Egg");
                            System.out.println("\t\t\t\t\t\t\tPrice:6 per piece");
                            System.out.println("\t\t\t\t\t\t\tGST:18%");
                            p=(6*18)/100;
                            System.out.println("\t\t\t\t\t\t\tthe GST is : "+p+" Rupees");
                            break;

                            case 7:
                            System.out.println("\t\t\t\t\t\t\tYou've selected Cheese");
                            System.out.println("\t\t\t\t\t\t\tPrice:400 per kg");
                            System.out.println("\t\t\t\t\t\t\tGST:18%");
                            p=(400*18)/100;
                            System.out.println("\t\t\t\t\t\t\tthe GST is : "+p+" Rupees");
                            break;
                }        
                break;

            case 2:
                System.out.println(
                        "\t\t\t\t\t\t\tApple\n\t\t\t\t\t\t\tBanana\n\t\t\t\t\t\t\tAppricot\n\t\t\t\t\t\t\tMango\n\t\t\t\t\t\t\tKiwi\n\t\t\t\t\t\t\tPeaches\n\t\t\t\t\t\t\tCherry\n\t\t\t\t\t\t\tPulm\n\t\t\t\t\t\t\tWatermelon");
                        int inopt2 = sc.nextInt();
                        switch(inopt2){
                            
                            case 1:
                            System.out.println("\t\t\t\t\t\t\tYou've selected Apple");
                            System.out.println("\t\t\t\t\t\t\tPrice:180 per kg");
                            System.out.println("\t\t\t\t\t\t\tGST:5%");
                            p=(180*5)/100;
                            System.out.println("\t\t\t\t\t\t\tthe GST is : "+p+" Rupees");
                            break;

                            case 2:
                            System.out.println("\t\t\t\t\t\t\tYou've selected banana");
                            System.out.println("\t\t\t\t\t\t\tPrice:60 per dozen");
                            System.out.println("\t\t\t\t\t\t\tGST:5%");
                            p=(60*5)/100;
                            System.out.println("\t\t\t\t\t\t\tthe GST is : "+p+" Rupees");
                            break;

                            case 3:
                            System.out.println("\t\t\t\t\t\t\tYou've selected Apricot");
                            System.out.println("\t\t\t\t\t\t\tPrice:300 per dozen");
                            System.out.println("\t\t\t\t\t\t\tGST:5%");
                            p=(300*5)/100;
                            System.out.println("\t\t\t\t\t\t\tthe GST is : "+p+" Rupees");
                            break;

                            case 4:
                            System.out.println("\t\t\t\t\t\t\tYou've selected Mango");
                            System.out.println("\t\t\t\t\t\t\tPrice:250 per dozen");
                            System.out.println("\t\t\t\t\t\t\tGST:5%");
                            p=(250*5)/100;
                            System.out.println("\t\t\t\t\t\t\tthe GST is : "+p+" Rupees");
                            break;

                            case 5:
                            System.out.println("\t\t\t\t\t\t\tYou've selected Kiwi");
                            System.out.println("\t\t\t\t\t\t\tPrice:101 per dozen");
                            System.out.println("\t\t\t\t\t\t\tGST:5%");
                            p=(101*5)/100;
                            System.out.println("\t\t\t\t\t\t\tthe GST is : "+p+" Rupees");
                            break;

                            case 6:
                            System.out.println("\t\t\t\t\t\t\tYou've selected Peaches");
                            System.out.println("\t\t\t\t\t\t\tPrice:250 per kg");
                            System.out.println("\t\t\t\t\t\t\tGST:5%");
                            p=(250*5)/100;
                            System.out.println("\t\t\t\t\t\t\tthe GST is : "+p+" Rupees");
                            break;

                            case 7:
                            System.out.println("\t\t\t\t\t\t\tYou've selected Cherry");
                            System.out.println("\t\t\t\t\t\t\tPrice:240 per kg");
                            System.out.println("\t\t\t\t\t\t\tGST:5%");
                            p=(240*5)/100;
                            System.out.println("the GST is : "+p+" Rupees");
                            break;

                            case 8:
                            System.out.println("\t\t\t\t\t\t\tYou've selected Plum");
                            System.out.println("\t\t\t\t\t\t\tPrice:70 per kg");
                            System.out.println("\t\t\t\t\t\t\tGST:5%");
                            p=(70*5)/100;
                            System.out.println("\t\t\t\t\t\t\tthe GST is : "+p+" Rupees");
                            break;

                            case 9:
                            System.out.println("\t\t\t\t\t\t\tYou've selected Watermelon");
                            System.out.println("\t\t\t\t\t\t\tPrice:50 per kg");
                            System.out.println("\t\t\t\t\t\t\tGST:5%");
                            p=(50*5)/100;
                            System.out.println("\t\t\t\t\t\t\tthe GST is : "+p+" Rupees");
                            break;
                        }
                break;

            default:
                System.out.println(" ");
        }

        
    }
}


public class AlfrescoMart {
    public static void main(String args[]){
        System.out.println("\t\t\t\t\t\t\tWELCOME TO Alfresco Mart!!!!\n");

        home s = new home();
        s.display();
    }
}
