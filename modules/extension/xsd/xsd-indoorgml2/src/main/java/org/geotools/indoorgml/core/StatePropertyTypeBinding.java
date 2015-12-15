package org.geotools.indoorgml.core;


import org.geotools.gml2.FeatureTypeCache;
import org.geotools.indoorgml.core.binding.GMLComplexParsingUtils;
import org.geotools.xml.*;
import org.geotools.xml.AbstractComplexBinding;
import org.opengis.feature.Association;
import org.opengis.feature.Feature;

import javax.xml.namespace.QName;

/**
 * Binding object for the type http://www.opengis.net/indoorgml/1.0/core:StatePropertyType.
 *
 * <p>
 *	<pre>
 *	 <code>
 *  &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;xs:complexType name="StatePropertyType" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;
 *  		&lt;xs:sequence minOccurs="0"&gt;
 *  			&lt;xs:element ref="State"/&gt;
 *  		&lt;/xs:sequence&gt;
 *  		&lt;xs:attributeGroup ref="gml:AssociationAttributeGroup"/&gt;
 *  	&lt;/xs:complexType&gt; 
 *		
 *	  </code>
 *	 </pre>
 * </p>
 *
 * @generated
 */
public class StatePropertyTypeBinding extends AbstractComplexBinding {

        FeatureTypeCache ftCache;
        
        public StatePropertyTypeBinding(FeatureTypeCache ftCache) {
            this.ftCache = ftCache;
        }
        
	/**
	 * @generated
	 */
	public QName getTarget() {
		return INDOORCORE.StatePropertyType;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *	
	 * @generated modifiable
	 */	
	public Class getType() {
		return Association.class;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *	
	 * @generated modifiable
	 */	
	public Object parse(ElementInstance instance, Node node, Object value) 
		throws Exception {

	    System.out.println("### StatePropertyTypeBinding ###");
	    return GMLComplexParsingUtils.parseAssociation(instance, node, value, ftCache);
	}

}