package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class di2 extends jv8 {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final jv8[] f;

    public di2(String str, boolean z, boolean z2, String[] strArr, jv8[] jv8VarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = jv8VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || di2.class != obj.getClass()) {
            return false;
        }
        di2 di2Var = (di2) obj;
        return this.c == di2Var.c && this.d == di2Var.d && this.b.equals(di2Var.b) && Arrays.equals(this.e, di2Var.e) && Arrays.equals(this.f, di2Var.f);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((527 + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31);
    }
}
