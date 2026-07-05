package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.messages.CompactionStatus;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j84 {
    public static final void a(k84 k84Var, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        a80 a80Var;
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1740309667);
        int i2 = i | (e18Var2.f(k84Var) ? 4 : 2) | 384;
        if (e18Var2.Q(i2 & 1, (i2 & 147) != 146)) {
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = new hsc(MTTypesetterKt.kLineSkipLimitMultiplier);
                e18Var2.k0(objN);
            }
            hsc hscVar = (hsc) objN;
            Object objN2 = e18Var2.N();
            if (objN2 == lz1Var) {
                objN2 = zh4.a(MTTypesetterKt.kLineSkipLimitMultiplier);
                e18Var2.k0(objN2);
            }
            a80 a80Var2 = (a80) objN2;
            nwb nwbVarZ = mpk.Z(zy7Var, e18Var2);
            long j = k84Var != null ? k84Var.b : 0L;
            Long lValueOf = Long.valueOf(j);
            boolean zE = e18Var2.e(j) | e18Var2.h(a80Var2);
            Object objN3 = e18Var2.N();
            if (zE || objN3 == lz1Var) {
                e9 e9Var = new e9(j, a80Var2, hscVar, null);
                e18Var2.k0(e9Var);
                objN3 = e9Var;
            }
            fd9.i(e18Var2, (pz7) objN3, lValueOf);
            Float fValueOf = Float.valueOf(hscVar.h());
            int i3 = i2 & 14;
            boolean zH = (i3 == 4) | e18Var2.h(a80Var2);
            Object objN4 = e18Var2.N();
            if (zH || objN4 == lz1Var) {
                objN4 = new h84(k84Var, a80Var2, hscVar, null);
                e18Var2.k0(objN4);
            }
            fd9.i(e18Var2, (pz7) objN4, fValueOf);
            Boolean boolValueOf = Boolean.valueOf((k84Var != null ? k84Var.a : null) == CompactionStatus.Status.COMPLETE || k84Var == null);
            boolean zH2 = (i3 == 4) | e18Var2.h(a80Var2) | e18Var2.f(nwbVarZ);
            Object objN5 = e18Var2.N();
            if (zH2 || objN5 == lz1Var) {
                i84 i84Var = new i84(k84Var, a80Var2, hscVar, nwbVarZ, null);
                a80Var = a80Var2;
                e18Var2.k0(i84Var);
                objN5 = i84Var;
            } else {
                a80Var = a80Var2;
            }
            fd9.i(e18Var2, (pz7) objN5, boolValueOf);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 48);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var2, fqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, q64VarA);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            tjh.b(d4c.j0(R.string.compaction_progress_label, e18Var2), null, gm3.a(e18Var2).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 0, 0, 131066);
            e18Var = e18Var2;
            kxk.g(e18Var, b.e(fqbVar, 7.0f));
            b(((Number) a80Var.e()).floatValue(), 0, e18Var, null);
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new f44(k84Var, i, zy7Var, iqbVar2, 1);
        }
    }

    public static final void b(float f, int i, ld4 ld4Var, iqb iqbVar) {
        final float f2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-172882156);
        int i2 = (e18Var.c(f) ? 4 : 2) | i | 48;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            final long j = gm3.a(e18Var).s;
            final long j2 = gm3.a(e18Var).N;
            fqb fqbVar = fqb.E;
            iqb iqbVarV = xn5.V(b.e(b.t(fqbVar, 200.0f), 4.0f), xve.b(2.0f));
            boolean zE = e18Var.e(j) | ((i2 & 14) == 4) | e18Var.e(j2);
            Object objN = e18Var.N();
            if (zE || objN == jd4.a) {
                f2 = f;
                bz7 bz7Var = new bz7() { // from class: f84
                    @Override // defpackage.bz7
                    public final Object invoke(Object obj) {
                        xd6 xd6Var = (xd6) obj;
                        xd6Var.getClass();
                        float fQ0 = xd6Var.q0(2.0f);
                        xd6.y(xd6Var, j, 0L, 0L, (((long) Float.floatToRawIntBits(fQ0)) << 32) | (((long) Float.floatToRawIntBits(fQ0)) & 4294967295L), null, MTTypesetterKt.kLineSkipLimitMultiplier, 246);
                        float fD0 = wd6.d0(f2, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f) * Float.intBitsToFloat((int) (xd6Var.g() >> 32));
                        if (fD0 < fQ0) {
                            fD0 = fQ0;
                        }
                        xd6.y(xd6Var, j2, 0L, (((long) Float.floatToRawIntBits(fD0)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (xd6Var.g() & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(fQ0)) & 4294967295L) | (Float.floatToRawIntBits(fQ0) << 32), null, MTTypesetterKt.kLineSkipLimitMultiplier, 242);
                        return iei.a;
                    }
                };
                e18Var.k0(bz7Var);
                objN = bz7Var;
            } else {
                f2 = f;
            }
            dw1.a(zni.s(iqbVarV, (bz7) objN), e18Var, 0);
            iqbVar = fqbVar;
        } else {
            f2 = f;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new g84(f2, i, 0, iqbVar);
        }
    }
}
