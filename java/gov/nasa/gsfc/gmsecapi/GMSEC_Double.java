/*
 * Copyright 2007-2016 United States Government as represented by the
 * Administrator of The National Aeronautics and Space Administration.
 * No copyright is claimed in the United States under Title 17, U.S. Code.
 * All Rights Reserved.
 */







package gov.nasa.gsfc.gmsecapi;

/** @class GMSEC_Double
 *
 * @brief This is a container class for the GMSEC double field type.
 *
 */
public class GMSEC_Double extends GMSEC_F64
{
	/**
	 * @brief Construct empty double
	 */
	public GMSEC_Double()
	{
	}

	/**
	 * @brief construct double with value
	 * @param arg
	 */
	public GMSEC_Double(double arg)
	{
		value = arg;
	}

	/**
	 * @param d Double value
	 */
	public GMSEC_Double(GMSEC_Double d)
	{
		Set(d.Get());
	}
}