package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bv9 {
    public final au a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public au h;
    public final /* synthetic */ int j;
    public boolean b = true;
    public final HashMap i = new HashMap();

    public bv9(au auVar, int i) {
        this.j = i;
        this.a = auVar;
    }

    public static final void a(bv9 bv9Var, ut utVar, int i, m5c m5cVar) {
        HashMap map = bv9Var.i;
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        while (true) {
            long jN = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (bv9Var.j) {
                    case 0:
                        mmc mmcVar = m5cVar.r0;
                        if (mmcVar != null) {
                            ma8 ma8Var = (ma8) mmcVar;
                            float[] fArrB = ma8Var.b();
                            if (!ma8Var.W) {
                                jN = nwa.b(jN, fArrB);
                            }
                        }
                        jN = yfd.N(jN, m5cVar.f0);
                        break;
                    default:
                        hma hmaVarF1 = m5cVar.f1();
                        hmaVarF1.getClass();
                        long j = hmaVarF1.T;
                        jN = fcc.i((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32), jN);
                        break;
                }
                m5cVar = m5cVar.W;
                m5cVar.getClass();
                if (m5cVar.equals(bv9Var.a.d())) {
                    int iRound = Math.round(utVar instanceof mo8 ? Float.intBitsToFloat((int) (jN & 4294967295L)) : Float.intBitsToFloat((int) (jN >> 32)));
                    if (map.containsKey(utVar)) {
                        int iIntValue = ((Number) sta.f0(utVar, map)).intValue();
                        mo8 mo8Var = xt.a;
                        iRound = ((Number) utVar.a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(utVar, Integer.valueOf(iRound));
                    return;
                }
            } while (!bv9Var.b(m5cVar).containsKey(utVar));
            float fC = bv9Var.c(m5cVar, utVar);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fC);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fC);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(m5c m5cVar) {
        switch (this.j) {
            case 0:
                return m5cVar.x0().c();
            default:
                hma hmaVarF1 = m5cVar.f1();
                hmaVarF1.getClass();
                return hmaVarF1.x0().c();
        }
    }

    public final int c(m5c m5cVar, ut utVar) {
        switch (this.j) {
            case 0:
                return m5cVar.R(utVar);
            default:
                hma hmaVarF1 = m5cVar.f1();
                hmaVarF1.getClass();
                return hmaVarF1.R(utVar);
        }
    }

    public final boolean d() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean e() {
        h();
        return this.h != null;
    }

    public final void f() {
        this.b = true;
        au auVar = this.a;
        au auVarF = auVar.f();
        if (auVarF == null) {
            return;
        }
        if (this.c) {
            auVarF.N();
        } else if (this.e || this.d) {
            auVarF.requestLayout();
        }
        if (this.f) {
            auVar.N();
        }
        if (this.g) {
            auVar.requestLayout();
        }
        auVarF.c().f();
    }

    public final void g() {
        HashMap map = this.i;
        map.clear();
        e0 e0Var = new e0(3, this);
        au auVar = this.a;
        auVar.F(e0Var);
        map.putAll(b(auVar.d()));
        this.b = false;
    }

    public final void h() {
        bv9 bv9VarC;
        bv9 bv9VarC2;
        boolean zD = d();
        au auVar = this.a;
        if (!zD) {
            au auVarF = auVar.f();
            if (auVarF == null) {
                return;
            }
            auVar = auVarF.c().h;
            if (auVar == null || !auVar.c().d()) {
                au auVar2 = this.h;
                if (auVar2 == null || auVar2.c().d()) {
                    return;
                }
                au auVarF2 = auVar2.f();
                if (auVarF2 != null && (bv9VarC2 = auVarF2.c()) != null) {
                    bv9VarC2.h();
                }
                au auVarF3 = auVar2.f();
                auVar = (auVarF3 == null || (bv9VarC = auVarF3.c()) == null) ? null : bv9VarC.h;
            }
        }
        this.h = auVar;
    }
}
