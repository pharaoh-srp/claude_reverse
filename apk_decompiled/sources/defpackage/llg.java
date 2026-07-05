package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class llg implements w3g {
    public final long E;
    public final long F;

    public llg(long j, long j2) {
        this.E = j;
        this.F = j2;
        if (j < 0) {
            mr9.q(grc.q(j, "stopTimeout(", " ms) cannot be negative"));
            throw null;
        }
        if (j2 >= 0) {
            return;
        }
        mr9.q(grc.q(j2, "replayExpiration(", " ms) cannot be negative"));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof llg)) {
            return false;
        }
        llg llgVar = (llg) obj;
        return this.E == llgVar.E && this.F == llgVar.F;
    }

    @Override // defpackage.w3g
    public final kp7 f(nvg nvgVar) {
        return j8.A(new gq7(j8.l0(nvgVar, new klg(this, null)), new ih5(2, null, 3), 0));
    }

    public final int hashCode() {
        return Long.hashCode(this.F) + (Long.hashCode(this.E) * 31);
    }

    public final String toString() {
        d8a d8aVar = new d8a(2);
        long j = this.E;
        if (j > 0) {
            d8aVar.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.F;
        if (j2 < Long.MAX_VALUE) {
            d8aVar.add("replayExpiration=" + j2 + "ms");
        }
        return vb7.s(new StringBuilder("SharingStarted.WhileSubscribed("), w44.S0(x44.v(d8aVar), null, null, null, null, 63), ')');
    }
}
