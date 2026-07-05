package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class b2c {
    public static final mrg a = new mrg("app_scoped_retrofit");
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final oqb f;
    public static final oqb g;
    public static final oqb h;
    public static final oqb i;

    static {
        lz1 lz1Var = uh6.F;
        zh6 zh6Var = zh6.MINUTES;
        b = v40.Q(1, zh6Var);
        c = v40.Q(1, zh6Var);
        zh6 zh6Var2 = zh6.SECONDS;
        d = v40.Q(20, zh6Var2);
        e = v40.R(300L, zh6Var2);
        xga xgaVar = new xga(21);
        oqb oqbVar = new oqb();
        xgaVar.invoke(oqbVar);
        f = oqbVar;
        xga xgaVar2 = new xga(22);
        oqb oqbVar2 = new oqb();
        xgaVar2.invoke(oqbVar2);
        g = oqbVar2;
        xga xgaVar3 = new xga(23);
        oqb oqbVar3 = new oqb();
        xgaVar3.invoke(oqbVar3);
        h = oqbVar3;
        xga xgaVar4 = new xga(24);
        oqb oqbVar4 = new oqb();
        xgaVar4.invoke(oqbVar4);
        i = oqbVar4;
        new xga(25).invoke(new oqb());
    }

    public static qre a(hdc hdcVar, String str, bg9 bg9Var, qf0 qf0Var) {
        el5 el5Var = new el5(16);
        el5Var.E = hdcVar;
        el5Var.q(str);
        ((ArrayList) el5Var.H).add(qf0Var);
        ide ideVar = p8b.e;
        ((ArrayList) el5Var.G).add(new ee7(nai.D("application/json; charset=UTF8"), new efe(24, bg9Var)));
        return el5Var.r();
    }
}
