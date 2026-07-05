package androidx.credentials.exceptions;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/exceptions/GetCredentialException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "credentials"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public abstract class GetCredentialException extends Exception {
    public static final /* synthetic */ int E = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCredentialException(CharSequence charSequence, String str) {
        super(charSequence != null ? charSequence.toString() : null);
        str.getClass();
    }
}
