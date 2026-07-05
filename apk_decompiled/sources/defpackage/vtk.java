package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.compose.foundation.layout.b;
import anthropic.claude.usercontent.UnknownMessage;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.WebViewEvents$WebViewKind;
import com.anthropic.claude.api.chat.tool.CodeBlockDisplayContent;
import com.anthropic.claude.api.chat.tool.JsonBlockDisplayContent;
import com.anthropic.claude.api.chat.tool.RichItem;
import com.anthropic.claude.api.chat.tool.RichItemsDisplayContent;
import com.anthropic.claude.api.chat.tool.RichLinkDisplayContent;
import com.anthropic.claude.api.chat.tool.TableDisplayContent;
import com.anthropic.claude.api.chat.tool.TextDisplayContent;
import com.anthropic.claude.api.chat.tool.ToolDisplayContent;
import com.anthropic.claude.api.chat.tool.UnknownDisplayContent;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.tool.model.KnowledgeSource;
import com.pvporbit.freetype.FreeTypeConstants;
import com.squareup.wire.AnyMessage;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vtk {
    public static final ta4 a = new ta4(466842926, false, new xb4(28));
    public static final ta4 b = new ta4(-1999514041, false, new qb4(2));

    public static final void a(String str, iqb iqbVar, n3f n3fVar, ld4 ld4Var, int i) {
        n3f n3fVar2;
        int i2;
        n3f n3fVar3;
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(218267184);
        int i3 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.f(iqbVar) ? 32 : 16) | FreeTypeConstants.FT_LOAD_PEDANTIC;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            e18Var.V();
            int i4 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i4 == 0 || e18Var.A()) {
                m7f m7fVarN = sq6.n(e18Var, -1168520582, e18Var, -1633490746);
                boolean zF = e18Var.f(null) | e18Var.f(m7fVarN);
                Object objN = e18Var.N();
                if (zF || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(n3f.class), null, null);
                    e18Var.k0(objN);
                }
                e18Var.p(false);
                e18Var.p(false);
                i2 = i3 & (-897);
                n3fVar3 = (n3f) objN;
            } else {
                e18Var.T();
                i2 = i3 & (-897);
                n3fVar3 = n3fVar;
            }
            e18Var.q();
            Object objN2 = e18Var.N();
            if (objN2 == lz1Var) {
                ot0 ot0Var = new ot0(n3fVar3.a(WebViewEvents$WebViewKind.CONTENT));
                e18Var.k0(ot0Var);
                objN2 = ot0Var;
            }
            int i5 = m3f.c;
            grk.a(str, iqbVar, "file:///", "image/svg+xml", null, (ot0) objN2, false, false, e18Var, (i2 & 112) | (i2 & 14) | 3456 | 262144, 208);
            n3fVar2 = n3fVar3;
        } else {
            e18Var.T();
            n3fVar2 = n3fVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m6(str, i, iqbVar, n3fVar2, 10);
        }
    }

    public static final void b(m0c m0cVar, boolean z, boolean z2, zy7 zy7Var, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        m0cVar.getClass();
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-2036436469);
        int i7 = i | (e18Var.d(m0cVar.ordinal()) ? 4 : 2) | (e18Var.g(z) ? 32 : 16) | (e18Var.g(z2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        if (e18Var.Q(i7 & 1, (i7 & 9363) != 9362)) {
            iqb iqbVarJ = gb9.J(j8.e0(iqbVar, z, false, null, zy7Var, 14), 16.0f);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
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
            d4c.i0(e18Var, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            wo1 wo1Var = lja.Q;
            cxe cxeVarA = axe.a(ko0.g, wo1Var, e18Var, 54);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarC);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, cxeVarA);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            cxe cxeVarA2 = axe.a(new ho0(8.0f, true, new sz6(1)), wo1Var, e18Var, 54);
            int iHashCode3 = Long.hashCode(e18Var.T);
            hyc hycVarL3 = e18Var.l();
            iqb iqbVarE3 = kxk.E(e18Var, fqbVar);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, cxeVarA2);
            d4c.i0(e18Var, z80Var2, hycVarL3);
            ij0.t(iHashCode3, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE3);
            int iOrdinal = m0cVar.ordinal();
            if (iOrdinal != 0) {
                z4 = true;
                if (iOrdinal != 1) {
                    i2 = 2;
                    if (iOrdinal != 2) {
                        throw ebh.u(e18Var, -1257077565, false);
                    }
                    i3 = -1257070317;
                    i4 = R.string.ccr_onboarding_network_full;
                    z3 = false;
                } else {
                    i2 = 2;
                    z3 = false;
                    i3 = -1257073165;
                    i4 = R.string.ccr_onboarding_network_none;
                }
            } else {
                i2 = 2;
                z3 = false;
                z4 = true;
                i3 = -1257076106;
                i4 = R.string.ccr_onboarding_network_trusted;
            }
            boolean z5 = z4;
            tjh.b(vb7.n(e18Var, i3, i4, e18Var, z3), null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).h, e18Var, 0, 0, 131066);
            e18 e18Var2 = e18Var;
            if (z2) {
                e18Var2.a0(9485131);
                tjh.b(d4c.j0(R.string.ccr_onboarding_recommended, e18Var2), gb9.K(yfd.p(ez1.t(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var2).l, xve.b(6.0f)), gm3.a(e18Var2).m, xve.b(6.0f)), 6.0f, 2.0f), gm3.a(e18Var2).j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).k, e18Var2, 0, 0, 131064);
                e18Var2 = e18Var2;
                e18Var2.p(z3);
            } else {
                e18Var2.a0(10285241);
                e18Var2.p(z3);
            }
            e18Var2.p(z5);
            if (z) {
                e18Var2.a0(-1861274037);
                cv8.b(a.a(ud0.N, e18Var2), null, b.o(fqbVar, 20.0f), gm3.a(e18Var2).c, e18Var2, 440, 0);
                e18Var2.p(z3);
            } else {
                e18Var2.a0(-1860935331);
                e18Var2.p(z3);
            }
            e18Var2.p(z5);
            kxk.g(e18Var2, b.e(fqbVar, 4.0f));
            int iOrdinal2 = m0cVar.ordinal();
            if (iOrdinal2 == 0) {
                i5 = -1590770010;
                i6 = R.string.ccr_onboarding_network_trusted_description;
            } else if (iOrdinal2 == z5) {
                i5 = -1590766685;
                i6 = R.string.ccr_onboarding_network_none_description;
            } else {
                if (iOrdinal2 != i2) {
                    throw ebh.u(e18Var2, -1590771445, z3);
                }
                i5 = -1590763453;
                i6 = R.string.ccr_onboarding_network_full_description;
            }
            e18 e18Var3 = e18Var2;
            tjh.b(vb7.n(e18Var2, i5, i6, e18Var2, z3), null, gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var3, 0, 0, 131066);
            e18Var = e18Var3;
            e18Var.p(z5);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new iw0(m0cVar, z, z2, zy7Var, iqbVar, i, 5);
        }
    }

    public static final void c(final mnc mncVar, float f, final ta4 ta4Var, ld4 ld4Var, final int i, final int i2) {
        final float f2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(897013632);
        int i3 = (e18Var.f(mncVar) ? 4 : 2) | i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= e18Var.c(f) ? 32 : 16;
        }
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            f2 = i4 != 0 ? 12.0f : f;
            fqb fqbVar = fqb.E;
            iqb iqbVarI = gb9.I(fqbVar, mncVar);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
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
            kxk.g(e18Var, b.e(fqbVar, f2));
            ta4Var.invoke(e18Var, 6);
            grc.z(fqbVar, f2, e18Var, true);
        } else {
            e18Var.T();
            f2 = f;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: gwh
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vtk.c(mncVar, f2, ta4Var, (ld4) obj, x44.p0(i | 1), i2);
                    return iei.a;
                }
            };
        }
    }

    public static final void d(j0a j0aVar, ToolDisplayContent toolDisplayContent, ToolDisplayContent toolDisplayContent2, String str, bz7 bz7Var, bz7 bz7Var2, mnc mncVar) {
        j0aVar.getClass();
        str.getClass();
        bz7Var.getClass();
        bz7Var2.getClass();
        mncVar.getClass();
        int i = 1;
        boolean z = toolDisplayContent != null;
        boolean z2 = toolDisplayContent2 != null;
        kwh kwhVar = kwh.E;
        if (z) {
            if (z2) {
                j0aVar.U(lwh.E, kwhVar, new ta4(-1586100341, true, new re(mncVar, i)));
            }
            f(j0aVar, str, toolDisplayContent, lwh.F, bz7Var, bz7Var2, mncVar);
        }
        if (z2) {
            if (z) {
                j0aVar.U(lwh.G, kwhVar, new ta4(-126592780, true, new re(mncVar, 2)));
            }
            f(j0aVar, str, toolDisplayContent2, lwh.H, bz7Var, bz7Var2, mncVar);
        }
    }

    public static final void e(String str, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-2057236376);
        int i2 = i | (e18Var2.f(str) ? 4 : 2) | 48;
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            tkh tkhVar = ((jm3) gm3.c(e18Var2).e.E).h;
            long j = gm3.a(e18Var2).O;
            fqb fqbVar = fqb.E;
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            Object objN = e18Var2.N();
            if (objN == jd4.a) {
                objN = new x2h(28);
                e18Var2.k0(objN);
            }
            e18Var = e18Var2;
            tjh.b(str, tjf.b(iqbVarC, false, (bz7) objN), j, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, tkhVar, e18Var, i2 & 14, 24960, 110584);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ip(str, iqbVar2, i, 19);
        }
    }

    public static final void f(j0a j0aVar, String str, final ToolDisplayContent toolDisplayContent, lwh lwhVar, bz7 bz7Var, bz7 bz7Var2, final mnc mncVar) {
        final int i = 0;
        final int i2 = 1;
        if (toolDisplayContent instanceof CodeBlockDisplayContent) {
            j0aVar.U(lwhVar + "_" + lwh.I, kwh.F, new ta4(1123044234, true, new rz7() { // from class: iwh
                @Override // defpackage.rz7
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i3 = i;
                    iei ieiVar = iei.a;
                    ToolDisplayContent toolDisplayContent2 = toolDisplayContent;
                    int i4 = 1;
                    px9 px9Var = (px9) obj;
                    ld4 ld4Var = (ld4) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (i3) {
                        case 0:
                            px9Var.getClass();
                            e18 e18Var = (e18) ld4Var;
                            if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                e18Var.T();
                            } else {
                                vtk.c(mncVar, 4.0f, fd9.q0(-540259922, new pvh(toolDisplayContent2, 2), e18Var), e18Var, 432, 0);
                            }
                            break;
                        case 1:
                            px9Var.getClass();
                            e18 e18Var2 = (e18) ld4Var;
                            if (!e18Var2.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                e18Var2.T();
                            } else {
                                vtk.c(mncVar, 4.0f, fd9.q0(-1917248219, new pvh(toolDisplayContent2, i4), e18Var2), e18Var2, 432, 0);
                            }
                            break;
                        default:
                            px9Var.getClass();
                            e18 e18Var3 = (e18) ld4Var;
                            if (!e18Var3.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                e18Var3.T();
                            } else {
                                vtk.c(mncVar, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-862460119, new pvh(toolDisplayContent2, 3), e18Var3), e18Var3, 384, 2);
                            }
                            break;
                    }
                    return ieiVar;
                }
            }));
            return;
        }
        if (toolDisplayContent instanceof JsonBlockDisplayContent) {
            j0aVar.U(lwhVar + "_" + lwh.J, kwh.G, new ta4(-1209788415, true, new rz7() { // from class: iwh
                @Override // defpackage.rz7
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i3 = i2;
                    iei ieiVar = iei.a;
                    ToolDisplayContent toolDisplayContent2 = toolDisplayContent;
                    int i4 = 1;
                    px9 px9Var = (px9) obj;
                    ld4 ld4Var = (ld4) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (i3) {
                        case 0:
                            px9Var.getClass();
                            e18 e18Var = (e18) ld4Var;
                            if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                e18Var.T();
                            } else {
                                vtk.c(mncVar, 4.0f, fd9.q0(-540259922, new pvh(toolDisplayContent2, 2), e18Var), e18Var, 432, 0);
                            }
                            break;
                        case 1:
                            px9Var.getClass();
                            e18 e18Var2 = (e18) ld4Var;
                            if (!e18Var2.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                e18Var2.T();
                            } else {
                                vtk.c(mncVar, 4.0f, fd9.q0(-1917248219, new pvh(toolDisplayContent2, i4), e18Var2), e18Var2, 432, 0);
                            }
                            break;
                        default:
                            px9Var.getClass();
                            e18 e18Var3 = (e18) ld4Var;
                            if (!e18Var3.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                e18Var3.T();
                            } else {
                                vtk.c(mncVar, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-862460119, new pvh(toolDisplayContent2, 3), e18Var3), e18Var3, 384, 2);
                            }
                            break;
                    }
                    return ieiVar;
                }
            }));
            return;
        }
        if (toolDisplayContent instanceof RichItemsDisplayContent) {
            List<RichItem> content = ((RichItemsDisplayContent) toolDisplayContent).getContent();
            ArrayList arrayList = new ArrayList(x44.y(content, 10));
            for (RichItem richItem : content) {
                wq9 wq9Var = KnowledgeSource.Companion;
                boolean zContains = dr9.b.contains(str);
                wq9Var.getClass();
                arrayList.add(wq9.c(richItem, zContains));
            }
            fuk.p(j0aVar, arrayList, bz7Var2, new jwh(lwhVar, i), mncVar);
            return;
        }
        if (toolDisplayContent instanceof RichLinkDisplayContent) {
            j0aVar.U(lwhVar + "_" + lwh.L, kwh.I, new ta4(-682394365, true, new h9a(toolDisplayContent, mncVar, bz7Var, bz7Var2, 14)));
            return;
        }
        if (toolDisplayContent instanceof TableDisplayContent) {
            List<List<String>> table = ((TableDisplayContent) toolDisplayContent).getTable();
            jwh jwhVar = new jwh(lwhVar, i2);
            j0aVar.getClass();
            table.getClass();
            mncVar.getClass();
            j0aVar.W(table.size(), new zkd(jwhVar, 18, table), new wxf(table, 7), new ta4(2039820996, true, new lp(table, mncVar, table, 11)));
            return;
        }
        boolean z = toolDisplayContent instanceof TextDisplayContent;
        kwh kwhVar = kwh.K;
        if (z) {
            final int i3 = 2;
            j0aVar.U(lwhVar + "_" + lwh.N, kwhVar, new ta4(-155000315, true, new rz7() { // from class: iwh
                @Override // defpackage.rz7
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i32 = i3;
                    iei ieiVar = iei.a;
                    ToolDisplayContent toolDisplayContent2 = toolDisplayContent;
                    int i4 = 1;
                    px9 px9Var = (px9) obj;
                    ld4 ld4Var = (ld4) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (i32) {
                        case 0:
                            px9Var.getClass();
                            e18 e18Var = (e18) ld4Var;
                            if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                e18Var.T();
                            } else {
                                vtk.c(mncVar, 4.0f, fd9.q0(-540259922, new pvh(toolDisplayContent2, 2), e18Var), e18Var, 432, 0);
                            }
                            break;
                        case 1:
                            px9Var.getClass();
                            e18 e18Var2 = (e18) ld4Var;
                            if (!e18Var2.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                e18Var2.T();
                            } else {
                                vtk.c(mncVar, 4.0f, fd9.q0(-1917248219, new pvh(toolDisplayContent2, i4), e18Var2), e18Var2, 432, 0);
                            }
                            break;
                        default:
                            px9Var.getClass();
                            e18 e18Var3 = (e18) ld4Var;
                            if (!e18Var3.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                e18Var3.T();
                            } else {
                                vtk.c(mncVar, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-862460119, new pvh(toolDisplayContent2, 3), e18Var3), e18Var3, 384, 2);
                            }
                            break;
                    }
                    return ieiVar;
                }
            }));
            return;
        }
        if (!(toolDisplayContent instanceof UnknownDisplayContent)) {
            wg6.i();
            return;
        }
        j0aVar.U(lwhVar + "_" + lwh.O, kwhVar, new ta4(108696710, true, new re(mncVar, 3)));
    }

    public static final void g(AnyMessage anyMessage) {
        if (anyMessage != null) {
            String typeUrl = anyMessage.getTypeUrl();
            ProtoAdapter<UnknownMessage> protoAdapter = UnknownMessage.ADAPTER;
            if (x44.r(typeUrl, protoAdapter.getTypeUrl())) {
                SilentException.a(new SilentException(ij0.j("SandboxWebView: Unknown payload message type: '", ((UnknownMessage) anyMessage.unpack(protoAdapter)).getType(), "'")), null, false, 3);
            }
        }
    }

    public static Object h(v84 v84Var, vp4 vp4Var) {
        lz1 lz1Var = uh6.F;
        long jQ = v40.Q(30, zh6.SECONDS);
        return iuj.P(d4c.o0(jQ), new fze(v84Var, null, 1), vp4Var);
    }

    public static coj i(Context context) {
        dgj.v(context);
        return new coj(context, new roj());
    }

    public static final void j(BroadcastReceiver broadcastReceiver, c45 c45Var, pz7 pz7Var) {
        mp4 mp4VarC = fd9.c(c45Var);
        gb9.D(mp4VarC, null, null, new t74(mp4VarC, broadcastReceiver.goAsync(), pz7Var, null, 14), 3);
    }
}
