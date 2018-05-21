/**********************************************************************
 * Jhove - JSTOR/Harvard Object Validation Environment
 * Copyright 2003 by JSTOR and the President and Fellows of Harvard College
 **********************************************************************/

package edu.harvard.hul.ois.jhove;

/**
 * This class defines enumerated types for a Checksum on a content
 * stream or file.
 * Applications will not create or modify ChecksumTypes, but will
 * use one of the predefined ChecksumType instances
 * CRC32, MD5, or SHA1.
 *
 * @see Checksum
 */
public enum ChecksumType {
	/** 32-bit Cyclical Redundancy Checksum. */
	CRC32("CRC32"),
	/** 128-bit Message Digest 5. */
	MD5("MD5"),
	/** 160-bit Secure Hash Algorithm. */
	SHA1("SHA-1");
	public final String name;
	/**
	 * Applications will never create ChecksumTypes directly.
	 **/
	private ChecksumType(final String name) {
		this.name = name;
	}
}
