package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qqh extends t3 {
    public final long G;
    public final rqh H;
    public final ta4 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqh(long j, rqh rqhVar, ta4 ta4Var) {
        super(6);
        rqhVar.getClass();
        this.G = j;
        this.H = rqhVar;
        this.I = ta4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqh)) {
            return false;
        }
        qqh qqhVar = (qqh) obj;
        return d54.c(this.G, qqhVar.G) && this.H == qqhVar.H && x44.r(this.I, qqhVar.I);
    }

    public final int hashCode() {
        int i = d54.i;
        return this.I.hashCode() + ((this.H.hashCode() + (Long.hashCode(this.G) * 31)) * 31);
    }

    @Override // defpackage.t3
    public final long j() {
        return this.G;
    }

    @Override // defpackage.t3
    public final rqh k() {
        return this.H;
    }

    @Override // defpackage.t3
    public final String toString() {
        return "Custom(color=" + d54.i(this.G) + ", lineAppearance=" + this.H + ", content=" + this.I + ")";
    }
}
