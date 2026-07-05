package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class ved extends m3f {
    @Override // defpackage.m3f
    public final boolean b(Uri uri) {
        String string = uri.toString();
        string.getClass();
        return isg.q0(string, "https://cdn.jsdelivr.net/", false) || isg.q0(string, rtk.d("text/html"), false);
    }
}
