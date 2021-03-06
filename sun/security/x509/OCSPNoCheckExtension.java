package sun.security.x509;

import java.io.IOException;
import java.util.Enumeration;

public class OCSPNoCheckExtension extends Extension implements CertAttrSet<String> {
  public static final String IDENT = "x509.info.extensions.OCSPNoCheck";
  
  public static final String NAME = "OCSPNoCheck";
  
  public OCSPNoCheckExtension() throws IOException {}
  
  public OCSPNoCheckExtension(Boolean paramBoolean, Object paramObject) throws IOException {}
  
  public void set(String paramString, Object paramObject) throws IOException { throw new IOException("No attribute is allowed by CertAttrSet:OCSPNoCheckExtension."); }
  
  public Object get(String paramString) throws IOException { throw new IOException("No attribute is allowed by CertAttrSet:OCSPNoCheckExtension."); }
  
  public void delete(String paramString) throws IOException { throw new IOException("No attribute is allowed by CertAttrSet:OCSPNoCheckExtension."); }
  
  public Enumeration<String> getElements() { return (new AttributeNameEnumeration()).elements(); }
  
  public String getName() { return "OCSPNoCheck"; }
}


/* Location:              D:\software\jd-gui\jd-gui-windows-1.6.3\rt.jar!\sun\security\x509\OCSPNoCheckExtension.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */