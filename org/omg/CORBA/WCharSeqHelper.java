package org.omg.CORBA;

import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.OutputStream;

public abstract class WCharSeqHelper {
  private static String _id = "IDL:omg.org/CORBA/WCharSeq:1.0";
  
  private static TypeCode __typeCode = null;
  
  public static void insert(Any paramAny, char[] paramArrayOfChar) {
    OutputStream outputStream = paramAny.create_output_stream();
    paramAny.type(type());
    write(outputStream, paramArrayOfChar);
    paramAny.read_value(outputStream.create_input_stream(), type());
  }
  
  public static char[] extract(Any paramAny) { return read(paramAny.create_input_stream()); }
  
  public static TypeCode type() {
    if (__typeCode == null) {
      __typeCode = ORB.init().get_primitive_tc(TCKind.tk_wchar);
      __typeCode = ORB.init().create_sequence_tc(0, __typeCode);
      __typeCode = ORB.init().create_alias_tc(id(), "WCharSeq", __typeCode);
    } 
    return __typeCode;
  }
  
  public static String id() { return _id; }
  
  public static char[] read(InputStream paramInputStream) {
    char[] arrayOfChar = null;
    int i = paramInputStream.read_long();
    arrayOfChar = new char[i];
    paramInputStream.read_wchar_array(arrayOfChar, 0, i);
    return arrayOfChar;
  }
  
  public static void write(OutputStream paramOutputStream, char[] paramArrayOfChar) {
    paramOutputStream.write_long(paramArrayOfChar.length);
    paramOutputStream.write_wchar_array(paramArrayOfChar, 0, paramArrayOfChar.length);
  }
}


/* Location:              D:\software\jd-gui\jd-gui-windows-1.6.3\rt.jar!\org\omg\CORBA\WCharSeqHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */