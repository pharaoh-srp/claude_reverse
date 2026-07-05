package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.CodeBlockDisplayContent;
import com.anthropic.claude.api.chat.tool.JsonBlockDisplayContent;
import com.anthropic.claude.api.chat.tool.RichItem;
import com.anthropic.claude.api.chat.tool.RichItemsDisplayContent;
import com.anthropic.claude.api.chat.tool.RichLinkDisplayContent;
import com.anthropic.claude.api.chat.tool.TableDisplayContent;
import com.anthropic.claude.api.chat.tool.TextDisplayContent;
import com.anthropic.claude.api.chat.tool.ToolDisplayContent;
import com.anthropic.claude.api.chat.tool.UnknownDisplayContent;
import com.anthropic.claude.api.conway.WebhookRecord;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class htk {
    public static final ta4 a = new ta4(-441745150, false, new xb4(18));

    public static final void a(ml3 ml3Var, bz7 bz7Var, iqb iqbVar, qi3 qi3Var, gr0 gr0Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        qi3 qi3Var2;
        gr0 gr0Var2;
        qi3 qi3Var3;
        int i3;
        gr0 gr0Var3;
        bz7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-2064066371);
        int i4 = 4;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var2.f(ml3Var) : e18Var2.h(ml3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(bz7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 9363) != 9362)) {
            e18Var2.V();
            int i5 = i & 1;
            tp4 tp4Var = null;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var2.A()) {
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(qi3.class), null, null);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                qi3Var3 = (qi3) objN;
                m7f m7fVar = (m7f) e18Var2.j(gr9.b);
                boolean zH = e18Var2.h(m7fVar);
                Object objN2 = e18Var2.N();
                if (zH || objN2 == lz1Var) {
                    objN2 = new di(m7fVar, i4);
                    e18Var2.k0(objN2);
                }
                kce kceVar = jce.a;
                gr0 gr0Var4 = (gr0) fd9.r0(kceVar.b(gr0.class), oq5.B(kceVar.b(gr0.class)), (bz7) objN2, e18Var2);
                i3 = i2 & (-64513);
                gr0Var3 = gr0Var4;
            } else {
                e18Var2.T();
                qi3Var3 = qi3Var;
                i3 = i2 & (-64513);
                gr0Var3 = gr0Var;
            }
            e18Var2.q();
            boolean zH2 = e18Var2.h(qi3Var3);
            Object objN3 = e18Var2.N();
            if (zH2 || objN3 == lz1Var) {
                objN3 = new gw(qi3Var3, tp4Var, 5);
                e18Var2.k0(objN3);
            }
            csg.g((bz7) objN3, e18Var2, 0, 1);
            Object objN4 = e18Var2.N();
            if (objN4 == lz1Var) {
                objN4 = sq6.p(e18Var2);
            }
            ybg ybgVar = (ybg) objN4;
            qnc qncVar = n2i.a;
            g77 g77VarA = n2i.a(eg0.h(e18Var2), e18Var2, 14);
            zni.g(gr0Var3.f, ybgVar, e18Var2, 48);
            int i6 = 6;
            e18Var = e18Var2;
            v40.b(iqbVar, null, fd9.q0(-1997210688, new kn(g77VarA, i6, ml3Var), e18Var2), null, fd9.q0(1022832962, new rn(ybgVar, i4), e18Var2), null, 0, 0L, 0L, null, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(62895091, new ye(gr0Var3, g77VarA, bz7Var, i6), e18Var2), e18Var, ((i3 >> 6) & 14) | 24960, 2026);
            qi3Var2 = qi3Var3;
            gr0Var2 = gr0Var3;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            qi3Var2 = qi3Var;
            gr0Var2 = gr0Var;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pk((Object) ml3Var, (Object) bz7Var, iqbVar, (Object) qi3Var2, (Object) gr0Var2, i, 2);
        }
    }

    public static final void b(int i, ld4 ld4Var, iqb iqbVar, String str, String str2) {
        String str3;
        int i2;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-616973313);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (e18Var2.f(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 147) != 146)) {
            ho0 ho0Var = new ho0(12.0f, true, new sz6(1));
            iqb iqbVarJ = gb9.J(ez1.t(iqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var2).u, gm3.b(e18Var2).c), 16.0f);
            q64 q64VarA = p64.a(ho0Var, lja.S, e18Var2, 6);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarJ);
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
            tjh.b(str3, null, gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).j, e18Var2, i2 & 14, 0, 131066);
            tjh.b(str2, null, gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, (i2 >> 3) & 14, 0, 131066);
            e18Var = e18Var2;
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new t6e(str, str2, iqbVar, i, 2);
        }
    }

    public static final void c(ta4 ta4Var, String str, String str2, String str3, String str4, ToolDisplayContent toolDisplayContent, iqb iqbVar, mnc mncVar, ld4 ld4Var, int i) {
        int i2;
        String str5;
        ta4 ta4Var2;
        ij0.z(str, str2, str3, str4);
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(30669358);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(ta4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str5 = str;
            i2 |= e18Var.f(str5) ? 32 : 16;
        } else {
            str5 = str;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(str2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.f(str3) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.f(str4) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var.f(toolDisplayContent) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= e18Var.f(mncVar) ? 8388608 : 4194304;
        }
        if (e18Var.Q(i2 & 1, (4793491 & i2) != 4793490)) {
            ho0 ho0Var = new ho0(16.0f, true, new sz6(1));
            iqb iqbVarI = gb9.I(iqbVar, mncVar);
            q64 q64VarA = p64.a(ho0Var, lja.S, e18Var, 6);
            int i3 = i2;
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarI);
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
            int i4 = 0;
            tjh.b(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).g, e18Var, (i3 >> 6) & 14, 0, 131070);
            e18Var = e18Var;
            if (toolDisplayContent == null) {
                e18Var.a0(70411737);
                e18Var.p(false);
                ta4Var2 = null;
            } else {
                e18Var.a0(70411738);
                ta4 ta4VarQ0 = fd9.q0(-1779380692, new pvh(toolDisplayContent, i4), e18Var);
                e18Var.p(false);
                ta4Var2 = ta4VarQ0;
            }
            fqb fqbVar = fqb.E;
            nuk.f(ta4Var, str5, b.c(fqbVar, 1.0f), ta4Var2, e18Var, (i3 & 14) | 384 | (i3 & 112));
            int i5 = i3 >> 9;
            b((i5 & 112) | (i5 & 14) | 384, e18Var, b.c(fqbVar, 1.0f), str3, str4);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new we(ta4Var, str, str2, str3, str4, toolDisplayContent, iqbVar, mncVar, i, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r16v6, types: [boolean] */
    public static final void d(ToolDisplayContent toolDisplayContent, iqb iqbVar, ld4 ld4Var, int i) throws IOException {
        e18 e18Var;
        String url;
        iqb iqbVar2 = iqbVar;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-480197948);
        int i2 = 2;
        int i3 = i | (e18Var2.f(toolDisplayContent) ? 4 : 2);
        boolean z = true;
        ?? r12 = 0;
        if (e18Var2.Q(i3 & 1, (i3 & 19) != 18)) {
            float f = 16.0f;
            if (toolDisplayContent instanceof TableDisplayContent) {
                e18Var2.a0(-1908721121);
                q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
                int iHashCode = Long.hashCode(e18Var2.T);
                hyc hycVarL = e18Var2.l();
                iqb iqbVarE = kxk.E(e18Var2, iqbVar2);
                dd4.e.getClass();
                zy7 zy7Var = cd4.b;
                e18Var2.e0();
                if (e18Var2.S) {
                    e18Var2.k(zy7Var);
                } else {
                    e18Var2.n0();
                }
                d4c.i0(e18Var2, cd4.f, q64VarA);
                d4c.i0(e18Var2, cd4.e, hycVarL);
                d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
                d4c.h0(e18Var2, cd4.h);
                d4c.i0(e18Var2, cd4.d, iqbVarE);
                e18Var2.a0(415507663);
                int i4 = 0;
                e18 e18Var3 = e18Var2;
                for (Object obj : ((TableDisplayContent) toolDisplayContent).getTable()) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        x44.n0();
                        throw null;
                    }
                    List list = (List) obj;
                    fqb fqbVar = fqb.E;
                    if (i4 > 0) {
                        e18Var3.a0(-795142586);
                        iuj.e(gb9.L(fqbVar, f, MTTypesetterKt.kLineSkipLimitMultiplier, i2), MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var3).u, e18Var3, 54, 0);
                        e18Var3.p(r12);
                    } else {
                        e18Var3.a0(-794910427);
                        e18Var3.p(r12);
                    }
                    iqb iqbVarJ = gb9.J(b.c(fqbVar, 1.0f), f);
                    cxe cxeVarA = axe.a(ko0.a, lja.P, e18Var3, r12);
                    int iHashCode2 = Long.hashCode(e18Var3.T);
                    hyc hycVarL2 = e18Var3.l();
                    iqb iqbVarE2 = kxk.E(e18Var3, iqbVarJ);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var);
                    } else {
                        e18Var3.n0();
                    }
                    d4c.i0(e18Var3, cd4.f, cxeVarA);
                    d4c.i0(e18Var3, cd4.e, hycVarL2);
                    d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var3, cd4.h);
                    d4c.i0(e18Var3, cd4.d, iqbVarE2);
                    String str = (String) w44.O0(r12, list);
                    if (str == null) {
                        str = "";
                    }
                    tkh tkhVar = ((jm3) gm3.c(e18Var3).e.E).j;
                    long j = gm3.a(e18Var3).N;
                    if (1.0f <= 0.0d) {
                        z29.a("invalid weight; must be greater than zero");
                    }
                    e18 e18Var4 = e18Var3;
                    ?? r16 = z;
                    tjh.b(str, new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, z), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var4, 0, 0, 131064);
                    kxk.g(e18Var4, b.t(fqbVar, 24.0f));
                    e18Var4.a0(534899010);
                    String str2 = (String) (r16 < list.size() ? list.get(r16 == true ? 1 : 0) : d4c.j0(R.string.tool_approval_table_empty_value, e18Var4));
                    e18Var4.p(false);
                    tkh tkhVar2 = ((jm3) gm3.c(e18Var4).e.E).i;
                    long j2 = gm3.a(e18Var4).O;
                    float f2 = 1.8f;
                    if (1.8f <= 0.0d) {
                        z29.a("invalid weight; must be greater than zero");
                    }
                    if (1.8f > Float.MAX_VALUE) {
                        f2 = Float.MAX_VALUE;
                    }
                    tjh.b(str2, new hw9(f2, r16), j2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar2, e18Var4, 0, 0, 131064);
                    e18 e18Var5 = e18Var4;
                    e18Var5.p(r16);
                    z = r16 == true ? 1 : 0;
                    r12 = 0;
                    i4 = i5;
                    i2 = 2;
                    f = 16.0f;
                    e18Var3 = e18Var5;
                }
                boolean z2 = r12;
                ij0.w(e18Var3, z2, z, z2);
                iqbVar2 = iqbVar;
                e18Var = e18Var3;
            } else if (toolDisplayContent instanceof TextDisplayContent) {
                e18Var2.a0(960453466);
                iqbVar2 = iqbVar;
                tjh.b(((TextDisplayContent) toolDisplayContent).getText(), gb9.J(iqbVar, 16.0f), gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).g, e18Var2, 0, 0, 131064);
                e18 e18Var6 = e18Var2;
                e18Var6.p(false);
                e18Var = e18Var6;
            } else {
                iqbVar2 = iqbVar;
                if (toolDisplayContent instanceof JsonBlockDisplayContent) {
                    e18Var2.a0(960686617);
                    tjh.b(((JsonBlockDisplayContent) toolDisplayContent).getJson_block(), gb9.J(iqbVar2, 16.0f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (tkh) ((wk) gm3.c(e18Var2).e.F).i, e18Var2, 0, 0, 131068);
                    e18 e18Var7 = e18Var2;
                    e18Var7.p(false);
                    e18Var = e18Var7;
                } else if (toolDisplayContent instanceof CodeBlockDisplayContent) {
                    e18Var2.a0(960889791);
                    tjh.b(((CodeBlockDisplayContent) toolDisplayContent).getCode(), gb9.J(iqbVar2, 16.0f), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (tkh) ((wk) gm3.c(e18Var2).e.F).i, e18Var2, 0, 0, 131068);
                    e18 e18Var8 = e18Var2;
                    e18Var8.p(false);
                    e18Var = e18Var8;
                } else if (toolDisplayContent instanceof RichItemsDisplayContent) {
                    e18Var2.a0(961279554);
                    List<RichItem> content = ((RichItemsDisplayContent) toolDisplayContent).getContent();
                    ArrayList arrayList = new ArrayList();
                    for (RichItem richItem : content) {
                        String title = richItem.getTitle();
                        if (title == null) {
                            title = richItem.getUrl();
                        }
                        if (title != null) {
                            arrayList.add(title);
                        }
                    }
                    tjh.b(w44.S0(arrayList, "\n", null, null, null, 62), gb9.J(iqbVar2, 16.0f), gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).g, e18Var2, 0, 0, 131064);
                    e18 e18Var9 = e18Var2;
                    e18Var9.p(false);
                    e18Var = e18Var9;
                } else if (toolDisplayContent instanceof RichLinkDisplayContent) {
                    e18Var2.a0(961567606);
                    RichLinkDisplayContent richLinkDisplayContent = (RichLinkDisplayContent) toolDisplayContent;
                    String title2 = richLinkDisplayContent.getLink().getTitle();
                    if (title2 == null) {
                        url = richLinkDisplayContent.getLink().getUrl();
                        if (url == null) {
                            url = "";
                        }
                    } else {
                        url = title2;
                    }
                    tjh.b(url, gb9.J(iqbVar2, 16.0f), gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).g, e18Var2, 0, 0, 131064);
                    e18 e18Var10 = e18Var2;
                    e18Var10.p(false);
                    e18Var = e18Var10;
                } else {
                    if (!(toolDisplayContent instanceof UnknownDisplayContent)) {
                        throw ebh.u(e18Var2, -1908721113, false);
                    }
                    e18Var2.a0(961981084);
                    e18Var2.p(false);
                    e18Var = e18Var2;
                }
            }
        } else {
            e18Var2.T();
            e18Var = e18Var2;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ufe(toolDisplayContent, iqbVar2, i, 28);
        }
    }

    public static final String e(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        sb.append(mp0.M0(parameterTypes, "", "(", ")", p9d.a0, 24));
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        sb.append(yae.b(returnType));
        return sb.toString();
    }

    public static void f(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static gub g(String str, String str2, tie tieVar) {
        tieVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("form-data; name=");
        p8b p8bVar = hub.e;
        gtk.e(sb, str);
        if (str2 != null) {
            sb.append("; filename=");
            gtk.e(sb, str2);
        }
        String string = sb.toString();
        gmf gmfVar = new gmf(16);
        gmfVar.u("Content-Disposition", string);
        wg8 wg8VarV = gmfVar.v();
        if (wg8VarV.a("Content-Type") != null) {
            sz6.p("Unexpected header: Content-Type");
            return null;
        }
        if (wg8VarV.a("Content-Length") == null) {
            return new gub(wg8VarV, tieVar);
        }
        sz6.p("Unexpected header: Content-Length");
        return null;
    }

    public static final a25 h(WebhookRecord webhookRecord) {
        webhookRecord.getClass();
        boolean zR = x44.r(webhookRecord.getSource(), "github");
        a25 a25Var = a25.G;
        if (zR) {
            return a25Var;
        }
        boolean zR2 = x44.r(webhookRecord.getSource(), "linear");
        a25 a25Var2 = a25.H;
        if (zR2) {
            return a25Var2;
        }
        boolean zR3 = x44.r(webhookRecord.getSource(), "stripe");
        a25 a25Var3 = a25.I;
        if (zR3) {
            return a25Var3;
        }
        boolean zR4 = x44.r(webhookRecord.getSource(), "slack");
        a25 a25Var4 = a25.J;
        return zR4 ? a25Var4 : x44.r(webhookRecord.getAuth_type(), "github_hmac256") ? a25Var : x44.r(webhookRecord.getAuth_type(), "linear_hmac256") ? a25Var2 : x44.r(webhookRecord.getAuth_type(), "stripe_hmac256") ? a25Var3 : x44.r(webhookRecord.getAuth_type(), "slack_signing") ? a25Var4 : (webhookRecord.getAuth_type() == null || x44.r(webhookRecord.getAuth_type(), "none")) ? a25.L : a25.K;
    }
}
