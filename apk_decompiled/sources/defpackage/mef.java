package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mef extends bhi {
    public final fnc e;

    public mef(fnc fncVar) {
        super(vph.c, fncVar == fnc.E ? 2 : 1, fncVar == fnc.F ? 2 : null);
        this.e = fncVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mef) {
            return this.e == ((mef) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
