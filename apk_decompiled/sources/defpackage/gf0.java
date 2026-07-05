package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class gf0 {
    public final int a;
    public final nyj b;
    public final fe0 c;
    public final String d;

    public gf0(nyj nyjVar, fe0 fe0Var, String str) {
        this.b = nyjVar;
        this.c = fe0Var;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{nyjVar, fe0Var, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gf0)) {
            return false;
        }
        gf0 gf0Var = (gf0) obj;
        return gb9.v(this.b, gf0Var.b) && gb9.v(this.c, gf0Var.c) && gb9.v(this.d, gf0Var.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
