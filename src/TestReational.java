/*#########################################################
This program created by Hashim Khubrani twitter: @HJKCS2002
##########################################################*/
import java.util.Scanner;
public class TestReational {

    /*###########################################//####### We must Develping is: 1- simplifaction ########
        This program for Reational Opearations: 
        Multi = Multiplication. 
        Div = Division. 
        Add = Addition. 
        Sub = Subtraction.
     ############################################*/
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
/*#################################
         this is Objects Area.
###################################*/
        
        MultiReational MultiReationalObject1 = new MultiReational();
        MultiReational MultiReationalObject2 = new MultiReational();
       
        AddReational AddReationalObject1 = new AddReational();
        AddReational AddReationalObject2 = new AddReational();
        
        SubReational SubReationalObject1 = new SubReational();
        SubReational SubReationalObject2 = new SubReational();
        
        DivReational DivReationalObject1 = new DivReational();
        DivReational DivReationalObject2 = new DivReational();
        
        System.out.println("####This program created by Hashim Khubrani twitter: @HJKCS2002####");
        System.out.print("Enter type of Calc Proccess: 'Multi' or 'Add' or 'Sub' or 'Div': ");
        String choiceProccess = reader.next();
    
/*#################################
    this is part for Multi Procces 
###################################*/
                
            if (choiceProccess.equals("Multi")){
                System.out.print("Enter First Reational as follwos 'Enter Numeratror then Denominator' : ");
                MultiReationalObject1.setNoem(reader.nextDouble());
                MultiReationalObject1.setdenom(reader.nextDouble());
                
                System.out.print("Enter Seconed Reational as follwos 'Enter Numeratror then Denominator' : ");
                MultiReationalObject2.setNoem(reader.nextDouble());
                MultiReationalObject2.setdenom(reader.nextDouble());

                MultiReational MultiReationalObject3 = MultiReationalObject1.reusltMlti(MultiReationalObject2);

                System.out.println( "Result of Multi:\n" +
                "Noem = " + MultiReationalObject3.getNoem() +
                "\nDenom = " + MultiReationalObject3.getdenom()
                );
            
            }
            
/*#################################
    this is part for Div Procces 
###################################*/
            
            else if (choiceProccess.equals("Div")){
                System.out.print("Enter First Reational as follwos 'Enter Numeratror then Denominator' : ");
                DivReationalObject1.setNoem(reader.nextDouble());
                DivReationalObject1.setdenom(reader.nextDouble());

                System.out.print("Enter Seconed Reational as follwos 'Enter Numeratror then Denominator' : ");
                DivReationalObject2.setNoem(reader.nextDouble());
                DivReationalObject2.setdenom(reader.nextDouble());

                DivReational DivReationalObject3 = DivReationalObject1.reusltDiv(DivReationalObject2);

                System.out.println( "Result of Div: \n" +
                "Noem = " + DivReationalObject3.getNoem() +
                "\nDenom = " + DivReationalObject3.getdenom()
                );
        }
            
/*#################################
    this is part for Add Procces 
###################################*/
            
            else if (choiceProccess.equals("Add")){
                System.out.print("Enter First Reational as follwos 'Enter Numeratror then Denominator' : ");
                AddReationalObject1.setNoem(reader.nextDouble());
                AddReationalObject1.setdenom(reader.nextDouble());

                System.out.print("Enter Seconed Reational as follwos 'Enter Numeratror then Denominator' : ");
                AddReationalObject2.setNoem(reader.nextDouble());
                AddReationalObject2.setdenom(reader.nextDouble());

                AddReational AddReationalObject3 = AddReationalObject1.reusltAdd(AddReationalObject2);

                System.out.println( "Result of Add: \n" +
                "Noem = " + AddReationalObject3.getNoem() +
                "\nDenom = " + AddReationalObject3.getdenom()
                );
        }
            
/*#################################
    this is part for Sub Procces 
###################################*/
            
            else if (choiceProccess.equals("Sub")){
                System.out.print("Enter First Reational as follwos 'Enter Numeratror then Denominator' : ");
                SubReationalObject1.setNoem(reader.nextDouble());
                SubReationalObject1.setdenom(reader.nextDouble());

                System.out.print("Enter Seconed Reational as follwos 'Enter Numeratror then Denominator' : ");
                SubReationalObject2.setNoem(reader.nextDouble());
                SubReationalObject2.setdenom(reader.nextDouble());

                SubReational SubReationalObject3 = SubReationalObject1.reusltSub(SubReationalObject2);

                System.out.println( "Result of Sub: \n" +
                "Noem = " + SubReationalObject3.getNoem() +
                "\nDenom = " + SubReationalObject3.getdenom()
                );
        }
            
/*#############################################################
   If Input it is not Correct the program enter else-branching.
################################################################*/  
            
            else 
                System.out.println("The Input it isn't Correct, Try Again,..");

            
    }
    
}
