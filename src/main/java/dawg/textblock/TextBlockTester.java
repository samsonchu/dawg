package dawg.textblock;

public class TextBlockTester {
    public static void main(String[] args) {
        System.out.println("{\"name\": \"painter\", \"qty\": 18, "
                + "\"size\": {\"width\": 1, \"height\": 8, \"unit\": \"in\"},"
                + "\"tags\": [\"writing\", \"pen\"],"
                + "\"rating\": 7}");

        System.out.println("""
                {  
                  "name": "painter", "qty": 18,
                  "size": {"width": 1, "height": 8, "unit": "in"},
                  "tags": ["writing", "pen"],
                  "rating": 7
                 }              
                 """);
    }
}
