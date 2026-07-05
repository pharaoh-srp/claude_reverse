package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.sessions.types.CodeAgent;
import com.anthropic.claude.types.strings.CodeAgentId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mok {
    public static final ta4 a = new ta4(-1047393273, false, new sb4(20));
    public static final ta4 b = new ta4(-1353027802, false, new sb4(21));

    public static final void a(CodeAgent codeAgent, boolean z, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        ta4 ta4VarQ0;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1038688290);
        int i2 = 2;
        int i3 = i | (e18Var2.h(codeAgent) ? 4 : 2) | (e18Var2.g(z) ? 32 : 16) | (e18Var2.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        int i4 = 0;
        if (e18Var2.Q(i3 & 1, (i3 & 1171) != 1170)) {
            String description = codeAgent.getDescription();
            if (description == null || description.length() <= 0) {
                description = null;
            }
            if (description == null) {
                e18Var2.a0(1676742283);
                String slack_alias = codeAgent.getSlack_alias();
                if (slack_alias == null) {
                    e18Var2.a0(1676742282);
                    e18Var2.p(false);
                    description = null;
                } else {
                    e18Var2.a0(1676742283);
                    description = d4c.k0(R.string.code_agent_slack_alias, new Object[]{slack_alias.length() == 0 ? "@Claude" : "@Claude ".concat(slack_alias)}, e18Var2);
                    e18Var2.p(false);
                }
                e18Var2.p(false);
            } else {
                e18Var2.a0(-1747029213);
                e18Var2.p(false);
            }
            if (description == null) {
                e18Var2.a0(1677528287);
                e18Var2.p(false);
                ta4VarQ0 = null;
            } else {
                e18Var2.a0(1677528288);
                ta4VarQ0 = fd9.q0(1411344386, new rq(description, i4), e18Var2);
                e18Var2.p(false);
            }
            ta4 ta4Var = z ? ttj.d : null;
            vue vueVar = new vue(3);
            fqb fqbVar = fqb.E;
            e18Var = e18Var2;
            ybi.b(ttj.e, fd9.q0(-2087896618, new fp(i2, codeAgent), e18Var2), j8.e0(fqbVar, z, false, vueVar, zy7Var, 10), ta4VarQ0, ta4Var, 0L, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, false, null, null, e18Var, 54, 0, 16352);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new sq(i, 0, codeAgent, zy7Var, iqbVar2, z);
        }
    }

    public static final void b(List list, boolean z, String str, String str2, bz7 bz7Var, zy7 zy7Var, i4g i4gVar, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        iqb iqbVar2;
        e18 e18Var;
        boolean z2;
        Object obj;
        fqb fqbVar;
        e18 e18Var2;
        list.getClass();
        bz7Var.getClass();
        zy7Var.getClass();
        i4gVar.getClass();
        e18 e18Var3 = (e18) ld4Var;
        e18Var3.c0(-1572521681);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var3.f(list) : e18Var3.h(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var3.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var3.f(str) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var3.f(str2 != null ? CodeAgentId.m992boximpl(str2) : null) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var3.h(bz7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var3.h(zy7Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var3.f(i4gVar) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        int i3 = i2 | 12582912;
        int i4 = 1;
        if (e18Var3.Q(i3 & 1, (4793491 & i3) != 4793490)) {
            fqb fqbVar2 = fqb.E;
            if (z && list.isEmpty()) {
                e18Var3.a0(-1784766428);
                int i5 = i3 >> 18;
                e(i4gVar, ttj.a, e18Var3, (i5 & 112) | (i5 & 14) | 384);
                e18Var3.p(false);
            } else if (str != null && list.isEmpty()) {
                e18Var3.a0(-1784598780);
                int i6 = i3 >> 18;
                e(i4gVar, fd9.q0(-286935198, new wh(i4, zy7Var), e18Var3), e18Var3, (i6 & 112) | (i6 & 14) | 384);
                e18Var3.p(false);
            } else if (list.isEmpty()) {
                e18Var3.a0(-1784105198);
                int i7 = i3 >> 18;
                e(i4gVar, ttj.c, e18Var3, (i7 & 112) | (i7 & 14) | 384);
                e18Var3.p(false);
            } else {
                e18Var3.a0(-1783471868);
                qnc qncVarB = i4gVar.b();
                iqb iqbVarF = tvk.f(b.c(fqbVar2, 1.0f));
                boolean z3 = ((i3 & 14) == 4 || ((i3 & 8) != 0 && e18Var3.h(list))) | ((i3 & 7168) == 2048) | ((i3 & 57344) == 16384);
                Object objN = e18Var3.N();
                if (z3 || objN == jd4.a) {
                    z2 = false;
                    oq oqVar = new oq(list, str2, bz7Var, false ? 1 : 0);
                    e18Var3.k0(oqVar);
                    obj = oqVar;
                } else {
                    z2 = false;
                    obj = objN;
                }
                fqbVar = fqbVar2;
                knk.h(iqbVarF, null, qncVarB, false, null, null, null, false, null, (bz7) obj, e18Var3, 0, 506);
                e18 e18Var4 = e18Var3;
                e18Var4.p(z2);
                e18Var2 = e18Var4;
                iqbVar2 = fqbVar;
                e18Var = e18Var2;
            }
            e18Var2 = e18Var3;
            fqbVar = fqbVar2;
            iqbVar2 = fqbVar;
            e18Var = e18Var2;
        } else {
            e18 e18Var5 = e18Var3;
            e18Var5.T();
            iqbVar2 = iqbVar;
            e18Var = e18Var5;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pq(list, z, str, str2, bz7Var, zy7Var, i4gVar, iqbVar2, i);
        }
    }

    public static final void c(ek0 ek0Var, bz7 bz7Var, iqb iqbVar, oxf oxfVar, mnc mncVar, ld4 ld4Var, int i) {
        e18 e18Var;
        ek0Var.getClass();
        bz7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1414341076);
        int i2 = i | (e18Var2.d(ek0Var.ordinal()) ? 4 : 2) | (e18Var2.h(bz7Var) ? 32 : 16) | (e18Var2.f(oxfVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.f(mncVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if (e18Var2.Q(i2 & 1, (i2 & 9363) != 9362)) {
            e18Var2.V();
            if ((i & 1) != 0 && !e18Var2.A()) {
                e18Var2.T();
            }
            e18Var2.q();
            Object objN = e18Var2.N();
            if (objN == jd4.a) {
                objN = w44.p1(ek0.I);
                e18Var2.k0(objN);
            }
            e18Var = e18Var2;
            idi.e(a.a(ud0.R0, e18Var2), d4c.j0(R.string.color_mode_setting_title, e18Var2), ek0Var, (List) objN, new p6(13), new p6(14), bz7Var, iqbVar, false, null, oxfVar, mncVar, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, 0L, 0, e18Var, ((i2 << 6) & 896) | 8 | (3670016 & (i2 << 15)) | 12582912, i2 & 64512);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uo((Enum) ek0Var, bz7Var, iqbVar, oxfVar, mncVar, i, 9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.ctc r30, final java.lang.String r31, final defpackage.g93 r32, final defpackage.m83 r33, final defpackage.bz7 r34, final defpackage.bz7 r35, defpackage.b1i r36, defpackage.ld4 r37, final int r38, final int r39) {
        /*
            Method dump skipped, instruction units count: 1171
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mok.d(ctc, java.lang.String, g93, m83, bz7, bz7, b1i, ld4, int, int):void");
    }

    public static final void e(i4g i4gVar, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(2017986654);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(i4gVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        fqb fqbVar = fqb.E;
        if (i3 == 0) {
            i2 |= e18Var.f(fqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i4 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            vo1 vo1Var = lja.T;
            ho0 ho0Var = new ho0(8.0f, true, new sz6(i4));
            iqb iqbVarL = gb9.L(gb9.I(b.c(fqbVar, 1.0f), i4gVar.b()), MTTypesetterKt.kLineSkipLimitMultiplier, 32.0f, 1);
            q64 q64VarA = p64.a(ho0Var, vo1Var, e18Var, 54);
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
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            vb7.y((i2 >> 6) & 14, ta4Var, e18Var, true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qq(i, ta4Var, i4gVar);
        }
    }

    public static final void f(final cjh cjhVar, final bz7 bz7Var, final iqb iqbVar, final String str, final tkh tkhVar, long j, long j2, long j3, e0g e0gVar, qu1 qu1Var, final mp9 mp9Var, kp9 kp9Var, final int i, int i2, mnc mncVar, ld4 ld4Var, final int i3, final int i4, final int i5) {
        int i6;
        e18 e18Var;
        final long j4;
        final long j5;
        final e0g e0gVar2;
        final mnc mncVar2;
        final long j6;
        final int i7;
        final qu1 qu1Var2;
        final kp9 kp9Var2;
        int i8;
        kp9 kp9Var3;
        e0g e0gVar3;
        int i9;
        long j7;
        long j8;
        qu1 qu1Var3;
        mnc qncVar;
        long j9;
        iqb iqbVarU;
        cjhVar.getClass();
        bz7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1114997371);
        int i10 = (e18Var2.f(cjhVar) ? 4 : 2) | i3;
        if ((i3 & 48) == 0) {
            i10 |= e18Var2.h(bz7Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i10 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i11 = i10 | (e18Var2.f(str) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        boolean zF = e18Var2.f(tkhVar);
        int i12 = FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        long j10 = j3;
        int i13 = i11 | (zF ? 16384 : 8192) | 589824 | (((i5 & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0 && e18Var2.e(j10)) ? 8388608 : 4194304) | 301989888;
        int i14 = i4 | 432;
        if ((i4 & 24576) == 0) {
            if ((i5 & 16384) == 0) {
                i6 = i2;
                if (e18Var2.d(i6)) {
                    i12 = 16384;
                }
            } else {
                i6 = i2;
            }
            i14 |= i12;
        } else {
            i6 = i2;
        }
        int i15 = i14 | 65536;
        if (e18Var2.Q(i13 & 1, ((306783379 & i13) == 306783378 && (74899 & i15) == 74898) ? false : true)) {
            e18Var2.V();
            if ((i3 & 1) == 0 || e18Var2.A()) {
                long j11 = gm3.a(e18Var2).N;
                long j12 = gm3.a(e18Var2).O;
                int i16 = i13 & (-4128769);
                if ((i5 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
                    i16 = i13 & (-33488897);
                    j10 = gm3.a(e18Var2).n;
                }
                e0g e0gVar4 = gm3.b(e18Var2).f;
                qu1 qu1VarA = sf5.a(MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var2).u);
                int i17 = i16 & (-2113929217);
                kp9 kp9Var4 = kp9.g;
                if ((i5 & 16384) != 0) {
                    i6 = Integer.MAX_VALUE;
                    i15 = 69046;
                }
                i8 = i17;
                kp9Var3 = kp9Var4;
                e0gVar3 = e0gVar4;
                i9 = i15 & (-458753);
                j7 = j11;
                j8 = j10;
                qu1Var3 = qu1VarA;
                qncVar = new qnc(12.0f, 8.0f, 12.0f, 8.0f);
                j9 = j12;
            } else {
                e18Var2.T();
                int i18 = i13 & (-4128769);
                if ((i5 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
                    i18 = i13 & (-33488897);
                }
                int i19 = i18 & (-2113929217);
                if ((i5 & 16384) != 0) {
                    i15 = 69046;
                }
                j9 = j2;
                e0gVar3 = e0gVar;
                qu1Var3 = qu1Var;
                kp9Var3 = kp9Var;
                i8 = i19;
                i9 = i15 & (-458753);
                j8 = j10;
                j7 = j;
                qncVar = mncVar;
            }
            final int i20 = i6;
            e18Var2.q();
            qu1 qu1Var4 = qu1Var3;
            mnc mncVar3 = qncVar;
            final long j13 = j9;
            tkh tkhVarG = tkh.g(tkhVar, j7, 0L, null, null, null, 0L, null, 0, 0L, 16777214);
            long j14 = j7;
            eeg eegVar = new eeg(tkhVarG.d());
            iqb iqbVarP = yfd.p(iqbVar, j8, e0gVar3);
            iqb iqbVar2 = fqb.E;
            if (qu1Var4 != null && (iqbVarU = ez1.u(iqbVar2, qu1Var4.a, qu1Var4.b, e0gVar3)) != null) {
                iqbVar2 = iqbVarU;
            }
            kp9 kp9Var5 = kp9Var3;
            e18Var = e18Var2;
            bg1.b(cjhVar, bz7Var, gb9.I(iqbVarP.B(iqbVar2), mncVar3), false, tkhVarG, mp9Var, kp9Var5, false, i20, i, null, null, null, eegVar, fd9.q0(-165373502, new rz7() { // from class: rgh
                @Override // defpackage.rz7
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    String str2;
                    pz7 pz7Var = (pz7) obj;
                    ld4 ld4Var2 = (ld4) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    pz7Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((e18) ld4Var2).h(pz7Var) ? 4 : 2;
                    }
                    e18 e18Var3 = (e18) ld4Var2;
                    if (e18Var3.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        o5b o5bVarD = dw1.d(lja.G, false);
                        int iHashCode = Long.hashCode(e18Var3.T);
                        hyc hycVarL = e18Var3.l();
                        fqb fqbVar = fqb.E;
                        iqb iqbVarE = kxk.E(e18Var3, fqbVar);
                        dd4.e.getClass();
                        re4 re4Var = cd4.b;
                        e18Var3.e0();
                        if (e18Var3.S) {
                            e18Var3.k(re4Var);
                        } else {
                            e18Var3.n0();
                        }
                        d4c.i0(e18Var3, cd4.f, o5bVarD);
                        d4c.i0(e18Var3, cd4.e, hycVarL);
                        d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode));
                        d4c.h0(e18Var3, cd4.h);
                        d4c.i0(e18Var3, cd4.d, iqbVarE);
                        if (cjhVar.a.F.length() != 0 || (str2 = str) == null) {
                            e18Var3.a0(1521857210);
                            e18Var3.p(false);
                        } else {
                            e18Var3.a0(1521611721);
                            tjh.b(str2, gb9.L(fqbVar, 2.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, i20, 0, null, tkh.b(tkhVar, j13, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214), e18Var3, 48, 0, 114684);
                            e18Var3.p(false);
                        }
                        sq6.B(iIntValue & 14, pz7Var, e18Var3, true);
                    } else {
                        e18Var3.T();
                    }
                    return iei.a;
                }
            }, e18Var2), e18Var, (i8 & 126) | 114819072 | ((i9 << 15) & 1879048192), 196614, 14360);
            mncVar2 = mncVar3;
            qu1Var2 = qu1Var4;
            kp9Var2 = kp9Var5;
            i7 = i20;
            j6 = j8;
            j4 = j14;
            j5 = j13;
            e0gVar2 = e0gVar3;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            j4 = j;
            j5 = j2;
            e0gVar2 = e0gVar;
            mncVar2 = mncVar;
            j6 = j10;
            i7 = i6;
            qu1Var2 = qu1Var;
            kp9Var2 = kp9Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: tgh
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(i3 | 1);
                    int iP02 = x44.p0(i4);
                    mok.f(cjhVar, bz7Var, iqbVar, str, tkhVar, j4, j5, j6, e0gVar2, qu1Var2, mp9Var, kp9Var2, i, i7, mncVar2, (ld4) obj, iP0, iP02, i5);
                    return iei.a;
                }
            };
        }
    }

    public static eoe g(qh9 qh9Var) {
        try {
            bh9 bh9VarS = qh9Var.s("technology");
            String strM = bh9VarS != null ? bh9VarS.m() : null;
            bh9 bh9VarS2 = qh9Var.s("carrier_name");
            return new eoe(strM, bh9VarS2 != null ? bh9VarS2.m() : null);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Cellular", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Cellular", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Cellular", e3);
            return null;
        }
    }

    public static final dv7 h(dv7 dv7Var, dv7 dv7Var2, float f) {
        return new dv7(wd6.e0(d4c.X(f, dv7Var.E, dv7Var2.E), 1, 1000));
    }

    public static lsj i(grj grjVar, qsj qsjVar, c61 c61Var, ArrayList arrayList) {
        String str = qsjVar.E;
        if (grjVar.e(str)) {
            lsj lsjVarB = grjVar.b(str);
            if (lsjVarB instanceof nrj) {
                return ((nrj) lsjVarB).c(c61Var, arrayList);
            }
            sz6.p(kgh.o(str, " is not a function"));
            return null;
        }
        if ("hasOwnProperty".equals(str)) {
            gqk.n(arrayList, 1, "hasOwnProperty");
            return grjVar.e(((mvd) c61Var.G).n(c61Var, (lsj) arrayList.get(0)).h()) ? lsj.A : lsj.B;
        }
        sz6.p(ij0.i("Object has no function ", str));
        return null;
    }
}
