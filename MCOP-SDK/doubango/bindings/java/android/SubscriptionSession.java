/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.tinyWRAP;

public class SubscriptionSession extends SipSession {
  private long swigCPtr;

  protected SubscriptionSession(long cPtr, boolean cMemoryOwn) {
    super(tinyWRAPJNI.SubscriptionSession_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SubscriptionSession obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        tinyWRAPJNI.delete_SubscriptionSession(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SubscriptionSession(SipStack pStack) {
    this(tinyWRAPJNI.new_SubscriptionSession(SipStack.getCPtr(pStack), pStack), true);
  }

  public boolean subscribe() {
    return tinyWRAPJNI.SubscriptionSession_subscribe(swigCPtr, this);
  }

  public boolean unSubscribe() {
    return tinyWRAPJNI.SubscriptionSession_unSubscribe(swigCPtr, this);
  }

}