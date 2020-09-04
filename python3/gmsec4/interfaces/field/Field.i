/*
 * Copyright 2007-2018 United States Government as represented by the
 * Administrator of The National Aeronautics and Space Administration.
 * No copyright is claimed in the United States under Title 17, U.S. Code.
 * All Rights Reserved.
 */

%module Field
%{
#include <gmsec4/field/Field.h>
using namespace gmsec::api;
%}

%rename("get_name") getName;
%rename("get_type") getType;
%rename("is_header") isHeader;
%rename("to_XML") toXML;
%rename("to_JSON") toJSON;
%rename("get_integer_value") getIntegerValue;
%rename("get_unsigned_integer_value") getUnsignedIntegerValue;
%rename("get_double_value") getDoubleValue;
%rename("get_string_value") getStringValue;

%include "dox/Field_dox.i"
%include <gmsec4/util/wdllexp.h>
%include <gmsec4/field/Field.h>
