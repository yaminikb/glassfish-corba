package org.glassfish.idlj;


/**
* org/glassfish/idlj/_CORBAServerTestStub.java .
* Generated by the IDL-to-Java compiler (portable), version "4.1"
* from /Users/rgold/projects/glassfish/glassfish-corba/idlj/src/main/idl/org/glassfish/idlj/CORBAServerTest.idl
* Monday, January 29, 2018 11:19:41 AM EST
*/

public class _CORBAServerTestStub extends org.omg.CORBA.portable.ObjectImpl implements org.glassfish.idlj.CORBAServerTest
{

  public String test_primitive (String s, int l)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("test_primitive", true);
                $out.write_string (s);
                $out.write_long (l);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return test_primitive (s, l        );
            } finally {
                _releaseReply ($in);
            }
  } // test_primitive

  public void test_oneway (String s, int l)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("test_oneway", false);
                $out.write_string (s);
                $out.write_long (l);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                test_oneway (s, l        );
            } finally {
                _releaseReply ($in);
            }
  } // test_oneway

  public org.omg.CORBA.Any test_any (org.omg.CORBA.Any a)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("test_any", true);
                $out.write_any (a);
                $in = _invoke ($out);
                org.omg.CORBA.Any $result = $in.read_any ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return test_any (a        );
            } finally {
                _releaseReply ($in);
            }
  } // test_any

  public void test_out (org.omg.CORBA.StringHolder s)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("test_out", true);
                $in = _invoke ($out);
                s.value = $in.read_string ();
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                test_out (s        );
            } finally {
                _releaseReply ($in);
            }
  } // test_out

  public void test_inout (org.omg.CORBA.AnyHolder a)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("test_inout", true);
                $out.write_any (a.value);
                $in = _invoke ($out);
                a.value = $in.read_any ();
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                test_inout (a        );
            } finally {
                _releaseReply ($in);
            }
  } // test_inout

  public void test_transaction ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("test_transaction", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                test_transaction (        );
            } finally {
                _releaseReply ($in);
            }
  } // test_transaction

  public void test_subject ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("test_subject", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                test_subject (        );
            } finally {
                _releaseReply ($in);
            }
  } // test_subject

  public void test_exception () throws org.glassfish.idlj.CORBAServerTestPackage.AnException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("test_exception", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:org/glassfish/idlj/CORBAServerTest/AnException:1.0"))
                    throw org.glassfish.idlj.CORBAServerTestPackage.AnExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                test_exception (        );
            } finally {
                _releaseReply ($in);
            }
  } // test_exception

  public void test_exception2 () throws org.glassfish.idlj.CORBAServerTestPackage.MungedException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("test_exception2", true);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:org/glassfish/idlj/MungedExRepid:1.0"))
                    throw org.glassfish.idlj.CORBAServerTestPackage.MungedExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                test_exception2 (        );
            } finally {
                _releaseReply ($in);
            }
  } // test_exception2

  public String test_widestring (String w)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("test_widestring", true);
                $out.write_wstring (w);
                $in = _invoke ($out);
                String $result = $in.read_wstring ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return test_widestring (w        );
            } finally {
                _releaseReply ($in);
            }
  } // test_widestring

  public String test_timeout (int timeout)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("test_timeout", true);
                $out.write_long (timeout);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return test_timeout (timeout        );
            } finally {
                _releaseReply ($in);
            }
  } // test_timeout

  public String test_value (String w)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("test_value", true);
                org.omg.CORBA.WStringValueHelper.write ($out, w);
                $in = _invoke ($out);
                String $result = org.omg.CORBA.WStringValueHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return test_value (w        );
            } finally {
                _releaseReply ($in);
            }
  } // test_value

  public org.glassfish.idlj.CORBAUnion test_union (org.glassfish.idlj.CORBAUnionHolder u)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("test_union", true);
                org.glassfish.idlj.CORBAUnionHelper.write ($out, u.value);
                $in = _invoke ($out);
                org.glassfish.idlj.CORBAUnion $result = org.glassfish.idlj.CORBAUnionHelper.read ($in);
                u.value = org.glassfish.idlj.CORBAUnionHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return test_union (u        );
            } finally {
                _releaseReply ($in);
            }
  } // test_union

  public org.glassfish.idlj.CORBAStruct test_struct (org.glassfish.idlj.CORBAStruct s, org.glassfish.idlj.CORBAStructHolder os)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("test_struct", true);
                org.glassfish.idlj.CORBAStructHelper.write ($out, s);
                $in = _invoke ($out);
                org.glassfish.idlj.CORBAStruct $result = org.glassfish.idlj.CORBAStructHelper.read ($in);
                os.value = org.glassfish.idlj.CORBAStructHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return test_struct (s, os        );
            } finally {
                _releaseReply ($in);
            }
  } // test_struct

  public org.glassfish.idlj.CORBAStruct[] test_seq (org.glassfish.idlj.CORBASeqHolder seq)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("test_seq", true);
                org.glassfish.idlj.CORBASeqHelper.write ($out, seq.value);
                $in = _invoke ($out);
                org.glassfish.idlj.CORBAStruct $result[] = org.glassfish.idlj.CORBASeqHelper.read ($in);
                seq.value = org.glassfish.idlj.CORBASeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return test_seq (seq        );
            } finally {
                _releaseReply ($in);
            }
  } // test_seq

  public int[] test_long_seq (org.glassfish.idlj.LongSeqHolder seq)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("test_long_seq", true);
                org.glassfish.idlj.LongSeqHelper.write ($out, seq.value);
                $in = _invoke ($out);
                int $result[] = org.glassfish.idlj.LongSeqHelper.read ($in);
                seq.value = org.glassfish.idlj.LongSeqHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return test_long_seq (seq        );
            } finally {
                _releaseReply ($in);
            }
  } // test_long_seq

  public org.omg.CORBA.Object test_POA (String name)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("test_POA", true);
                $out.write_string (name);
                $in = _invoke ($out);
                org.omg.CORBA.Object $result = org.omg.CORBA.ObjectHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return test_POA (name        );
            } finally {
                _releaseReply ($in);
            }
  } // test_POA

  public void cleanup_POA (String name)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("cleanup_POA", true);
                $out.write_string (name);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                cleanup_POA (name        );
            } finally {
                _releaseReply ($in);
            }
  } // cleanup_POA

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:org/glassfish/idlj/CORBAServerTest:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.Object obj = org.omg.CORBA.ORB.init (args, props).string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     String str = org.omg.CORBA.ORB.init (args, props).object_to_string (this);
     s.writeUTF (str);
  }
} // class _CORBAServerTestStub
