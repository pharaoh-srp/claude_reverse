package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class ot0 extends m3f {
    public final String d;

    public ot0(o3f o3fVar) {
        super(o3fVar);
        this.d = rtk.d("image/svg+xml");
    }

    @Override // defpackage.m3f
    public final boolean b(Uri uri) {
        return x44.r(uri.toString(), this.d);
    }
}
