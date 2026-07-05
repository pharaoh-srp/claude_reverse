package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class ook implements ipk {
    public final w6g a;

    public ook(w6g w6gVar) {
        this.a = w6gVar;
    }

    public final String a(Uri uri, String str, String str2) {
        w6g w6gVar;
        if (uri != null) {
            w6gVar = (w6g) this.a.get(uri.toString());
        } else {
            w6gVar = null;
        }
        if (w6gVar == null) {
            return null;
        }
        if (str != null) {
            str2 = kgh.o(str, str2);
        }
        return (String) w6gVar.get(str2);
    }
}
