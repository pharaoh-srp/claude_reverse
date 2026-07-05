package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m29 {
    public final List a;
    public final j29 b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public m29(d8a d8aVar, j29 j29Var, boolean z, boolean z2, String str) {
        d8aVar.getClass();
        this.a = d8aVar;
        this.b = j29Var;
        this.c = z;
        this.d = z2;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m29)) {
            return false;
        }
        m29 m29Var = (m29) obj;
        return x44.r(this.a, m29Var.a) && this.b == m29Var.b && this.c == m29Var.c && this.d == m29Var.d && x44.r(this.e, m29Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        j29 j29Var = this.b;
        int iP = fsh.p(fsh.p((iHashCode + (j29Var == null ? 0 : j29Var.hashCode())) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return iP + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InitStepsState(steps=");
        sb.append(this.a);
        sb.append(", sessionMode=");
        sb.append(this.b);
        sb.append(", isDone=");
        ij0.A(sb, this.c, ", sawStepEvent=", this.d, ", anchorAfterUuid=");
        return ij0.m(sb, this.e, ")");
    }
}
