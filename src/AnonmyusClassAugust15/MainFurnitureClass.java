package AnonmyusClassAugust15;

public class MainFurnitureClass {
    public static void main(String[] args) {
//        Furniture furniture =new Chair();
//        furniture.sit();
//        furniture.stand();
//        Furniture furniture1 =new Table();
//        furniture1.sit();
//        furniture1.stand();
//    }

        Furniture furniture = new Furniture() {
            @Override
            public void sit() {
                System.out.println("You can sit");
            }

            @Override
            public void stand() {
                System.out.println("You cannot sit");
            }
        };
        furniture.stand();
       furniture.sit();
    }
}

/*
* Annomyus class --- inner class, it doesn't have any name
*
* */