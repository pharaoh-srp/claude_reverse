package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.tool.model.MobileAppToolPreviewInfo;
import com.pvporbit.freetype.FreeTypeConstants;
import java.time.OffsetDateTime;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kmb {
    static {
        OffsetDateTime.parse("2025-11-15T10:00:00Z").getClass();
    }

    public static final void a(int i, int i2, ld4 ld4Var, zy7 zy7Var, boolean z) {
        e18 e18Var;
        long j;
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1025333564);
        int i3 = i2 | (e18Var2.d(i) ? 4 : 2) | (e18Var2.g(z) ? 32 : 16) | (e18Var2.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var2.Q(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z2 = i == 0;
            fqb fqbVar = fqb.E;
            iqb iqbVarL = gb9.L(b.c(fqbVar, 1.0f), 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarL);
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
            kxk.g(e18Var2, b.e(fqbVar, 16.0f));
            ta4 ta4Var = z ? spk.a : null;
            qnc qncVar = new qnc(16.0f, 12.0f, 16.0f, 12.0f);
            iqb iqbVarP = yfd.p(b.c(fqbVar, 1.0f), gm3.a(e18Var2).p, gm3.b(e18Var2).c);
            if (z2) {
                e18Var2.a0(395556251);
                j = gm3.a(e18Var2).y;
            } else {
                e18Var2.a0(395557339);
                j = gm3.a(e18Var2).u;
            }
            e18Var2.p(false);
            ybi.b(null, spk.b, androidx.compose.foundation.b.c(ez1.t(iqbVarP, MTTypesetterKt.kLineSkipLimitMultiplier, j, gm3.b(e18Var2).c), z, null, null, null, zy7Var, 14), fd9.q0(-1743130324, new jmb(z, i, z2), e18Var2), ta4Var, 0L, qncVar, MTTypesetterKt.kLineSkipLimitMultiplier, null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, false, null, null, e18Var2, 1575990, 0, 16288);
            e18Var = e18Var2;
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lw0(i, i2, 4, zy7Var, z);
        }
    }

    public static final void b(MobileAppToolPreviewInfo mobileAppToolPreviewInfo, float f, ld4 ld4Var, int i) {
        int i2;
        mobileAppToolPreviewInfo.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1447810140);
        int i3 = i | (e18Var.f(mobileAppToolPreviewInfo) ? 4 : 2);
        if ((i & 48) == 0) {
            i3 |= e18Var.c(f) ? 32 : 16;
        }
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            fqb fqbVar = fqb.E;
            iqb iqbVarL = gb9.L(b.c(fqbVar, 1.0f), f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            vo1 vo1Var = lja.S;
            eo0 eo0Var = ko0.c;
            q64 q64VarA = p64.a(eo0Var, vo1Var, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarL);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            tjh.b(d4c.j0(R.string.tool_access_request, e18Var), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131066);
            kxk.g(e18Var, b.e(fqbVar, 8.0f));
            iqb iqbVarK = gb9.K(yfd.p(ez1.t(b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).u, gm3.b(e18Var).c), gm3.a(e18Var).p, gm3.b(e18Var).c), 8.0f, 16.0f);
            cxe cxeVarA = axe.a(ko0.a, lja.P, e18Var, 0);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarK);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, cxeVarA);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            wtk.c(null, d54.g, 0L, null, 48.0f, fd9.q0(1348472125, new vk1(mobileAppToolPreviewInfo, 1), e18Var), e18Var, 224304, 5);
            hw9 hw9Var = new hw9(1.0f, true);
            q64 q64VarA2 = p64.a(eo0Var, vo1Var, e18Var, 0);
            int iHashCode3 = Long.hashCode(e18Var.T);
            hyc hycVarL3 = e18Var.l();
            iqb iqbVarE3 = kxk.E(e18Var, hw9Var);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, q64VarA2);
            d4c.i0(e18Var, z80Var2, hycVarL3);
            ij0.t(iHashCode3, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE3);
            i2 = 0;
            tjh.b(mobileAppToolPreviewInfo.getToolLabel(), b.c(fqbVar, 1.0f), 0L, 0L, null, dv7.K, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).e, e18Var, 1572912, 0, 131004);
            kxk.g(e18Var, b.e(fqbVar, 4.0f));
            tjh.b(mobileAppToolPreviewInfo.getToolDescription(), b.c(fqbVar, 1.0f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 48, 0, 131068);
            e18Var = e18Var;
            ij0.w(e18Var, true, true, true);
        } else {
            i2 = 0;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new imb(mobileAppToolPreviewInfo, f, i, i2);
        }
    }
}
