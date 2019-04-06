/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.softbody;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.physics.bullet.dynamics.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class SoftBodyClusterData extends BulletBase {
	private long swigCPtr;
	
	protected SoftBodyClusterData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new SoftBodyClusterData, normally you should not need this constructor it's intended for low-level usage. */ 
	public SoftBodyClusterData(long cPtr, boolean cMemoryOwn) {
		this("SoftBodyClusterData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(SoftBodyClusterData obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				SoftbodyJNI.delete_SoftBodyClusterData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setFramexform(btTransformFloatData value) {
    SoftbodyJNI.SoftBodyClusterData_framexform_set(swigCPtr, this, btTransformFloatData.getCPtr(value), value);
  }

  public btTransformFloatData getFramexform() {
    long cPtr = SoftbodyJNI.SoftBodyClusterData_framexform_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransformFloatData(cPtr, false);
  }

  public void setLocii(btMatrix3x3FloatData value) {
    SoftbodyJNI.SoftBodyClusterData_locii_set(swigCPtr, this, btMatrix3x3FloatData.getCPtr(value), value);
  }

  public btMatrix3x3FloatData getLocii() {
    long cPtr = SoftbodyJNI.SoftBodyClusterData_locii_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btMatrix3x3FloatData(cPtr, false);
  }

  public void setInvwi(btMatrix3x3FloatData value) {
    SoftbodyJNI.SoftBodyClusterData_invwi_set(swigCPtr, this, btMatrix3x3FloatData.getCPtr(value), value);
  }

  public btMatrix3x3FloatData getInvwi() {
    long cPtr = SoftbodyJNI.SoftBodyClusterData_invwi_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btMatrix3x3FloatData(cPtr, false);
  }

  public void setCom(btVector3FloatData value) {
    SoftbodyJNI.SoftBodyClusterData_com_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getCom() {
    long cPtr = SoftbodyJNI.SoftBodyClusterData_com_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setVimpulses(btVector3FloatData value) {
    SoftbodyJNI.SoftBodyClusterData_vimpulses_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getVimpulses() {
    long cPtr = SoftbodyJNI.SoftBodyClusterData_vimpulses_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setDimpulses(btVector3FloatData value) {
    SoftbodyJNI.SoftBodyClusterData_dimpulses_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getDimpulses() {
    long cPtr = SoftbodyJNI.SoftBodyClusterData_dimpulses_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setLv(btVector3FloatData value) {
    SoftbodyJNI.SoftBodyClusterData_lv_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getLv() {
    long cPtr = SoftbodyJNI.SoftBodyClusterData_lv_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setAv(btVector3FloatData value) {
    SoftbodyJNI.SoftBodyClusterData_av_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getAv() {
    long cPtr = SoftbodyJNI.SoftBodyClusterData_av_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setFramerefs(btVector3FloatData value) {
    SoftbodyJNI.SoftBodyClusterData_framerefs_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getFramerefs() {
    long cPtr = SoftbodyJNI.SoftBodyClusterData_framerefs_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setNodeIndices(java.nio.IntBuffer value) {
    assert value.isDirect() : "Buffer must be allocated direct.";
    {
      SoftbodyJNI.SoftBodyClusterData_nodeIndices_set(swigCPtr, this, value);
    }
  }

  public java.nio.IntBuffer getNodeIndices() {
    return SoftbodyJNI.SoftBodyClusterData_nodeIndices_get(swigCPtr, this);
}

  public void setMasses(java.nio.FloatBuffer value) {
    assert value.isDirect() : "Buffer must be allocated direct.";
    {
      SoftbodyJNI.SoftBodyClusterData_masses_set(swigCPtr, this, value);
    }
  }

  public java.nio.FloatBuffer getMasses() {
    return SoftbodyJNI.SoftBodyClusterData_masses_get(swigCPtr, this);
}

  public void setNumFrameRefs(int value) {
    SoftbodyJNI.SoftBodyClusterData_numFrameRefs_set(swigCPtr, this, value);
  }

  public int getNumFrameRefs() {
    return SoftbodyJNI.SoftBodyClusterData_numFrameRefs_get(swigCPtr, this);
  }

  public void setNumNodes(int value) {
    SoftbodyJNI.SoftBodyClusterData_numNodes_set(swigCPtr, this, value);
  }

  public int getNumNodes() {
    return SoftbodyJNI.SoftBodyClusterData_numNodes_get(swigCPtr, this);
  }

  public void setNumMasses(int value) {
    SoftbodyJNI.SoftBodyClusterData_numMasses_set(swigCPtr, this, value);
  }

  public int getNumMasses() {
    return SoftbodyJNI.SoftBodyClusterData_numMasses_get(swigCPtr, this);
  }

  public void setIdmass(float value) {
    SoftbodyJNI.SoftBodyClusterData_idmass_set(swigCPtr, this, value);
  }

  public float getIdmass() {
    return SoftbodyJNI.SoftBodyClusterData_idmass_get(swigCPtr, this);
  }

  public void setImass(float value) {
    SoftbodyJNI.SoftBodyClusterData_imass_set(swigCPtr, this, value);
  }

  public float getImass() {
    return SoftbodyJNI.SoftBodyClusterData_imass_get(swigCPtr, this);
  }

  public void setNvimpulses(int value) {
    SoftbodyJNI.SoftBodyClusterData_nvimpulses_set(swigCPtr, this, value);
  }

  public int getNvimpulses() {
    return SoftbodyJNI.SoftBodyClusterData_nvimpulses_get(swigCPtr, this);
  }

  public void setNdimpulses(int value) {
    SoftbodyJNI.SoftBodyClusterData_ndimpulses_set(swigCPtr, this, value);
  }

  public int getNdimpulses() {
    return SoftbodyJNI.SoftBodyClusterData_ndimpulses_get(swigCPtr, this);
  }

  public void setNdamping(float value) {
    SoftbodyJNI.SoftBodyClusterData_ndamping_set(swigCPtr, this, value);
  }

  public float getNdamping() {
    return SoftbodyJNI.SoftBodyClusterData_ndamping_get(swigCPtr, this);
  }

  public void setLdamping(float value) {
    SoftbodyJNI.SoftBodyClusterData_ldamping_set(swigCPtr, this, value);
  }

  public float getLdamping() {
    return SoftbodyJNI.SoftBodyClusterData_ldamping_get(swigCPtr, this);
  }

  public void setAdamping(float value) {
    SoftbodyJNI.SoftBodyClusterData_adamping_set(swigCPtr, this, value);
  }

  public float getAdamping() {
    return SoftbodyJNI.SoftBodyClusterData_adamping_get(swigCPtr, this);
  }

  public void setMatching(float value) {
    SoftbodyJNI.SoftBodyClusterData_matching_set(swigCPtr, this, value);
  }

  public float getMatching() {
    return SoftbodyJNI.SoftBodyClusterData_matching_get(swigCPtr, this);
  }

  public void setMaxSelfCollisionImpulse(float value) {
    SoftbodyJNI.SoftBodyClusterData_maxSelfCollisionImpulse_set(swigCPtr, this, value);
  }

  public float getMaxSelfCollisionImpulse() {
    return SoftbodyJNI.SoftBodyClusterData_maxSelfCollisionImpulse_get(swigCPtr, this);
  }

  public void setSelfCollisionImpulseFactor(float value) {
    SoftbodyJNI.SoftBodyClusterData_selfCollisionImpulseFactor_set(swigCPtr, this, value);
  }

  public float getSelfCollisionImpulseFactor() {
    return SoftbodyJNI.SoftBodyClusterData_selfCollisionImpulseFactor_get(swigCPtr, this);
  }

  public void setContainsAnchor(int value) {
    SoftbodyJNI.SoftBodyClusterData_containsAnchor_set(swigCPtr, this, value);
  }

  public int getContainsAnchor() {
    return SoftbodyJNI.SoftBodyClusterData_containsAnchor_get(swigCPtr, this);
  }

  public void setCollide(int value) {
    SoftbodyJNI.SoftBodyClusterData_collide_set(swigCPtr, this, value);
  }

  public int getCollide() {
    return SoftbodyJNI.SoftBodyClusterData_collide_get(swigCPtr, this);
  }

  public void setClusterIndex(int value) {
    SoftbodyJNI.SoftBodyClusterData_clusterIndex_set(swigCPtr, this, value);
  }

  public int getClusterIndex() {
    return SoftbodyJNI.SoftBodyClusterData_clusterIndex_get(swigCPtr, this);
  }

  public SoftBodyClusterData() {
    this(SoftbodyJNI.new_SoftBodyClusterData(), true);
  }

}
