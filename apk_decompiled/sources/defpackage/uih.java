package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uih {
    public fu9 a;
    public cz5 b;
    public wt7 c;
    public tkh d;
    public Object e;
    public final lsc f = mpk.P(Boolean.TRUE);
    public long g;

    public uih(fu9 fu9Var, cz5 cz5Var, wt7 wt7Var, tkh tkhVar, Object obj) {
        this.a = fu9Var;
        this.b = cz5Var;
        this.c = wt7Var;
        this.d = tkhVar;
        this.e = obj;
        this.g = agh.a(this.d, this.b, this.c, agh.a, 1);
    }

    public static void a(uih uihVar, fu9 fu9Var, cz5 cz5Var, tkh tkhVar, int i) {
        if ((i & 1) != 0) {
            fu9Var = uihVar.a;
        }
        if ((i & 2) != 0) {
            cz5Var = uihVar.b;
        }
        wt7 wt7Var = uihVar.c;
        if ((i & 8) != 0) {
            tkhVar = uihVar.d;
        }
        Object obj = uihVar.e;
        fu9 fu9Var2 = uihVar.a;
        lsc lscVar = uihVar.f;
        if (fu9Var == fu9Var2 && x44.r(cz5Var, uihVar.b) && x44.r(wt7Var, uihVar.c) && x44.r(tkhVar, uihVar.d)) {
            if (x44.r(obj, uihVar.e)) {
                return;
            }
            uihVar.e = obj;
            lscVar.setValue(Boolean.TRUE);
            return;
        }
        uihVar.a = fu9Var;
        uihVar.b = cz5Var;
        uihVar.c = wt7Var;
        uihVar.d = tkhVar;
        lscVar.setValue(Boolean.TRUE);
    }
}
