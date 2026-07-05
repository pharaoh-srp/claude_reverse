package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes2.dex */
public final class lv5 {
    public static final lv5 a = new lv5();

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(b9i b9iVar, ld4 ld4Var, int i) {
        e18 e18Var;
        fqb fqbVar;
        iqb iqbVarA;
        int i2;
        final b9i b9iVar2;
        s2i s2iVar;
        b9i b9iVar3 = b9iVar;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1640665680);
        int i3 = i | (e18Var2.f(b9iVar3) ? 4 : 2);
        if (e18Var2.Q(i3 & 1, (i3 & 3) != 2)) {
            float f = b9iVar3.k;
            m2i m2iVar = b9iVar3.n;
            wbj wbjVar = b9iVar3.m;
            q2i q2iVar = b9iVar3.o;
            float f2 = b9iVar3.l;
            if (Float.isNaN(f) || (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) >= 2139095040) {
                sz6.p("The collapsedHeight is expected to be specified and finite");
                return;
            }
            if (Float.isNaN(f2) || (Float.floatToRawIntBits(f2) & Integer.MAX_VALUE) >= 2139095040) {
                sz6.p("The expandedHeight is expected to be specified and finite");
                return;
            }
            if (va6.a(f2, f) < 0) {
                sz6.p("The expandedHeight is expected to be greater or equal to the collapsedHeight");
                return;
            }
            int iM0 = ((cz5) e18Var2.j(ve4.h)).M0(b9iVar3.d);
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objN = e18Var2.N();
            int i5 = 11;
            Object obj = jd4.a;
            if (z || objN == obj) {
                objN = new xi4(i5, b9iVar3);
                e18Var2.k0(objN);
            }
            zy7 zy7Var = (zy7) objN;
            boolean zF = (i4 == 4) | e18Var2.f(zy7Var);
            Object objN2 = e18Var2.N();
            if (zF || objN2 == obj) {
                objN2 = new p4(b9iVar3, 19, zy7Var);
                e18Var2.k0(objN2);
            }
            zy7 zy7Var2 = (zy7) objN2;
            ta4 ta4VarQ0 = fd9.q0(-1333673671, new mk4(13, b9iVar3), e18Var2);
            boolean zF2 = e18Var2.f(zy7Var);
            Object objN3 = e18Var2.N();
            if (zF2 || objN3 == obj) {
                objN3 = new kl1(10, zy7Var);
                e18Var2.k0(objN3);
            }
            zy7 zy7Var3 = (zy7) objN3;
            boolean zF3 = e18Var2.f(zy7Var);
            Object objN4 = e18Var2.N();
            if (zF3 || objN4 == obj) {
                objN4 = new kl1(i5, zy7Var);
                e18Var2.k0(objN4);
            }
            zy7 zy7Var4 = (zy7) objN4;
            boolean zF4 = e18Var2.f(zy7Var);
            Object objN5 = e18Var2.N();
            if (zF4 || objN5 == obj) {
                objN5 = mpk.w(new kl1(12, zy7Var));
                e18Var2.k0(objN5);
            }
            wlg wlgVar = (wlg) objN5;
            boolean z2 = !((Boolean) wlgVar.getValue()).booleanValue();
            fqb fqbVar2 = fqb.E;
            if (q2iVar != null) {
                e18Var2.a0(-341139672);
                boolean z3 = i4 == 4;
                Object objN6 = e18Var2.N();
                if (z3 || objN6 == obj) {
                    objN6 = new py3(14, b9iVar3);
                    e18Var2.k0(objN6);
                }
                pd6 pd6VarB = nd6.b((bz7) objN6, e18Var2, 0);
                boolean z4 = i4 == 4;
                Object objN7 = e18Var2.N();
                if (z4 || objN7 == obj) {
                    objN7 = new kv5(b9iVar3, null);
                    e18Var2.k0(objN7);
                }
                iqbVarA = nd6.a(fqbVar2, pd6VarB, ukc.E, false, null, false, null, (rz7) objN7, false, 188);
                fqbVar = fqbVar2;
                e18Var2.p(false);
            } else {
                fqbVar = fqbVar2;
                e18Var2.a0(-340524694);
                e18Var2.p(false);
                iqbVarA = fqbVar;
            }
            iqb iqbVarB = b9iVar3.a.B(iqbVarA);
            boolean zF5 = e18Var2.f(zy7Var2);
            Object objN8 = e18Var2.N();
            if (zF5 || objN8 == obj) {
                objN8 = new kw0(7, zy7Var2);
                e18Var2.k0(objN8);
            }
            iqb iqbVarS = zni.s(iqbVarB, (bz7) objN8);
            Object objN9 = e18Var2.N();
            if (objN9 == obj) {
                objN9 = new qy4(16);
                e18Var2.k0(objN9);
            }
            iqb iqbVarB2 = tjf.b(iqbVarS, false, (bz7) objN9);
            Object objN10 = e18Var2.N();
            if (objN10 == obj) {
                objN10 = jv5.F;
                e18Var2.k0(objN10);
            }
            iqb iqbVarA2 = a0h.a(iqbVarB2, iei.a, (PointerInputEventHandler) objN10);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarA2);
            dd4.e.getClass();
            zy7 zy7Var5 = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(zy7Var5);
            } else {
                e18Var2.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var2, z80Var, o5bVarD);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var2, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var2, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var2, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var2, z80Var4, iqbVarE);
            vo1 vo1Var = lja.S;
            q64 q64VarA = p64.a(ko0.c, vo1Var, e18Var2, 0);
            fqb fqbVar3 = fqbVar;
            int iHashCode2 = Long.hashCode(e18Var2.T);
            hyc hycVarL2 = e18Var2.l();
            iqb iqbVarE2 = kxk.E(e18Var2, fqbVar3);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(zy7Var5);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var, q64VarA);
            d4c.i0(e18Var2, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var2, z80Var3, e18Var2, bxVar);
            d4c.i0(e18Var2, z80Var4, iqbVarE2);
            iqb iqbVarW = xn5.W(knk.M(fqbVar3, wbjVar));
            Object objN11 = e18Var2.N();
            if (objN11 == obj) {
                objN11 = new iv5();
                e18Var2.k0(objN11);
            }
            long j = m2iVar.c;
            long j2 = m2iVar.d;
            long j3 = m2iVar.e;
            long j4 = m2iVar.f;
            ta4 ta4Var = b9iVar.e;
            tkh tkhVar = b9iVar.f;
            tkh tkhVar2 = b9iVar.h;
            boolean zBooleanValue = ((Boolean) wlgVar.getValue()).booleanValue();
            ta4 ta4Var2 = b9iVar.i;
            float f3 = b9iVar.k;
            qnc qncVar = n2i.a;
            eg0.e(iqbVarW, (to7) objN11, j, j2, j4, j3, ta4Var, tkhVar, tkhVar2, zy7Var3, ko0.e, vo1Var, 0, zBooleanValue, ta4Var2, ta4VarQ0, f3, qncVar, e18Var2, 0, 102239280);
            iqb iqbVarW2 = xn5.W(knk.M(fqbVar3, new a5a(wbjVar, 15)));
            if (q2iVar == null || (s2iVar = ((g77) q2iVar).a) == null) {
                i2 = 1;
            } else {
                i2 = 1;
                iqb iqbVarV0 = wd6.v0(iqbVarW2, new a2(i2, s2iVar));
                if (iqbVarV0 != null) {
                    iqbVarW2 = iqbVarV0;
                }
            }
            int i6 = i4 == 4 ? i2 : 0;
            Object objN12 = e18Var2.N();
            if (i6 != 0 || objN12 == obj) {
                b9iVar2 = b9iVar;
                objN12 = new to7() { // from class: hv5
                    @Override // defpackage.to7
                    public final float a() {
                        s2i s2iVar2;
                        q2i q2iVar2 = b9iVar2.o;
                        return (q2iVar2 == null || (s2iVar2 = ((g77) q2iVar2).a) == null) ? MTTypesetterKt.kLineSkipLimitMultiplier : s2iVar2.c.h();
                    }
                };
                e18Var2.k0(objN12);
            } else {
                b9iVar2 = b9iVar;
            }
            boolean z5 = i2;
            iqb iqbVar = iqbVarW2;
            b9iVar3 = b9iVar2;
            eg0.e(iqbVar, (to7) objN12, m2iVar.c, m2iVar.d, m2iVar.f, m2iVar.e, b9iVar2.b, b9iVar2.c, b9iVar2.g, zy7Var4, ko0.d, vo1Var, iM0, z2, nai.d, nai.e, f2 - f, qncVar, e18Var2, 0, 102432816);
            e18 e18Var3 = e18Var2;
            e18Var3.p(z5);
            e18Var3.p(z5);
            e18Var = e18Var3;
        } else {
            e18Var2.T();
            e18Var = e18Var2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new um5(this, b9iVar3, i, 7);
        }
    }
}
