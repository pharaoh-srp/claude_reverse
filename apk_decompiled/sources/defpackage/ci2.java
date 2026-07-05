package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ci2 extends jv8 {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final jv8[] g;

    public ci2(String str, int i, int i2, long j, long j2, jv8[] jv8VarArr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = jv8VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ci2.class != obj.getClass()) {
            return false;
        }
        ci2 ci2Var = (ci2) obj;
        return this.c == ci2Var.c && this.d == ci2Var.d && this.e == ci2Var.e && this.f == ci2Var.f && this.b.equals(ci2Var.b) && Arrays.equals(this.g, ci2Var.g);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31);
    }
}
