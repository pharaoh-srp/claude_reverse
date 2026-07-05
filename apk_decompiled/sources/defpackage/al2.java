package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class al2 {
    public final boolean a;
    public final double b;
    public final double c;
    public final double d;
    public final boolean e;
    public final double f;
    public final double g;
    public final double h;
    public final List i;
    public final List j;

    public al2(boolean z, double d, double d2, double d3, boolean z2, double d4, double d5, double d6) {
        this.a = z;
        this.b = d;
        this.c = d2;
        this.d = d3;
        this.e = z2;
        this.f = d4;
        this.g = d5;
        this.h = d6;
        this.i = z ? b(d, d2) : a(d, d2, d3);
        this.j = z2 ? b(d4, d5) : a(d4, d5, d6);
    }

    public static ArrayList a(double d, double d2, double d3) {
        ArrayList arrayList = new ArrayList(10);
        double d4 = 1.0E-10d * d3;
        while (d <= d2 + d4) {
            double dPow = Math.pow(10.0d, Math.max(0.0d, (-Math.floor(Math.log10(Math.abs(d3)))) + 1.0d));
            arrayList.add(Double.valueOf(Math.rint(d * dPow) / dPow));
            d += d3;
        }
        return arrayList;
    }

    public static List b(double d, double d2) {
        if (d == 0.0d || d2 == 0.0d || (d <= 0.0d && d2 >= 0.0d)) {
            double dF = jik.f(d2, d);
            return a(Math.floor(d / dF) * dF, Math.ceil(d2 / dF) * dF, dF);
        }
        double dLog10 = Math.log10(d);
        double dLog102 = Math.log10(d2);
        if (dLog102 - dLog10 < 2.0d) {
            int iFloor = (int) Math.floor(Math.log10(d));
            int iCeil = (int) Math.ceil(Math.log10(d2));
            ArrayList arrayList = new ArrayList();
            int i = iFloor - 1;
            int i2 = iCeil + 1;
            if (i <= i2) {
                while (true) {
                    double dPow = Math.pow(10.0d, i);
                    arrayList.add(Double.valueOf(1.0d * dPow));
                    arrayList.add(Double.valueOf(dPow * 2.0d));
                    arrayList.add(Double.valueOf(dPow * 5.0d));
                    if (i == i2) {
                        break;
                    }
                    i++;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                double dDoubleValue = ((Number) obj).doubleValue();
                if (dDoubleValue >= d && dDoubleValue <= d2) {
                    arrayList2.add(obj);
                }
            }
            List listH1 = w44.h1(arrayList2);
            if (listH1.size() <= 10) {
                return listH1;
            }
            int iMax = Math.max(1, arrayList.size() / 10);
            ArrayList arrayList3 = new ArrayList();
            int i3 = 0;
            for (Object obj2 : arrayList) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    x44.n0();
                    throw null;
                }
                ((Number) obj2).doubleValue();
                if (i3 % iMax == 0) {
                    arrayList3.add(obj2);
                }
                i3 = i4;
            }
            return arrayList3;
        }
        b79 b79Var = new b79((int) Math.floor(dLog10), (int) Math.ceil(dLog102), 1);
        ArrayList arrayList4 = new ArrayList(x44.y(b79Var, 10));
        Iterator it = b79Var.iterator();
        while (true) {
            if (!((a79) it).G) {
                return arrayList4;
            }
            arrayList4.add(Double.valueOf(Math.pow(10.0d, r2.nextInt())));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al2)) {
            return false;
        }
        al2 al2Var = (al2) obj;
        return this.a == al2Var.a && Double.compare(this.b, al2Var.b) == 0 && Double.compare(this.c, al2Var.c) == 0 && Double.compare(this.d, al2Var.d) == 0 && this.e == al2Var.e && Double.compare(this.f, al2Var.f) == 0 && Double.compare(this.g, al2Var.g) == 0 && Double.compare(this.h, al2Var.h) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.h) + fsh.o(this.g, fsh.o(this.f, fsh.p(fsh.o(this.d, fsh.o(this.c, fsh.o(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31), 31);
    }

    public final String toString() {
        return "ChartGridSpec(yLog=" + this.a + ", yMin=" + this.b + ", yMax=" + this.c + ", yStep=" + this.d + ", xLog=" + this.e + ", xMin=" + this.f + ", xMax=" + this.g + ", xStep=" + this.h + ")";
    }
}
