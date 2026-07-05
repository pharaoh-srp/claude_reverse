package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gb1 extends sf5 {
    public final Object g;
    public final long h;

    public gb1(Object obj, long j) {
        this.g = obj;
        this.h = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb1)) {
            return false;
        }
        gb1 gb1Var = (gb1) obj;
        return this.g.equals(gb1Var.g) && this.h == gb1Var.h;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + (this.g.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackHandlerInfo(owner=");
        sb.append(this.g);
        sb.append(", compositeKey=");
        return ebh.p(sb, this.h, ')');
    }
}
