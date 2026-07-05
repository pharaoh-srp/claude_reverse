package defpackage;

import androidx.compose.ui.graphics.painter.BitmapPainter;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rx8 {
    public static final u0h a = new u0h(new ij8(19));
    public static final u0h b = new u0h(new ij8(20));
    public static final u0h c = new u0h(new ij8(21));
    public static final epk d = new epk(4);

    public static final bpc a(he6 he6Var, ld4 ld4Var) {
        bpc bitmapPainter;
        xne xneVar;
        he6 he6Var2;
        cz5 cz5Var;
        Object qx8Var;
        he6 he6Var3;
        cz5 cz5Var2;
        he6Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.a0(-1508925367);
        ((yne) e18Var.j(aoe.b)).getClass();
        xne xneVarA = yne.a(e18Var);
        boolean zF = e18Var.f(he6Var) | e18Var.f(xneVarA);
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (zF || objN == lz1Var) {
            objN = aoe.a(he6Var, xneVarA).b;
            e18Var.k0(objN);
        }
        String str = (String) objN;
        tp4 tp4Var = null;
        if (isg.h0(str, ".xml", true)) {
            e18Var.a0(-1267601485);
            np5 np5VarS = zh4.s(dqe.a, e18Var);
            cz5 cz5Var3 = (cz5) e18Var.j(ve4.h);
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new ij8(23);
                e18Var.k0(objN2);
            }
            zy7 zy7Var = (zy7) objN2;
            boolean zF2 = e18Var.f(he6Var) | e18Var.h(np5VarS) | e18Var.f(cz5Var3);
            Object objN3 = e18Var.N();
            if (zF2 || objN3 == lz1Var) {
                qx8Var = new qx8(he6Var, np5VarS, cz5Var3, tp4Var, 1);
                he6Var3 = he6Var;
                cz5Var2 = cz5Var3;
                e18Var.k0(qx8Var);
            } else {
                qx8Var = objN3;
                cz5Var2 = cz5Var3;
                he6Var3 = he6Var;
            }
            bitmapPainter = yb5.B((py8) bsk.f(he6Var3, np5VarS, cz5Var2, zy7Var, (pz7) qx8Var, e18Var).getValue(), e18Var);
            e18Var.p(false);
        } else if (isg.h0(str, ".svg", true)) {
            e18Var.a0(-1267490226);
            np5 np5VarS2 = zh4.s(dqe.a, e18Var);
            cz5 cz5Var4 = (cz5) e18Var.j(ve4.h);
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var) {
                objN4 = new ij8(22);
                e18Var.k0(objN4);
            }
            zy7 zy7Var2 = (zy7) objN4;
            boolean zF3 = e18Var.f(he6Var) | e18Var.h(np5VarS2) | e18Var.f(cz5Var4);
            Object objN5 = e18Var.N();
            if (zF3 || objN5 == lz1Var) {
                qx8 qx8Var2 = new qx8(he6Var, np5VarS2, cz5Var4, tp4Var, 0);
                he6Var2 = he6Var;
                cz5Var = cz5Var4;
                e18Var.k0(qx8Var2);
                objN5 = qx8Var2;
            } else {
                he6Var2 = he6Var;
                cz5Var = cz5Var4;
            }
            bitmapPainter = (bpc) bsk.f(he6Var2, np5VarS2, cz5Var, zy7Var2, (pz7) objN5, e18Var).getValue();
            e18Var.p(false);
        } else {
            e18Var.a0(-1267441060);
            np5 np5VarS3 = zh4.s(dqe.a, e18Var);
            xne xneVarB = aoe.b(e18Var);
            Object objN6 = e18Var.N();
            if (objN6 == lz1Var) {
                objN6 = new ij8(18);
                e18Var.k0(objN6);
            }
            zy7 zy7Var3 = (zy7) objN6;
            boolean zF4 = e18Var.f(he6Var) | e18Var.f(xneVarB) | e18Var.h(np5VarS3);
            Object objN7 = e18Var.N();
            if (zF4 || objN7 == lz1Var) {
                w14 w14Var = new w14(he6Var, xneVarB, np5VarS3, tp4Var, 27);
                xneVar = xneVarB;
                e18Var.k0(w14Var);
                objN7 = w14Var;
            } else {
                xneVar = xneVarB;
            }
            bitmapPainter = new BitmapPainter((r20) bsk.f(he6Var, np5VarS3, xneVar, zy7Var3, (pz7) objN7, e18Var).getValue());
            e18Var.p(false);
        }
        e18Var.p(false);
        return bitmapPainter;
    }
}
