package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class lmj {
    public final gf0 a;
    public final jf7 b;

    public /* synthetic */ lmj(gf0 gf0Var, jf7 jf7Var) {
        this.a = gf0Var;
        this.b = jf7Var;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof lmj)) {
            return false;
        }
        lmj lmjVar = (lmj) obj;
        return gb9.v(this.a, lmjVar.a) && gb9.v(this.b, lmjVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        q28 q28Var = new q28(this);
        q28Var.c("key", this.a);
        q28Var.c("feature", this.b);
        return q28Var.toString();
    }
}
