package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class aij {
    public final thj a;
    public final List b;
    public final int c;

    public aij(thj thjVar, List list, int i) {
        this.a = thjVar;
        this.b = list;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aij)) {
            return false;
        }
        aij aijVar = (aij) obj;
        return this.a.equals(aijVar.a) && this.b.equals(aijVar.b) && this.c == aijVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kgh.m(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkflowRollup(counts=");
        sb.append(this.a);
        sb.append(", phases=");
        sb.append(this.b);
        sb.append(", totalTokens=");
        return vb7.l(this.c, ")", sb);
    }
}
