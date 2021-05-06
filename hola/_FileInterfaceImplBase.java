
/**
* _FileInterfaceImplBase.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from FileInterface.idl
* jueves 6 de mayo de 2021 03:54:23 PM GMT
*/

public abstract class _FileInterfaceImplBase extends org.omg.CORBA.portable.ObjectImpl
                implements FileInterface, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors
  public _FileInterfaceImplBase ()
  {
  }

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("ContarLineas", new java.lang.Integer (0));
    _methods.put ("ContarVocales", new java.lang.Integer (1));
    _methods.put ("Escribe", new java.lang.Integer (2));
    _methods.put ("Imprimir", new java.lang.Integer (3));
    _methods.put ("Respaldar", new java.lang.Integer (4));
    _methods.put ("Copiar", new java.lang.Integer (5));
    _methods.put ("Renombrar", new java.lang.Integer (6));
    _methods.put ("Borrar", new java.lang.Integer (7));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get (method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // FileInterface/ContarLineas
       {
         String archivo = in.read_string ();
         String __result = null;
         __result = this.ContarLineas (archivo);
         out = rh.createReply();
         out.write_string (__result);
         break;
       }

       case 1:  // FileInterface/ContarVocales
       {
         String archivo = in.read_string ();
         String __result = null;
         __result = this.ContarVocales (archivo);
         out = rh.createReply();
         out.write_string (__result);
         break;
       }

       case 2:  // FileInterface/Escribe
       {
         String archivo = in.read_string ();
         String contenido = in.read_string ();
         this.Escribe (archivo, contenido);
         out = rh.createReply();
         break;
       }

       case 3:  // FileInterface/Imprimir
       {
         String archivo = in.read_string ();
         String __result = null;
         __result = this.Imprimir (archivo);
         out = rh.createReply();
         out.write_string (__result);
         break;
       }

       case 4:  // FileInterface/Respaldar
       {
         String archivo = in.read_string ();
         String respaldo = in.read_string ();
         this.Respaldar (archivo, respaldo);
         out = rh.createReply();
         break;
       }

       case 5:  // FileInterface/Copiar
       {
         String archivo = in.read_string ();
         String archivin = in.read_string ();
         this.Copiar (archivo, archivin);
         out = rh.createReply();
         break;
       }

       case 6:  // FileInterface/Renombrar
       {
         String archivo = in.read_string ();
         String renombrado = in.read_string ();
         this.Renombrar (archivo, renombrado);
         out = rh.createReply();
         break;
       }

       case 7:  // FileInterface/Borrar
       {
         String archivo = in.read_string ();
         boolean __result = false;
         __result = this.Borrar (archivo);
         out = rh.createReply();
         out.write_boolean (__result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:FileInterface:1.0"};

  public String[] _ids ()
  {
    return __ids;
  }


} // class _FileInterfaceImplBase