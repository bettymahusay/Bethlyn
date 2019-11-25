/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity1;

/**
 *
 * @author it11614
 */
public class ACTIVITY1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
      for(int a=4; a >= 1; --a)
        {
            for(int b = 1; b <= a; ++b)
            {
            System.out.print("* ");
            }
            System.out.println();
        }
         for(int x = 1; x <= 4; ++x)
         {
            for(int y = 1; y <= x; ++y)
            {
                System.out.print("** ");
            }
            System.out.println();
            }
    }    
    
}
