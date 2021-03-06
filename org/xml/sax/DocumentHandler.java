package org.xml.sax;

public interface DocumentHandler {
  void setDocumentLocator(Locator paramLocator);
  
  void startDocument() throws SAXException;
  
  void endDocument() throws SAXException;
  
  void startElement(String paramString, AttributeList paramAttributeList) throws SAXException;
  
  void endElement(String paramString) throws SAXException;
  
  void characters(char[] paramArrayOfChar, int paramInt1, int paramInt2) throws SAXException;
  
  void ignorableWhitespace(char[] paramArrayOfChar, int paramInt1, int paramInt2) throws SAXException;
  
  void processingInstruction(String paramString1, String paramString2) throws SAXException;
}


/* Location:              D:\software\jd-gui\jd-gui-windows-1.6.3\rt.jar!\org\xml\sax\DocumentHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */