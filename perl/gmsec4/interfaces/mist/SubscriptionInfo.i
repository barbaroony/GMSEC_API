/*
 * Copyright 2007-2019 United States Government as represented by the
 * Administrator of The National Aeronautics and Space Administration.
 * No copyright is claimed in the United States under Title 17, U.S. Code.
 * All Rights Reserved.
 */

%rename(MIST_SubscriptionInfo) gmsec::api::mist::SubscriptionInfo;

%module SubscriptionInfo
%{
#include <gmsec4/mist/SubscriptionInfo.h>
using namespace gmsec::api::mist;
%}

%include <gmsec4/util/wdllexp.h>
%include <gmsec4/mist/SubscriptionInfo.h>


%perlcode%{
=pod

=head1 NAME

libgmsec_perl::SubscriptionInfo

=head1 DESCRIPTION

Structure that contains the information the user has supplied when setting up a subscription.

=head2 Public Member Subroutines

=head3 DESTROY

C<libgmsec_perl::SubscriptionInfo-E<gt>DESTROY()>

        Destructor

=head3 getSubject

C<libgmsec_perl::SubscriptionInfo-E<gt>getSubject()>

        Returns the subject string used when setting up the subscription.

=for html <b>&nbsp;&nbsp;&nbsp;&nbsp;Returns:</b>

        Subject string.

=head3 getCallback

C<libgmsec_perl::SubscriptionInfo-E<gt>getSubject()>

        Returns the ConnectionManagerCallback object, if any, used when setting up the subscription.

=for html <b>&nbsp;&nbsp;&nbsp;&nbsp;Returns:</b>

        Pointer to ConnectionManagerCallback object.

=head1 SEE ALSO

=for html &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="ConnectionManager.html#subscribe">ConnectionManager->subscribe()</a><br>

=for html &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="ConnectionManager.html#unsubscribe">ConnectionManager->unsubscribe()</a><br>

=cut
%}
