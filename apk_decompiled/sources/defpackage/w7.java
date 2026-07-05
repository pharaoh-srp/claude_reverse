package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w7 {
    public static final oqb c;
    public final zy1 a = wd6.P(1, 4, py1.F);
    public nif b;

    static {
        oqb oqbVar = new oqb();
        d8 d8Var = new d8(5);
        new ir9(oqbVar, sq6.o(new qh1(dpf.K, jce.a.b(w7.class), null, d8Var, kq9.E), oqbVar));
        c = oqbVar;
    }

    public final void a(v7 v7Var) {
        nif nifVar = this.b;
        if (nifVar != null) {
            nifVar.invoke(v7Var);
        }
        this.b = null;
    }

    public final void b(String str) {
        List list = xah.a;
        xah.e(6, "Requesting account switch to ".concat(str), null, null);
        this.a.r(new t7(str));
    }
}
