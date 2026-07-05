package defpackage;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.common.RateLimit;
import com.anthropic.claude.api.common.WindowStatus;
import com.pvporbit.freetype.FreeTypeConstants;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class h66 {
    public static final void a(String str, String str2, zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1317447932);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            e(0L, fd9.q0(-938256138, new xg4(str, zy7Var, str2, 10), e18Var), e18Var, 48, 1);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fy3(str, str2, zy7Var, i, 1);
        }
    }

    public static final void b(zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i) {
        int i2;
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1754581102);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var2) ? 32 : 16;
        }
        int i3 = 0;
        int i4 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            e(0L, fd9.q0(-488727328, new pr4(zy7Var, zy7Var2, i4), e18Var), e18Var, 48, 1);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new a66(i, i3, zy7Var, zy7Var2);
        }
    }

    public static final void c(zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1737751556);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            e(0L, fd9.q0(-1818469166, new tu(16, zy7Var), e18Var), e18Var, 48, 1);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new np1(i, i3, zy7Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(com.anthropic.claude.api.notice.Notice r16, defpackage.zy7 r17, defpackage.zy7 r18, defpackage.zy7 r19, defpackage.ld4 r20, int r21) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h66.d(com.anthropic.claude.api.notice.Notice, zy7, zy7, zy7, ld4, int):void");
    }

    public static final void e(long j, final ta4 ta4Var, ld4 ld4Var, final int i, final int i2) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1411951296);
        int i3 = (((i2 & 1) == 0 && e18Var.e(j)) ? 4 : 2) | i;
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            e18Var.V();
            if ((i & 1) != 0 && !e18Var.A()) {
                e18Var.T();
                int i4 = i2 & 1;
            } else if ((i2 & 1) != 0) {
                j = gm3.a(e18Var).q;
            }
            e18Var.q();
            iqb iqbVarK = gb9.K(yfd.p(b.c(fqb.E, 1.0f), j, xve.b(16.0f)), 12.0f, 12.0f);
            cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarK);
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
            ta4Var.invoke(fxe.a, e18Var, 54);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        final long j2 = j;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7(j2, ta4Var, i, i2) { // from class: z56
                public final /* synthetic */ long E;
                public final /* synthetic */ ta4 F;
                public final /* synthetic */ int G;

                {
                    this.G = i2;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP0 = x44.p0(49);
                    h66.e(this.E, this.F, (ld4) obj, iP0, this.G);
                    return iei.a;
                }
            };
        }
    }

    public static final void f(zy7 zy7Var, ld4 ld4Var, int i) {
        zy7 zy7Var2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-999869195);
        int i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            zy7Var2 = zy7Var;
            ez1.e(zy7Var2, b.o(fqb.E, 24.0f), false, null, null, skk.k, e18Var, (i2 & 14) | 1572912, 60);
        } else {
            zy7Var2 = zy7Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new wh(i, 22, zy7Var2);
        }
    }

    public static final void g(zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-478675170);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            e(0L, fd9.q0(-439895060, new tu(17, zy7Var), e18Var), e18Var, 48, 1);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new np1(i, i3, zy7Var);
        }
    }

    public static final void h(zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i) {
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-631580198);
        int i2 = 2;
        int i3 = (e18Var.h(zy7Var) ? 4 : 2) | i | (e18Var.h(zy7Var2) ? 32 : 16);
        if (e18Var.Q(i3 & 1, (i3 & 19) != 18)) {
            e(0L, fd9.q0(794727116, new pr4(zy7Var, zy7Var2, i2), e18Var), e18Var, 48, 1);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v56(i, i2, zy7Var, zy7Var2);
        }
    }

    public static final void i(int i, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2013702946);
        if (e18Var.Q(i & 1, i != 0)) {
            e(0L, skk.e, e18Var, 48, 1);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lc4(i, 23);
        }
    }

    public static final void j(iwg iwgVar, zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        cpc cpcVar;
        ta4 ta4VarQ0;
        iwgVar.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-243366037);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = i | (e18Var2.d(iwgVar.ordinal()) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(zy7Var) ? 32 : 16;
        }
        byte b = 0;
        int i4 = 21;
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            int iOrdinal = iwgVar.ordinal();
            if (iOrdinal == 0) {
                cpcVar = new cpc(Integer.valueOf(R.string.continue_on_web_alert_title), Integer.valueOf(R.string.continue_on_web_alert_body));
            } else if (iOrdinal == 1) {
                cpcVar = new cpc(Integer.valueOf(R.string.continue_on_google_play_alert_title), Integer.valueOf(R.string.continue_on_google_play_alert_body));
            } else {
                if (iOrdinal != 2) {
                    mr9.b();
                    return;
                }
                cpcVar = new cpc(Integer.valueOf(R.string.continue_on_app_store_alert_title), Integer.valueOf(R.string.continue_on_app_store_alert_body));
            }
            int iIntValue = ((Number) cpcVar.E).intValue();
            int iIntValue2 = ((Number) cpcVar.F).intValue();
            ta4 ta4VarQ02 = fd9.q0(-1213756722, new f44(iwgVar, kd7.a(e18Var2), zy7Var, 26), e18Var2);
            if (iwgVar == iwg.E) {
                e18Var2.a0(-211494559);
                ta4VarQ0 = fd9.q0(135859435, new wh(i4, zy7Var), e18Var2);
                e18Var2.p(false);
            } else {
                e18Var2.a0(-211375086);
                e18Var2.p(false);
                ta4VarQ0 = null;
            }
            e18Var = e18Var2;
            trk.b(zy7Var, ta4VarQ02, null, ta4VarQ0, fd9.q0(-442031918, new gq0(iIntValue, i3, b), e18Var2), fd9.q0(-249100717, new gq0(iIntValue2, 3, b), e18Var2), null, 0L, 0L, 0L, 0L, null, e18Var, ((i2 >> 3) & 14) | 1769520, 0, 16276);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qq(iwgVar, zy7Var, i, 21);
        }
    }

    public static final void k(final int i, final Date date, final r1e r1eVar, final iwg iwgVar, final qi3 qi3Var, final zy7 zy7Var, long j, ld4 ld4Var, final int i2) {
        final long j2;
        final long jA;
        r1eVar.getClass();
        qi3Var.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1879171192);
        int i3 = i2 | (e18Var.d(i) ? 4 : 2) | (e18Var.h(date) ? 32 : 16) | (e18Var.d(r1eVar.ordinal()) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.d(iwgVar.ordinal()) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.f(qi3Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.h(zy7Var) ? 131072 : 65536) | 524288;
        if (e18Var.Q(i3 & 1, (599187 & i3) != 599186)) {
            e18Var.V();
            if ((i2 & 1) == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == jd4.a) {
                    objN = m7fVarN.a(jce.a.b(mn5.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                jA = ((mn5) objN).a();
            } else {
                e18Var.T();
                jA = j;
            }
            e18Var.q();
            if (date == null) {
                r7e r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    final int i4 = 0;
                    r7eVarS.d = new pz7(i, date, r1eVar, iwgVar, qi3Var, zy7Var, jA, i2, i4) { // from class: x56
                        public final /* synthetic */ int E;
                        public final /* synthetic */ int F;
                        public final /* synthetic */ Date G;
                        public final /* synthetic */ r1e H;
                        public final /* synthetic */ iwg I;
                        public final /* synthetic */ qi3 J;
                        public final /* synthetic */ zy7 K;
                        public final /* synthetic */ long L;

                        {
                            this.E = i4;
                        }

                        @Override // defpackage.pz7
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.E;
                            iei ieiVar = iei.a;
                            switch (i5) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP0 = x44.p0(1);
                                    h66.k(this.F, this.G, this.H, this.I, this.J, this.K, this.L, (ld4) obj, iP0);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP02 = x44.p0(1);
                                    h66.k(this.F, this.G, this.H, this.I, this.J, this.K, this.L, (ld4) obj, iP02);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    return;
                }
                return;
            }
            long j3 = jA;
            e(0L, fd9.q0(1189809130, new y56(w(date, j3, e18Var), i, r1eVar, iwgVar, qi3Var, zy7Var), e18Var), e18Var, 48, 1);
            j2 = j3;
        } else {
            e18Var.T();
            j2 = j;
        }
        r7e r7eVarS2 = e18Var.s();
        if (r7eVarS2 != null) {
            final int i5 = 1;
            r7eVarS2.d = new pz7(i, date, r1eVar, iwgVar, qi3Var, zy7Var, j2, i2, i5) { // from class: x56
                public final /* synthetic */ int E;
                public final /* synthetic */ int F;
                public final /* synthetic */ Date G;
                public final /* synthetic */ r1e H;
                public final /* synthetic */ iwg I;
                public final /* synthetic */ qi3 J;
                public final /* synthetic */ zy7 K;
                public final /* synthetic */ long L;

                {
                    this.E = i5;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = this.E;
                    iei ieiVar = iei.a;
                    switch (i52) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iP0 = x44.p0(1);
                            h66.k(this.F, this.G, this.H, this.I, this.J, this.K, this.L, (ld4) obj, iP0);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iP02 = x44.p0(1);
                            h66.k(this.F, this.G, this.H, this.I, this.J, this.K, this.L, (ld4) obj, iP02);
                            break;
                    }
                    return ieiVar;
                }
            };
        }
    }

    public static final void l(String str, iqb iqbVar, ta4 ta4Var, ld4 ld4Var, int i) {
        ta4 ta4Var2;
        e18 e18Var;
        str.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1013004401);
        int i2 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.f(iqbVar) ? 32 : 16);
        if (e18Var2.Q(i2 & 1, (i2 & 147) != 146)) {
            q64 q64VarA = p64.a(new ho0(2.0f, true, new sz6(1)), lja.S, e18Var2, 6);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVar);
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
            tjh.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).j, e18Var2, i2 & 14, 0, 131070);
            e18Var = e18Var2;
            ta4Var2 = ta4Var;
            tjh.a(tkh.b(((jm3) gm3.c(e18Var).e.E).k, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, 0, 0L, null, 0, 16777214), fd9.q0(1576364982, new rx0(ta4Var2, 14), e18Var), e18Var, 48);
            e18Var.p(true);
        } else {
            ta4Var2 = ta4Var;
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new f44(str, i, iqbVar, ta4Var2, 28);
        }
    }

    public static final void m(zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-391949864);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            a(d4c.j0(R.string.chat_notice_max_tokens, e18Var), d4c.j0(R.string.generic_button_continue, e18Var), zy7Var, e18Var, (i2 << 6) & 896);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new np1(i, 3, zy7Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(com.anthropic.claude.api.notice.Notice r16, defpackage.zy7 r17, defpackage.zy7 r18, defpackage.ld4 r19, int r20) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h66.n(com.anthropic.claude.api.notice.Notice, zy7, zy7, ld4, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(java.lang.String r39, java.lang.String r40, defpackage.zy7 r41, defpackage.zy7 r42, defpackage.zy7 r43, defpackage.zy7 r44, java.lang.String r45, boolean r46, defpackage.qi3 r47, defpackage.ld4 r48, int r49, int r50) {
        /*
            Method dump skipped, instruction units count: 1037
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h66.o(java.lang.String, java.lang.String, zy7, zy7, zy7, zy7, java.lang.String, boolean, qi3, ld4, int, int):void");
    }

    public static final void p(int i, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(875154122);
        if (e18Var.Q(i & 1, i != 0)) {
            e(gm3.a(e18Var).A, skk.c, e18Var, 48, 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lc4(i, 24);
        }
    }

    public static final void q(String str, qi3 qi3Var, zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        qi3Var.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1395631481);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (e18Var.f(qi3Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i3 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            e(0L, fd9.q0(1303137387, new wt2(str, qi3Var, zy7Var, 3), e18Var), e18Var, 48, 1);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fb0(str, i, qi3Var, zy7Var, 3);
        }
    }

    public static final void r(RateLimit.ApproachingLimit approachingLimit, final r1e r1eVar, final iwg iwgVar, final qi3 qi3Var, final zy7 zy7Var, long j, ld4 ld4Var, int i) {
        long j2;
        final long jA;
        String strF0;
        Date resetsAt;
        WindowStatus windowStatusA;
        approachingLimit.getClass();
        r1eVar.getClass();
        qi3Var.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-508191952);
        Double surpassedThreshold = null;
        int i2 = i | (e18Var.f(approachingLimit) ? 4 : 2) | (e18Var.f(null) ? 32 : 16) | (e18Var.d(r1eVar.ordinal()) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.d(iwgVar.ordinal()) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.f(qi3Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.h(zy7Var) ? 131072 : 65536) | 524288;
        if (e18Var.Q(i2 & 1, (599187 & i2) != 599186)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == jd4.a) {
                    objN = m7fVarN.a(jce.a.b(mn5.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                jA = ((mn5) objN).a();
            } else {
                e18Var.T();
                jA = j;
            }
            e18Var.q();
            gne gneVarC = u1e.c(approachingLimit);
            if (gneVarC != null && (windowStatusA = gneVarC.a()) != null) {
                surpassedThreshold = windowStatusA.getSurpassedThreshold();
            }
            if (gneVarC == null || surpassedThreshold == null) {
                e18Var.a0(214383969);
                Integer remaining = approachingLimit.getRemaining();
                int iIntValue = remaining != null ? remaining.intValue() : 0;
                strF0 = d4c.f0(R.plurals.rate_limit_messages_remaining, iIntValue, new Object[]{Integer.valueOf(iIntValue)}, e18Var);
                resetsAt = approachingLimit.getResetsAt();
                e18Var.p(false);
            } else {
                e18Var.a0(213834308);
                int iDoubleValue = (int) (surpassedThreshold.doubleValue() * 100.0d);
                int iOrdinal = gneVarC.b().ordinal();
                if (iOrdinal == 0) {
                    e18Var.a0(1253828242);
                    strF0 = d4c.k0(R.string.rate_limit_percent_of_limit_used, new Object[]{Integer.valueOf(iDoubleValue)}, e18Var);
                    e18Var.p(false);
                } else {
                    if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
                        throw kgh.s(e18Var, 1253825844, false);
                    }
                    e18Var.a0(1253836281);
                    strF0 = d4c.k0(R.string.rate_limit_percent_of_weekly_limit_used, new Object[]{Integer.valueOf(iDoubleValue)}, e18Var);
                    e18Var.p(false);
                }
                resetsAt = gneVarC.a().getResetsAt();
                if (resetsAt == null) {
                    resetsAt = approachingLimit.getResetsAt();
                }
                e18Var.p(false);
            }
            final Date date = resetsAt;
            final String str = strF0;
            e(0L, fd9.q0(-543084546, new rz7() { // from class: d66
                @Override // defpackage.rz7
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    dxe dxeVar = (dxe) obj;
                    ld4 ld4Var2 = (ld4) obj2;
                    int iIntValue2 = ((Integer) obj3).intValue();
                    dxeVar.getClass();
                    if ((iIntValue2 & 6) == 0) {
                        iIntValue2 |= ((e18) ld4Var2).f(dxeVar) ? 4 : 2;
                    }
                    e18 e18Var2 = (e18) ld4Var2;
                    if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                        h66.l(str, dxeVar.a(fqb.E, 1.0f, true), fd9.q0(-1558500766, new e66(date, jA), e18Var2), e18Var2, 384);
                        h66.s(r1eVar, iwgVar, "chat_input_toast_approaching", qi3Var, zy7Var, e18Var2, 384);
                    } else {
                        e18Var2.T();
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, 48, 1);
            j2 = jA;
        } else {
            e18Var.T();
            j2 = j;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new c66(approachingLimit, r1eVar, iwgVar, qi3Var, zy7Var, j2, i, 1);
        }
    }

    public static final void s(final r1e r1eVar, final iwg iwgVar, final String str, final qi3 qi3Var, final zy7 zy7Var, ld4 ld4Var, final int i) {
        e18 e18Var;
        r7e r7eVarS;
        pz7 pz7Var;
        iwg iwgVar2;
        r7i r7iVar;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(2000363931);
        int i2 = i | (e18Var2.d(r1eVar.ordinal()) ? 4 : 2) | (e18Var2.d(iwgVar.ordinal()) ? 32 : 16) | (e18Var2.f(qi3Var) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if (e18Var2.Q(i2 & 1, (i2 & 9363) != 9362)) {
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var2.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            if (((Boolean) nwbVar.getValue()).booleanValue()) {
                e18Var2.a0(170966418);
                Object objN2 = e18Var2.N();
                if (objN2 == lz1Var) {
                    objN2 = new sy4(12, nwbVar);
                    e18Var2.k0(objN2);
                }
                iwgVar2 = iwgVar;
                j(iwgVar2, (zy7) objN2, e18Var2, ((i2 >> 3) & 14) | 48);
                e18Var2.p(false);
            } else {
                iwgVar2 = iwgVar;
                e18Var2.a0(171078855);
                e18Var2.p(false);
            }
            int iOrdinal = r1eVar.ordinal();
            if (iOrdinal == 0) {
                e18Var2.a0(-1795581409);
                e18Var2.p(false);
                r7iVar = new r7i(Integer.valueOf(R.string.upgrade_to_pro), str, zy7Var);
            } else if (iOrdinal == 1) {
                e18Var2.a0(-1795577290);
                e18Var2.p(false);
                r7iVar = new r7i(Integer.valueOf(R.string.upgrade_button_upsell_for_subscriptions), str.concat("_max"), zy7Var);
            } else if (iOrdinal == 2) {
                e18Var2.a0(-1795573138);
                Integer numValueOf = Integer.valueOf(R.string.upgrade_button_upsell_for_subscriptions);
                String strConcat = str.concat("_max_web");
                Object objN3 = e18Var2.N();
                if (objN3 == lz1Var) {
                    objN3 = new sy4(13, nwbVar);
                    e18Var2.k0(objN3);
                }
                r7iVar = new r7i(numValueOf, strConcat, (zy7) objN3);
                e18Var2.p(false);
            } else {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw kgh.s(e18Var2, -1795592238, false);
                    }
                    e18Var2.a0(171243713);
                    e18Var2.p(false);
                    r7eVarS = e18Var2.s();
                    if (r7eVarS != null) {
                        final int i3 = 0;
                        final iwg iwgVar3 = iwgVar2;
                        pz7Var = new pz7(r1eVar, iwgVar3, str, qi3Var, zy7Var, i, i3) { // from class: f66
                            public final /* synthetic */ int E;
                            public final /* synthetic */ r1e F;
                            public final /* synthetic */ iwg G;
                            public final /* synthetic */ String H;
                            public final /* synthetic */ qi3 I;
                            public final /* synthetic */ zy7 J;

                            {
                                this.E = i3;
                            }

                            @Override // defpackage.pz7
                            public final Object invoke(Object obj, Object obj2) {
                                int i4 = this.E;
                                iei ieiVar = iei.a;
                                switch (i4) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iP0 = x44.p0(385);
                                        h66.s(this.F, this.G, this.H, this.I, this.J, (ld4) obj, iP0);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iP02 = x44.p0(385);
                                        h66.s(this.F, this.G, this.H, this.I, this.J, (ld4) obj, iP02);
                                        break;
                                }
                                return ieiVar;
                            }
                        };
                        r7eVarS.d = pz7Var;
                    }
                    return;
                }
                e18Var2.a0(-1795566235);
                Integer numValueOf2 = Integer.valueOf(R.string.get_more_usage);
                String strConcat2 = str.concat("_more_usage_web");
                Object objN4 = e18Var2.N();
                if (objN4 == lz1Var) {
                    objN4 = new sy4(14, nwbVar);
                    e18Var2.k0(objN4);
                }
                r7iVar = new r7i(numValueOf2, strConcat2, (zy7) objN4);
                e18Var2.p(false);
            }
            int iIntValue = ((Number) r7iVar.E).intValue();
            String str2 = (String) r7iVar.F;
            zy7 zy7Var2 = (zy7) r7iVar.G;
            String strJ0 = d4c.j0(iIntValue, e18Var2);
            long j = gm3.a(e18Var2).g;
            tkh tkhVar = ((jm3) gm3.c(e18Var2).e.E).l;
            boolean zF = e18Var2.f(str2) | ((i2 & 7168) == 2048) | e18Var2.f(zy7Var2);
            Object objN5 = e18Var2.N();
            if (zF || objN5 == lz1Var) {
                objN5 = new bs1(qi3Var, str2, zy7Var2, 1);
                e18Var2.k0(objN5);
            }
            e18Var = e18Var2;
            tjh.b(strJ0, gb9.L(androidx.compose.foundation.b.c(fqb.E, false, null, null, null, (zy7) objN5, 15), 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), j, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, tkhVar, e18Var, 0, 24960, 110584);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            final int i4 = 1;
            pz7Var = new pz7(r1eVar, iwgVar, str, qi3Var, zy7Var, i, i4) { // from class: f66
                public final /* synthetic */ int E;
                public final /* synthetic */ r1e F;
                public final /* synthetic */ iwg G;
                public final /* synthetic */ String H;
                public final /* synthetic */ qi3 I;
                public final /* synthetic */ zy7 J;

                {
                    this.E = i4;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = this.E;
                    iei ieiVar = iei.a;
                    switch (i42) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iP0 = x44.p0(385);
                            h66.s(this.F, this.G, this.H, this.I, this.J, (ld4) obj, iP0);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iP02 = x44.p0(385);
                            h66.s(this.F, this.G, this.H, this.I, this.J, (ld4) obj, iP02);
                            break;
                    }
                    return ieiVar;
                }
            };
            r7eVarS.d = pz7Var;
        }
    }

    public static final void t(final RateLimit.ExceedsLimit exceedsLimit, final r1e r1eVar, final iwg iwgVar, final qi3 qi3Var, final zy7 zy7Var, long j, ld4 ld4Var, int i) {
        long j2;
        final long jA;
        String strN;
        int i2;
        int i3;
        exceedsLimit.getClass();
        r1eVar.getClass();
        qi3Var.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-266067336);
        int i4 = i | (e18Var.f(exceedsLimit) ? 4 : 2) | (e18Var.f(null) ? 32 : 16) | (e18Var.d(r1eVar.ordinal()) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.d(iwgVar.ordinal()) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var.f(qi3Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var.h(zy7Var) ? 131072 : 65536) | 524288;
        if (e18Var.Q(i4 & 1, (599187 & i4) != 599186)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == jd4.a) {
                    objN = m7fVarN.a(jce.a.b(mn5.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                jA = ((mn5) objN).a();
            } else {
                e18Var.T();
                jA = j;
            }
            e18Var.q();
            final gne gneVarC = u1e.c(exceedsLimit);
            if (gneVarC != null) {
                e18Var.a0(2098081496);
                int iOrdinal = gneVarC.b().ordinal();
                if (iOrdinal == 0) {
                    strN = vb7.n(e18Var, 2007354499, R.string.rate_limit_reached, e18Var, false);
                    e18Var.p(false);
                } else {
                    if (iOrdinal == 1) {
                        i2 = 2007344554;
                        i3 = R.string.rate_limit_weekly_reached;
                    } else if (iOrdinal == 2) {
                        i2 = 2007347656;
                        i3 = R.string.rate_limit_opus_reached;
                    } else if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            throw kgh.s(e18Var, 2007342698, false);
                        }
                        strN = vb7.n(e18Var, 2007354499, R.string.rate_limit_reached, e18Var, false);
                        e18Var.p(false);
                    } else {
                        i2 = 2007350762;
                        i3 = R.string.rate_limit_sonnet_reached;
                    }
                    strN = vb7.n(e18Var, i2, i3, e18Var, false);
                    e18Var.p(false);
                }
            } else {
                strN = x44.r(exceedsLimit.getPerModelLimit(), Boolean.TRUE) ? vb7.n(e18Var, 2007357609, R.string.rate_limit_model_reached, e18Var, false) : vb7.n(e18Var, 2007359715, R.string.rate_limit_reached, e18Var, false);
            }
            final String str = strN;
            e(0L, fd9.q0(830251078, new rz7() { // from class: b66
                @Override // defpackage.rz7
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    dxe dxeVar = (dxe) obj;
                    ld4 ld4Var2 = (ld4) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    dxeVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((e18) ld4Var2).f(dxeVar) ? 4 : 2;
                    }
                    e18 e18Var2 = (e18) ld4Var2;
                    if (e18Var2.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        h66.l(str, dxeVar.a(fqb.E, 1.0f, true), fd9.q0(1491781802, new fj2(gneVarC, exceedsLimit, jA, 1), e18Var2), e18Var2, 384);
                        h66.s(r1eVar, iwgVar, "chat_input_toast_exceeded", qi3Var, zy7Var, e18Var2, 384);
                    } else {
                        e18Var2.T();
                    }
                    return iei.a;
                }
            }, e18Var), e18Var, 48, 1);
            j2 = jA;
        } else {
            e18Var.T();
            j2 = j;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new c66(exceedsLimit, r1eVar, iwgVar, qi3Var, zy7Var, j2, i, 0);
        }
    }

    public static final void u(Date date, long j, ld4 ld4Var, int i) {
        e18 e18Var;
        String strK0;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-2143031345);
        int i2 = (e18Var2.h(date) ? 4 : 2) | i | (e18Var2.e(j) ? 32 : 16);
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            if (date == null) {
                strK0 = vb7.n(e18Var2, 1642147504, R.string.rate_limit_try_again_later, e18Var2, false);
            } else {
                e18Var2.a0(1642227174);
                p1e p1eVarW = w(date, j, e18Var2);
                if (p1eVarW.c()) {
                    e18Var2.a0(1642322158);
                    strK0 = d4c.k0(R.string.rate_limit_resets_day_at_time, new Object[]{p1eVarW.a(), p1eVarW.b()}, e18Var2);
                    e18Var2.p(false);
                } else {
                    e18Var2.a0(1642427837);
                    strK0 = d4c.k0(R.string.rate_limit_resets_at_time, new Object[]{p1eVarW.b()}, e18Var2);
                    e18Var2.p(false);
                }
                e18Var2.p(false);
            }
            e18Var = e18Var2;
            tjh.b(strK0, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var, 0, 0, 262142);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new e66(date, j, i);
        }
    }

    public static final void v(zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2018014610);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            a(d4c.j0(R.string.chat_notice_tool_use_limit, e18Var), d4c.j0(R.string.generic_button_continue, e18Var), zy7Var, e18Var, (i2 << 6) & 896);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new np1(i, i3, zy7Var);
        }
    }

    public static final p1e w(Date date, long j, ld4 ld4Var) {
        Object hreVar;
        date.getClass();
        Locale localeX = knk.x(ld4Var);
        e18 e18Var = (e18) ld4Var;
        Context context = (Context) e18Var.j(w00.b);
        boolean zF = e18Var.f(knk.x(e18Var)) | e18Var.f(context);
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (zF || objN == lz1Var) {
            try {
                hreVar = Boolean.valueOf(DateFormat.is24HourFormat(context));
            } catch (Throwable th) {
                hreVar = new hre(th);
            }
            if (hreVar instanceof hre) {
                hreVar = null;
            }
            objN = Boolean.valueOf(x44.r(hreVar, Boolean.TRUE));
            e18Var.k0(objN);
        }
        boolean zBooleanValue = ((Boolean) objN).booleanValue();
        boolean zG = e18Var.g(zBooleanValue) | e18Var.f(localeX);
        Object objN2 = e18Var.N();
        if (zG || objN2 == lz1Var) {
            objN2 = new SimpleDateFormat(zBooleanValue ? "HH:mm" : "ha", localeX);
            e18Var.k0(objN2);
        }
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) objN2;
        boolean zF2 = e18Var.f(localeX);
        Object objN3 = e18Var.N();
        if (zF2 || objN3 == lz1Var) {
            objN3 = new SimpleDateFormat("EEEE", localeX);
            e18Var.k0(objN3);
        }
        SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) objN3;
        long time = date.getTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(time);
        boolean z = calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
        String str = simpleDateFormat2.format(date);
        str.getClass();
        String str2 = simpleDateFormat.format(date);
        str2.getClass();
        return new p1e(str, str2, !z);
    }
}
