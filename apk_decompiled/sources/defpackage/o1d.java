package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.tool.model.PhoneCallCompletedOutputTranscriptItemSpeaker;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o1d {
    public static final /* synthetic */ int a = 0;

    static {
        PhoneCallCompletedOutputTranscriptItemSpeaker phoneCallCompletedOutputTranscriptItemSpeaker = PhoneCallCompletedOutputTranscriptItemSpeaker.CALLEE;
        u0d u0dVar = new u0d(0, phoneCallCompletedOutputTranscriptItemSpeaker, "Hello?");
        PhoneCallCompletedOutputTranscriptItemSpeaker phoneCallCompletedOutputTranscriptItemSpeaker2 = PhoneCallCompletedOutputTranscriptItemSpeaker.AGENT;
        x44.X(u0dVar, new u0d(1, phoneCallCompletedOutputTranscriptItemSpeaker2, "Hi there! I'm calling to make a dinner reservation for tonight at six PM for four people. Just so you know, I'm an AI assistant calling on behalf of Khalil, and this call may be recorded. Is that time available?"), new u0d(2, phoneCallCompletedOutputTranscriptItemSpeaker, "You're who?"), new u0d(3, phoneCallCompletedOutputTranscriptItemSpeaker2, "I'm an AI…"));
    }

    public static final void a(zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1745189783);
        int i2 = i | (e18Var2.h(zy7Var) ? 4 : 2);
        byte b = 0;
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            e18Var = e18Var2;
            trk.b(zy7Var2, fd9.q0(-2052740998, new sxa(zy7Var, 14, b), e18Var2), null, fd9.q0(-155761540, new sxa(zy7Var2, 15, b), e18Var2), trk.b, trk.c, null, 0L, 0L, 0L, 0L, null, e18Var, 1772598, 0, 16276);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v56(i, 5, zy7Var, zy7Var2);
        }
    }

    public static final void b(u0d u0dVar, boolean z, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        cpc cpcVar;
        u0d u0dVar2 = u0dVar;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1230422344);
        int i2 = i | (e18Var.f(u0dVar2) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | 384;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            int i3 = n1d.a[u0dVar2.b.ordinal()];
            if (i3 == 1) {
                e18Var.a0(1319873358);
                cpcVar = new cpc(ud0.G1, d4c.j0(R.string.phone_call_speaker_agent, e18Var));
                e18Var.p(false);
            } else {
                if (i3 != 2) {
                    throw ebh.u(e18Var, 1319872004, false);
                }
                e18Var.a0(1319876462);
                cpcVar = new cpc(ud0.E1, d4c.j0(R.string.phone_call_speaker_callee, e18Var));
                e18Var.p(false);
            }
            ud0 ud0Var = (ud0) cpcVar.E;
            String str = (String) cpcVar.F;
            ho0 ho0Var = new ho0(16.0f, true, new sz6(1));
            fqb fqbVar = fqb.E;
            iqb iqbVarJ = rkj.j(b.c(fqbVar, 1.0f), za9.E);
            cxe cxeVarA = axe.a(ho0Var, lja.P, e18Var, 6);
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
            d4c.i0(e18Var, z80Var4, iqbVarE);
            vo1 vo1Var = lja.T;
            ho0 ho0Var2 = new ho0(4.0f, true, new sz6(1));
            iqb iqbVarB = gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13).B(b.b);
            q64 q64VarA = p64.a(ho0Var2, vo1Var, e18Var, 54);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarB);
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
            cv8.b(a.a(ud0Var, e18Var), str, b.o(fqbVar, 24.0f), gm3.a(e18Var).N, e18Var, 392, 0);
            if (z) {
                e18Var.a0(-623802017);
                dw1.a(yfd.p(xn5.V(b.t(fqbVar, 1.0f).B(new hw9(1.0f, true)), xve.b(1.0f)), gm3.a(e18Var).v, zni.b), e18Var, 0);
                e18Var.p(false);
            } else {
                e18Var.a0(-623524288);
                e18Var.p(false);
            }
            e18Var.p(true);
            u0dVar2 = u0dVar;
            tjh.b(u0dVar2.c, gb9.N(new hw9(1.0f, true), MTTypesetterKt.kLineSkipLimitMultiplier, 6.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, 5), gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, 0, 0, 131064);
            e18Var = e18Var;
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new iv(u0dVar2, z, iqbVar2, i, 22);
        }
    }
}
