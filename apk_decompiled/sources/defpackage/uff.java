package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class uff implements no8 {
    @Override // defpackage.no8
    public final List a(ge2 ge2Var, oub oubVar, eq3 eq3Var) {
        ge2Var.getClass();
        oubVar.getClass();
        return lm6.E;
    }

    @Override // defpackage.no8
    public final List c(yd2 yd2Var, eq3 eq3Var, eq3 eq3Var2, float f) {
        double d = eq3Var.E;
        double dDoubleValue = Double.valueOf(d).doubleValue();
        ge2 ge2Var = yd2Var.a;
        boolean z = false;
        double d2 = 1;
        double d3 = (ge2Var.d().d() * ((d2 - ((((dDoubleValue - ge2Var.d().b()) / ge2Var.d().d()) - ((double) 0)) % d2)) % d2)) + Double.valueOf(d).doubleValue();
        double dB = ge2Var.d().b() % ge2Var.d().d();
        ArrayList arrayList = new ArrayList();
        int i = -2;
        while (true) {
            int i2 = i + 1;
            double d4 = (ge2Var.d().d() * ((double) (i * 1))) + d3;
            double d5 = ge2Var.d().d();
            double d6 = (d4 - dB) / ge2Var.d().d();
            double dAbs = Math.abs(d6);
            double dSignum = (Math.signum(d6) * (dAbs % 1.0d >= 0.5d ? Math.ceil(dAbs) : Math.floor(dAbs)) * d5) + dB;
            if (dSignum >= ge2Var.d().b() && dSignum != Double.valueOf(eq3Var2.E).doubleValue()) {
                if (dSignum > ge2Var.d().a() || dSignum == Double.valueOf(eq3Var2.F).doubleValue()) {
                    break;
                }
                arrayList.add(Double.valueOf(dSignum));
                if (dSignum <= Double.valueOf(eq3Var.F).doubleValue()) {
                    continue;
                } else {
                    if (z) {
                        break;
                    }
                    z = true;
                }
            }
            i = i2;
        }
        return arrayList;
    }

    @Override // defpackage.no8
    public final float d(ge2 ge2Var, oub oubVar, float f, float f2) {
        ge2Var.getClass();
        oubVar.getClass();
        return f;
    }

    @Override // defpackage.no8
    public final List e(ge2 ge2Var, oub oubVar, eq3 eq3Var) {
        ge2Var.getClass();
        oubVar.getClass();
        xd2 xd2VarD = ge2Var.d();
        d8a d8aVarE = x44.E();
        d8aVarE.add(Double.valueOf(xd2VarD.b()));
        if (xd2VarD.c() >= xd2VarD.d()) {
            d8aVarE.add(Double.valueOf((Math.floor(xd2VarD.c() / xd2VarD.d()) * xd2VarD.d()) + xd2VarD.b()));
            if (xd2VarD.c() >= xd2VarD.d() * 2.0d) {
                double dB = xd2VarD.b();
                double d = xd2VarD.d();
                double dC = (xd2VarD.c() / 2.0d) / xd2VarD.d();
                double dAbs = Math.abs(dC);
                d8aVarE.add(Double.valueOf((Math.signum(dC) * (dAbs % 1.0d >= 0.5d ? Math.ceil(dAbs) : Math.floor(dAbs)) * d) + dB));
            }
        }
        return x44.v(d8aVarE);
    }

    @Override // defpackage.no8
    public final List g(yd2 yd2Var, eq3 eq3Var, eq3 eq3Var2) {
        double d = eq3Var.E;
        double dDoubleValue = Double.valueOf(d).doubleValue();
        ge2 ge2Var = yd2Var.a;
        double d2 = ((ge2Var.d().d() / 2.0d) + (dDoubleValue - ge2Var.d().b())) % ge2Var.d().d();
        double d3 = ((ge2Var.d().d() - d2) % ge2Var.d().d()) + Double.valueOf(d).doubleValue();
        ArrayList arrayList = new ArrayList();
        int i = -1;
        while (true) {
            int i2 = i + 1;
            double d4 = (ge2Var.d().d() * ((double) i)) + d3;
            if (d4 >= ge2Var.d().b() - (ge2Var.d().d() / 2.0d)) {
                if (d4 > (ge2Var.d().d() / 2.0d) + ge2Var.d().a()) {
                    break;
                }
                arrayList.add(Double.valueOf(d4));
                if (d4 > Double.valueOf(eq3Var.F).doubleValue()) {
                    break;
                }
            }
            i = i2;
        }
        return arrayList;
    }

    @Override // defpackage.no8
    public final float h(ge2 ge2Var, oub oubVar, float f, float f2) {
        ge2Var.getClass();
        oubVar.getClass();
        return f;
    }

    @Override // defpackage.no8
    public final boolean i(yd2 yd2Var) {
        return true;
    }
}
