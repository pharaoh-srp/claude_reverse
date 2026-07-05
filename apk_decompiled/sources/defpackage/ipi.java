package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ipi extends bhi {
    public final fnc e;

    public ipi(fnc fncVar) {
        super(mcc.a, fncVar == fnc.E ? 2 : 1, fncVar == fnc.F ? 2 : null);
        this.e = fncVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ipi) {
            return this.e == ((ipi) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
