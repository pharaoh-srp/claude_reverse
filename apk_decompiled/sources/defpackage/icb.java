package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class icb {
    public final hcb a;
    public final boolean b;

    public icb(hcb hcbVar, boolean z) {
        hcbVar.getClass();
        this.a = hcbVar;
        this.b = z;
    }

    public final hcb a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icb)) {
            return false;
        }
        icb icbVar = (icb) obj;
        return this.a == icbVar.a && this.b == icbVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MemoryStyleCommit(style=" + this.a + ", isConfirmedOff=" + this.b + ")";
    }
}
