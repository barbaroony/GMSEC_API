/*
 * Copyright 2007-2019 United States Government as represented by the
 * Administrator of The National Aeronautics and Space Administration.
 * No copyright is claimed in the United States under Title 17, U.S. Code.
 * All Rights Reserved.
 */

%rename(MnemonicMessage) gmsec::api::mist::message::MnemonicMessage;

%module MnemonicMessage
%{
#include <gmsec4/mist/message/MnemonicMessage.h>
using namespace gmsec::api::mist::message;
%}

%ignore gmsec::api::mist::message::MnemonicMessage::operator=(const MnemonicMessage&);

%include "dox/MnemonicMessage_dox.i"
%include <gmsec4/util/wdllexp.h>
%include <gmsec4/mist/message/MnemonicMessage.h>
