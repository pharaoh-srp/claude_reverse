package androidx.credentials.exceptions;

import defpackage.mdj;
import defpackage.sz6;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/exceptions/CreateCredentialCustomException;", "Landroidx/credentials/exceptions/CreateCredentialException;", "credentials"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class CreateCredentialCustomException extends CreateCredentialException {
    public CreateCredentialCustomException(CharSequence charSequence, String str) {
        super(charSequence, str);
        if (str.length() > 0) {
            return;
        }
        sz6.p("type must not be empty");
        throw null;
    }
}
