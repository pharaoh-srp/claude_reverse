package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qn5 extends bhi {
    public final fnc e;

    public qn5(fnc fncVar) {
        super(ll5.a, fncVar == fnc.E ? 2 : 1, fncVar == fnc.F ? 2 : null);
        this.e = fncVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qn5) {
            return this.e == ((qn5) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
