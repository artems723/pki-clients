/**
 * DeactivationDate.java
 * -----------------------------------------------------------------
 *     __ __ __  ___________ 
 *    / //_//  |/  /  _/ __ \	  .--.
 *   / ,<  / /|_/ // // /_/ /	 /.-. '----------.
 *  / /| |/ /  / // // ____/ 	 \'-' .--"--""-"-'
 * /_/ |_/_/  /_/___/_/      	  '--'
 * 
 * -----------------------------------------------------------------
 * Description:
 * The Deactivation Date is the date and time when the Managed 
 * Cryptographic Object SHALL NOT be used for any purpose, except 
 * for decryption, signature verification, or unwrapping, but only 
 * under extraordinary circumstances and only when special 
 * permission is granted.
 *
 * @author     Stefanie Meile <stefaniemeile@gmail.com>
 * @author     Michael Guster <michael.guster@gmail.com>
 * @org.       NTB - University of Applied Sciences Buchs, (CH)
 * @copyright  Copyright � 2013, Stefanie Meile, Michael Guster
 * @license    Simplified BSD License (see LICENSE.TXT)
 * @version    1.0, 2013/08/09
 * @since      Class available since Release 1.0
 *
 * 
 */

package ch.ntb.inf.kmip.attributes;

import ch.ntb.inf.kmip.kmipenum.EnumTag;
import ch.ntb.inf.kmip.kmipenum.EnumType;
import ch.ntb.inf.kmip.objects.base.Attribute;
import ch.ntb.inf.kmip.types.KMIPDateTime;
import ch.ntb.inf.kmip.types.KMIPTextString;
import ch.ntb.inf.kmip.types.KMIPType;

public class DeactivationDate extends Attribute {

	public DeactivationDate(){
		super(new KMIPTextString("Deactivation Date"), new EnumTag(EnumTag.DeactivationDate), new EnumType(EnumType.DateTime));
		this.values = new KMIPAttributeValue[1];
		this.values[0] = new KMIPAttributeValue(new EnumType(EnumType.DateTime), new EnumTag(EnumTag.DeactivationDate), new KMIPDateTime());
		this.values[0].setName(this.getAttributeName());
	}
	
	public DeactivationDate(KMIPType value){
		this();
		this.values[0].setValue(value);
	}
}