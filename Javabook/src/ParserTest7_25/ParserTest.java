package ParserTest7_25;

class ParserTest {
	public static void main(String[] args) {
		Parseable parser = ParserManger.getParser("XML");
		parser.parse("document.xml");
		parser = ParserManger.getParser("XTML");
		parser.parse("document2.html");
	}
}
	interface Parseable{
public abstract void parse (String fileName);
	}
	class ParserManger {
		public static Parseable getParser(String type) {
			if (type.equals("xmL")) {
				return new XMLParser();
			}else { 
				Parseable p = new HTMLParser();
				return p;
				
			}
		}
	}
class XMLParser implements Parseable {
	public void parse(String fileName) {
System.out.println(fileName + "- XML parsing completed");
	}
}
class HTMLParser implements Parseable{
	public void parse(String fileName) {
		System.out.println(fileName +"-HTML parsing completed");
	}
}
