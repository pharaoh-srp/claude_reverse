package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class moh {
    public hoh a;
    public fj0 e;
    public final fqc b = new fqc();
    public final fqc c = new fqc();
    public final fqc d = new fqc();
    public final ue7 f = new ue7(new loh(this, 0), new loh(this, 1));
    public long g = 0;
    public final int h = 3;

    public final fqc a(int i) {
        return b(c(i));
    }

    public final fqc b(ooh oohVar) {
        int iOrdinal = oohVar.ordinal();
        if (iOrdinal == 0) {
            return this.b;
        }
        if (iOrdinal == 1) {
            return this.c;
        }
        if (iOrdinal == 2) {
            return this.d;
        }
        mr9.b();
        return null;
    }

    public final ooh c(int i) {
        hoh hohVar = this.a;
        if (hohVar == null) {
            x44.o0("ltrOrder");
            throw null;
        }
        if (i == 0) {
            return hohVar.a;
        }
        if (i == 1) {
            return ooh.E;
        }
        if (i == 2) {
            return hohVar.b;
        }
        xh6.j(grc.p(i, "Invalid pane index "));
        return null;
    }
}
