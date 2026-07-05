package androidx.credentials.exceptions.publickeycredential;

import defpackage.mdj;
import defpackage.r;
import defpackage.sz6;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException;", "Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialException;", "ppk", "credentials"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class GetPublicKeyCredentialDomException extends GetPublicKeyCredentialException {
    public static final /* synthetic */ int G = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public GetPublicKeyCredentialDomException(r rVar, String str) {
        String strConcat = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/".concat(rVar.a);
        super(str, strConcat);
        if (strConcat.length() > 0) {
            return;
        }
        sz6.p("type must not be empty");
        throw null;
    }
}
