/*
 * Copyright 2007-2018 United States Government as represented by the
 * Administrator of The National Aeronautics and Space Administration.
 * No copyright is claimed in the United States under Title 17, U.S. Code.
 * All Rights Reserved.
 */







package gov.nasa.gsfc.gmsecapi;

/** 
 * @class gmsecAPI
 *
 * @deprecated API 3.x has been deprecated; use API 4.x instead.
 *
 * @brief The constants needed for the GMSEC API are in this file.
 *
 */
@Deprecated
public class gmsecAPI
{
	/**
	 * @name Connection types
	 * @brief <b>These identifiers have been deprecated</b>
	 * @{
	 */
	/**
	 * @brief ICS Software bus connection identifier
	 */
	public final static int GMSEC_CONNECTION_ICSSWB = 1;
	/** @brief Rendezvous connection identifier */
	public final static int GMSEC_CONNECTION_RENDEZVOUS = 2;
	/** @brief SmartSockets connection identifier */
	public final static int GMSEC_CONNECTION_SMARTSOCKETS = 3;
	/**@}*/


	/**
	 * @name GMSEC Field type identifiers
	 * @brief These are used to identify field types with Messages
	 * @defgroup FieldTypes Field Types
	 * @{ 
	 */
	/** @brief UNSET field type */
	public final static int GMSEC_TYPE_UNSET = 0;

	/** @brief CHAR field type */
	public final static int GMSEC_TYPE_CHAR = 1;

	/** @brief BOOL field type */
	public final static int GMSEC_TYPE_BOOL = 2;

	/** @brief I16 / SHORT field type */
	public final static int GMSEC_TYPE_SHORT = 3;
	public final static int GMSEC_TYPE_I16 = 3;

	/** @brief U16 / USHORT field type */
	public final static int GMSEC_TYPE_USHORT = 4;
	public final static int GMSEC_TYPE_U16 = 4;

	/** @brief I32 / LONG field type */
	public final static int GMSEC_TYPE_LONG = 5;
	public final static int GMSEC_TYPE_I32 = 5;

	/** @brief U32 / ULONG field type */
	public final static int GMSEC_TYPE_ULONG = 6;
	public final static int GMSEC_TYPE_U32 = 6;

	/** @brief FLOAT field type */
	public final static int GMSEC_TYPE_FLOAT = 7;
	public final static int GMSEC_TYPE_F32 = 7;

	/** @brief DOUBLE field type */
	public final static int GMSEC_TYPE_DOUBLE = 8;
	public final static int GMSEC_TYPE_F64 = 8;

	/** @brief STRING field type */
	public final static int GMSEC_TYPE_STRING = 9;

	/** @brief BIN field type */
	public final static int GMSEC_TYPE_BIN = 10;

	/** @brief I8 field type */
	public final static int GMSEC_TYPE_I8 = 20;

	/** @brief U8 field type */
	public final static int GMSEC_TYPE_U8 = 21;

	/** @brief I64 field type */
	public final static int GMSEC_TYPE_I64 = 22;

	/**@}*/

	// true and false (used for GMSEC_Bool type)
	public final static short GMSEC_TRUE = 1;
	public final static short GMSEC_FALSE = 0;

	//TODO: Why is the UNSET an int type, whereas the others are short?
	public final static int   MESSAGE_TRACKINGFIELDS_UNSET = -1;
	public final static short MESSAGE_TRACKINGFIELDS_ON    = GMSEC_TRUE;
	public final static short MESSAGE_TRACKINGFIELDS_OFF   = GMSEC_FALSE;

	/**
	 * @name GMSEC message 'kinds'
	 * @brief these are used to identify message kinds
	 * @defgroup MessageKinds Message Kinds
	 * @{
	 */
	/** @brief UNSET message kind */
	public final static int GMSEC_MSG_UNSET = 0;
	/** @brief PUBLISH message kind */
	public final static int GMSEC_MSG_PUBLISH = 1;
	/** @brief REQUEST message kind */
	public final static int GMSEC_MSG_REQUEST = 2;
	/** @brief REPLY message kind */
	public final static int GMSEC_MSG_REPLY = 3;
	/**@}*/

	/**
	 * @name GMSEC error class codes
	 * @brief These are used int he Status object to identify general
	 * error classification. This can give the client program some idea
	 * what module has generated the error.
	 * @defgroup ErrorClasses Error Classes
	 * @{
	 */
	/** @brief No error was generated */
	public final static int GMSEC_STATUS_NO_ERROR = 0;
	/** @brief An error was generated by the ConnectionFactory */
	public final static int GMSEC_STATUS_FACTORY_ERROR = 1;
	/** @brief An error was generated by the Connection */
	public final static int GMSEC_STATUS_CONNECTION_ERROR = 2;
	/** @brief An error was generated by the Config */
	public final static int GMSEC_STATUS_CONFIG_ERROR = 3;
	/**
	 * @brief An error was generated by the middleware. 
	 * (In this case the error code will be a middleware specific 
	 * error code)
	 */
	public final static int GMSEC_STATUS_MIDDLEWARE_ERROR = 4;
	/** @brief An error was generated by the Message */
	public final static int GMSEC_STATUS_MESSAGE_ERROR = 5;
	/** @brief An error was generated by the Field */
	public final static int GMSEC_STATUS_FIELD_ERROR = 6;
	/** @brief An error was generated by the Callback */
	public final static int GMSEC_STATUS_CALLBACK_ERROR = 7;
	/** @brief An error was generated by the Callback Dispatcher */
	public final static int GMSEC_STATUS_CALLBACKLKP_ERROR = 8;
	/** @brief An error was generated by the ConfigFile */
	public final static int GMSEC_STATUS_CONFIGFILE_ERROR = 9;
	/** @brief An error was generated by an Iterator error */
	public final static int GMSEC_STATUS_ITERATOR_ERROR = 10;
	/** @brief An error was generated by a Policy error */
	public final static int GMSEC_STATUS_POLICY_ERROR = 11;
	/** @brief An error was generated by a custom error */
	public final static int GMSEC_STATUS_CUSTOM_ERROR = 12;
	/** @brief An error was generated by an undefined part of the API */
	public final static int GMSEC_STATUS_OTHER_ERROR = 20;
	/**@}*/

	/**
	 * @name GMSEC Error codes
	 * @brief These codes correspond to the specific error being generated.
	     * @defgroup ErrorCodes Error Codes
	 * @{
	 */
	/** @brief FAILED to load gmsec middleware wrapper library */
	public final static int GMSEC_LIBRARY_LOAD_FAILURE = 0;
	/** @brief Connection type identifier not recongnized */
	public final static int GMSEC_INVALID_CONNECTION_TYPE = 1;
	/** @brief An error occured trying to run the auto-dispatcher for a Connection */
	public final static int GMSEC_AUTODISPATCH_FAILURE = 2;
	/** @brief The relevant Connection object is invalid */
	public final static int GMSEC_INVALID_CONNECTION = 3;
	/** @brief The requested API function is NOT IMPLEMENTED for the given middleware. */
	public final static int GMSEC_FEATURE_NOT_SUPPORTED = 4;
	/** @brief The specified config value is not understood. */
	public final static int GMSEC_INVALID_CONFIG_VALUE = 5;
	/** @brief Value iteration in the Config object has reached the end of the list of values. */
	public final static int GMSEC_CONFIG_END_REACHED = 6;
	/** @brief The relevant Message object is invalid */
	public final static int GMSEC_INVALID_MESSAGE = 7;
	/** @brief The specified Message type is not understood. */
	public final static int GMSEC_UNKNOWN_MSG_TYPE = 8;
	/** @brief Field iteration in the Message object has reached the end of the list of fields. */
	public final static int GMSEC_FIELDS_END_REACHED = 9;
	/** @brief The specified field type does not match the type of the current field. */
	public final static int GMSEC_FIELD_TYPE_MISMATCH = 10;
	/** @brief The specified field type is not understood. */
	public final static int GMSEC_UNKNOWN_FIELD_TYPE = 11;
	/** @brief The spcified Callback is invalid. */
	public final static int GMSEC_INVALID_CALLBACK = 12;
	/** @brief Request with reply Callback failed. */
	public final static int GMSEC_REQDISPATCH_FAILURE = 13;
	/** @brief The specified Message can not be converted. */
	public final static int GMSEC_MSGCONVERT_FAILURE = 14;
	/** @brief The specified Field name is invalid. */
	public final static int GMSEC_INVALID_FIELD_NAME = 15;
	/** @brief The specified Field value is invalid. */
	public final static int GMSEC_INVALID_FIELD_VALUE = 16;
	/** @brief The specified Config name is invalid. */
	public final static int GMSEC_INVALID_CONFIG_NAME = 17;
	/** @brief The specified subject name is invalid. */
	public final static int GMSEC_INVALID_SUBJECT_NAME = 18;
	/** @brief GetNextMsg() timed out waiting for Message recieve. */
	public final static int GMSEC_NO_MESSAGE_AVAILABLE = 19;
	/** @brief Request() timed out waiting for reply message. */
	public final static int GMSEC_TIMEOUT_OCCURRED = 20;
	/** @brief The API was unable to generate tracking information. */
	public final static int GMSEC_TRACKING_FAILURE = 21;
	/** @brief The specified Config contains values that where not understood. */
	public final static int GMSEC_UNUSED_CONFIG_ITEM = 22;
	/** 
	* @brief  A valid field object was not allocated 
	* and passed in as needed by certain calls within the C API. 
	*/
	public final static int GMSEC_INVALID_FIELD = 23;
	/**
	* @brief This error code is reported when there are problems
	* parsing xml to create a message.
	*/
	public final static int GMSEC_XML_PARSE_ERROR = 24;
	/**
	* @brief This error code is reported when a config object
	* pointer is invalid
	*/
	public final static int GMSEC_INVALID_CONFIG = 25;
	
	/**
	* Error Code@n
	* This error code is reported when a encoding problem occurs
	*/
	public final static int GMSEC_ENCODING_ERROR = 26;

	/**
	* Error Code@n
	* This error code indicates GMSEC encountered a problem allocating memory
	*/
	public final static int GMSEC_OUT_OF_MEMORY = 27;

	/**
	* Error Code@n
	* This error code indicates the user called Next on an iterator that
	* reached the end of the field set.
	*/
	public final static int GMSEC_INVALID_NEXT = 28;

	/**
	* Error Code@n
	* This error code indicates an operation was attempted on an uninitialized object.
	*/
	public final static int GMSEC_INITIALIZATION_ERROR = 29;

	/**
	* Error Code@n
	* This error code indicates an incorrect signature.
	*/
	public final static int GMSEC_USER_ACCESS_INVALID = 30;

	/**
	* Error Code@n
	* This error code indicates an unauthorized attempt to publish.
	*/
	public final static int GMSEC_PUBLISH_NOT_AUTHORIZED = 31;

	/**
	* Error Code@n
	* This error code indicates an unauthorized attempt to subscribe.
	*/
	public final static int GMSEC_SUBSCRIBE_NOT_AUTHORIZED = 32;

	/**
	* Error Code@n
	* This error code indicates message format is incorrect.
	*/
	public final static int GMSEC_BAD_MESSAGE_FORMAT = 33;

	/**
	* Error Code@n
	* This error code indicates message format is incorrect.
	*/
	public final static int GMSEC_INVALID_SIGNATURE = 34;

	/**
	* Error Code@n
	* This error code indicates an operation was attempted on an uninitialized object.
	*/
	public final static int GMSEC_UNINITIALIZED_OBJECT = 35;

	/**
	* Error Code@n
	* This error code indicates a custom (error) code is available via GetCustomCode().
	*/
	public final static int GMSEC_CUSTOM_ERROR = 36;

	/**
	* Error Code@n
	* This error code indicates the AutoDispatcher is running and an exclusive method was called.
	*/
	public final static int GMSEC_AUTODISPATCH_EXCLUSIVE = 37;


	/** @brief Other non-specified error. */
	public final static int GMSEC_OTHER_ERROR = 50;
	/**@}*/

	/**
	 * @name Timeout Constants
	 * @brief these are special timeout values that cause special blocking behavior.
	 * @defgroup TimeoutConsts Timeout Constants
	 * @{
	 */
	/** @brief Do not block, return immediately with error if condition not met */
	public final static int GMSEC_NO_WAIT = 0;
	/** @brief block indefinately, do not return unless condition is met or error has occured */
	public final static int GMSEC_WAIT_FOREVER = -1;
	/**@}*/


	/// @brief 2014 version of the GMSEC Interface Specification Document (ISD)
	/// for use with ConnectionManager.
	public final static int GMSEC_ISD_2014_00 = 201400;

	/// @brief Default version of the GMSEC Interface Specification Document (ISD)
	/// for use with ConnectionManager.
	public final static int GMSEC_ISD_CURRENT = GMSEC_ISD_2014_00;


	/// @brief No error was generated.
	public final static int GMSEC_NO_MIST_ERROR = 0;
	/// @brief An general error has occurred within ConnectionManager or other MIST class.
	public final static int GMSEC_GENERAL_MIST_ERROR = 1001;
	/// @brief The ConnectionManager's Heartbeat Service is not running.
	public final static int GMSEC_HEARTBEAT_SERVICE_NOT_RUNNING = 1002;
	/// @brief The ConnectionManager's Heartbeat Service is running.
	public final static int GMSEC_HEARTBEAT_SERVICE_IS_RUNNING = 1003;
	/// @brief The ConnectionManager's Dispatch Service is not running.
	public final static int GMSEC_DISPATCH_SERVICE_NOT_RUNNING = 1004;
	/// @brief The ConnectionManager's Dispatch Service is running.
	public final static int GMSEC_DISPATCH_SERVICE_IS_RUNNING = 1005;
	/// @brief A Dispatch Service subscription was not found.
	public final static int GMSEC_DISPATCH_SERVICE_SUBSCRIPTION_NOT_FOUND = 1006;
	/// @brief A Dispatch Service subscription alread exists.
	public final static int GMSEC_DISPATCH_SERVICE_ALREADY_SUBSCRIBED = 1007;

	/// @brief Error code to indicate Field is unset.
	public final static int GMSEC_UNSET_FIELD = 1010;
	/// @brief Error code to indicate invalid value.
	public final static int GMSEC_INVALID_VALUE = 1011;
	/// @brief Error code to indicate MIST template ID does not exist.
	public final static int GMSEC_TEMPLATE_ID_DOES_NOT_EXIST = 1012;
	/// @brief Error code to indicate MIST template directory was not found.
	public final static int GMSEC_SYSTEM_TEMPLATE_DIRECTORY_NOT_FOUND = 1013;
	/// @brief Error code to indicate MIST template directory could not be found.
	public final static int GMSEC_COULD_NOT_FIND_TEMPLATE_DIRECTORY = 1014;
	/// @brief Error code to indicate MIST template directory could not be read.
	public final static int GMSEC_COULD_NOT_LIST_TEMPLATE_DIRECTORY = 1015;
	/// @brief Error code to indicate MIST template schema could not be parsed.
	public final static int GMSEC_SCHEMA_FAILED_TO_PARSE = 1016;
	/// @brief Error code to indicate MIST template is missing a required field.
	public final static int GMSEC_MISSING_REQUIRED_FIELD = 1017;
	/// @brief Error code to indicate MIST template has an illegal field.
	public final static int GMSEC_NON_ALLOWED_FIELD = 1018;
	/// @brief Error code to indicate MIST template has an illegal field type.
	public final static int GMSEC_INCORRECT_FIELD_TYPE = 1019;
	/// @brief Error code to indicate a blank message is required.
	public final static int GMSEC_REQUIRED_BLANK_MESSAGE = 1020;
	/// @brief Error code to indicate outside status value.
	public final static int GMSEC_OUTSIDE_STATUS_VALUE = 1021;
	/// @brief Error code to indicate that the Connection Manager's internal connection to the bus has not been initialized.
	public final static int GMSEC_CONNECTION_NOT_INITIALIZED = 1022;
	/// @brief Error code to indicate that the given message is null.
	public final static int GMSEC_MESSAGE_NULL = 1023;
	/// @brief Error code to indicate that the given message has too many subtypes.
	public final static int GMSEC_MESSAGE_TOO_MANY_SUBTYPES = 1024;

}
