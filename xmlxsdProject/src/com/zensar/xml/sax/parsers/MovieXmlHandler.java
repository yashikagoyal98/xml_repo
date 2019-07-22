package com.zensar.xml.sax.parsers;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MovieXmlHandler extends DefaultHandler {

	@Override
	public void characters(char[] arg0, int arg1, int arg2) throws SAXException {
		// TODO Auto-generated method stub
		for(int i=arg1;i<arg1+arg2;i++)
		{
			System.out.print(arg0[i]);
		}
		System.out.println();
	}

	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
	System.out.println("End of Xml Document");
	}

	@Override
	public void endElement(String arg0, String arg1, String arg2) throws SAXException {
		// TODO Auto-generated method stub
	System.out.println("End Element: "+arg2);
	}

	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
	System.out.println("Starting..");
	}

	@Override
	public void startElement(String arg0, String arg1, String arg2, Attributes arg3) throws SAXException {
		// TODO Auto-generated method stub
    System.out.println("Start Element: " +arg2);

	}

	

}
