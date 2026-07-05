package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class npe {
    public final Number a;
    public final Number b;

    public npe(Number number, Number number2) {
        this.a = number;
        this.b = number2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npe)) {
            return false;
        }
        npe npeVar = (npe) obj;
        return this.a.equals(npeVar.a) && this.b.equals(npeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Viewport(width=" + this.a + ", height=" + this.b + ")";
    }
}
