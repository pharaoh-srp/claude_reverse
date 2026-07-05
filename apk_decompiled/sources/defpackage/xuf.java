package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xuf implements fvf {
    public final int a;
    public final zpf b;

    public xuf(int i, zpf zpfVar) {
        this.a = i;
        this.b = zpfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xuf)) {
            return false;
        }
        xuf xufVar = (xuf) obj;
        return this.a == xufVar.a && this.b.equals(xufVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Replace(position=" + this.a + ", event=" + this.b + ")";
    }
}
