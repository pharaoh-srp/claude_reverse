package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ut7 {
    public final ArrayList a;
    public final char b;
    public final double c;
    public final String d;
    public final String e;

    public ut7(ArrayList arrayList, char c, double d, String str, String str2) {
        this.a = arrayList;
        this.b = c;
        this.c = d;
        this.d = str;
        this.e = str2;
    }

    public static int a(char c, String str, String str2) {
        return str2.hashCode() + kgh.l(c * 31, 31, str);
    }

    public final int hashCode() {
        return a(this.b, this.e, this.d);
    }
}
