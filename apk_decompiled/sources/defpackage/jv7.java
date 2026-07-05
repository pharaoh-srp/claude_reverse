package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class jv7 {
    public final Uri a;
    public final int b;
    public final int c;
    public final boolean d;
    public final String e;
    public final int f;

    public jv7(String str, String str2) {
        this.a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.b = 0;
        this.c = 400;
        this.d = false;
        this.e = str2;
        this.f = 0;
    }

    public jv7(Uri uri, int i, int i2, boolean z, String str, int i3) {
        uri.getClass();
        this.a = uri;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = str;
        this.f = i3;
    }
}
