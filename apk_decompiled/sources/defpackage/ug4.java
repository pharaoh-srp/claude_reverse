package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.InputSchema;
import com.anthropic.claude.api.chat.tool.Tool;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ug4 {
    static {
        x44.X(f("create", "Create note", "Creates a new note in the Notes app"), f("search", "Search notes", "Searches existing notes by title or body"), f("delete", "Delete note", "Permanently deletes a note"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x01ee, code lost:
    
        r0 = r36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.String r26, java.lang.String r27, java.util.List r28, boolean r29, defpackage.bz7 r30, defpackage.pz7 r31, defpackage.bz7 r32, defpackage.bz7 r33, defpackage.bz7 r34, defpackage.iqb r35, defpackage.pl3 r36, defpackage.ld4 r37, int r38) {
        /*
            Method dump skipped, instruction units count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ug4.a(java.lang.String, java.lang.String, java.util.List, boolean, bz7, pz7, bz7, bz7, bz7, iqb, pl3, ld4, int):void");
    }

    public static final void b(List list, eyh eyhVar, bz7 bz7Var, pz7 pz7Var, bz7 bz7Var2, bz7 bz7Var3, pl3 pl3Var, ld4 ld4Var, int i) {
        char c;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1024516453);
        int i2 = i | (e18Var.f(list) ? 4 : 2) | (e18Var.d(eyhVar == null ? -1 : eyhVar.ordinal()) ? 32 : 16) | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(pz7Var) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(bz7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.h(bz7Var3) ? 131072 : 65536) | (e18Var.f(pl3Var) ? FreeTypeConstants.FT_LOAD_COLOR : 524288);
        if (e18Var.Q(i2 & 1, (599187 & i2) != 599186)) {
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var, fqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            int i3 = i2 >> 12;
            e(eyhVar, bz7Var3, pl3Var, gb9.J(b.c(fqbVar, 1.0f), 12.0f), e18Var, (i3 & 896) | ((i2 >> 3) & 14) | 3072 | (i3 & 112));
            e18Var.a0(798602617);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                vg4 vg4Var = (vg4) it.next();
                iuj.e(null, MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).v, e18Var, 0, 3);
                eyh eyhVar2 = (eyh) bz7Var.invoke(vg4Var.a);
                boolean zH = e18Var.h(vg4Var) | ((i2 & 7168) == 2048);
                Object objN = e18Var.N();
                lz1 lz1Var = jd4.a;
                if (zH || objN == lz1Var) {
                    objN = new lj2(pz7Var, 18, vg4Var);
                    e18Var.k0(objN);
                }
                bz7 bz7Var4 = (bz7) objN;
                boolean zH2 = e18Var.h(vg4Var) | ((57344 & i2) == 16384);
                Object objN2 = e18Var.N();
                if (zH2 || objN2 == lz1Var) {
                    c = 4;
                    objN2 = new d44(bz7Var2, 4, vg4Var);
                    e18Var.k0(objN2);
                } else {
                    c = 4;
                }
                e18 e18Var2 = e18Var;
                d(vg4Var, eyhVar2, bz7Var4, (zy7) objN2, b.c(fqbVar, 1.0f), e18Var2, 24576);
                e18Var = e18Var2;
            }
            e18Var.p(false);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new og4(list, eyhVar, bz7Var, pz7Var, bz7Var2, bz7Var3, pl3Var, i);
        }
    }

    public static final void c(String str, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1003197991);
        int i2 = (e18Var.f(str) ? 4 : 2) | i;
        int i3 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) e18Var.j(w00.b);
            boolean zH = e18Var.h(context) | ((i2 & 14) == 4);
            Object objN = e18Var.N();
            tp4 tp4Var = null;
            if (zH || objN == jd4.a) {
                objN = new tg4(context, str, tp4Var, i3);
                e18Var.k0(objN);
            }
            Drawable drawable = (Drawable) mpk.S(null, str, (pz7) objN, e18Var, ((i2 << 3) & 112) | 6).getValue();
            if (drawable == null) {
                e18Var.a0(-1888582284);
                e18Var.p(false);
            } else {
                e18Var.a0(-1888582283);
                xn5.N(ge6.a(drawable, e18Var), null, xn5.V(b.o(fqb.E, 40.0f), gm3.b(e18Var).d), null, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, e18Var, 56, 120);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new rq(str, i, 13);
        }
    }

    public static final void d(vg4 vg4Var, eyh eyhVar, bz7 bz7Var, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        eyh eyhVar2;
        e18 e18Var;
        Tool.CustomTool customTool = vg4Var.d;
        eyhVar.getClass();
        bz7Var.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-284152703);
        int i2 = i | (e18Var2.f(vg4Var) ? 4 : 2) | (e18Var2.d(eyhVar.ordinal()) ? 32 : 16) | (e18Var2.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var2.Q(i2 & 1, (i2 & 9363) != 9362)) {
            wo1 wo1Var = lja.Q;
            ho0 ho0Var = new ho0(12.0f, true, new sz6(1));
            iqb iqbVarJ = gb9.J(androidx.compose.foundation.b.c(iqbVar, false, null, null, null, zy7Var, 15), 12.0f);
            cxe cxeVarA = axe.a(ho0Var, wo1Var, e18Var2, 54);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarJ);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var2, z80Var, cxeVarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var2, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var2, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var2, bxVar);
            z80 z80Var4 = cd4.d;
            hw9 hw9VarN = kgh.n(e18Var2, iqbVarE, z80Var4, 1.0f, true);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
            int iHashCode2 = Long.hashCode(e18Var2.T);
            hyc hycVarL2 = e18Var2.l();
            iqb iqbVarE2 = kxk.E(e18Var2, hw9VarN);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var, q64VarA);
            d4c.i0(e18Var2, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var2, z80Var3, e18Var2, bxVar);
            d4c.i0(e18Var2, z80Var4, iqbVarE2);
            tjh.b(customTool.getTitle(), null, gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var2).e.E).e, e18Var2, 0, 24960, 110586);
            tjh.b(customTool.getDescription(), null, gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 0, 24960, 110586);
            e18Var = e18Var2;
            e18Var.p(true);
            eyhVar2 = eyhVar;
            ah4.d(eyhVar2, bz7Var, null, e18Var, (i2 >> 3) & 126);
            e18Var.p(true);
        } else {
            eyhVar2 = eyhVar;
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uo((Object) vg4Var, (Object) eyhVar2, (Object) bz7Var, zy7Var, iqbVar, i, 10);
        }
    }

    public static final void e(eyh eyhVar, bz7 bz7Var, pl3 pl3Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(834420053);
        if ((i & 6) == 0) {
            i2 = (e18Var.d(eyhVar == null ? -1 : eyhVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(bz7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? e18Var.f(pl3Var) : e18Var.h(pl3Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            cxe cxeVarA = axe.a(ko0.g, lja.Q, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, cxeVarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            tjh.b(d4c.j0(R.string.connected_apps_set_all_label, e18Var), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131066);
            e18Var = e18Var;
            kvj.b(null, null, 0L, null, fd9.q0(-2046274864, new ye(eyhVar, bz7Var, pl3Var, 28), e18Var), e18Var, 24576);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xd(eyhVar, bz7Var, pl3Var, iqbVar, i, 19);
        }
    }

    public static final vg4 f(String str, String str2, String str3) {
        return new vg4("com_example_notes__".concat(str), "Notes", "com.example.notes", new Tool.CustomTool(str, str2, str3, new InputSchema("object", (Map) null, (List) null, 6, (mq5) null)));
    }
}
