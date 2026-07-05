package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pqh extends t3 {
    public final long G;
    public final float H;
    public final rqh I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqh(long j, float f, rqh rqhVar) {
        super(6);
        rqhVar.getClass();
        this.G = j;
        this.H = f;
        this.I = rqhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pqh)) {
            return false;
        }
        pqh pqhVar = (pqh) obj;
        return d54.c(this.G, pqhVar.G) && va6.b(this.H, pqhVar.H) && this.I == pqhVar.I;
    }

    public final int hashCode() {
        int i = d54.i;
        return this.I.hashCode() + vb7.b(this.H, Long.hashCode(this.G) * 31, 31);
    }

    @Override // defpackage.t3
    public final long j() {
        return this.G;
    }

    @Override // defpackage.t3
    public final rqh k() {
        return this.I;
    }

    @Override // defpackage.t3
    public final String toString() {
        StringBuilder sbR = kgh.r("Bullet(color=", d54.i(this.G), ", cornerRadius=", va6.c(this.H), ", lineAppearance=");
        sbR.append(this.I);
        sbR.append(")");
        return sbR.toString();
    }

    public pqh(long j, rqh rqhVar, int i) {
        this(j, 4.0f, (i & 4) != 0 ? rqh.E : rqhVar);
    }
}
