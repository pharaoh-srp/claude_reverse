package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class yrh extends hsh {
    public static final String e = String.valueOf((char) 0);
    public final ire d;

    public yrh(yrh yrhVar) {
        super(5);
        ire ireVar = new ire(4, false);
        this.d = ireVar;
        this.b = yrhVar.b;
        this.c = yrhVar.c;
        String strS = yrhVar.d.s();
        ireVar.p();
        ireVar.F = strS;
    }

    @Override // defpackage.hsh
    public final void f() {
        this.b = -1;
        this.c = -1;
        this.d.p();
    }

    public String toString() {
        return this.d.s();
    }

    public yrh() {
        super(5);
        this.d = new ire(4, false);
    }
}
