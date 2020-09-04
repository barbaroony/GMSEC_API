
// File: classlibgmsec__python_1_1ProductFileMessage.xml


%feature("docstring") gmsec::api::mist::message::ProductFileMessage "

A MistMessage object that is capable of storing ProductFile objects
The following message schema IDs and their templates are supported:
MSG.PROD.AAA
MSG.PROD.AUTO
MSG.PROD.FD
MSG.PROD.MAS
MSG.PROD.PAS
MSG.PROD.SC
MSG.PROD.TAC
REQ.PROD.AAA
REQ.PROD.AUTO
REQ.PROD.FD
REQ.PROD.MAS
REQ.PROD.PAS
REQ.PROD.SC
REQ.PROD.TAC
RESP.PROD.AAA
RESP.PROD.AUTO
RESP.PROD.FD
RESP.PROD.MAS
RESP.PROD.PAS
RESP.PROD.SC
RESP.PROD.TAC

See Also
--------
Message
MistMessage
Config
Specification
Field
MsgFieldIterator

CONSTRUCTORS:

>>> ProductFileMessage(self, subject, responseStatus, msgKind, productType, productSubtype, spec)

    Initializes the message instance and automatically builds a schema ID based on params given.

    Parameters
    ----------
    subject: The subject string for the message.
    responseStatus: RESPONSE-STATUS field to indert into a MSG PROD message.
    msgKind: The kind of message to instantiate.
    productType: PROD-TYPE field to insert into a MSG PROD message.
    productSubtype: PROD-SUBTYPE field to indert into a MSG PROD message.
    spec: The specification this message's schema will adhere to.

    Exceptions
    ----------
    An Exception is thrown if Specification fails to load the template directory or if a valid schemaID cannot be created from the given params.



>>> ProductFileMessage(self, subject, responseStatus, msgKind, productType, productSubtype, config, spec)

    Initializes the message instance and associates a Configuration object and automatically builds a schema ID based on params given.

    Parameters
    ----------
    subject: The subject string for the message.
    responseStatus: RESPONSE-STATUS field to indert into a MSG PROD message.
    msgKind: The kind of message to instantiate.
    productType: PROD-TYPE field to insert into a MSG PROD message.
    productSubtype: PROD-SUBTYPE field to indert into a MSG PROD message.
    config: A configuration to associate with the message.
    spec: The specification this message's schema will adhere to.

    Exceptions
    ----------
    An Exception is thrown if Specification fails to load the template directory or if a valid schemaID cannot be created from the given params.



>>> ProductFileMessage(self, subject, responseStatus, schemaID, spec)

    Initializes the message with a given schema ID

    Parameters
    ----------
    subject: The subject string for the message.
    responseStatus: RESPONSE-STATUS field to indert into a MSG PROD message.
    schemaID: The string used to identify the message schema in the GMSEC ISD. The schema ID has the messageKind.messageType.messageSubtype (e.g. MSG.PROD.AUTO).
    spec: The specification this message's schema will adhere to.

    Exceptions
    ----------
    An Exception is thrown if Specification fails to load the template directory or if schemaID is not a valid ID.



>>> ProductFileMessage(self, subject, responseStatus, schemaID, config, spec)

    Initializes the message with a given schema ID

    Parameters
    ----------
    subject: The subject string for the message.
    responseStatus: RESPONSE-STATUS field to indert into a MSG PROD message.
    schemaID: The string used to identify the message schema in the GMSEC ISD. The schema ID has the messageKind.messageType.messageSubtype (e.g. MSG.PROD.AUTO).
    config: A configuration to associate with the message.
    spec: The specification this message's schema will adhere to.

    Exceptions
    ----------
    An Exception is thrown if Specification fails to load the template directory or if schemaID is not a valid ID.



>>> ProductFileMessage(self, other)

    Copy constructor - initializes the message instance using the other given ProductFileMessage.

    Parameters
    ----------
    other: The other ProductFileMessage object to copy.



>>> ProductFileMessage(self, data)

    Initializes a ProductFileMessage using an XML or JSON string.

    Parameters
    ----------
    data: XML or JSON string used to initialize the ProductFileMessage.

    Exceptions
    ----------
    An Exception is thrown if the given data does not represent a valid XML or JSON statement.

    Note
    ----------
    This constructor has been deprecated. Use ProductFileMessage(self, spec, data) instead.



>>> ProductFileMessage(self, spec, data)

    Initializes a ProductFileMessage using an XML or JSON string.

    Parameters
    ----------
    spec: The specification this message's schema will adhere to.
    data: XML or JSON string used to initialize the ProductFileMessage.

    Exceptions
    ----------
    An Exception is thrown if the given data does not represent a valid XML or JSON statement.
    An Exception is thrown if the given data does not represent a Product File Message.
";


%feature("docstring") gmsec::api::mist::message::ProductFileMessage::getNumProductFiles "

    getNumProductFiles(self) -> size_t

    Get the number of ProductFiles in this message.

    Returns
    -------
    Return the number of ProductFiles in the message.
";

%feature("docstring") gmsec::api::mist::message::ProductFileMessage::addProductFile "

    addProductFile(self, productFile)

    Add a product file to the message.
";

%feature("docstring") gmsec::api::mist::message::ProductFileMessage::getProductSubtype "

    getProductSubtype(self) -> char const *

    Get the PROD-SUBTYPE of this ProductFile message.
";

%feature("docstring") gmsec::api::mist::message::ProductFileMessage::getProductType "

    getProductType(self) -> char const *

    Get the PROD-TYPE of this ProductFile message.
";

%feature("docstring") gmsec::api::mist::message::ProductFileMessage::getProductFile "

    getProductFile(self, index) -> ProductFile

    Get ProductFile numbered at index. Note that the index which will be
    retrieved does not correspond to the GMSEC ISD and starts from 0 instead of 1.
    For example, getProductFile(0) would return the ProductFile corresponding to
    FILE.1.

    Returns
    -------
    ProductFile at specified index inside of ProductFileMessage.

    Exceptions
    ----------
    Throws an exception if the index specified is not in the
        range of ProductFiles in this message.

    Note: This function has been deprecated, use ProductFileIterator instead.
";

%feature("docstring") gmsec::api::mist::message::ProductFileMessage::getResponseStatus "

    getResponseStatus(self) -> gmsec::api::mist::ResponseStatus::Response

    Get the response status of this ProductFile message.
";

%feature("docstring") gmsec::api::mist::message::ProductFileMessage::convertMessage "

    convertMessage(message) -> ProductFileMessage

    Constructs and returns a MnemonicMessage from an an ordinary message.
";

%feature("docstring") gmsec::api::mist::message::ProductFileMessage::getProductFileIterator "

    getProductFileIterator(self) -> ProductFileIterator

    Method that allows the callee to get the ProductFileIterator associated with the ProductFileMessage.
    This iterator will allow for applications to iterate over the ProductFile objects stored within the ProductFileMessage.
    The iterator is reset each time getProductFileIterator() is called.  The iterator itself is destroyed when the
    ProductFileMessage object is destroyed.

    Note: Only one ProductFileIterator object is associated with a ProductFileMessage object; multiple calls to
        getProductFileIterator() will return a reference to the same ProductFileIterator object.  Each call will reset the iterator.

    Returns
    -------
    A reference to a ProductFileIterator object.
";

