package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class goh {
    public static final goh d;
    public final dqc a;
    public final dqc b;
    public final dqc c;

    static {
        dqc dqcVar = zp3.L;
        d = new goh(dqcVar, dqcVar, dqcVar);
    }

    public goh(dqc dqcVar, dqc dqcVar2, dqc dqcVar3) {
        this.a = dqcVar;
        this.b = dqcVar2;
        this.c = dqcVar3;
    }

    public final dqc a(ooh oohVar) {
        int iOrdinal = oohVar.ordinal();
        if (iOrdinal == 0) {
            return this.a;
        }
        if (iOrdinal == 1) {
            return this.b;
        }
        if (iOrdinal == 2) {
            return this.c;
        }
        mr9.b();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof goh)) {
            return false;
        }
        goh gohVar = (goh) obj;
        return x44.r(this.a, gohVar.a) && x44.r(this.b, gohVar.b) && x44.r(this.c, gohVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ThreePaneMotion(primaryPaneMotion=" + this.a + ", secondaryPaneMotion=" + this.b + ", tertiaryPaneMotion=" + this.c + ')';
    }
}
