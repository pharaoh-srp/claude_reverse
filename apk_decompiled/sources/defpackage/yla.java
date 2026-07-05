package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yla {
    public final Number a;
    public final Number b;

    public yla(Number number, Number number2) {
        this.a = number;
        this.b = number2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yla)) {
            return false;
        }
        yla ylaVar = (yla) obj;
        return this.a.equals(ylaVar.a) && this.b.equals(ylaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Viewport(width=" + this.a + ", height=" + this.b + ")";
    }
}
