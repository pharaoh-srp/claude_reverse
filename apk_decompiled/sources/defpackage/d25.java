package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.conway.WebhookRecord;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d25 {
    public static final ide a = new ide("^[!#$%&'*+.^_`|~0-9A-Za-z-]+$");

    public static final void a(WebhookRecord webhookRecord, rz7 rz7Var, zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        rz7Var.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1040288219);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var2.f(webhookRecord) : e18Var2.h(webhookRecord) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var2.f(rz7Var) : e18Var2.h(rz7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.h(zy7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 147) != 146)) {
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var2.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            Object objN2 = e18Var2.N();
            if (objN2 == lz1Var) {
                objN2 = new x40(25, nwbVar);
                e18Var2.k0(objN2);
            }
            v4g v4gVarG = iuj.G(true, (bz7) objN2, e18Var2, 54, 0);
            gnb gnbVar = new gnb(!((Boolean) nwbVar.getValue()).booleanValue(), 2);
            long j = gm3.a(e18Var2).o;
            boolean z = (i2 & 896) == 256;
            Object objN3 = e18Var2.N();
            if (z || objN3 == lz1Var) {
                objN3 = new pn(zy7Var, nwbVar, 16);
                e18Var2.k0(objN3);
            }
            e18Var = e18Var2;
            iuj.f((zy7) objN3, null, v4gVarG, MTTypesetterKt.kLineSkipLimitMultiplier, false, null, j, 0L, 0L, null, null, gnbVar, fd9.q0(-378393283, new bn(webhookRecord, rz7Var, zy7Var, nwbVar), e18Var2), e18Var, 0, 3072, 4026);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ji(webhookRecord, i, rz7Var, zy7Var, 22);
        }
    }

    public static final void b(WebhookRecord webhookRecord, boolean z, final bz7 bz7Var, final rz7 rz7Var, zy7 zy7Var, ld4 ld4Var, int i) {
        boolean z2;
        e18 e18Var;
        float f;
        nwb nwbVar;
        fqb fqbVar;
        final l45 l45Var;
        int i2;
        String str;
        nwb nwbVar2;
        hw9 hw9Var;
        boolean z3;
        nwb nwbVar3;
        bz7Var.getClass();
        rz7Var.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1812814839);
        int i3 = (i & 6) == 0 ? ((i & 8) == 0 ? e18Var2.f(webhookRecord) : e18Var2.h(webhookRecord) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= e18Var2.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= e18Var2.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? e18Var2.f(rz7Var) : e18Var2.h(rz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i3 |= e18Var2.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if (e18Var2.Q(i3 & 1, (i3 & 9363) != 9362)) {
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = fd9.O(im6.E, e18Var2);
                e18Var2.k0(objN);
            }
            l45 l45Var2 = (l45) objN;
            Context context = (Context) e18Var2.j(w00.b);
            Object objN2 = e18Var2.N();
            if (objN2 == lz1Var) {
                objN2 = mpk.P(e25.I);
                e18Var2.k0(objN2);
            }
            nwb nwbVar4 = (nwb) objN2;
            Object objN3 = e18Var2.N();
            if (objN3 == lz1Var) {
                objN3 = mpk.P("");
                e18Var2.k0(objN3);
            }
            nwb nwbVar5 = (nwb) objN3;
            Object objN4 = e18Var2.N();
            if (objN4 == lz1Var) {
                objN4 = mpk.P(null);
                e18Var2.k0(objN4);
            }
            final nwb nwbVar6 = (nwb) objN4;
            Object objN5 = e18Var2.N();
            if (objN5 == lz1Var) {
                objN5 = mpk.P(null);
                e18Var2.k0(objN5);
            }
            nwb nwbVar7 = (nwb) objN5;
            String strJ0 = d4c.j0(R.string.conway_webhook_verify_error_header, e18Var2);
            final String strJ02 = d4c.j0(R.string.conway_webhook_verify_error_generic, e18Var2);
            final String strJ03 = d4c.j0(R.string.conway_webhook_verify_error_already, e18Var2);
            fqb fqbVar2 = fqb.E;
            int i4 = i3;
            iqb iqbVarN = gb9.N(gb9.L(b.c(fqbVar2, 1.0f), 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 32.0f, 7);
            ho0 ho0Var = new ho0(20.0f, true, new sz6(1));
            vo1 vo1Var = lja.S;
            q64 q64VarA = p64.a(ho0Var, vo1Var, e18Var2, 6);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarN);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var2, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var2, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var2, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var2, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var2, z80Var4, iqbVarE);
            lz1 lz1Var2 = lz1Var;
            nwb nwbVar8 = nwbVar7;
            tjh.b(d4c.j0(R.string.conway_webhook_verify_title, e18Var2), null, gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).f, e18Var2, 0, 0, 131066);
            b25 b25Var = (b25) nwbVar6.getValue();
            e12 e12Var = e12.a;
            if (b25Var == null) {
                e18Var2.a0(1704157661);
                tjh.b(d4c.k0(R.string.conway_webhook_verify_body, new Object[]{webhookRecord.getLabel()}, e18Var2), null, gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).g, e18Var2, 0, 0, 131066);
                e18 e18Var3 = e18Var2;
                q64 q64VarA2 = p64.a(new ho0(8.0f, true, new sz6(1)), vo1Var, e18Var3, 6);
                int iHashCode2 = Long.hashCode(e18Var3.T);
                hyc hycVarL2 = e18Var3.l();
                iqb iqbVarE2 = kxk.E(e18Var3, fqbVar2);
                e18Var3.e0();
                if (e18Var3.S) {
                    e18Var3.k(re4Var);
                } else {
                    e18Var3.n0();
                }
                d4c.i0(e18Var3, z80Var, q64VarA2);
                d4c.i0(e18Var3, z80Var2, hycVarL2);
                ij0.t(iHashCode2, e18Var3, z80Var3, e18Var3, bxVar);
                d4c.i0(e18Var3, z80Var4, iqbVarE2);
                e18Var3.a0(-934169598);
                for (e25 e25Var : e25.K) {
                    boolean z4 = e25Var == ((e25) nwbVar4.getValue());
                    boolean z5 = !z;
                    boolean zD = e18Var3.d(e25Var.ordinal());
                    Object objN6 = e18Var3.N();
                    lz1 lz1Var3 = lz1Var2;
                    if (zD || objN6 == lz1Var3) {
                        nwbVar3 = nwbVar8;
                        objN6 = new yg4((Object) e25Var, nwbVar4, nwbVar3, 7);
                        e18Var3.k0(objN6);
                    } else {
                        nwbVar3 = nwbVar8;
                    }
                    nwb nwbVar9 = nwbVar4;
                    e18 e18Var4 = e18Var3;
                    c(e25Var, z4, z5, (zy7) objN6, e18Var4, 0);
                    e18Var3 = e18Var4;
                    lz1Var2 = lz1Var3;
                    nwbVar8 = nwbVar3;
                    nwbVar4 = nwbVar9;
                }
                final nwb nwbVar10 = nwbVar4;
                e18 e18Var5 = e18Var3;
                nwb nwbVar11 = nwbVar8;
                lz1 lz1Var4 = lz1Var2;
                e18Var5.p(false);
                e18Var5.p(true);
                if (((e25) nwbVar10.getValue()).H) {
                    e18Var5.a0(1704861795);
                    String str2 = (String) nwbVar5.getValue();
                    boolean z6 = !z;
                    mp9 mp9Var = new mp9(0, 0, 0, 126);
                    iqb iqbVarC = b.c(fqbVar2, 1.0f);
                    Object objN7 = e18Var5.N();
                    if (objN7 == lz1Var4) {
                        nwbVar2 = nwbVar5;
                        objN7 = new x40(27, nwbVar2);
                        e18Var5.k0(objN7);
                    } else {
                        nwbVar2 = nwbVar5;
                    }
                    nwbVar = nwbVar11;
                    f = 1.0f;
                    i2 = i4;
                    fqbVar = fqbVar2;
                    l45Var = l45Var2;
                    str = strJ0;
                    kxk.d(str2, (bz7) objN7, iqbVarC, z6, false, null, xjk.a, xjk.b, null, null, null, false, null, mp9Var, null, true, 0, 0, null, null, e18Var5, 14156208, 12779520, 0, 8224560);
                    e18Var = e18Var5;
                    e18Var.p(false);
                } else {
                    e18Var = e18Var5;
                    f = 1.0f;
                    nwbVar = nwbVar11;
                    fqbVar = fqbVar2;
                    l45Var = l45Var2;
                    i2 = i4;
                    str = strJ0;
                    nwbVar2 = nwbVar5;
                    e18Var.a0(1705429219);
                    e18Var.p(false);
                }
                String str3 = (String) nwbVar.getValue();
                if (str3 == null) {
                    e18Var.a0(1705456684);
                    e18Var.p(false);
                } else {
                    e18Var.a0(1705456685);
                    e18 e18Var6 = e18Var;
                    tjh.b(str3, null, gm3.a(e18Var).z, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var6, 0, 0, 131066);
                    e18Var = e18Var6;
                    e18Var.p(false);
                }
                iqb iqbVarC2 = b.c(fqbVar, f);
                cxe cxeVarA = axe.a(new ho0(12.0f, true, new sz6(1)), lja.P, e18Var, 6);
                int iHashCode3 = Long.hashCode(e18Var.T);
                hyc hycVarL3 = e18Var.l();
                iqb iqbVarE3 = kxk.E(e18Var, iqbVarC2);
                dd4.e.getClass();
                re4 re4Var2 = cd4.b;
                e18Var.e0();
                if (e18Var.S) {
                    e18Var.k(re4Var2);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, cd4.f, cxeVarA);
                d4c.i0(e18Var, cd4.e, hycVarL3);
                d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode3));
                d4c.h0(e18Var, cd4.h);
                d4c.i0(e18Var, cd4.d, iqbVarE3);
                String strJ04 = d4c.j0(R.string.conway_dialog_cancel, e18Var);
                boolean z7 = !z;
                if (f <= 0.0d) {
                    z29.a("invalid weight; must be greater than zero");
                }
                e18 e18Var7 = e18Var;
                dtj.a(strJ04, new hw9(f > Float.MAX_VALUE ? Float.MAX_VALUE : f, true), z7, null, f12.a, null, 0L, zy7Var, e18Var7, ((i2 << 9) & 29360128) | 24576, 104);
                String strJ05 = d4c.j0(z ? R.string.conway_webhook_verify_generating : R.string.conway_webhook_verify_generate, e18Var7);
                if (f <= 0.0d) {
                    z29.a("invalid weight; must be greater than zero");
                }
                if (f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                }
                hw9 hw9Var2 = new hw9(f, true);
                boolean zF = e18Var7.f(str) | ((i2 & 896) == 256) | e18Var7.h(l45Var) | ((i2 & 7168) == 2048 || ((i2 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 && e18Var7.h(rz7Var))) | e18Var7.f(strJ03) | e18Var7.f(strJ02);
                Object objN8 = e18Var7.N();
                if (zF || objN8 == lz1Var4) {
                    final String str4 = str;
                    final nwb nwbVar12 = nwbVar2;
                    hw9Var = hw9Var2;
                    final nwb nwbVar13 = nwbVar;
                    z3 = false;
                    zy7 zy7Var2 = new zy7() { // from class: c25
                        @Override // defpackage.zy7
                        public final Object a() {
                            nwb nwbVar14 = nwbVar13;
                            nwbVar14.setValue(null);
                            nwb nwbVar15 = nwbVar10;
                            String string = ((e25) nwbVar15.getValue()).H ? bsg.k1((String) nwbVar12.getValue()).toString() : "";
                            int length = string.length();
                            iei ieiVar = iei.a;
                            if (length > 0 && !d25.a.f(string)) {
                                nwbVar14.setValue(str4);
                                return ieiVar;
                            }
                            Boolean bool = Boolean.TRUE;
                            bz7 bz7Var2 = bz7Var;
                            bz7Var2.invoke(bool);
                            gb9.D(l45Var, null, null, new ky0(rz7Var, string, bz7Var2, nwbVar15, nwbVar6, strJ03, strJ02, nwbVar14, (tp4) null), 3);
                            return ieiVar;
                        }
                    };
                    e18Var7.k0(zy7Var2);
                    objN8 = zy7Var2;
                } else {
                    hw9Var = hw9Var2;
                    z3 = false;
                }
                e18Var2 = e18Var7;
                dtj.a(strJ05, hw9Var, z7, null, e12Var, null, 0L, (zy7) objN8, e18Var2, 24576, 104);
                e18Var2.p(true);
                e18Var2.p(z3);
                z2 = true;
            } else {
                e18Var2.a0(1707700124);
                ho0 ho0Var2 = new ho0(8.0f, true, new sz6(1));
                wo1 wo1Var = lja.Q;
                cxe cxeVarA2 = axe.a(ho0Var2, wo1Var, e18Var2, 54);
                int iHashCode4 = Long.hashCode(e18Var2.T);
                hyc hycVarL4 = e18Var2.l();
                iqb iqbVarE4 = kxk.E(e18Var2, fqbVar2);
                e18Var2.e0();
                if (e18Var2.S) {
                    e18Var2.k(re4Var);
                } else {
                    e18Var2.n0();
                }
                d4c.i0(e18Var2, z80Var, cxeVarA2);
                d4c.i0(e18Var2, z80Var2, hycVarL4);
                ij0.t(iHashCode4, e18Var2, z80Var3, e18Var2, bxVar);
                d4c.i0(e18Var2, z80Var4, iqbVarE4);
                cv8.b(a.a(ud0.M, e18Var2), null, null, gm3.a(e18Var2).a, e18Var2, 56, 4);
                tjh.b(d4c.k0(R.string.conway_webhook_verify_enabled, new Object[]{d4c.j0(((e25) nwbVar4.getValue()).F, e18Var2)}, e18Var2), null, gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).h, e18Var2, 0, 0, 131066);
                e18Var2.p(true);
                tjh.b(d4c.j0(R.string.conway_webhook_verify_copy_once, e18Var2), null, gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).g, e18Var2, 0, 0, 131066);
                iqb iqbVarP = yfd.p(xn5.V(b.c(fqbVar2, 1.0f), xve.b(8.0f)), gm3.a(e18Var2).q, zni.b);
                boolean zH = e18Var2.h(context) | e18Var2.f(b25Var);
                Object objN9 = e18Var2.N();
                if (zH || objN9 == lz1Var2) {
                    objN9 = new d44(context, 15, b25Var);
                    e18Var2.k0(objN9);
                }
                iqb iqbVarK = gb9.K(androidx.compose.foundation.b.c(iqbVarP, false, null, null, null, (zy7) objN9, 15), 12.0f, 10.0f);
                cxe cxeVarA3 = axe.a(new ho0(8.0f, true, new sz6(1)), wo1Var, e18Var2, 54);
                int iHashCode5 = Long.hashCode(e18Var2.T);
                hyc hycVarL5 = e18Var2.l();
                iqb iqbVarE5 = kxk.E(e18Var2, iqbVarK);
                e18Var2.e0();
                if (e18Var2.S) {
                    e18Var2.k(re4Var);
                } else {
                    e18Var2.n0();
                }
                d4c.i0(e18Var2, z80Var, cxeVarA3);
                d4c.i0(e18Var2, z80Var2, hycVarL5);
                ij0.t(iHashCode5, e18Var2, z80Var3, e18Var2, bxVar);
                d4c.i0(e18Var2, z80Var4, iqbVarE5);
                tjh.b(b25Var.a, new hw9(1.0f, true), gm3.a(e18Var2).M, 0L, null, null, xt7.H, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 0, 0, 130936);
                cv8.b(a.a(ud0.Y, e18Var2), d4c.j0(R.string.conway_webhook_verify_copy_secret, e18Var2), b.o(fqbVar2, 16.0f), gm3.a(e18Var2).N, e18Var2, 392, 0);
                e18Var2.p(true);
                tjh.b(d4c.k0(((e25) nwbVar4.getValue()).G, new Object[]{b25Var.b}, e18Var2), null, gm3.a(e18Var2).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 0, 0, 131066);
                tjh.b(d4c.j0(R.string.conway_webhook_verify_lose_warning, e18Var2), null, gm3.a(e18Var2).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 0, 0, 131066);
                e18Var2 = e18Var2;
                dtj.a(d4c.j0(R.string.conway_dialog_done, e18Var2), b.c(fqbVar2, 1.0f), false, null, e12Var, null, 0L, zy7Var, e18Var2, ((i4 << 9) & 29360128) | 24624, 108);
                e18Var2.p(false);
                z2 = true;
            }
            e18Var2.p(z2);
        } else {
            e18Var2.T();
        }
        r7e r7eVarS = e18Var2.s();
        if (r7eVarS != null) {
            r7eVarS.d = new k04(webhookRecord, z, bz7Var, rz7Var, zy7Var, i, 3);
        }
    }

    public static final void c(e25 e25Var, boolean z, boolean z2, zy7 zy7Var, ld4 ld4Var, int i) {
        long j;
        long j2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1884663119);
        int i2 = i | (e18Var.d(e25Var.ordinal()) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | (e18Var.g(z2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            fqb fqbVar = fqb.E;
            iqb iqbVarV = xn5.V(b.c(fqbVar, 1.0f), xve.b(8.0f));
            if (z) {
                e18Var.a0(1314952924);
                j = gm3.a(e18Var).a;
            } else {
                e18Var.a0(1314954074);
                j = gm3.a(e18Var).v;
            }
            e18Var.p(false);
            iqb iqbVarT = ez1.t(iqbVarV, 1.0f, j, xve.b(8.0f));
            if (z) {
                e18Var.a0(1314958358);
                j2 = gm3.a(e18Var).p;
            } else {
                e18Var.a0(1314959318);
                j2 = gm3.a(e18Var).o;
            }
            e18Var.p(false);
            iqb iqbVarJ = gb9.J(androidx.compose.foundation.b.c(yfd.p(iqbVarT, j2, zni.b), z2, null, null, null, zy7Var, 14), 12.0f);
            cxe cxeVarA = axe.a(new ho0(12.0f, true, new sz6(1)), lja.P, e18Var, 54);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarJ);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, cxeVarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            hw9 hw9VarN = kgh.n(e18Var, iqbVarE, z80Var4, 1.0f, true);
            q64 q64VarA = p64.a(new ho0(2.0f, true, new sz6(1)), lja.S, e18Var, 6);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, hw9VarN);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, q64VarA);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            tjh.b(d4c.j0(e25Var.F, e18Var), null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).h, e18Var, 0, 0, 131066);
            tjh.b(d4c.k0(e25Var.G, new Object[]{"X-Webhook-Secret"}, e18Var), null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131066);
            e18Var = e18Var;
            e18Var.p(true);
            if (z) {
                e18Var.a0(-608089772);
                cv8.b(a.a(ud0.M, e18Var), null, b.o(fqbVar, 18.0f), gm3.a(e18Var).a, e18Var, 440, 0);
                e18Var.p(false);
            } else {
                e18Var.a0(-607863627);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new q32(e25Var, z, z2, zy7Var, i, 4);
        }
    }
}
