import java.util.Stack;

public class HtmlTagChecker {

    public static boolean isHtmlMatched(String html) {
        Stack<String> buffer = new Stack<>();
        int j = html.indexOf('<'); 

        while (j != -1) {
            int k = html.indexOf('>', j + 1); 
            if (k == -1) {
                return false; 
            }
            String tag = html.substring(j + 1, k); 

            if (!tag.startsWith("/")) {
                buffer.push(tag);
            } else { 
                if (buffer.isEmpty()) {
                    return false; 
                }
                
                if (!tag.substring(1).equals(buffer.pop())) {
                    return false; 
                }
            }
            j = html.indexOf('<', k + 1); 
        }
        return buffer.isEmpty(); 
    }

    public static void main(String[] args) {
        
        String codigo_1 = "<body>\n" +
                "<center>\n" +
                "<h1> The Little Boat </h1>\n" +
                "</center>\n" +
                "<p> The storm tossed the little\n" +
                "boat like a cheap sneaker in an\n" +
                "old washing machine. The three\n" +
                "drunken fishermen were used to\n" +
                "such treatment, of course, but\n" +
                "not the tree salesman, who even as\n" +
                "a stowaway now felt that he\n" +
                "had overpaid for the voyage. </p>\n" +
                "<ol>\n" +
                "<li> Will the salesman die? </li>\n" +
                "<li> What color is the boat? </li>\n" +
                "<li> And what about Naomi? </li>\n" +
                "</ol>\n" +
                "</body>";

        
        String codigo_2 = "<body>\n" +
                "  <center>\n" +
                "    <h1>The Little Boat</h1>\n" +
                "  </center>\n" +
                "  <p>\n" +
                "    The storm tossed the little boat like a cheap sneaker in an old washing machine.\n" +
                "    The three drunken fishermen were used to such treatment, of course, but not the tree salesman,\n" +
                "    who even as a stowaway now felt that he had overpaid for the voyage.\n" +
                "  <ol>\n" +
                "    <li>Will the salesman die?</li>\n" +
                "    <li>What color is the boat?</li>\n" +
                "    <li>And what about Naomi?</li>\n" +
                "  </ol>\n" +
                "</body>";

        System.out.println("Verificação do Código 1: " + isHtmlMatched(codigo_1));
        System.out.println("Verificação do Código 2: " + isHtmlMatched(codigo_2));
    }
}
