package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class fvd {
    public final x1a a;

    public fvd(zy7 zy7Var) {
        this.a = new x1a(zy7Var);
    }

    public abstract hvd a(Object obj);

    public zqi b() {
        return this.a;
    }

    public final hvd c(um2 um2Var) {
        return a(um2Var);
    }

    public final zqi d(hvd hvdVar, zqi zqiVar) {
        zqi zqiVar2 = null;
        zqiVar2 = null;
        zqiVar2 = null;
        zqiVar2 = null;
        zqiVar2 = null;
        zqiVar2 = null;
        if (zqiVar instanceof oi6) {
            if (hvdVar.b) {
                oi6 oi6Var = (oi6) zqiVar;
                oi6Var.a.setValue(hvdVar.a());
                zqiVar2 = oi6Var;
            }
        } else if (zqiVar instanceof xmg) {
            if ((hvdVar.a || hvdVar.f != null) && !hvdVar.b) {
                xmg xmgVar = (xmg) zqiVar;
                if (x44.r(hvdVar.a(), xmgVar.a)) {
                    zqiVar2 = xmgVar;
                }
            }
        } else if (zqiVar instanceof ye4) {
            hvdVar.getClass();
        }
        if (zqiVar2 != null) {
            return zqiVar2;
        }
        if (!hvdVar.b) {
            return new xmg(hvdVar.a());
        }
        Object obj = hvdVar.f;
        fdg fdgVar = (fdg) hvdVar.e;
        if (fdgVar == null) {
            fdgVar = a5.N;
        }
        return new oi6(new lsc(obj, fdgVar));
    }
}
