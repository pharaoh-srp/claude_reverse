package defpackage;

import android.net.Uri;
import io.sentry.e0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ug5 {
    public final Uri a;
    public final int b;
    public final byte[] c;
    public final Map d;
    public final long e;
    public final long f;
    public final int g;

    static {
        k7b.a("media3.datasource");
    }

    public ug5(Uri uri, int i, byte[] bArr, Map map, long j, long j2, int i2) {
        fd9.E(j >= 0);
        fd9.E(j >= 0);
        fd9.E(j2 > 0 || j2 == -1);
        uri.getClass();
        this.a = uri;
        this.b = i;
        this.c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.d = Collections.unmodifiableMap(new HashMap(map));
        this.e = j;
        this.f = j2;
        this.g = i2;
    }

    public static String a(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        e0.b();
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(a(this.b));
        sb.append(" ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", null, ");
        return vb7.l(this.g, "]", sb);
    }
}
