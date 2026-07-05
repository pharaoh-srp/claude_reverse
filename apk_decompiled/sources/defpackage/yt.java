package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yt extends yok {
    public final jke b;

    public yt(jke jkeVar) {
        this.b = jkeVar;
    }

    @Override // defpackage.yok
    public final int c(c3d c3dVar) {
        return ((Number) ((bz7) this.b.F).invoke(c3dVar)).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yt) && x44.r(this.b, ((yt) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Block(lineProviderBlock=" + this.b + ')';
    }
}
