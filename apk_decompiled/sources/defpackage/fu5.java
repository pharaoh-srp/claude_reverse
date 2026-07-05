package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fu5 implements ojg {
    public final bz7 a;
    public final sz7 b;

    public fu5(bz7 bz7Var, sz7 sz7Var) {
        sz7Var.getClass();
        this.a = bz7Var;
        this.b = sz7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x018d  */
    @Override // defpackage.ojg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.bf3 r17, defpackage.iqb r18, defpackage.ta4 r19, defpackage.ld4 r20, int r21) {
        /*
            Method dump skipped, instruction units count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu5.a(bf3, iqb, ta4, ld4, int):void");
    }

    public final ib0 b(ie3 ie3Var, d56 d56Var, rok rokVar, ie3 ie3Var2, boolean z, h7g h7gVar) {
        rjg rjgVar = h7gVar;
        if (h7gVar == null) {
            rjgVar = (rjg) this.b.i(ie3Var, ie3Var2, d56Var, Boolean.valueOf(z));
        }
        return new ib0(ie3Var, d56Var, rokVar, rjgVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(ib0 ib0Var, zy7 zy7Var, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2123007399);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(ib0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i2 & 147) == 146 && e18Var.C()) {
            e18Var.T();
        } else {
            Object[] objArr = 0;
            int i3 = 0;
            a6i a6iVarA0 = nai.a0(ib0Var.c, null, e18Var, 0, 2);
            rok rokVar = ib0Var.c;
            boolean zL0 = rokVar instanceof swb ? ((swb) rokVar).L0() : false;
            e18Var.a0(-1859215523);
            if (zL0) {
                e18Var.a0(-1859213766);
                boolean z = (i2 & 112) == 32;
                Object objN = e18Var.N();
                if (z || objN == jd4.a) {
                    objN = new bu5(zy7Var, objArr == true ? 1 : 0, i3);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                fd9.i(e18Var, (pz7) objN, iei.a);
            }
            e18Var.p(false);
            yfd.h(zL0 ? null : ib0Var.b, a6iVarA0, fd9.q0(-1022092546, new cu5(i3, ta4Var, ib0Var), e18Var), e18Var, 384);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xo4(this, ib0Var, zy7Var, ta4Var, i);
        }
    }

    public final void d(bf3 bf3Var, qbd qbdVar, bz7 bz7Var, ld4 ld4Var, int i) {
        int i2;
        fu5 fu5Var;
        bf3 bf3Var2;
        qbd qbdVar2;
        bz7 bz7Var2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1176639550);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(bf3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(qbdVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(this) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i2 & 1171) == 1170 && e18Var.C()) {
            e18Var.T();
            fu5Var = this;
            bf3Var2 = bf3Var;
            qbdVar2 = qbdVar;
            bz7Var2 = bz7Var;
        } else {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = fd9.O(im6.E, e18Var);
                e18Var.k0(objN);
            }
            l45 l45Var = (l45) objN;
            e18Var.a0(1715866290);
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                fu5Var = this;
                bf3Var2 = bf3Var;
                qbdVar2 = qbdVar;
                bz7Var2 = bz7Var;
                eu5 eu5Var = new eu5(fu5Var, bf3Var2, l45Var, qbdVar2, bz7Var2);
                e18Var.k0(eu5Var);
                objN2 = eu5Var;
            } else {
                fu5Var = this;
                bf3Var2 = bf3Var;
                qbdVar2 = qbdVar;
                bz7Var2 = bz7Var;
            }
            eu5 eu5Var2 = (eu5) objN2;
            e18Var.p(false);
            bb1 bb1Var = qbdVar2.a;
            e18Var.a0(1715876842);
            boolean zH = e18Var.h(qbdVar2) | e18Var.h(eu5Var2) | e18Var.h(l45Var);
            Object objN3 = e18Var.N();
            if (zH || objN3 == lz1Var) {
                objN3 = new ny4(qbdVar2, eu5Var2, l45Var, 6);
                e18Var.k0(objN3);
            }
            e18Var.p(false);
            fd9.e(bb1Var, eu5Var2, (bz7) objN3, e18Var);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xd(fu5Var, bf3Var2, qbdVar2, bz7Var2, i);
        }
    }

    public final LinkedHashMap e(bf3 bf3Var, bf3 bf3Var2) {
        d56 d56Var = d56.E;
        zo6 zo6Var = zo6.F;
        if (bf3Var2 == null || x44.r(bf3Var.a.c, bf3Var2.a.c)) {
            return x44.k(new ib0(bf3Var.a, d56Var, new swb(zo6Var), null));
        }
        int size = bf3Var.c.size();
        int size2 = bf3Var2.c.size();
        zo6 zo6Var2 = zo6.G;
        zo6 zo6Var3 = zo6.E;
        if (size < size2) {
            List list = bf3Var2.b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (x44.r(((ie3) it.next()).c, bf3Var.a.c)) {
                        ie3 ie3Var = bf3Var.a;
                        swb swbVar = new swb(zo6Var3);
                        swbVar.M0(zo6Var);
                        ib0 ib0VarB = b(ie3Var, d56.G, swbVar, bf3Var2.a, false, null);
                        ie3 ie3Var2 = bf3Var2.a;
                        swb swbVar2 = new swb(zo6Var);
                        swbVar2.M0(zo6Var2);
                        return x44.k(ib0VarB, b(ie3Var2, d56.F, swbVar2, bf3Var.a, false, null));
                    }
                }
            }
        }
        ie3 ie3Var3 = bf3Var2.a;
        swb swbVar3 = new swb(zo6Var);
        swbVar3.M0(zo6Var2);
        ib0 ib0VarB2 = b(ie3Var3, d56.H, swbVar3, bf3Var.a, false, null);
        ie3 ie3Var4 = bf3Var.a;
        swb swbVar4 = new swb(zo6Var3);
        swbVar4.M0(zo6Var);
        return x44.k(ib0VarB2, b(ie3Var4, d56Var, swbVar4, bf3Var2.a, false, null));
    }
}
