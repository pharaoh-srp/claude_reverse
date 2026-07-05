package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.memory.MemoryFsCategory;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qbb {
    static {
        x44.X(new MemoryFsCategory("profile", "Profile"), new MemoryFsCategory("topics", "Topics"), new MemoryFsCategory("areas", "Areas"), new MemoryFsCategory("people", "People"), new MemoryFsCategory(null, "Other"));
    }

    public static final void a(List list, boolean z, boolean z2, bz7 bz7Var, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1154587546);
        int i2 = i | (e18Var2.f(list) ? 4 : 2) | (e18Var2.g(z) ? 32 : 16) | (e18Var2.g(z2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(bz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var2.f(iqbVar) ? 131072 : 65536);
        if (e18Var2.Q(i2 & 1, (74899 & i2) != 74898)) {
            boolean z3 = z && list != null;
            int i3 = i2 >> 9;
            e18Var = e18Var2;
            fxd.b(z3, zy7Var, iqbVar, null, null, null, false, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(2117997506, new qe((Object) list, (Object) bz7Var, z2, zy7Var, 6), e18Var2), e18Var, (i3 & 112) | 100663296 | (i3 & 896), 248);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new kv2(list, z, z2, bz7Var, zy7Var, iqbVar, i);
        }
    }

    public static final void b(int i, ld4 ld4Var, bz7 bz7Var, iqb iqbVar, List list) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(698223181);
        int i2 = i | (e18Var.f(list) ? 4 : 2) | (e18Var.h(bz7Var) ? 32 : 16) | 384;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            qnc qncVar = qf2.a;
            qnc qncVarB = gb9.b(MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, 1);
            boolean z = false;
            ho0 ho0Var = new ho0(2.0f, true, new sz6(1));
            FillElement fillElement = b.c;
            boolean z2 = (i2 & 14) == 4;
            if ((i2 & 112) == 32) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object objN = e18Var.N();
            if (z3 || objN == jd4.a) {
                objN = new bs4(1, bz7Var, list);
                e18Var.k0(objN);
            }
            knk.h(fillElement, null, qncVarB, false, ho0Var, null, null, false, null, (bz7) objN, e18Var, 0, 490);
            iqbVar2 = fqb.E;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new i44(list, bz7Var, iqbVar2, i, 2);
        }
    }

    public static final void c(zy7 zy7Var, bz7 bz7Var, iqb iqbVar, pbb pbbVar, qi3 qi3Var, ld4 ld4Var, int i) {
        iqb iqbVar2;
        pbb pbbVar2;
        qi3 qi3Var2;
        qi3 qi3Var3;
        iqb iqbVar3;
        int i2;
        pbb pbbVar3;
        zy7Var.getClass();
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(103354453);
        int i3 = i | (e18Var.h(zy7Var) ? 4 : 2) | (e18Var.h(bz7Var) ? 32 : 16) | 9600;
        if (e18Var.Q(i3 & 1, (i3 & 9363) != 9362)) {
            e18Var.V();
            int i4 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var.A()) {
                m7f m7fVarB = gr9.b(e18Var);
                boolean zH = e18Var.h(m7fVarB);
                Object objN = e18Var.N();
                if (zH || objN == lz1Var) {
                    objN = new di(m7fVarB, 20);
                    e18Var.k0(objN);
                }
                kce kceVar = jce.a;
                pbb pbbVar4 = (pbb) fd9.r0(kceVar.b(pbb.class), oq5.B(kceVar.b(pbb.class)), (bz7) objN, e18Var);
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN2 = e18Var.N();
                if (zF || objN2 == lz1Var) {
                    objN2 = m7fVarN.a(kceVar.b(qi3.class), null, null);
                    e18Var.k0(objN2);
                }
                e18Var.p(false);
                e18Var.p(false);
                qi3Var3 = (qi3) objN2;
                iqbVar3 = fqb.E;
                i2 = i3 & (-64513);
                pbbVar3 = pbbVar4;
            } else {
                e18Var.T();
                iqbVar3 = iqbVar;
                qi3Var3 = qi3Var;
                i2 = i3 & (-64513);
                pbbVar3 = pbbVar;
            }
            e18Var.q();
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = sq6.p(e18Var);
            }
            ybg ybgVar = (ybg) objN3;
            boolean zH2 = e18Var.h(qi3Var3) | e18Var.f(pbbVar3);
            Object objN4 = e18Var.N();
            if (zH2 || objN4 == lz1Var) {
                objN4 = new dv(qi3Var3, pbbVar3, (tp4) null, 9);
                e18Var.k0(objN4);
            }
            csg.g((bz7) objN4, e18Var, 0, 1);
            zni.g(pbbVar3.d, ybgVar, e18Var, 48);
            iqb iqbVar4 = iqbVar3;
            ssj.c(d4c.j0(R.string.memory_style_files, e18Var), zy7Var, iqbVar4, null, fd9.q0(1103741087, new rn(ybgVar, 13), e18Var), 0L, fd9.q0(221864676, new nw7(pbbVar3, 14, bz7Var), e18Var), e18Var, ((i2 << 3) & 112) | 1597824, 40);
            pbbVar2 = pbbVar3;
            iqbVar2 = iqbVar4;
            qi3Var2 = qi3Var3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            pbbVar2 = pbbVar;
            qi3Var2 = qi3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uo(zy7Var, bz7Var, iqbVar2, (Object) pbbVar2, (Object) qi3Var2, i, 27);
        }
    }
}
