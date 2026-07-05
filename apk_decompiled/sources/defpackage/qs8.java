package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class qs8 implements gh7 {
    public final u0h a;
    public final u0h b;
    public final boolean c;

    public qs8(u0h u0hVar, u0h u0hVar2, boolean z) {
        this.a = u0hVar;
        this.b = u0hVar2;
        this.c = z;
    }

    @Override // defpackage.gh7
    public final ih7 a(Object obj, rjc rjcVar) {
        Uri uri = (Uri) obj;
        if (!x44.r(uri.getScheme(), "http") && !x44.r(uri.getScheme(), "https")) {
            return null;
        }
        return new ts8(uri.toString(), rjcVar, this.a, this.b, this.c);
    }
}
