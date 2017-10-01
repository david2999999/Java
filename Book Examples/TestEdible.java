public class TestEdible{
      public static void main(String[] args) {
            Object[] objects = {new Tiger() , new Chicken(), new Apple()};
            for (int i = 0 ; i < objects.length ; i++ )
                  if(objects[i] instanceof Edible)
                        System.out.println(((Edible)objects[i]).howToEat());
      }
}


      interface Edible{
            public abstract String howToEat();
      }

      class Animal{
      }

      class Chicken extends Animal implements Edible{
            public String howToEat(){
                  return "Chicken: Fry it";
            }
      }

      class Tiger extends Animal{
      }

      abstract class Fruit implements Edible{
      }

      class Apple extends Fruit{
            public String howToEat(){
                  return "Apple: Make apple Cider";
            }
      }

      class Orange extends Fruit{
            public String howToEat(){
                  return "Orange: Make Orange Juice";
            }
      }
