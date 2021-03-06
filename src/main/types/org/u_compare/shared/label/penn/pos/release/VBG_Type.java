
/* First created by JCasGen Wed Mar 16 10:14:07 CET 2011 */
package org.u_compare.shared.label.penn.pos.release;

import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.u_compare.shared.label.penn.pos.general.Verb_Type;

/** 
 * Updated by JCasGen Tue Mar 06 16:28:17 CET 2012
 * @generated */
public class VBG_Type extends Verb_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (VBG_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = VBG_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new VBG(addr, VBG_Type.this);
  			   VBG_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new VBG(addr, VBG_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = VBG.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("org.u_compare.shared.label.penn.pos.release.VBG");



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public VBG_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    