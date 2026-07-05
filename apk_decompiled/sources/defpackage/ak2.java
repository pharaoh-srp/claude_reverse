package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.tool.model.ChartDisplayV0Input;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class ak2 extends dxh {
    public final String e;
    public final String f;
    public final ewh g;

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 ewh, still in use, count: 2, list:
          (r2v3 ewh) from 0x039e: MOVE (r41v1 ewh) = (r2v3 ewh)
          (r2v3 ewh) from 0x01fa: MOVE (r41v4 ewh) = (r2v3 ewh)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public ak2(com.anthropic.claude.models.organization.configtypes.ChartDisplayInputDescriptions r39, java.lang.String r40, defpackage.mwh r41) {
        /*
            Method dump skipped, instruction units count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak2.<init>(com.anthropic.claude.models.organization.configtypes.ChartDisplayInputDescriptions, java.lang.String, mwh):void");
    }

    @Override // defpackage.dxh
    public final void c(String str, String str2, boolean z, dlb dlbVar, lvh lvhVar, boolean z2, boolean z3, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        boolean z4;
        ebh.B(str, str2, dlbVar, lvhVar, iqbVar);
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(984322284);
        if ((i & 3072) == 0) {
            i2 = ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? e18Var.f(dlbVar) : e18Var.h(dlbVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | i;
        } else {
            i2 = i;
        }
        if ((196608 & i) == 0) {
            z4 = z2;
            i2 |= e18Var.g(z4) ? 131072 : 65536;
        } else {
            z4 = z2;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var.g(z3) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= e18Var.f(iqbVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= (134217728 & i) == 0 ? e18Var.f(this) : e18Var.h(this) ? 67108864 : 33554432;
        }
        if (!e18Var.Q(i2 & 1, (38339585 & i2) != 38339584)) {
            e18Var.T();
        } else if (z3) {
            e18Var.a0(-2091117275);
            c0l c0lVar = c0l.I;
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new ll1(10);
                e18Var.k0(objN);
            }
            auk.b(c0lVar, R.drawable.phosphor_puzzle_piece, z4, true, (zy7) objN, iqbVar, false, 0L, false, null, null, e18Var, ((i2 >> 9) & 896) | 1600518 | ((i2 >> 6) & 458752), 6, 896);
            e18Var = e18Var;
            e18Var.p(false);
        } else {
            e18Var.a0(-2090773640);
            pj2.b((ChartDisplayV0Input) dlbVar.a(), iqbVar, null, null, null, false, e18Var, (i2 >> 18) & 112);
            e18Var.p(false);
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ss(this, str, str2, z, dlbVar, lvhVar, z2, z3, iqbVar, i, 7);
        }
    }

    @Override // defpackage.dxh
    public final fwh n() {
        return this.g;
    }

    @Override // defpackage.dxh
    public final vwh o() {
        return new uwh(false);
    }

    @Override // defpackage.dxh
    public final int p() {
        return R.drawable.phosphor_puzzle_piece;
    }

    @Override // defpackage.dxh
    public final String r() {
        return this.f;
    }

    @Override // defpackage.dxh
    public final String s() {
        return this.e;
    }
}
