package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ukb extends bhi {
    public final fnc e;

    public ukb(fnc fncVar) {
        super(vph.b, fncVar == fnc.E ? 2 : 1, fncVar == fnc.F ? 2 : null);
        this.e = fncVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ukb) {
            return this.e == ((ukb) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
