package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.health.HealthMetricOutcome;
import com.anthropic.claude.api.chat.messages.ThinkingSummary;
import com.anthropic.claude.chat.messagelistitem.CollapsedBlockRowState$IconState$ToolIntegrationIconWithPainter;
import com.anthropic.claude.chat.parse.ParsedContentBlock$Thinking;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.tool.model.Tool;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bok {
    public static final ta4 a = new ta4(-1655783595, false, new rb4(28));
    public static final ta4 b = new ta4(846469799, false, new ya4(10));

    static {
        new ta4(-1653547739, false, new rb4(29));
    }

    public static final void a(z34 z34Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        long j;
        long j2;
        String strN;
        boolean z;
        fqb fqbVar;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2043732491);
        int i2 = i | (e18Var.f(z34Var) ? 4 : 2) | 48;
        int i3 = 18;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            xo1 xo1Var = lja.K;
            fqb fqbVar2 = fqb.E;
            iqb iqbVarO = b.o(fqbVar2, 24.0f);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarO);
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
            if (z34Var instanceof y34) {
                e18Var.a0(-332719219);
                y34 y34Var = (y34) z34Var;
                String str = y34Var.c;
                String str2 = y34Var.a;
                String str3 = y34Var.b;
                if (str3 == null) {
                    strN = vb7.n(e18Var, -980561624, R.string.mcp_tool_content_description, e18Var, false);
                } else {
                    e18Var.a0(-980562213);
                    e18Var.p(false);
                    strN = str3;
                }
                boolean zF = e18Var.f(str2);
                Object objN = e18Var.N();
                lz1 lz1Var = jd4.a;
                if (zF || objN == lz1Var) {
                    objN = mpk.P(Boolean.FALSE);
                    e18Var.k0(objN);
                }
                nwb nwbVar = (nwb) objN;
                Context context = (Context) e18Var.j(w00.b);
                boolean zF2 = e18Var.f(str);
                Object objN2 = e18Var.N();
                if (zF2 || objN2 == lz1Var) {
                    ud0 ud0Var = ud0.d;
                    objN2 = v40.w(str);
                    e18Var.k0(objN2);
                }
                ud0 ud0Var2 = (ud0) objN2;
                if (ud0Var2 != null) {
                    e18Var.a0(-332241850);
                    ud0 ud0Var3 = ud0.d;
                    cv8.b(a.a(ud0Var2, e18Var), strN, b.o(fqbVar2, 16.0f), gm3.a(e18Var).O, e18Var, 392, 0);
                    e18Var.p(false);
                    z = false;
                    fqbVar = fqbVar2;
                } else {
                    String str4 = strN;
                    if (str2 == null || ((Boolean) nwbVar.getValue()).booleanValue()) {
                        z = false;
                        if (str3 != null) {
                            e18Var.a0(-331250439);
                            fqbVar = fqbVar2;
                            tjh.b(quk.i(str3), gb9.N(fqbVar2, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 0.5f, 7), gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (tkh) gm3.c(e18Var).f.G, e18Var, 48, 0, 131064);
                            e18Var = e18Var;
                            e18Var.p(false);
                        } else {
                            fqbVar = fqbVar2;
                            e18Var.a0(-330887584);
                            iv1.b(ud0.B1, str4, null, ef2.F, gm3.a(e18Var).O, e18Var, 3072, 4);
                            e18Var = e18Var;
                            e18Var.p(false);
                        }
                    } else {
                        e18Var.a0(-331859000);
                        boolean zF3 = e18Var.f(str2);
                        Object objN3 = e18Var.N();
                        if (zF3 || objN3 == lz1Var) {
                            fx8 fx8Var = new fx8(context);
                            fx8Var.c = str2;
                            mx8.a(fx8Var);
                            objN3 = fx8Var.a();
                            e18Var.k0(objN3);
                        }
                        jx8 jx8Var = (jx8) objN3;
                        iqb iqbVarO2 = b.o(fqbVar2, 20.0f);
                        boolean zF4 = e18Var.f(nwbVar);
                        Object objN4 = e18Var.N();
                        if (zF4 || objN4 == lz1Var) {
                            objN4 = new x40(i3, nwbVar);
                            e18Var.k0(objN4);
                        }
                        z = false;
                        nuk.d(jx8Var, str4, iqbVarO2, null, null, null, null, (bz7) objN4, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, 0, false, e18Var, 384, 0, 65016);
                        e18Var = e18Var;
                        e18Var.p(false);
                        fqbVar = fqbVar2;
                    }
                }
                e18Var.p(z);
                iqbVar2 = fqbVar;
            } else if (z34Var instanceof CollapsedBlockRowState$IconState$ToolIntegrationIconWithPainter) {
                e18Var.a0(-330451290);
                CollapsedBlockRowState$IconState$ToolIntegrationIconWithPainter collapsedBlockRowState$IconState$ToolIntegrationIconWithPainter = (CollapsedBlockRowState$IconState$ToolIntegrationIconWithPainter) z34Var;
                bpc painter = collapsedBlockRowState$IconState$ToolIntegrationIconWithPainter.getPainter();
                d54 d54Var = collapsedBlockRowState$IconState$ToolIntegrationIconWithPainter.b;
                if (d54Var == null) {
                    e18Var.a0(-980487498);
                    j2 = gm3.a(e18Var).O;
                    e18Var.p(false);
                } else {
                    e18Var.a0(-980488645);
                    e18Var.p(false);
                    j2 = d54Var.a;
                }
                iqbVar2 = fqbVar2;
                cv8.b(painter, collapsedBlockRowState$IconState$ToolIntegrationIconWithPainter.a, b.o(iqbVar2, 16.0f), j2, e18Var, 392, 0);
                e18Var.p(false);
            } else {
                iqbVar2 = fqbVar2;
                if (!(z34Var instanceof x34)) {
                    throw ebh.u(e18Var, -980566367, false);
                }
                e18Var.a0(-330107345);
                iqb iqbVarO3 = b.o(iqbVar2, 8.0f);
                if (((x34) z34Var).a) {
                    e18Var.a0(-980473702);
                    j = gm3.a(e18Var).a;
                    e18Var.p(false);
                } else {
                    e18Var.a0(-980471656);
                    j = gm3.a(e18Var).v;
                    e18Var.p(false);
                }
                dw1.a(yfd.p(iqbVarO3, j, xve.a), e18Var, 0);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new t04(z34Var, iqbVar2, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.xhb r31, boolean r32, defpackage.bz7 r33, defpackage.ld4 r34, int r35) {
        /*
            Method dump skipped, instruction units count: 1408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bok.b(xhb, boolean, bz7, ld4, int):void");
    }

    public static final void c(final ArrayList arrayList, iqb iqbVar, ld4 ld4Var, final int i) {
        final iqb iqbVar2;
        r7e r7eVarS;
        pz7 pz7Var;
        float f;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(621497216);
        int i2 = (e18Var.f(arrayList) ? 4 : 2) | i | 48;
        final int i3 = 1;
        final int i4 = 0;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            List listJ1 = w44.j1(arrayList, 3);
            boolean zIsEmpty = listJ1.isEmpty();
            iqbVar2 = fqb.E;
            if (zIsEmpty) {
                r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    pz7Var = new pz7(arrayList, iqbVar2, i, i4) { // from class: e44
                        public final /* synthetic */ int E;
                        public final /* synthetic */ ArrayList F;
                        public final /* synthetic */ iqb G;

                        {
                            this.E = i4;
                        }

                        @Override // defpackage.pz7
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.E;
                            iei ieiVar = iei.a;
                            iqb iqbVar3 = this.G;
                            ArrayList arrayList2 = this.F;
                            ld4 ld4Var2 = (ld4) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    bok.c(arrayList2, iqbVar3, ld4Var2, x44.p0(1));
                                    break;
                                default:
                                    bok.c(arrayList2, iqbVar3, ld4Var2, x44.p0(1));
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    r7eVarS.d = pz7Var;
                }
                return;
            }
            float f2 = 20.0f;
            iqb iqbVarQ = b.q(iqbVar2, ((listJ1.size() - 1) * 12.0f) + 20.0f, 20.0f);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarQ);
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
            e18Var.a0(729188593);
            int i5 = 0;
            for (Object obj : listJ1) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    x44.n0();
                    throw null;
                }
                yjg yjgVar = (yjg) obj;
                iqb iqbVarP = yfd.p(b.o(lnk.j(sf5.N(iqbVar2, i5 * 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), listJ1.size() - i5), f2), gm3.a(e18Var).o, xve.a);
                o5b o5bVarD2 = dw1.d(lja.K, false);
                int iHashCode2 = Long.hashCode(e18Var.T);
                hyc hycVarL2 = e18Var.l();
                iqb iqbVarE2 = kxk.E(e18Var, iqbVarP);
                dd4.e.getClass();
                re4 re4Var2 = cd4.b;
                e18Var.e0();
                if (e18Var.S) {
                    e18Var.k(re4Var2);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, cd4.f, o5bVarD2);
                d4c.i0(e18Var, cd4.e, hycVarL2);
                d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode2));
                d4c.h0(e18Var, cd4.h);
                d4c.i0(e18Var, cd4.d, iqbVarE2);
                if (yjgVar instanceof wjg) {
                    e18Var.a0(334988038);
                    wjg wjgVar = (wjg) yjgVar;
                    f = 20.0f;
                    cv8.b(u00.D(wjgVar.a, 0, e18Var), wjgVar.b, b.o(iqbVar2, 16.0f), gm3.a(e18Var).O, e18Var, 392, 0);
                    e18Var.p(false);
                } else {
                    f = 20.0f;
                    if (!(yjgVar instanceof xjg)) {
                        throw ebh.u(e18Var, -1790311777, false);
                    }
                    e18Var.a0(335351265);
                    xjg xjgVar = (xjg) yjgVar;
                    d(xjgVar.a, xjgVar.b, xjgVar.c, e18Var, 0);
                    e18Var.p(false);
                }
                e18Var.p(true);
                i5 = i6;
                f2 = f;
            }
            e18Var.p(false);
            e18Var.p(true);
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            pz7Var = new pz7(arrayList, iqbVar2, i, i3) { // from class: e44
                public final /* synthetic */ int E;
                public final /* synthetic */ ArrayList F;
                public final /* synthetic */ iqb G;

                {
                    this.E = i3;
                }

                @Override // defpackage.pz7
                public final Object invoke(Object obj2, Object obj22) {
                    int i52 = this.E;
                    iei ieiVar = iei.a;
                    iqb iqbVar3 = this.G;
                    ArrayList arrayList2 = this.F;
                    ld4 ld4Var2 = (ld4) obj2;
                    ((Integer) obj22).getClass();
                    switch (i52) {
                        case 0:
                            bok.c(arrayList2, iqbVar3, ld4Var2, x44.p0(1));
                            break;
                        default:
                            bok.c(arrayList2, iqbVar3, ld4Var2, x44.p0(1));
                            break;
                    }
                    return ieiVar;
                }
            };
            r7eVarS.d = pz7Var;
        }
    }

    public static final void d(String str, String str2, String str3, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(769748836);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.f(str2) ? 32 : 16) | (e18Var.f(str3) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) e18Var.j(w00.b);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z || objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var.k0(objN);
            }
            nwb nwbVar = (nwb) objN;
            boolean z2 = (i2 & 896) == 256;
            Object objN2 = e18Var.N();
            if (z2 || objN2 == lz1Var) {
                ud0 ud0Var = ud0.d;
                objN2 = v40.w(str3);
                e18Var.k0(objN2);
            }
            ud0 ud0Var2 = (ud0) objN2;
            fqb fqbVar = fqb.E;
            if (ud0Var2 != null) {
                e18Var.a0(757523724);
                ud0 ud0Var3 = ud0.d;
                cv8.b(a.a(ud0Var2, e18Var), str2, b.o(fqbVar, 16.0f), gm3.a(e18Var).O, e18Var, 392 | (i2 & 112), 0);
                e18Var.p(false);
            } else if (str != null && !((Boolean) nwbVar.getValue()).booleanValue()) {
                e18Var.a0(757810443);
                boolean z3 = i3 == 4;
                Object objN3 = e18Var.N();
                if (z3 || objN3 == lz1Var) {
                    fx8 fx8Var = new fx8(context);
                    fx8Var.c = str;
                    mx8.a(fx8Var);
                    objN3 = fx8Var.a();
                    e18Var.k0(objN3);
                }
                jx8 jx8Var = (jx8) objN3;
                iqb iqbVarO = b.o(fqbVar, 16.0f);
                boolean zF = e18Var.f(nwbVar);
                Object objN4 = e18Var.N();
                if (zF || objN4 == lz1Var) {
                    objN4 = new x40(19, nwbVar);
                    e18Var.k0(objN4);
                }
                nuk.d(jx8Var, str2, iqbVarO, null, null, null, null, (bz7) objN4, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, 0, false, e18Var, (i2 & 112) | 384, 0, 65016);
                e18Var.p(false);
            } else if (str2 != null) {
                e18Var.a0(758252968);
                tjh.b(quk.i(str2), null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (tkh) gm3.c(e18Var).f.G, e18Var, 0, 0, 131066);
                e18Var = e18Var;
                e18Var.p(false);
            } else {
                e18Var.a0(758462559);
                iv1.b(ud0.B1, null, null, ef2.F, gm3.a(e18Var).O, e18Var, 3120, 4);
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new f44(str, i, str2, str3, 0);
        }
    }

    public static final long e(int i, int i2, int i3, long j) {
        int i4;
        int iG = kkh.g(j);
        int iF = kkh.f(j);
        if (iF < i) {
            return j;
        }
        if (iG <= i && i2 <= iF) {
            i4 = i3 - (i2 - i);
            if (iG == iF) {
            }
            i = iF + i4;
            return mwa.m(iG, i);
        }
        if (iG > i && iF < i2) {
            i += i3;
            iG = i;
        } else if (iG >= i2) {
            i4 = i3 - (i2 - i);
        } else if (i < iG) {
            iG = i + i3;
            i = (i3 - (i2 - i)) + iF;
        }
        return mwa.m(iG, i);
        iG += i4;
        i = iF + i4;
        return mwa.m(iG, i);
    }

    public static final wm f(List list, String str, String str2, boolean z, kj kjVar, String str3, String str4) {
        Object objPrevious;
        String str5;
        list.getClass();
        str.getClass();
        kjVar.getClass();
        List list2 = list;
        Set setF0 = bnf.f0(bnf.b0(bnf.V(new c54(0, list2), new q6(9)), new q6(10)));
        Set setF02 = bnf.f0(bnf.b0(bnf.V(new c54(0, list2), new q6(11)), new q6(12)));
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((yk) objPrevious).b == xm.E) {
                break;
            }
        }
        yk ykVar = (yk) objPrevious;
        return new wm(str, str2, z, setF0, setF02, kjVar, (ykVar == null || (str5 = ykVar.a) == null || str5.equals(str3) || str5.equals(str4)) ? null : str5);
    }

    public static final void g(dfh dfhVar, int i, int i2) {
        dfhVar.c(i, i2, "");
    }

    public static final void h(WebView webView) {
        ViewParent parent = webView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        webView.setLayerType(0, null);
        viewGroup.removeView(webView);
        webView.post(new bya(webView, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(ys7 ys7Var) {
        if (!((hqb) ys7Var).E.R) {
            b39.c("visitChildren called on an unattached node");
        }
        wwb wwbVar = new wwb(0, new hqb[16]);
        hqb hqbVar = ((hqb) ys7Var).E;
        hqb hqbVar2 = hqbVar.J;
        if (hqbVar2 == null) {
            yfd.i(wwbVar, hqbVar);
        } else {
            wwbVar.b(hqbVar2);
        }
        while (true) {
            int i = wwbVar.G;
            if (i == 0) {
                return;
            }
            hqb hqbVarJ = (hqb) wwbVar.m(i - 1);
            if ((hqbVarJ.H & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
                yfd.i(wwbVar, hqbVarJ);
            } else {
                while (true) {
                    if (hqbVarJ == null) {
                        break;
                    }
                    if ((hqbVarJ.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                        wwb wwbVar2 = null;
                        while (hqbVarJ != null) {
                            if (hqbVarJ instanceof jt7) {
                                jt7 jt7Var = (jt7) hqbVarJ;
                                ns7 ns7Var = ((ts7) yfd.X(jt7Var).getFocusOwner()).d;
                                if (ns7Var.c.a(jt7Var)) {
                                    ns7Var.a();
                                }
                            } else if ((hqbVarJ.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 && (hqbVarJ instanceof qw5)) {
                                int i2 = 0;
                                for (hqb hqbVar3 = ((qw5) hqbVarJ).T; hqbVar3 != null; hqbVar3 = hqbVar3.J) {
                                    if ((hqbVar3.G & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            hqbVarJ = hqbVar3;
                                        } else {
                                            if (wwbVar2 == null) {
                                                wwbVar2 = new wwb(0, new hqb[16]);
                                            }
                                            if (hqbVarJ != null) {
                                                wwbVar2.b(hqbVarJ);
                                                hqbVarJ = null;
                                            }
                                            wwbVar2.b(hqbVar3);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            hqbVarJ = yfd.j(wwbVar2);
                        }
                    } else {
                        hqbVarJ = hqbVarJ.J;
                    }
                }
            }
        }
    }

    public static final void j(dfh dfhVar) {
        euc eucVar = dfhVar.F;
        int length = eucVar.length();
        int length2 = eucVar.length() + 1;
        if (length < 0 || length >= length2) {
            e39.a("Expected " + length + " to be in [0, " + length2 + ')');
        }
        dfhVar.H = mwa.m(length, length);
    }

    public static final void k(dfh dfhVar, int i, int i2) {
        dfhVar.f(mwa.m(wd6.e0(i, 0, dfhVar.F.length()), wd6.e0(i2, 0, dfhVar.F.length())));
    }

    public static final b44 m(whb whbVar, ld4 ld4Var) {
        cpc cpcVar;
        tkh tkhVar;
        z34 y34Var;
        long j;
        if (!(whbVar instanceof vhb)) {
            if (whbVar instanceof uhb) {
                e18 e18Var = (e18) ld4Var;
                e18Var.a0(-1311317809);
                ParsedContentBlock$Thinking parsedContentBlock$Thinking = ((uhb) whbVar).a;
                x34 x34Var = new x34(!parsedContentBlock$Thinking.getIsComplete());
                ThinkingSummary latestSummary = parsedContentBlock$Thinking.getLatestSummary();
                String summary = latestSummary != null ? latestSummary.getSummary() : null;
                if (summary == null) {
                    summary = vb7.n(e18Var, 1620277629, R.string.chat_thinking_block_finished_label, e18Var, false);
                } else {
                    e18Var.a0(1620275552);
                    e18Var.p(false);
                }
                b44 b44Var = new b44(x34Var, new a44(summary, ((jm3) gm3.c(e18Var).e.E).g, !parsedContentBlock$Thinking.getIsComplete(), false));
                e18Var.p(false);
                return b44Var;
            }
            if (!(whbVar instanceof thb)) {
                throw ebh.u((e18) ld4Var, 1620220972, false);
            }
            e18 e18Var2 = (e18) ld4Var;
            e18Var2.a0(-1310684727);
            htc htcVar = ((thb) whbVar).a;
            Tool tool = htcVar.b;
            if (tool instanceof Tool.WebSearch) {
                e18Var2.a0(-1310601554);
                cpcVar = new cpc(a.a(ud0.u0, e18Var2), d4c.j0(R.string.web_search_title, e18Var2));
                e18Var2.p(false);
            } else if (tool instanceof Tool.DriveSearch) {
                e18Var2.a0(-1310447701);
                cpcVar = new cpc(a.a(ud0.k1, e18Var2), d4c.j0(R.string.drive_search_title, e18Var2));
                e18Var2.p(false);
            } else {
                e18Var2.a0(-1310306031);
                cpcVar = new cpc(a.a(ud0.k1, e18Var2), d4c.j0(R.string.generic_search, e18Var2));
                e18Var2.p(false);
            }
            b44 b44Var2 = new b44(new CollapsedBlockRowState$IconState$ToolIntegrationIconWithPainter((bpc) cpcVar.E, (String) cpcVar.F, null), new a44(htcVar.getBody(), ((jm3) gm3.c(e18Var2).e.E).g, !htcVar.e, htcVar.f));
            e18Var2.p(false);
            return b44Var2;
        }
        e18 e18Var3 = (e18) ld4Var;
        e18Var3.a0(-1312745948);
        qxh qxhVar = ((vhb) whbVar).a;
        String messageText = qxhVar.getMessageText();
        if (messageText == null) {
            messageText = qxhVar.getToolName();
        }
        String toolName = qxhVar.getToolName();
        if (x44.r(messageText, bsg.e1(toolName, ":", toolName))) {
            e18Var3.a0(-1312623498);
            tkhVar = (tkh) ((wk) gm3.c(e18Var3).e.F).i;
            e18Var3.p(false);
        } else {
            e18Var3.a0(-1312544479);
            tkhVar = ((jm3) gm3.c(e18Var3).e.E).g;
            e18Var3.p(false);
        }
        Integer toolIconResId = qxhVar.getToolIconResId();
        if (toolIconResId != null) {
            e18Var3.a0(-1312338205);
            bpc bpcVarD = u00.D(toolIconResId.intValue(), 0, e18Var3);
            String integrationName = qxhVar.getIntegrationName();
            d54 d54VarMo681getToolIconTintQN2ZGVo = qxhVar.mo681getToolIconTintQN2ZGVo();
            if (d54VarMo681getToolIconTintQN2ZGVo == null) {
                e18Var3.a0(1620243817);
                j = ((d54) e18Var3.j(on4.a)).a;
                e18Var3.p(false);
            } else {
                e18Var3.a0(1620242329);
                e18Var3.p(false);
                j = d54VarMo681getToolIconTintQN2ZGVo.a;
            }
            y34Var = new CollapsedBlockRowState$IconState$ToolIntegrationIconWithPainter(bpcVarD, integrationName, new d54(j));
            e18Var3.p(false);
        } else {
            e18Var3.a0(-1311987223);
            e18Var3.p(false);
            y34Var = new y34(qxhVar.getIntegrationIconUrl(), qxhVar.getIntegrationName(), qxhVar.getIconName());
        }
        b44 b44Var3 = new b44(y34Var, new a44(messageText, tkhVar, !qxhVar.getIsComplete(), qxhVar.isError()));
        e18Var3.p(false);
        return b44Var3;
    }

    public static final HealthMetricOutcome n(bne bneVar) {
        if (bneVar.equals(ane.a)) {
            return HealthMetricOutcome.SUCCESS;
        }
        if (bneVar instanceof yme) {
            return HealthMetricOutcome.FAILURE;
        }
        if (bneVar.equals(zme.a)) {
            return HealthMetricOutcome.HANDOFF;
        }
        if (bneVar.equals(xme.a)) {
            return HealthMetricOutcome.ABORTED;
        }
        wg6.i();
        return null;
    }

    public static byte o(Boolean bool) {
        if (bool != null) {
            return !bool.booleanValue() ? (byte) 0 : (byte) 1;
        }
        return (byte) -1;
    }

    public static Boolean p(byte b2) {
        if (b2 == 0) {
            return Boolean.FALSE;
        }
        if (b2 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }
}
