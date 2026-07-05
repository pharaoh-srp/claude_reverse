package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h45 extends e1 {
    public static final dd8 G = new dd8(16);
    public final String F;

    public h45(String str) {
        super(G);
        this.F = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h45) && x44.r(this.F, ((h45) obj).F);
    }

    public final int hashCode() {
        return this.F.hashCode();
    }

    public final String toString() {
        return vb7.s(new StringBuilder("CoroutineName("), this.F, ')');
    }
}
