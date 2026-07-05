package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vka extends tka implements hq3 {
    public static final vka H = new vka(1, 0);

    public vka(long j, long j2) {
        super(j, j2, 1L);
    }

    @Override // defpackage.hq3
    public final Comparable e() {
        return Long.valueOf(this.E);
    }

    @Override // defpackage.tka
    public final boolean equals(Object obj) {
        if (!(obj instanceof vka)) {
            return false;
        }
        if (isEmpty() && ((vka) obj).isEmpty()) {
            return true;
        }
        vka vkaVar = (vka) obj;
        return this.E == vkaVar.E && this.F == vkaVar.F;
    }

    @Override // defpackage.hq3
    public final Comparable g() {
        return Long.valueOf(this.F);
    }

    @Override // defpackage.tka
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Long.hashCode(this.F) + (Long.hashCode(this.E) * 31);
    }

    @Override // defpackage.tka, defpackage.hq3
    public final boolean isEmpty() {
        return this.E > this.F;
    }

    @Override // defpackage.tka
    public final String toString() {
        return this.E + ".." + this.F;
    }
}
