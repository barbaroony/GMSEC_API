
%feature("docstring") gmsec::api::F64Field "

    Specialized Field class that can be used to store a 64-bit floating
    point value.


    CONSTRUCTOR:

    F64Field(self, name, value)

    Constructor for creating a specialized Field object containing a
    64-bit floating point value

    Parameters
    ----------
    name: the name of the Field
    value: the floating point value to store

    Exceptions
    ----------
    A GmsecError is thrown if the name is NULL, or is an empty string.
";

%feature("docstring") gmsec::api::F64Field::toXML "

    toXML(self) -> char const *

    Convenience method that returns the XML string representation of
    this object.

    Returns
    -------
    An XML string.
";


%feature("docstring") gmsec::api::F64Field::getValue "

    getValue(self) -> GMSEC_F64

    Exposes the underlying value held by the object.

    Returns
    -------
    Returns the value associated with the object.
";


%feature("docstring") gmsec::api::F64Field::toJSON "

    toJSON(self) -> char const *

    Convenience method that returns the JSON string representation of
    this object.

    Returns
    -------
    A JSON string.
";