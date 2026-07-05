package defpackage;

import com.anthropic.claude.agentchat.AgentChatDestination;
import com.anthropic.claude.configs.flags.AgentChatOnboardingConfig;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ek {
    public static final void a(ml3 ml3Var, zy7 zy7Var, bz7 bz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1446882644);
        int i2 = 2;
        int i3 = 4;
        int i4 = i | (e18Var.f(ml3Var) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        if (e18Var.Q(i4 & 1, (i4 & 1171) != 1170)) {
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new b5(i3);
                e18Var.k0(objN);
            }
            kce kceVar = jce.a;
            rwe rweVarP = eve.P(kceVar.b(AgentChatDestination.class), oq5.B(kceVar.b(AgentChatDestination.class)), true, iv1.M(kceVar.b(AgentChatDestination.class)), (zy7) objN, e18Var);
            e18Var = e18Var;
            fu5 fu5VarQ = csg.q(rweVarP, e18Var, 384);
            ta4 ta4VarQ0 = fd9.q0(1440332988, new wd((Object) ml3Var, (Object) zy7Var, bz7Var, i2), e18Var);
            fqb fqbVar = fqb.E;
            mwa.l(rweVarP, fqbVar, fu5VarQ, ta4VarQ0, e18Var, 3120, 0);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ck(ml3Var, zy7Var, bz7Var, iqbVar2, i, 0);
        }
    }

    public static final void b(ml3 ml3Var, zy7 zy7Var, bz7 bz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        String desktop_download_url;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(338729776);
        int i2 = i | (e18Var.f(ml3Var) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        int i3 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            m7f m7fVar = (m7f) e18Var.j(gr9.b);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = (sl) m7fVar.a(jce.a.b(sl.class), null, null);
                e18Var.k0(objN);
            }
            sl slVar = (sl) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = (q7) m7fVar.a(jce.a.b(q7.class), null, null);
                e18Var.k0(objN2);
            }
            q7 q7Var = (q7) objN2;
            Object objN3 = e18Var.N();
            if (objN3 == lz1Var) {
                objN3 = (qzb) m7fVar.a(jce.a.b(qzb.class), null, null);
                e18Var.k0(objN3);
            }
            qzb qzbVar = (qzb) objN3;
            Object objN4 = e18Var.N();
            if (objN4 == lz1Var) {
                objN4 = (qi3) m7fVar.a(jce.a.b(qi3.class), null, null);
                e18Var.k0(objN4);
            }
            qi3 qi3Var = (qi3) objN4;
            Object[] objArr = new Object[0];
            Object objN5 = e18Var.N();
            if (objN5 == lz1Var) {
                objN5 = new b5(5);
                e18Var.k0(objN5);
            }
            nwb nwbVar = (nwb) iuj.I(objArr, (zy7) objN5, e18Var, 48);
            boolean zB = qzbVar.b();
            boolean zBooleanValue = ((Boolean) qzbVar.k.getValue()).booleanValue();
            iei ieiVar = iei.a;
            if (!zBooleanValue || zB) {
                e18Var.a0(-2072426606);
                e18Var.p(false);
            } else {
                e18Var.a0(-2072494837);
                boolean zH = e18Var.h(slVar);
                Object objN6 = e18Var.N();
                if (zH || objN6 == lz1Var) {
                    objN6 = new dk(slVar, null, i3);
                    e18Var.k0(objN6);
                }
                fd9.i(e18Var, (pz7) objN6, ieiVar);
                e18Var.p(false);
            }
            boolean zH2 = e18Var.h(slVar) | e18Var.f(nwbVar);
            Object objN7 = e18Var.N();
            if (zH2 || objN7 == lz1Var) {
                objN7 = new m0(slVar, nwbVar, null, 6);
                e18Var.k0(objN7);
            }
            fd9.i(e18Var, (pz7) objN7, ieiVar);
            boolean z = (zB || ((vm) slVar).f() == null) ? false : true;
            if (!z && ((Boolean) nwbVar.getValue()) == null) {
                e18Var.a0(-898116637);
                kzj.a(0, e18Var);
                e18Var.p(false);
            } else if (z || !x44.r((Boolean) nwbVar.getValue(), Boolean.TRUE)) {
                e18Var.a0(-898097392);
                int i4 = ml3.f;
                cok.b(ml3Var, zy7Var, bz7Var, null, null, null, e18Var, i2 & 8190);
                e18Var.p(false);
            } else {
                e18Var.a0(-898113938);
                String strM105getEmail_addressZiuLfiY = q7Var.b() ? q7Var.a().m105getEmail_addressZiuLfiY() : "";
                AgentChatOnboardingConfig agentChatOnboardingConfig = (AgentChatOnboardingConfig) qzbVar.a.f(AgentChatOnboardingConfig.CONFIG_NAME, AgentChatOnboardingConfig.Companion.serializer()).getValue();
                if (agentChatOnboardingConfig == null || (desktop_download_url = agentChatOnboardingConfig.getDesktop_download_url()) == null) {
                    desktop_download_url = AgentChatOnboardingConfig.DEFAULT_DESKTOP_DOWNLOAD_URL;
                }
                boolean zH3 = e18Var.h(slVar) | e18Var.f(nwbVar);
                Object objN8 = e18Var.N();
                if (zH3 || objN8 == lz1Var) {
                    objN8 = new k6(slVar, 3, nwbVar);
                    e18Var.k0(objN8);
                }
                int i5 = ml3.f;
                il.a(ml3Var, slVar, qi3Var, strM105getEmail_addressZiuLfiY, desktop_download_url, (zy7) objN8, e18Var, 1572864 | (i2 & 14));
                e18Var.p(false);
            }
            iqbVar2 = fqb.E;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ck(ml3Var, zy7Var, bz7Var, iqbVar2, i, 1);
        }
    }
}
