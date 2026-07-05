package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class si7 {
    public final Uri a;
    public final String b;
    public final long c;
    public final String d;

    public si7(Uri uri, String str, long j, String str2) {
        uri.getClass();
        this.a = uri;
        this.b = str;
        this.c = j;
        this.d = str2;
    }

    public static si7 a(si7 si7Var, String str) {
        Uri uri = si7Var.a;
        String str2 = si7Var.b;
        long j = si7Var.c;
        uri.getClass();
        return new si7(uri, str2, j, str);
    }

    public static String f(si7 si7Var) {
        String str = si7Var.b;
        int iK0 = bsg.K0(str, '.', 0, 6);
        return (iK0 == -1 || str.length() - iK0 > 4) ? str : str.substring(0, iK0);
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.b;
    }

    public final long d() {
        return this.c;
    }

    public final Uri e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si7)) {
            return false;
        }
        si7 si7Var = (si7) obj;
        return x44.r(this.a, si7Var.a) && this.b.equals(si7Var.b) && this.c == si7Var.c && this.d.equals(si7Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + vb7.e(kgh.l(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FileInfo(uri=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", size=");
        qy1.m(this.c, ", mime=", this.d, sb);
        sb.append(")");
        return sb.toString();
    }
}
