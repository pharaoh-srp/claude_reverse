package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.ChatFeedbackType;
import com.anthropic.claude.types.strings.ChatId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ns2 {
    public static final List a = x44.X(ChatFeedbackType.FLAG_OTHER, ChatFeedbackType.FLAG_BUG, ChatFeedbackType.FLAG_HARMFUL, ChatFeedbackType.FLAG_REFUSAL, ChatFeedbackType.FLAG_INSTRUCTIONS, ChatFeedbackType.FLAG_FACTS, ChatFeedbackType.FLAG_INCOMPLETE);

    public static final void a(final String str, final String str2, final int i, ChatFeedbackType chatFeedbackType, final String str3, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final sz7 sz7Var, final zy7 zy7Var, cs2 cs2Var, qi3 qi3Var, ld4 ld4Var, final int i2) {
        e18 e18Var;
        final ChatFeedbackType chatFeedbackType2;
        final cs2 cs2Var2;
        final qi3 qi3Var2;
        int i3;
        qi3 qi3Var3;
        cs2 cs2Var3;
        int i4;
        tp4 tp4Var;
        int i5;
        str2.getClass();
        chatFeedbackType.getClass();
        sz7Var.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-4272717);
        int i6 = i2 | (e18Var2.f(str != null ? ChatId.m978boximpl(str) : null) ? 4 : 2) | (e18Var2.f(str2) ? 32 : 16) | (e18Var2.d(i) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.d(chatFeedbackType.ordinal()) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.f(str3) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var2.g(z) ? 131072 : 65536) | (e18Var2.g(z2) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var2.g(z3) ? 8388608 : 4194304) | (e18Var2.g(z4) ? 67108864 : 33554432) | (e18Var2.g(z5) ? 536870912 : 268435456);
        int i7 = (e18Var2.h(sz7Var) ? (char) 4 : (char) 2) | (e18Var2.h(zy7Var) ? ' ' : (char) 16) | 1152;
        if (e18Var2.Q(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 1171) == 1170) ? false : true)) {
            e18Var2.V();
            int i8 = i2 & 1;
            lz1 lz1Var = jd4.a;
            if (i8 == 0 || e18Var2.A()) {
                int i9 = i6 >> 3;
                m7f m7fVar = (m7f) e18Var2.j(gr9.b);
                boolean zH = ((((i9 & 7168) ^ 3072) > 2048 && e18Var2.f(str3)) || (i9 & 3072) == 2048) | ((((i9 & 112) ^ 48) > 32 && e18Var2.d(i)) || (i9 & 48) == 32) | ((((i9 & 14) ^ 6) > 4 && e18Var2.f(str2)) || (i9 & 6) == 4) | ((((i9 & 896) ^ 384) > 256 && e18Var2.d(chatFeedbackType.ordinal())) || (i9 & 384) == 256) | e18Var2.h(m7fVar);
                Object objN = e18Var2.N();
                if (zH || objN == lz1Var) {
                    i3 = i7;
                    wu0 wu0Var = new wu0(str2, i, chatFeedbackType, str3, m7fVar);
                    e18Var2.k0(wu0Var);
                    objN = wu0Var;
                } else {
                    i3 = i7;
                }
                kce kceVar = jce.a;
                cs2 cs2Var4 = (cs2) fd9.r0(kceVar.b(cs2.class), oq5.B(kceVar.b(cs2.class)), (bz7) objN, e18Var2);
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN2 = e18Var2.N();
                if (zF || objN2 == lz1Var) {
                    objN2 = m7fVarN.a(kceVar.b(qi3.class), null, null);
                    e18Var2.k0(objN2);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                int i10 = i3 & (-8065);
                qi3Var3 = (qi3) objN2;
                cs2Var3 = cs2Var4;
                i4 = i10;
            } else {
                e18Var2.T();
                i4 = i7 & (-8065);
                cs2Var3 = cs2Var;
                qi3Var3 = qi3Var;
            }
            e18Var2.q();
            boolean zH2 = e18Var2.h(qi3Var3);
            Object objN3 = e18Var2.N();
            if (zH2 || objN3 == lz1Var) {
                tp4Var = null;
                objN3 = new gw(qi3Var3, tp4Var, 8);
                e18Var2.k0(objN3);
            } else {
                tp4Var = null;
            }
            csg.g((bz7) objN3, e18Var2, 0, 1);
            Object objN4 = e18Var2.N();
            if (objN4 == lz1Var) {
                objN4 = mpk.P(tp4Var);
                e18Var2.k0(objN4);
            }
            nwb nwbVar = (nwb) objN4;
            int i11 = 14;
            boolean z6 = ((i4 & 112) == 32) | ((i4 & 14) == 4);
            Object objN5 = e18Var2.N();
            if (z6 || objN5 == lz1Var) {
                objN5 = new ei(zy7Var, sz7Var, nwbVar, i11);
                e18Var2.k0(objN5);
            }
            e18Var = e18Var2;
            r4g r4gVarS = gb9.S(u4g.F, null, null, (zy7) objN5, e18Var, 6, 6);
            zy1 zy1Var = cs2Var3.j;
            boolean zH3 = e18Var.h(r4gVarS);
            Object objN6 = e18Var.N();
            if (zH3 || objN6 == lz1Var) {
                i5 = 0;
                objN6 = new ls2(r4gVarS, nwbVar, null, 0);
                e18Var.k0(objN6);
            } else {
                i5 = 0;
            }
            x44.b(zy1Var, (pz7) objN6, e18Var, i5);
            final cs2 cs2Var5 = cs2Var3;
            chatFeedbackType2 = chatFeedbackType;
            vkc.a(r4gVarS, d4c.j0(R.string.title_feedback, e18Var), null, null, false, false, null, null, fd9.q0(-1015482983, new fp(19, cs2Var3), e18Var), null, fd9.q0(-1798764458, new gs2(cs2Var5, z4, str, z, z3), e18Var), null, fd9.q0(-1973886760, new sz7() { // from class: hs2
                @Override // defpackage.sz7
                public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i12;
                    final cs2 cs2Var6 = cs2Var5;
                    lsc lscVar = cs2Var6.l;
                    mnc mncVar = (mnc) obj2;
                    ld4 ld4Var2 = (ld4) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((s64) obj).getClass();
                    mncVar.getClass();
                    if ((iIntValue & 48) == 0) {
                        iIntValue |= ((e18) ld4Var2).f(mncVar) ? 32 : 16;
                    }
                    final int i13 = 1;
                    final int i14 = 0;
                    e18 e18Var3 = (e18) ld4Var2;
                    if (e18Var3.Q(iIntValue & 1, (iIntValue & 145) != 144)) {
                        fqb fqbVar = fqb.E;
                        iqb iqbVarI = gb9.I(fqbVar, mncVar);
                        q64 q64VarA = p64.a(ko0.c, lja.S, e18Var3, 0);
                        int iHashCode = Long.hashCode(e18Var3.T);
                        hyc hycVarL = e18Var3.l();
                        iqb iqbVarE = kxk.E(e18Var3, iqbVarI);
                        dd4.e.getClass();
                        re4 re4Var = cd4.b;
                        e18Var3.e0();
                        if (e18Var3.S) {
                            e18Var3.k(re4Var);
                        } else {
                            e18Var3.n0();
                        }
                        d4c.i0(e18Var3, cd4.f, q64VarA);
                        d4c.i0(e18Var3, cd4.e, hycVarL);
                        d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode));
                        d4c.h0(e18Var3, cd4.h);
                        d4c.i0(e18Var3, cd4.d, iqbVarE);
                        boolean zD = ns2.d((ChatFeedbackType) lscVar.getValue());
                        lz1 lz1Var2 = jd4.a;
                        if (zD && z5) {
                            e18Var3.a0(1146820456);
                            tjh.b(d4c.j0(R.string.chat_feedback_dialog_flag_type_label, e18Var3), null, gm3.a(e18Var3).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var3).e.E).j, e18Var3, 0, 0, 131066);
                            e18Var3 = e18Var3;
                            kxk.g(e18Var3, b.e(fqbVar, 8.0f));
                            ChatFeedbackType chatFeedbackType3 = (ChatFeedbackType) lscVar.getValue();
                            boolean zF2 = e18Var3.f(cs2Var6);
                            Object objN7 = e18Var3.N();
                            if (zF2 || objN7 == lz1Var2) {
                                objN7 = new bz7() { // from class: js2
                                    @Override // defpackage.bz7
                                    public final Object invoke(Object obj5) {
                                        int i15 = i14;
                                        iei ieiVar = iei.a;
                                        cs2 cs2Var7 = cs2Var6;
                                        switch (i15) {
                                            case 0:
                                                ChatFeedbackType chatFeedbackType4 = (ChatFeedbackType) obj5;
                                                chatFeedbackType4.getClass();
                                                cs2Var7.l.setValue(chatFeedbackType4);
                                                break;
                                            default:
                                                cjh cjhVar = (cjh) obj5;
                                                cjhVar.getClass();
                                                cs2Var7.k.setValue(cjhVar);
                                                break;
                                        }
                                        return ieiVar;
                                    }
                                };
                                e18Var3.k0(objN7);
                            }
                            ns2.b(chatFeedbackType3, (bz7) objN7, z2, ((Boolean) cs2Var6.p.getValue()).booleanValue(), e18Var3, 0);
                            grc.z(fqbVar, 16.0f, e18Var3, false);
                        } else {
                            e18Var3.a0(1147508532);
                            e18Var3.p(false);
                        }
                        Object objN8 = e18Var3.N();
                        if (objN8 == lz1Var2) {
                            objN8 = ij0.d(e18Var3);
                        }
                        bt7 bt7Var = (bt7) objN8;
                        e18 e18Var4 = e18Var3;
                        tjh.b(d4c.j0(R.string.chat_feedback_dialog_details_label, e18Var3), null, gm3.a(e18Var3).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var3).e.E).j, e18Var4, 0, 0, 131066);
                        kxk.g(e18Var4, b.e(fqbVar, 8.0f));
                        if (chatFeedbackType2 == ChatFeedbackType.FLAG_SAFETY_CLASSIFIER_FALSE_POSITIVE) {
                            i12 = R.string.chat_feedback_dialog_details_saftey_classifier_placeholder;
                        } else {
                            ChatFeedbackType chatFeedbackType4 = (ChatFeedbackType) lscVar.getValue();
                            chatFeedbackType4.getClass();
                            i12 = bsg.u0(chatFeedbackType4.getValue(), ChatFeedbackType.UPVOTE.getValue(), false) ? R.string.chat_feedback_dialog_details_placeholder_positive : R.string.chat_feedback_dialog_details_placeholder_flag;
                        }
                        cjh cjhVar = (cjh) cs2Var6.k.getValue();
                        String strJ0 = d4c.j0(i12, e18Var4);
                        tkh tkhVarB = tkh.b(((jm3) gm3.c(e18Var4).e.E).g, gm3.a(e18Var4).N, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214);
                        long j = gm3.a(e18Var4).p;
                        mp9 mp9Var = new mp9(3, 0, 0, 126);
                        iqb iqbVarC = b.c(iv1.s(fqbVar, bt7Var), 1.0f);
                        boolean zF3 = e18Var4.f(cs2Var6);
                        Object objN9 = e18Var4.N();
                        if (zF3 || objN9 == lz1Var2) {
                            objN9 = new bz7() { // from class: js2
                                @Override // defpackage.bz7
                                public final Object invoke(Object obj5) {
                                    int i15 = i13;
                                    iei ieiVar = iei.a;
                                    cs2 cs2Var7 = cs2Var6;
                                    switch (i15) {
                                        case 0:
                                            ChatFeedbackType chatFeedbackType42 = (ChatFeedbackType) obj5;
                                            chatFeedbackType42.getClass();
                                            cs2Var7.l.setValue(chatFeedbackType42);
                                            break;
                                        default:
                                            cjh cjhVar2 = (cjh) obj5;
                                            cjhVar2.getClass();
                                            cs2Var7.k.setValue(cjhVar2);
                                            break;
                                    }
                                    return ieiVar;
                                }
                            };
                            e18Var4.k0(objN9);
                        }
                        mok.f(cjhVar, (bz7) objN9, iqbVarC, strJ0, tkhVarB, 0L, 0L, j, null, null, mp9Var, null, 3, 5, null, e18Var4, 0, 27654, 39776);
                        grc.z(fqbVar, 16.0f, e18Var4, true);
                    } else {
                        e18Var3.T();
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, 100663304, 3120, 5884);
            qi3Var2 = qi3Var3;
            cs2Var2 = cs2Var5;
        } else {
            e18Var = e18Var2;
            chatFeedbackType2 = chatFeedbackType;
            e18Var.T();
            cs2Var2 = cs2Var;
            qi3Var2 = qi3Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final ChatFeedbackType chatFeedbackType3 = chatFeedbackType2;
            r7eVarS.d = new pz7(str, str2, i, chatFeedbackType3, str3, z, z2, z3, z4, z5, sz7Var, zy7Var, cs2Var2, qi3Var2, i2) { // from class: is2
                public final /* synthetic */ String E;
                public final /* synthetic */ String F;
                public final /* synthetic */ int G;
                public final /* synthetic */ ChatFeedbackType H;
                public final /* synthetic */ String I;
                public final /* synthetic */ boolean J;
                public final /* synthetic */ boolean K;
                public final /* synthetic */ boolean L;
                public final /* synthetic */ boolean M;
                public final /* synthetic */ boolean N;
                public final /* synthetic */ sz7 O;
                public final /* synthetic */ zy7 P;
                public final /* synthetic */ cs2 Q;
                public final /* synthetic */ qi3 R;

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(1);
                    ns2.a(this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, (ld4) obj, iP0);
                    return iei.a;
                }
            };
        }
    }

    public static final void b(ChatFeedbackType chatFeedbackType, bz7 bz7Var, boolean z, boolean z2, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1671140915);
        int i2 = i | (e18Var.d(chatFeedbackType.ordinal()) ? 4 : 2) | (e18Var.h(bz7Var) ? 32 : 16) | (e18Var.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.g(z2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                objN2 = new x40(13, nwbVar);
                e18Var.k0(objN2);
            }
            bz7 bz7Var2 = (bz7) objN2;
            iqb iqbVarP = yfd.p(fqb.E, gm3.a(e18Var).p, gm3.b(e18Var).f);
            qu1 qu1VarA = sf5.a(MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).u);
            kkk.a(false, bz7Var2, gb9.K(ez1.u(iqbVarP, qu1VarA.a, qu1VarA.b, gm3.b(e18Var).f), 12.0f, 8.0f), fd9.q0(93832439, new es2(chatFeedbackType, nwbVar, z2, z, bz7Var), e18Var), e18Var, 3126, 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new q32(chatFeedbackType, bz7Var, z, z2, i);
        }
    }

    public static final int c(ChatFeedbackType chatFeedbackType) {
        switch (ms2.a[chatFeedbackType.ordinal()]) {
            case 1:
                return R.string.chat_feedback_dialog_flag_type_flag_other;
            case 2:
                return R.string.chat_feedback_dialog_flag_type_flag_ui_bug;
            case 3:
                return R.string.chat_feedback_dialog_flag_type_flag_facts;
            case 4:
                return R.string.chat_feedback_dialog_flag_type_flag_image_understanding;
            case 5:
                return R.string.chat_feedback_dialog_flag_type_flag_harmful;
            case 6:
                return R.string.chat_feedback_dialog_flag_type_flag_incomplete;
            case 7:
                return R.string.chat_feedback_dialog_flag_type_flag_memory;
            case 8:
                return R.string.chat_feedback_dialog_flag_type_flag_instructions;
            case 9:
                return R.string.chat_feedback_dialog_flag_type_flag_other;
            case 10:
                return R.string.chat_feedback_dialog_flag_type_flag_refusal;
            case 11:
                return R.string.chat_feedback_dialog_flag_type_false_positive;
            case 12:
                return R.string.chat_feedback_dialog_flag_type_flag_other;
            default:
                wg6.i();
                return 0;
        }
    }

    public static final boolean d(ChatFeedbackType chatFeedbackType) {
        chatFeedbackType.getClass();
        return bsg.u0(chatFeedbackType.getValue(), ChatFeedbackType.FLAG.getValue(), false) || x44.r(chatFeedbackType.getValue(), ChatFeedbackType.FLAG_SAFETY_CLASSIFIER_FALSE_POSITIVE.getValue());
    }
}
