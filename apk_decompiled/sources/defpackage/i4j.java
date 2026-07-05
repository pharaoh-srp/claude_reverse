package defpackage;

import androidx.compose.foundation.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceActivationMode;
import com.anthropic.claude.bell.VoiceSessionSummary;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.OrganizationId;
import com.anthropic.claude.types.strings.VoiceSessionId;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i4j {
    static {
        new VoiceSessionSummary(OrganizationId.m1066constructorimpl("org-preview"), ChatId.m979constructorimpl("chat-preview"), VoiceSessionId.m1165constructorimpl("session-preview"), 143000L, 5L, "BuiltinMic", "BuiltinSpeaker", VoiceEvents$VoiceActivationMode.HANDS_FREE, (Long) null, (Long) null, 768, (mq5) null);
    }

    public static final void a(ud0 ud0Var, String str, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        str.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(303125701);
        int i2 = i | (e18Var.f(ud0Var) ? 4 : 2) | (e18Var.f(str) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            xo1 xo1Var = lja.K;
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(xn5.V(androidx.compose.foundation.layout.b.q(fqbVar, 36.0f, 32.0f), xve.a), false, null, null, null, zy7Var, 15);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarC);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            ud0 ud0Var2 = ud0.d;
            iv1.b(ud0Var, str, null, ef2.H, 0L, e18Var, (i2 & 112) | 3072 | (i2 & 14), 20);
            e18Var.p(true);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v3e((Object) ud0Var, str, (Object) zy7Var, iqbVar2, i, 16);
        }
    }

    public static final void b(VoiceSessionSummary voiceSessionSummary, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        zy7 zy7Var4;
        e18 e18Var;
        zy7Var.getClass();
        zy7Var2.getClass();
        zy7Var3.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(2080246731);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var2.f(voiceSessionSummary) : e18Var2.h(voiceSessionSummary) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            zy7Var4 = zy7Var;
            i2 |= e18Var2.h(zy7Var4) ? 32 : 16;
        } else {
            zy7Var4 = zy7Var;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var2.h(zy7Var3) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var2.f(iqbVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z = (i2 & 7168) == 2048;
            Object objN = e18Var2.N();
            if (z || objN == jd4.a) {
                objN = new rd2(zy7Var3, null, 3);
                e18Var2.k0(objN);
            }
            j5j j5jVar = VoiceSessionSummary.Companion;
            fd9.i(e18Var2, (pz7) objN, voiceSessionSummary);
            e18Var = e18Var2;
            pzg.a(androidx.compose.foundation.layout.b.g(iqbVar, 56.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), gm3.b(e18Var2).g, gm3.a(e18Var2).n, gm3.a(e18Var2).M, MTTypesetterKt.kLineSkipLimitMultiplier, 2.0f, sf5.a(0.5f, gm3.a(e18Var2).u), fd9.q0(850006694, new v3e(voiceSessionSummary, zy7Var3, zy7Var4, zy7Var2, 17), e18Var2), e18Var, 12779520, 16);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new t9h(voiceSessionSummary, zy7Var, zy7Var2, zy7Var3, iqbVar, i, 4);
        }
    }
}
