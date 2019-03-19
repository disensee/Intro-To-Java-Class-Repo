package Test;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlParser {

	public static void main(String[] args) {

		String str = "foo/bar:bang";
		String[] ar = str.split(":");
		String b = ar[1];
		String newStr = str.replace(b, "");
		System.out.println(newStr);
		
		// url = url.replace(UrlParser.getProtocol(url), "");
		
		String url1 = "http://www.acme.com";
		String url2 = "http://www.acme.com/widgets/";
		String url3 = "https://www.example.com/blog/some-blog-post.html";
		String url4 = "http://www.guitars.com/electric/fender/stratocaster.php?id=7&firstName=Bob&lastName=Smith";
		// Note: Your code should work with any valid absolute URL!

		// Test getProtocol()
		System.out.println(url1 + "  PROTOTCOL=" + UrlParser.getProtocol(url1));
		System.out.println(url2 + "  PROTOTCOL=" + UrlParser.getProtocol(url2));
		System.out.println(url3 + "  PROTOTCOL=" + UrlParser.getProtocol(url3));
		System.out.println(url4 + "  PROTOTCOL=" + UrlParser.getProtocol(url4));

		System.out.println("-----------------------------------------------------------\n");

		// Test getHost()
		System.out.println(url1 + "  HOST=" + UrlParser.getHost(url1));
		System.out.println(url2 + "  HOST=" + UrlParser.getHost(url2));
		System.out.println(url3 + "  HOST=" + UrlParser.getHost(url3));
		System.out.println(url4 + "  HOST=" + UrlParser.getHost(url4));

		System.out.println("-----------------------------------------------------------\n");

		// Test getQueryString()
		System.out.println(url1 + "  QUERY STRING=" + UrlParser.getQueryString(url1));
		System.out.println(url2 + "  QUERY STRING=" + UrlParser.getQueryString(url2));
		System.out.println(url3 + "  QUERY STRING=" + UrlParser.getQueryString(url3));
		System.out.println(url4 + "  QUERY STRING=" + UrlParser.getQueryString(url4));

		System.out.println("-----------------------------------------------------------\n");

		
		// Test getFileName()
		System.out.println(url1 + "  FILENAME=" + UrlParser.getFileName(url1));
		System.out.println(url2 + "  FILENAME=" + UrlParser.getFileName(url2));
		System.out.println(url3 + "  FILENAME=" + UrlParser.getFileName(url3));
		System.out.println(url4 + "  FILENAME=" + UrlParser.getFileName(url4));

		System.out.println("-----------------------------------------------------------\n");

		// Test getFileExtension()
		System.out.println(url1 + "  EXTENSION=" + UrlParser.getFileExtension(url1));
		System.out.println(url2 + "  EXTENSION=" + UrlParser.getFileExtension(url2));
		System.out.println(url3 + "  EXTENSION=" + UrlParser.getFileExtension(url3));
		System.out.println(url4 + "  EXTENSION=" + UrlParser.getFileExtension(url4));

		System.out.println("-----------------------------------------------------------\n");

		// Test getPath()
		System.out.println(url1 + "  PATH=" + UrlParser.getPath(url1));
		System.out.println(url2 + "  PATH=" + UrlParser.getPath(url2));
		System.out.println(url3 + "  PATH=" + UrlParser.getPath(url3));
		System.out.println(url4 + "  PATH=" + UrlParser.getPath(url4));

		
		// Test parseQueryStringParams()
		UrlParser.parseQueryStringParams(url4);
		

	}

	/**
	 * Validates an absolute url. This method uses a regular expression, which we'll
	 * discuss in Adv Topics. This method is not bullet-proof, but it will serve the
	 * purpose of this exercise.
	 * 
	 * @param url 
	 * @return Returns true if the url parameter is a valid absolute url, returns
	 *         false otherwise
	 */
	public static boolean isValid(String url) {
		String regex = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(url);
		boolean valid = m.matches();
		
		if (!valid) {
			System.out.println(url + " is not a valid absolute URL");
		}
		return valid;
	}

	/**
	 * Extracts the protocol portion of the url.
	 * Note that the protocol is the first part of a url and is always followed by a semi-colon.
	 * 
	 * @param url
	 * @return
	 */
	public static String getProtocol(String url) {

		String protocol = null;

		if (isValid(url)) {

			String[] splitting = url.split(":|/");
			protocol = splitting[0];

		}

		return protocol;
	}

	/**
	 * Extracts the host portion of the url.
	 * Note that the host portion of a url always starts just after the two forward slashes (//)
	 * and continues until the next forward slash.
	 * Also note that the host is also called the domain name, and/or the server name.
	 * 
	 * @param url
	 * @return
	 */
	public static String getHost(String url) {

		String host = null;

		if (isValid(url)) {

			String[] splitting = url.split("/");
			host = splitting[2];
			
		}

		return host;
	}

	/**
	 * Extracts the query string in a url.
	 * Note that a question mark is used to
	 * separate the query string from the rest of the URL. But the question mark is
	 * not considered part of the query string (so this method should not include the question
	 * mark in the extracted query string). Note that there can never be more than
	 * one question mark in a valid URL
	 * 
	 * @param url
	 * @return Returns the query string in the url. If there is no query string,
	 *         then returns an empty string.
	 */
	public static String getQueryString(String url) {

		String queryString = null;
		String check = "id=";

		if (isValid(url)) {

			if(url.toLowerCase().contains(check.toLowerCase())) {
				queryString = url.substring(url.indexOf("id="));
			}else {
				queryString = "";
			}
			
		}

		return queryString;
	}

	/**
	 * Extracts the file name, including the file extension, from the url.
	 * Note that some urls do not include a file (the url may represent a folder on the host computer).
	 * Note that other than the host part, there should never be a dot (.) in a urlL unless it
	 * is used in the file name. So, you may want to somehow remove/replace the host
	 * part of the url before checking for a file name.
	 * 
	 * @param url
	 * @return Returns the file name in the url. If there is no file name in the
	 *         url, then returns an empty string
	 */
	public static String getFileName(String url) {

		String fileName = null;

		if (isValid(url)) {
			
			fileName = url.substring(url.lastIndexOf("/") + 1);
			if(fileName.contains("?")) {
				fileName = fileName.substring(0, fileName.indexOf("?"));
			}
			if(fileName.contains(".com")) {
				fileName = "";
			}
			
		}

		return fileName;
	}

	/**
	 * Extracts the file extension in the url (if there is one) Note that if there
	 * is a file name in the url, it should always include the extension.
	 * 
	 * @param url
	 * @return Returns the file extension in the url. It there is no file extension,
	 *         returns an empty string
	 */
	public static String getFileExtension(String url) {

		String extension = null;

		if (isValid(url)) {

			extension = url.substring(url.lastIndexOf(".") + 1);
			if(extension.contains("?")) {
				extension = extension.substring(0, extension.indexOf("?"));
			}
			if(extension.contains("com")) {
				extension = "";
			}
			
		}

		return extension;
	}

	/**
	 * Extracts the path portion of a url
	 * 
	 * @param url
	 * @return Returns the path, if there is one. Returns and empty string if there
	 *         is not a path in the url
	 */
	
	public static String getPath(String url) {

		String path = null;

		if (isValid(url)) {

			path = url.substring(url.indexOf(".com") + 4);
			if(path.contains(getFileExtension(url))){
				path = path.substring(0, path.lastIndexOf("/")+1);
			}
			
		}

		return path;
	}

	/**
	 * Prints out the query string name and value pairs.
	 * 
	 * Note that a query string is made of key/value pairs. Each pair is separated
	 * by an ampersand (&) Within each pair, the key and value are separated by an
	 * equals sign (=)
	 * 
	 * For example: If this is the url:
	 * http://www.acme.com/blog/some-blog-post.html?id=7&firstName=Bob&lastName=Smith
	 * Then this would be the output printed to the console: id:7 firstName: Bob
	 * lastName: Smith
	 * 
	 * 
	 * If there is no query string in the url, then nothing is printed to the
	 * console.
	 * 
	 * @param url
	 */
	public static void parseQueryStringParams(String url) {

		if (isValid(url)) {

			String queryString = null;
			queryString = url.substring(url.lastIndexOf(".") + 1);
			String[] splitting = queryString.split("\\?|=|&");
			System.out.println(splitting[1] + ": " + splitting[2]);
			System.out.println(splitting[3] + ": " + splitting[4]);
			System.out.println(splitting[5] + ": " + splitting[6]);
			
			System.out.println(Arrays.deepToString(splitting));
		}

	}

}