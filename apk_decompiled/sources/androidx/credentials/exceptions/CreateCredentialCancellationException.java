package androidx.credentials.exceptions;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/exceptions/CreateCredentialCancellationException;", "Landroidx/credentials/exceptions/CreateCredentialException;", "credentials"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class CreateCredentialCancellationException extends CreateCredentialException {
    public CreateCredentialCancellationException(CharSequence charSequence) {
        super(charSequence, "android.credentials.CreateCredentialException.TYPE_USER_CANCELED");
    }
}
