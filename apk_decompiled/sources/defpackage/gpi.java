package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gpi extends bhi {
    public final fnc e;

    public gpi(fnc fncVar) {
        super(mcc.c, fncVar == fnc.E ? 2 : 1, fncVar == fnc.F ? 2 : null);
        this.e = fncVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gpi) {
            return this.e == ((gpi) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
