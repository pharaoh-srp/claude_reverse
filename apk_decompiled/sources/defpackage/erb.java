package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class erb extends bhi {
    public final fnc e;

    public erb(fnc fncVar) {
        super(hjj.b, fncVar == fnc.E ? 2 : 1, fncVar == fnc.F ? 2 : null);
        this.e = fncVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof erb) {
            return this.e == ((erb) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
