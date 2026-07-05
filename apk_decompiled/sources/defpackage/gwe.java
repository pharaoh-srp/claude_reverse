package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gwe {
    public final hwe a;
    public final hwe b;
    public final Throwable c;

    public gwe(hwe hweVar, ng4 ng4Var, Throwable th) {
        this.a = hweVar;
        this.b = ng4Var;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwe)) {
            return false;
        }
        gwe gweVar = (gwe) obj;
        return x44.r(this.a, gweVar.a) && x44.r(this.b, gweVar.b) && x44.r(this.c, gweVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        hwe hweVar = this.b;
        int iHashCode2 = (iHashCode + (hweVar == null ? 0 : hweVar.hashCode())) * 31;
        Throwable th = this.c;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.a + ", nextPlan=" + this.b + ", throwable=" + this.c + ')';
    }

    public /* synthetic */ gwe(hwe hweVar, Throwable th, int i) {
        this(hweVar, (ng4) null, (i & 4) != 0 ? null : th);
    }
}
