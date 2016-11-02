import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class readUrl {

	public static void main(String[] args) throws IOException {

		Document doc = Jsoup.connect("http://www.nytimes.com/").get();
		Element content = doc.getElementById("content");
		Elements links = doc.select("a[href]");
		Elements elements = null;
		Element document = null;
		 elements=doc.select("p");
	      String text=elements.text();
	        System.out.println(text);

		for (Element link : links) {
		  String linkHref = link.attr("href");
		  String linkText = link.text();
		 // System.out.println("Text::"+linkText+", URL::"+linkHref);
		  //System.out.println(elements.html());
		}
	}

}