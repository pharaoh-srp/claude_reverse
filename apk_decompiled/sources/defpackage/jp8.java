package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jp8 extends bhi {
    public final fnc e;

    public jp8(fnc fncVar) {
        super(vph.a, fncVar == fnc.E ? 2 : 1, fncVar == fnc.F ? 2 : null);
        this.e = fncVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jp8) {
            return this.e == ((jp8) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
