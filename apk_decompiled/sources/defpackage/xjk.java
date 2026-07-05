package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.e;
import androidx.health.platform.client.proto.h;
import androidx.health.platform.client.proto.u;
import androidx.health.platform.client.proto.z;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.account.VillageWeaverConsentState;
import com.anthropic.claude.api.experience.ExperienceBullet;
import com.anthropic.claude.bell.VoiceSessionSummary;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xjk {
    public static final ta4 a = new ta4(2083004687, false, new ob4(16));
    public static final ta4 b = new ta4(-873470354, false, new ob4(17));

    public static final void c(mc3 mc3Var, bz7 bz7Var, iqb iqbVar, nc3 nc3Var, ld4 ld4Var, int i) {
        nc3 nc3Var2;
        mc3Var.getClass();
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1660947480);
        int i2 = i | (e18Var.f(mc3Var) ? 4 : 2) | (e18Var.h(bz7Var) ? 32 : 16) | 3072;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = mpk.P(Boolean.FALSE);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            long j = gm3.a(e18Var).p;
            long j2 = gm3.a(e18Var).M;
            qu1 qu1VarA = sf5.a(MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).v);
            e0g e0gVar = gm3.b(e18Var).v;
            va6 va6Var = new va6(260.0f);
            if (!((Boolean) nwbVar.getValue()).booleanValue()) {
                va6Var = null;
            }
            pzg.a(b.e(b.t(iqbVar, va6Var != null ? va6Var.E : 200.0f), 76.0f), e0gVar, j, j2, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, qu1VarA, fd9.q0(-651443683, new m6(bz7Var, mc3Var, nwbVar), e18Var), e18Var, 12582912, 48);
            nc3Var2 = nc3.a;
        } else {
            e18Var.T();
            nc3Var2 = nc3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fn(mc3Var, bz7Var, iqbVar, nc3Var2, i, 15);
        }
    }

    public static final void d(List list, boolean z, bz7 bz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        list.getClass();
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(74320960);
        int i2 = i | (e18Var.f(list) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            fqb fqbVar = fqb.E;
            wd6.M(z, fqbVar, null, gp6.f(null, 3), null, fd9.q0(-252317592, new ii(list, 11, bz7Var), e18Var), e18Var, ((i2 >> 3) & 14) | 199728, 20);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new sq(i, 5, list, bz7Var, iqbVar2, z);
        }
    }

    public static final void e(ExperienceBullet experienceBullet, iqb iqbVar, ld4 ld4Var, int i) {
        experienceBullet.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-387549052);
        int i2 = (e18Var.f(experienceBullet) ? 4 : 2) | i | (e18Var.f(iqbVar) ? 32 : 16);
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            String icon = experienceBullet.getIcon();
            ud0 ud0Var = ud0.d;
            ud0 ud0VarW = v40.w(icon);
            if (icon == null || ud0VarW != null) {
                e18Var.a0(-601342498);
                e18Var.p(false);
            } else {
                e18Var.a0(-601486648);
                boolean zF = e18Var.f(icon);
                Object objN = e18Var.N();
                if (zF || objN == jd4.a) {
                    objN = new se2(i3, null, icon);
                    e18Var.k0(objN);
                }
                fd9.i(e18Var, (pz7) objN, icon);
                e18Var.p(false);
            }
            cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var, 48);
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
            if (ud0VarW != null) {
                e18Var.a0(1503832624);
                bpc bpcVarA = a.a(ud0VarW, e18Var);
                long j = gm3.a(e18Var).N;
                fqb fqbVar = fqb.E;
                cv8.b(bpcVarA, null, b.o(fqbVar, 24.0f), j, e18Var, 440, 0);
                vb7.A(fqbVar, 8.0f, e18Var, false);
            } else {
                e18Var.a0(1504095938);
                e18Var.p(false);
            }
            tjh.c(u00.h(gm3.a(e18Var).N, experienceBullet.getText()), null, gm3.a(e18Var).M, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, ((jm3) gm3.c(e18Var).e.E).e, e18Var, 0, 0, 262138);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new um5(experienceBullet, iqbVar, i, 12);
        }
    }

    public static final void f(zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, ld4 ld4Var, int i) {
        e18 e18Var;
        zy7Var.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1531150290);
        int i2 = 16;
        int i3 = i | (e18Var2.h(zy7Var) ? 4 : 2) | (e18Var2.h(zy7Var2) ? 32 : 16) | (e18Var2.h(zy7Var3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var2.Q(i3 & 1, (i3 & 147) != 146)) {
            r4g r4gVarS = gb9.S(u4g.H, null, null, zy7Var3, e18Var2, ((i3 << 3) & 7168) | 6, 6);
            e18Var = e18Var2;
            vkc.a(r4gVarS, d4c.j0(R.string.voice_consent_sheet_title, e18Var2), null, null, false, false, null, null, null, null, fd9.q0(759557711, new wd(zy7Var, r4gVarS, zy7Var2, i2), e18Var2), null, tvk.a, e18Var, 100663304, 3120, 5884);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xa0(zy7Var, zy7Var2, zy7Var3, i, 2);
        }
    }

    public static final void g(s64 s64Var, zy7 zy7Var, zy7 zy7Var2, mnc mncVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1540105464);
        if ((i & 48) == 0) {
            i2 = (e18Var.h(zy7Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(mncVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1169) != 1168)) {
            String strJ0 = d4c.j0(R.string.voice_consent_sheet_share_cta, e18Var);
            fqb fqbVar = fqb.E;
            dtj.a(strJ0, gb9.N(gb9.I(b.c(fqbVar, 1.0f), mncVar), MTTypesetterKt.kLineSkipLimitMultiplier, 48.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), false, null, e12.a, null, 0L, zy7Var, e18Var, ((i2 << 18) & 29360128) | 24576, 108);
            dtj.a(gid.p(8.0f, R.string.voice_consent_sheet_not_now, e18Var, e18Var, fqbVar), gb9.I(b.c(fqbVar, 1.0f), mncVar), false, null, f12.a, null, 0L, zy7Var2, e18Var, ((i2 << 15) & 29360128) | 24576, 108);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new p3h(s64Var, zy7Var, zy7Var2, mncVar, i, 7);
        }
    }

    public static final void h(iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(627160084);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(iqbVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            q64 q64VarA = p64.a(ko0.c, lja.T, e18Var, 48);
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
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            xn5.N(u00.D(R.drawable.voice_consent_hero, 0, e18Var), null, null, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, e18Var, 56, 124);
            fqb fqbVar = fqb.E;
            String strP = gid.p(16.0f, R.string.voice_consent_sheet_title, e18Var, e18Var, fqbVar);
            k4g k4gVar = k4g.a;
            tkh tkhVar = ((jm3) gm3.c(e18Var).e.E).f;
            long j = gm3.a(e18Var).M;
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new r2i(27);
                e18Var.k0(objN);
            }
            tjh.b(strP, tjf.b(fqbVar, false, (bz7) objN), j, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, tkhVar, e18Var, 0, 0, 130040);
            tjh.b(gid.p(8.0f, R.string.voice_consent_sheet_body, e18Var, e18Var, fqbVar), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 130042);
            e18Var = e18Var;
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new i10(iqbVar, i, 9, (byte) 0);
        }
    }

    public static ula i(qh9 qh9Var) {
        int i;
        String strM;
        String strM2;
        try {
            bh9 bh9VarS = qh9Var.s("status");
            int i2 = 0;
            if (bh9VarS != null && (strM2 = bh9VarS.m()) != null) {
                int[] iArrH = sq6.H(4);
                int length = iArrH.length;
                for (int i3 = 0; i3 < length; i3++) {
                    i = iArrH[i3];
                    if (!y6a.j(i).equals(strM2)) {
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            i = 0;
            bh9 bh9VarS2 = qh9Var.s("error_reason");
            if (bh9VarS2 != null && (strM = bh9VarS2.m()) != null) {
                int[] iArrH2 = sq6.H(4);
                int length2 = iArrH2.length;
                while (i2 < length2) {
                    int i4 = iArrH2[i2];
                    if (y6a.f(i4).equals(strM)) {
                        i2 = i4;
                    } else {
                        i2++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return new ula(i, i2);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Profiling", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Profiling", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Profiling", e3);
            return null;
        }
    }

    public static final int j(jug jugVar) {
        return System.identityHashCode(jugVar);
    }

    public static final boolean k(boolean z, VoiceSessionSummary voiceSessionSummary, boolean z2, boolean z3, VillageWeaverConsentState villageWeaverConsentState) {
        return z && !z2 && z3 && villageWeaverConsentState == null;
    }

    public static final u l(m3e m3eVar) {
        m3eVar.getClass();
        ake akeVarV = u.v();
        pl9 pl9Var = m3eVar.a;
        pl9Var.getClass();
        lg5 lg5VarS = h.s();
        String str = (String) i9e.a.get(pl9Var);
        if (str == null) {
            poc.t("Not supported yet: ", pl9Var);
            return null;
        }
        lg5VarS.b();
        h.p((h) lg5VarS.F, str);
        h hVar = (h) lg5VarS.a();
        akeVarV.b();
        u.q((u) akeVarV.F, hVar);
        z zVarL = psk.l(m3eVar.b);
        akeVarV.b();
        u.p((u) akeVarV.F, zVarL);
        Set<cg5> set = m3eVar.c;
        ArrayList arrayList = new ArrayList(x44.y(set, 10));
        for (cg5 cg5Var : set) {
            ig5 ig5VarS = e.s();
            String str2 = cg5Var.a;
            ig5VarS.b();
            e.p((e) ig5VarS.F, str2);
            arrayList.add((e) ig5VarS.a());
        }
        akeVarV.b();
        u.r((u) akeVarV.F, arrayList);
        boolean z = m3eVar.d;
        akeVarV.b();
        u.s((u) akeVarV.F, z);
        int i = m3eVar.e;
        akeVarV.b();
        u.t((u) akeVarV.F, i);
        String str3 = m3eVar.f;
        if (str3 != null) {
            akeVarV.b();
            u.u((u) akeVarV.F, str3);
        }
        return (u) akeVarV.a();
    }

    public void A(tjc tjcVar) {
        G(tjcVar);
    }

    public void B(arc arcVar) {
        G(arcVar);
    }

    public void C(aeg aegVar) {
        G(aegVar);
    }

    public void D(msg msgVar) {
        G(msgVar);
    }

    public abstract void E(edh edhVar);

    public void F(klh klhVar) {
        G(klhVar);
    }

    public void G(b5c b5cVar) {
        b5c b5cVar2 = b5cVar.b;
        while (b5cVar2 != null) {
            b5c b5cVar3 = b5cVar2.e;
            b5cVar2.a(this);
            b5cVar2 = b5cVar3;
        }
    }

    public void m(qr1 qr1Var) {
        G(qr1Var);
    }

    public void n(c02 c02Var) {
        G(c02Var);
    }

    public void o(kq3 kq3Var) {
        G(kq3Var);
    }

    public void p(p96 p96Var) {
        G(p96Var);
    }

    public void q(bm6 bm6Var) {
        G(bm6Var);
    }

    public void r(bh7 bh7Var) {
        G(bh7Var);
    }

    public void s(lf8 lf8Var) {
        G(lf8Var);
    }

    public void t(yg8 yg8Var) {
        G(yg8Var);
    }

    public void u(wp8 wp8Var) {
        G(wp8Var);
    }

    public void v(yp8 yp8Var) {
        G(yp8Var);
    }

    public void w(vv8 vv8Var) {
        G(vv8Var);
    }

    public void x(u09 u09Var) {
        G(u09Var);
    }

    public void y(l6a l6aVar) {
        G(l6aVar);
    }

    public void z(i9a i9aVar) {
        G(i9aVar);
    }
}
