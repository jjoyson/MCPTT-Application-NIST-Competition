/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.tinyWRAP;

public class ProxyPluginMgrCallback {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ProxyPluginMgrCallback(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ProxyPluginMgrCallback obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        tinyWRAPJNI.delete_ProxyPluginMgrCallback(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    tinyWRAPJNI.ProxyPluginMgrCallback_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    tinyWRAPJNI.ProxyPluginMgrCallback_change_ownership(this, swigCPtr, true);
  }

  public ProxyPluginMgrCallback() {
    this(tinyWRAPJNI.new_ProxyPluginMgrCallback(), true);
    tinyWRAPJNI.ProxyPluginMgrCallback_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

  public int OnPluginCreated(java.math.BigInteger id, twrap_proxy_plugin_type_t type) {
    return (getClass() == ProxyPluginMgrCallback.class) ? tinyWRAPJNI.ProxyPluginMgrCallback_OnPluginCreated(swigCPtr, this, id, type.swigValue()) : tinyWRAPJNI.ProxyPluginMgrCallback_OnPluginCreatedSwigExplicitProxyPluginMgrCallback(swigCPtr, this, id, type.swigValue());
  }

  public int OnPluginDestroyed(java.math.BigInteger id, twrap_proxy_plugin_type_t type) {
    return (getClass() == ProxyPluginMgrCallback.class) ? tinyWRAPJNI.ProxyPluginMgrCallback_OnPluginDestroyed(swigCPtr, this, id, type.swigValue()) : tinyWRAPJNI.ProxyPluginMgrCallback_OnPluginDestroyedSwigExplicitProxyPluginMgrCallback(swigCPtr, this, id, type.swigValue());
  }

}
