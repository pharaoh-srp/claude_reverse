package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zh3 {
    public static final zh3 b = new zh3(0);
    public static final zh3 c = new zh3(1);
    public static final zh3 d = new zh3(2);
    public final /* synthetic */ int a;

    public /* synthetic */ zh3(int i) {
        this.a = i;
    }

    public static String a(xh3 xh3Var) {
        String strD;
        sxb name = xh3Var.getName();
        name.getClass();
        String strC = yb5.C(name);
        if (!(xh3Var instanceof qai)) {
            bo5 bo5VarH = xh3Var.h();
            bo5VarH.getClass();
            if (bo5VarH instanceof qqb) {
                strD = a((xh3) bo5VarH);
            } else if (bo5VarH instanceof wmc) {
                xw7 xw7VarI = ((xmc) ((wmc) bo5VarH)).I.i();
                xw7VarI.getClass();
                strD = yb5.D(xw7VarI.e());
            } else {
                strD = null;
            }
            if (strD != null && !strD.equals("")) {
                return strD + '.' + strC;
            }
        }
        return strC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [bo5, xh3] */
    /* JADX WARN: Type inference failed for: r2v2, types: [bo5] */
    /* JADX WARN: Type inference failed for: r2v3, types: [bo5] */
    public final String b(xh3 xh3Var, g06 g06Var) {
        switch (this.a) {
            case 0:
                if (xh3Var instanceof qai) {
                    sxb name = ((qai) xh3Var).getName();
                    name.getClass();
                    return g06Var.P(name, false);
                }
                xw7 xw7VarG = m06.g(xh3Var);
                xw7VarG.getClass();
                return g06Var.p(yb5.D(xw7VarG.e()));
            case 1:
                if (xh3Var instanceof qai) {
                    sxb name2 = ((qai) xh3Var).getName();
                    name2.getClass();
                    return g06Var.P(name2, false);
                }
                ArrayList arrayList = new ArrayList();
                do {
                    arrayList.add(xh3Var.getName());
                    xh3Var = xh3Var.h();
                } while (xh3Var instanceof qqb);
                return yb5.D(new ese(arrayList));
            default:
                return a(xh3Var);
        }
    }
}
