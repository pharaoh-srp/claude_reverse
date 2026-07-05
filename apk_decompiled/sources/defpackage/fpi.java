package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fpi extends bhi {
    public final fnc e;

    public fpi(fnc fncVar) {
        super(mcc.b, fncVar == fnc.E ? 2 : 1, fncVar == fnc.F ? 2 : null);
        this.e = fncVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fpi) {
            return this.e == ((fpi) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
