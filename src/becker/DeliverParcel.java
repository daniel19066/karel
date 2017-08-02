package becker;

import becker.robots.*;

public class DeliverParcel
{
   public static void main(String[] args)
   {  
     // Set up the initial situation
      City prague = new City();
      /*for(int i=1;i<3;i++){
          new Wall(prague,1,i,Direction.NORTH);
          new Wall(prague,2,i,Direction.SOUTH);
          new Wall(prague,i,1,Direction.WEST);
          new Wall(prague,i,2,Direction.EAST);
      };*/
//      for(int i=1;i<3;i++){
//          new Wall(prague,1,i,Direction.NORTH);
//          new Wall(prague,i,1,Direction.WEST);
//          new Wall(prague,3-i,i,Direction.SOUTH);
//          if(i==2){
//              new Wall(prague,1,i,Direction.EAST);
//          }
//      }
//      new Thing(prague,2,2);
      Robot karel = new Robot(prague, 1, 2, Direction.SOUTH,5);
    
      // Direct the robot to the final situation}
      /*karel.move();
      karel.move();
      karel.turnLeft();
      for(int i=0;i<3;i++){
      karel.move();
      karel.move();
      karel.move();
      karel.turnLeft(); 
      }
      karel.move();*/
//      for(int i=0;i<3;i++){
//          if(i==0){
//              karel.turnLeft();
//              karel.turnLeft();
//          }
//          karel.turnLeft();
//          karel.move();
//      }
//     karel.pickThing();
      
      System.out.println(karel.countThingsInBackpack());
   }
}
