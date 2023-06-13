package dat3.springboottemplate.ConsoleIO;

public class ConsoleApiInfo {
    public static void print()
    {
        printWelcome();
        printApiEndpoints();
    }

    private static void printWelcome()
    {
        System.out.println();
        System.out.println("Example API");
        System.out.println();
    }

    private static void printApiEndpoints()
    {
        System.out.println("Available endpoints:");
        System.out.println();
        printEndPoint("","SwaggerUI/OpenAPI interface (Not available with security enabled)");
        System.out.println();
    }

    private static void printEndPoint(String path, String description)
    {
        String domain = "\t http://localhost:8080/";

        System.out.println(domain + path + " : " + description);
    }
}
