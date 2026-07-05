package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class whc implements rzb {
    public final lsc a = mpk.P(null);

    public static final String a(Uri uri, String str) {
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter == null || bsg.I0(queryParameter)) {
            return null;
        }
        return queryParameter;
    }
}
