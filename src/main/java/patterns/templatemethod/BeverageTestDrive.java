package patterns.templatemethod;

public class BeverageTestDrive {
    public static void main(String[] args) {
        CoffeineBeverageWithHook coffee = new CoffeeWithHook();
        CoffeineBeverageWithHook tea = new TeaWithHook();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();
    }
}
