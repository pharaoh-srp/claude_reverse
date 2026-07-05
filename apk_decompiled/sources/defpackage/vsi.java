package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vsi {
    public final int a;
    public final int b;

    public vsi(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsi)) {
            return false;
        }
        vsi vsiVar = (vsi) obj;
        return this.a == vsiVar.a && this.b == vsiVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return vb7.q("VerbPair(past=", ", running=", this.a, this.b, ")");
    }
}
