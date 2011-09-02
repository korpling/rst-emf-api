package de.hu_berlin.german.korpling.saltnpepper.misc.rst.exceptions;

public class RSTException extends java.lang.RuntimeException
{
	/**
	 * generated serialVersionUID
	 */
	private static final long serialVersionUID = 7152733137673679658L;

	public RSTException()
	{ super(); }
	
    public RSTException(String s)
    { super(s); }
    
	public RSTException(String s, Throwable ex)
	{super(s, ex); }
}
