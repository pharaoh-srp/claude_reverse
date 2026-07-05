package defpackage;

import android.view.ViewConfiguration;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.chat.messages.BellNoteDelta;
import com.anthropic.claude.api.chat.messages.CitationEndDelta;
import com.anthropic.claude.api.chat.messages.CitationStartDelta;
import com.anthropic.claude.api.chat.messages.ContentBlockDelta;
import com.anthropic.claude.api.chat.messages.FlagDelta;
import com.anthropic.claude.api.chat.messages.InputJsonDelta;
import com.anthropic.claude.api.chat.messages.TextDelta;
import com.anthropic.claude.api.chat.messages.ThinkingDelta;
import com.anthropic.claude.api.chat.messages.ThinkingSummaryDelta;
import com.anthropic.claude.api.chat.messages.ToolUseBlockUpdateDelta;
import com.anthropic.claude.api.chat.messages.VoiceNoteDelta;
import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mqk implements qff {
    public static final ta4 E = new ta4(-76656245, false, new tb4(19));

    public static final void a(String str, boolean z, zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-2112932982);
        int i2 = 2;
        int i3 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.g(z) ? 32 : 16) | (e18Var2.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        int i4 = 1;
        if (e18Var2.Q(i3 & 1, (i3 & 1171) != 1170)) {
            e18Var = e18Var2;
            trk.b(zy7Var, fd9.q0(-838230483, new mu2(z, zy7Var2, i4), e18Var2), null, fd9.q0(319301807, new mu2(zy7Var, z, i2), e18Var2), fd9.q0(1476834097, new yi7(str, 17), e18Var2), kpk.f, null, 0L, 0L, 0L, 0L, null, e18Var, 1772598, 0, 16276);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new sq(i, 10, str, zy7Var, zy7Var2, z);
        }
    }

    public static final void b(String str, jz0 jz0Var, boolean z, boolean z2, zy7 zy7Var, zy7 zy7Var2, zy7 zy7Var3, iqb iqbVar, ld4 ld4Var, int i) {
        re4 re4Var;
        z80 z80Var;
        z80 z80Var2;
        z80 z80Var3;
        bx bxVar;
        boolean z3;
        z80 z80Var4;
        boolean z4;
        fqb fqbVar;
        nw1 nw1Var;
        nw1 nw1Var2;
        fqb fqbVar2;
        boolean z5;
        zy7 zy7Var4 = zy7Var3;
        xo1 xo1Var = lja.K;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2055759614);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.f(jz0Var) ? 32 : 16) | (e18Var.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.g(z2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.h(zy7Var2) ? 131072 : 65536) | (e18Var.h(zy7Var4) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var.f(iqbVar) ? 8388608 : 4194304);
        byte b = 0;
        if (e18Var.Q(i2 & 1, (i2 & 4793491) != 4793490)) {
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVar);
            dd4.e.getClass();
            re4 re4Var2 = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var2);
            } else {
                e18Var.n0();
            }
            z80 z80Var5 = cd4.f;
            d4c.i0(e18Var, z80Var5, o5bVarD);
            z80 z80Var6 = cd4.e;
            d4c.i0(e18Var, z80Var6, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var7 = cd4.g;
            d4c.i0(e18Var, z80Var7, numValueOf);
            bx bxVar2 = cd4.h;
            d4c.h0(e18Var, bxVar2);
            z80 z80Var8 = cd4.d;
            d4c.i0(e18Var, z80Var8, iqbVarE);
            fqb fqbVar3 = fqb.E;
            nw1 nw1Var3 = nw1.a;
            if (jz0Var != null) {
                e18Var.a0(1127245139);
                iqb iqbVarM = gb9.M(mpk.b0(b.c, mpk.Y(e18Var), true), 20.0f, 16.0f, 20.0f, 72.0f);
                q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
                int iHashCode2 = Long.hashCode(e18Var.T);
                hyc hycVarL2 = e18Var.l();
                iqb iqbVarE2 = kxk.E(e18Var, iqbVarM);
                e18Var.e0();
                if (e18Var.S) {
                    e18Var.k(re4Var2);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, z80Var5, q64VarA);
                d4c.i0(e18Var, z80Var6, hycVarL2);
                ij0.t(iHashCode2, e18Var, z80Var7, e18Var, bxVar2);
                d4c.i0(e18Var, z80Var8, iqbVarE2);
                if (str == null || str.length() == 0) {
                    re4Var = re4Var2;
                    z80Var = z80Var8;
                    z80Var2 = z80Var6;
                    z80Var3 = z80Var5;
                    bxVar = bxVar2;
                    z80Var4 = z80Var7;
                    nw1Var2 = nw1Var3;
                    fqbVar2 = fqbVar3;
                    z5 = false;
                    e18Var.a0(157462348);
                    e18Var.p(false);
                } else {
                    e18Var.a0(157167600);
                    z80Var3 = z80Var5;
                    bxVar = bxVar2;
                    z80Var2 = z80Var6;
                    z80Var4 = z80Var7;
                    nw1Var2 = nw1Var3;
                    fqbVar2 = fqbVar3;
                    re4Var = re4Var2;
                    z80Var = z80Var8;
                    tjh.b(str, gb9.N(fqbVar3, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 7), gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, (i2 & 14) | 48, 0, 131064);
                    e18Var = e18Var;
                    z5 = false;
                    e18Var.p(false);
                }
                jlk.f(jz0Var, null, ((jm3) gm3.c(e18Var).e.E).e, null, null, null, null, e18Var, (i2 >> 3) & 14, 250);
                z3 = true;
                e18Var.p(true);
                e18Var.p(z5);
                zy7Var4 = zy7Var3;
                z4 = z5;
                fqbVar = fqbVar2;
                nw1Var = nw1Var2;
            } else {
                re4Var = re4Var2;
                z80Var = z80Var8;
                z80Var2 = z80Var6;
                z80Var3 = z80Var5;
                bxVar = bxVar2;
                z3 = true;
                z80Var4 = z80Var7;
                if (z) {
                    e18Var.a0(1128134064);
                    zy7Var4 = zy7Var3;
                    fqbVar = fqbVar3;
                    nw1Var = nw1Var3;
                    z4 = false;
                    pvj.c(kpk.a, fd9.q0(1374134469, new sxa(zy7Var4, 5, b), e18Var), nw1Var.a(fqbVar, xo1Var), 0L, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var, 54, 24);
                    e18Var.p(false);
                } else {
                    zy7Var4 = zy7Var3;
                    z4 = false;
                    fqbVar = fqbVar3;
                    nw1Var = nw1Var3;
                    e18Var.a0(1128896013);
                    ez1.a(nw1Var.a(fqbVar, xo1Var), vf2.J, gm3.a(e18Var).O, e18Var, 48, 0);
                    e18Var = e18Var;
                    e18Var.p(false);
                }
            }
            if (jz0Var != null) {
                e18Var.a0(1129198790);
                wo1 wo1Var = lja.Q;
                iqb iqbVarL = gb9.L(yfd.p(b.c(nw1Var.a(fqbVar, lja.N), 1.0f), gm3.a(e18Var).o, zni.b), 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                cxe cxeVarA = axe.a(ko0.g, wo1Var, e18Var, 54);
                int iHashCode3 = Long.hashCode(e18Var.T);
                hyc hycVarL3 = e18Var.l();
                iqb iqbVarE3 = kxk.E(e18Var, iqbVarL);
                e18Var.e0();
                if (e18Var.S) {
                    e18Var.k(re4Var);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, z80Var3, cxeVarA);
                d4c.i0(e18Var, z80Var2, hycVarL3);
                ij0.t(iHashCode3, e18Var, z80Var4, e18Var, bxVar);
                d4c.i0(e18Var, z80Var, iqbVarE3);
                ez1.e(zy7Var, null, !z2, null, null, kpk.c, e18Var, 1572870, 58);
                qnc qncVar = q02.a;
                e18 e18Var2 = e18Var;
                lnk.d(zy7Var2, null, false, null, q02.d(0L, gm3.a(e18Var).N, 0L, e18Var, 13), null, null, kpk.d, e18Var2, ((i2 >> 15) & 14) | 805306368, 494);
                e18Var = e18Var2;
                e18Var.p(z3);
                e18Var.p(z4);
            } else {
                e18Var.a0(1130211994);
                e18Var.p(z4);
            }
            e18Var.p(z3);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new er0(str, jz0Var, z, z2, zy7Var, zy7Var2, zy7Var4, iqbVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.lang.String r27, defpackage.zy7 r28, defpackage.zy7 r29, defpackage.bz7 r30, defpackage.iqb r31, defpackage.lbb r32, defpackage.obb r33, defpackage.qi3 r34, defpackage.ze0 r35, defpackage.ld4 r36, int r37) {
        /*
            Method dump skipped, instruction units count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqk.c(java.lang.String, zy7, zy7, bz7, iqb, lbb, obb, qi3, ze0, ld4, int):void");
    }

    public static String d(ContentBlockDelta contentBlockDelta) {
        contentBlockDelta.getClass();
        if (contentBlockDelta instanceof TextDelta) {
            return "text_delta";
        }
        if (contentBlockDelta instanceof CitationStartDelta) {
            return "citation_start_delta";
        }
        if (contentBlockDelta instanceof CitationEndDelta) {
            return "citation_end_delta";
        }
        if (contentBlockDelta instanceof InputJsonDelta) {
            return "input_json_delta";
        }
        if (contentBlockDelta instanceof ThinkingDelta) {
            return "thinking_delta";
        }
        if (contentBlockDelta instanceof ThinkingSummaryDelta) {
            return "thinking_summary_delta";
        }
        if (contentBlockDelta instanceof ToolUseBlockUpdateDelta) {
            return "tool_use_block_update_delta";
        }
        if (contentBlockDelta instanceof VoiceNoteDelta) {
            return "voice_note_delta";
        }
        if (contentBlockDelta instanceof BellNoteDelta) {
            return "bell_delta";
        }
        if (contentBlockDelta instanceof FlagDelta) {
            return "flag_delta";
        }
        if (contentBlockDelta instanceof qei) {
            String str = ((qei) contentBlockDelta).a;
            return str == null ? "null" : str;
        }
        wg6.i();
        return null;
    }

    public static dpe e(qh9 qh9Var) {
        try {
            return new dpe(qh9Var.s("duration").k(), qh9Var.s("start").k());
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Redirect", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Redirect", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Redirect", e3);
            return null;
        }
    }

    public static final blh f(blh blhVar, blh blhVar2) {
        String str = blhVar2.c;
        boolean z = blhVar.g;
        String str2 = blhVar.b;
        String str3 = blhVar.c;
        int i = blhVar.a;
        afh afhVar = blhVar.h;
        if (z) {
            boolean z2 = blhVar2.g;
            String str4 = blhVar2.b;
            int i2 = blhVar2.a;
            if (z2) {
                long j = blhVar2.f;
                long j2 = blhVar.f;
                if (j >= j2 && j - j2 < 5000 && !x44.r(str3, "\n") && !x44.r(str3, "\r\n") && !x44.r(str, "\n") && !x44.r(str, "\r\n") && afhVar == blhVar2.h) {
                    if (afhVar == afh.E && str3.length() + i == i2) {
                        return new blh(blhVar.a, "", kgh.o(str3, str), blhVar.d, blhVar2.e, blhVar.f, false, 64);
                    }
                    if (afhVar == afh.F && blhVar.a() == blhVar2.a() && (blhVar.a() == teh.E || blhVar.a() == teh.F)) {
                        if (i == str4.length() + i2) {
                            return new blh(blhVar2.a, kgh.o(str4, str2), "", blhVar.d, blhVar2.e, blhVar.f, false, 64);
                        }
                        int i3 = blhVar.a;
                        if (i3 == i2) {
                            return new blh(i3, kgh.o(str2, str4), "", blhVar.d, blhVar2.e, blhVar.f, false, 64);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final poj h(z9f z9fVar) {
        return new poj(ViewConfiguration.get(eve.Q(z9fVar).getContext()));
    }

    public static final void j(cbf cbfVar, efh efhVar, efh efhVar2, nyj nyjVar, boolean z) {
        wwb wwbVar = (wwb) nyjVar.F;
        int i = wwbVar.G;
        if (i > 1) {
            cbfVar.k(new blh(0, efhVar.G.toString(), efhVar2.G.toString(), efhVar.H, efhVar2.H, 0L, false, 32));
            return;
        }
        if (i == 1) {
            eh2 eh2Var = (eh2) wwbVar.E[0];
            long jM = mwa.m(eh2Var.c, eh2Var.d);
            eh2 eh2Var2 = (eh2) ((wwb) nyjVar.F).E[0];
            long jM2 = mwa.m(eh2Var2.d(), eh2Var2.c());
            if (kkh.d(jM) && kkh.d(jM2)) {
                return;
            }
            cbfVar.k(new blh(kkh.g(jM), mwa.O(jM, efhVar), mwa.O(jM2, efhVar2), efhVar.H, efhVar2.H, 0L, z, 32));
        }
    }

    public static boolean m(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public abstract int g(int i);

    public abstract int i(int i);

    @Override // defpackage.qff
    public int k(int i) {
        int iG = g(i);
        if (iG == -1 || g(iG) == -1) {
            return -1;
        }
        return iG;
    }

    @Override // defpackage.qff
    public int l(int i) {
        int i2 = i(i);
        if (i2 == -1 || i(i2) == -1) {
            return -1;
        }
        return i2;
    }

    @Override // defpackage.qff
    public int p(int i) {
        return i(i);
    }

    @Override // defpackage.qff
    public int q(int i) {
        return g(i);
    }
}
