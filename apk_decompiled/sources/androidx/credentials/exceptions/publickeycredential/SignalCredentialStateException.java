package androidx.credentials.exceptions.publickeycredential;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/SignalCredentialStateException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "credentials"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public abstract class SignalCredentialStateException extends Exception {
    public static final /* synthetic */ int E = 0;

    public SignalCredentialStateException(String str, String str2) {
        super(str2 != null ? str2.toString() : null);
    }
}
