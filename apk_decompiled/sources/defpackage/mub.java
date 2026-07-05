package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class mub implements xd2 {
    public Double a;
    public Double b;
    public LinkedHashMap c;
    public double d;

    @Override // defpackage.xd2
    public final double a() {
        Double d = this.b;
        if (d != null) {
            return d.doubleValue();
        }
        return 0.0d;
    }

    @Override // defpackage.xd2
    public final double b() {
        Double d = this.a;
        if (d != null) {
            return d.doubleValue();
        }
        return 0.0d;
    }

    @Override // defpackage.xd2
    public final double d() {
        return this.d;
    }

    @Override // defpackage.xd2
    public final lub e(qa1 qa1Var) {
        lub lubVar = (lub) this.c.get(qa1Var);
        return lubVar != null ? lubVar : (lub) sta.f0(null, this.c);
    }

    public final void f(double d, double d2, double d3, double d4) {
        Double d5 = this.a;
        if (d5 != null) {
            double dDoubleValue = d5.doubleValue();
            if (dDoubleValue <= d) {
                d = dDoubleValue;
            }
        }
        this.a = Double.valueOf(d);
        Double d6 = this.b;
        if (d6 != null) {
            double dDoubleValue2 = d6.doubleValue();
            if (dDoubleValue2 >= d2) {
                d2 = dDoubleValue2;
            }
        }
        this.b = Double.valueOf(d2);
        lub lubVar = (lub) this.c.get(null);
        if (lubVar != null) {
            lubVar.a = Math.min(lubVar.a, d3);
            lubVar.b = Math.max(lubVar.b, d4);
            return;
        }
        LinkedHashMap linkedHashMap = this.c;
        lub lubVar2 = new lub();
        lubVar2.a = d3;
        lubVar2.b = d4;
        linkedHashMap.put(null, lubVar2);
    }
}
