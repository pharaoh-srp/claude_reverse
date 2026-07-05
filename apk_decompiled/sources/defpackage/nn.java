package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.messages.ToolUseBlock;
import com.anthropic.claude.api.chat.tool.Tool;
import com.anthropic.claude.chat.parse.ParsedContentBlock$Thinking;
import com.anthropic.claude.code.remote.bottomsheet.CodeRemoteBottomSheetDestination;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.tool.model.AskUserInputV0InputQuestionsItem;
import com.anthropic.claude.types.strings.ToolUseId;
import com.mikepenz.aboutlibraries.Libs;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nn implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ nn(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        Uri uri = (Uri) this.F;
        i4g i4gVar = (i4g) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        i4gVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(i4gVar) ? 4 : 2;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            xo1 xo1Var = lja.K;
            iqb iqbVarN = gb9.N(b.c, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, i4gVar.b, 7);
            o5b o5bVarD = dw1.d(xo1Var, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarN);
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
            nuk.e(uri, null, b.c(fqb.E, 1.0f), null, null, null, ho4.b, MTTypesetterKt.kLineSkipLimitMultiplier, 0, false, e18Var, 12583344, 3960);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        qc8 qc8Var = (qc8) this.F;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((dxe) obj).getClass();
        int i = 1;
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            boolean zF = e18Var.f(qc8Var);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                objN = new pc8(qc8Var, i);
                e18Var.k0(objN);
            }
            zy7 zy7Var = (zy7) objN;
            boolean zF2 = e18Var.f(qc8Var);
            Object objN2 = e18Var.N();
            if (zF2 || objN2 == lz1Var) {
                objN2 = new pc8(qc8Var, 2);
                e18Var.k0(objN2);
            }
            prk.a(zy7Var, (zy7) objN2, e18Var, 0);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        boolean z;
        id8 id8Var = (id8) this.F;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((px9) obj).getClass();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            xo1 xo1Var = lja.K;
            iqb iqbVarC = b.c(fqb.E, 1.0f);
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
            boolean zF = e18Var.f(id8Var);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new xi4(18, id8Var);
                e18Var.k0(objN);
            }
            zy7 zy7Var = (zy7) objN;
            zcg zcgVar = id8Var.i.H;
            if (zcgVar == null || !zcgVar.E.isEmpty()) {
                Iterator it = zcgVar.iterator();
                while (((hmg) it).hasNext()) {
                    if (((n18) ((hmg) it).next()).c) {
                        z = true;
                        break;
                    }
                }
                z = false;
                lnk.d(zy7Var, null, z, null, null, null, null, dmk.a, e18Var, 805306368, 506);
                e18Var.p(true);
            } else {
                z = false;
                lnk.d(zy7Var, null, z, null, null, null, null, dmk.a, e18Var, 805306368, 506);
                e18Var.p(true);
            }
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        a80 a80Var = (a80) this.F;
        q5b q5bVar = (q5b) obj;
        h5b h5bVar = (h5b) obj2;
        q5bVar.getClass();
        h5bVar.getClass();
        a80Var.e();
        c3d c3dVarU = h5bVar.u(((rl4) obj3).a);
        return q5bVar.U(c3dVarU.E, c3dVarU.F, nm6.E, new b1(c3dVarU, 12));
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        fn1 fn1Var = (fn1) this.F;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((ia0) obj).getClass();
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            s51 s51Var = fn1Var != null ? (s51) ((tn1) fn1Var).r.v.getValue() : null;
            List list = fn1Var != null ? (List) ((tn1) fn1Var).r.x.getValue() : null;
            if (list == null) {
                list = lm6.E;
            }
            List list2 = list;
            boolean zF = e18Var.f(fn1Var);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new sk1(fn1Var, 3);
                e18Var.k0(objN);
            }
            kvk.a(s51Var, list2, (bz7) objN, null, e18Var, 8);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        ze0 ze0Var = (ze0) this.F;
        dxe dxeVar = (dxe) obj;
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        dxeVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((e18) ld4Var).f(dxeVar) ? 4 : 2;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
            tjh.b(d4c.j0(R.string.internal_setting_endpoint_selection_title, e18Var), dxeVar.a(fqb.E, 1.0f, true), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var, 0, 0, 262140);
            tjh.b(ze0Var.a(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var, 0, 0, 262142);
        } else {
            e18Var.T();
        }
        return iei.a;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        iei ieiVar;
        String strC;
        int i = this.E;
        fqb fqbVar = fqb.E;
        lz1 lz1Var = jd4.a;
        int i2 = 16;
        tp4 tp4Var = null;
        int i3 = 1;
        iei ieiVar2 = iei.a;
        Object obj4 = this.F;
        switch (i) {
            case 0:
                an anVar = (an) obj4;
                px9 px9Var = (px9) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                px9Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(px9Var) ? 4 : 2;
                }
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean zF = e18Var.f(anVar);
                    Object objN = e18Var.N();
                    if (zF || objN == lz1Var) {
                        xn xnVar = new xn(0, anVar, an.class, "dismissIntroBanner", "dismissIntroBanner()V", 0, 0);
                        e18Var.k0(xnVar);
                        objN = xnVar;
                    }
                    wp.b(0, 0, e18Var, (zy7) ((jm9) objN), px9.a(px9Var, fqbVar, null, null, 7));
                } else {
                    e18Var.T();
                }
                return ieiVar2;
            case 1:
                ep epVar = (ep) obj4;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    Set setQ = epVar.Q();
                    boolean zF2 = e18Var2.f(epVar);
                    Object objN2 = e18Var2.N();
                    if (zF2 || objN2 == lz1Var) {
                        objN2 = new yb(1, epVar, ep.class, "toggleKindFilter", "toggleKindFilter(Lcom/anthropic/claude/code/ui/DispatchTaskKind;)V", 0, 10);
                        e18Var2.k0(objN2);
                    }
                    gok.d(setQ, (bz7) ((jm9) objN2), null, e18Var2, 0);
                } else {
                    e18Var2.T();
                }
                return ieiVar2;
            case 2:
                pa3 pa3Var = (pa3) obj4;
                px9 px9Var2 = (px9) obj;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                px9Var2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((e18) ld4Var3).f(px9Var2) ? 4 : 2;
                }
                e18 e18Var3 = (e18) ld4Var3;
                if (e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    vo1 vo1Var = lja.T;
                    iqb iqbVarJ = gb9.J(px9.c(px9Var2), 32.0f);
                    q64 q64VarA = p64.a(ko0.c, vo1Var, e18Var3, 48);
                    int iHashCode = Long.hashCode(e18Var3.T);
                    hyc hycVarL = e18Var3.l();
                    iqb iqbVarE = kxk.E(e18Var3, iqbVarJ);
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
                    String str = pa3Var != null ? pa3Var.a : null;
                    if (str == null) {
                        str = "";
                    }
                    xb5.b(str, null, null, e18Var3, 0, 6);
                    e18Var3.p(true);
                } else {
                    e18Var3.T();
                }
                return ieiVar2;
            case 3:
                AskUserInputV0InputQuestionsItem askUserInputV0InputQuestionsItem = (AskUserInputV0InputQuestionsItem) obj4;
                dxe dxeVar = (dxe) obj;
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                dxeVar.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((e18) ld4Var4).f(dxeVar) ? 4 : 2;
                }
                e18 e18Var4 = (e18) ld4Var4;
                if (e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    tjh.b(askUserInputV0InputQuestionsItem.getQuestion(), dxeVar.a(gb9.N(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 7), 1.0f, true), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var4).e.E).e, e18Var4, 0, 0, 131068);
                } else {
                    e18Var4.T();
                }
                return ieiVar2;
            case 4:
                y49 y49Var = (y49) obj4;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ld4 ld4Var5 = (ld4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((e18) ld4Var5).g(zBooleanValue) ? 4 : 2;
                }
                e18 e18Var5 = (e18) ld4Var5;
                if (e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    xo1 xo1Var = lja.K;
                    iqb iqbVarQ = b.q(fqbVar, 190.0f, 84.0f);
                    o5b o5bVarD = dw1.d(xo1Var, false);
                    int iHashCode2 = Long.hashCode(e18Var5.T);
                    hyc hycVarL2 = e18Var5.l();
                    iqb iqbVarE2 = kxk.E(e18Var5, iqbVarQ);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var5.e0();
                    if (e18Var5.S) {
                        e18Var5.k(re4Var2);
                    } else {
                        e18Var5.n0();
                    }
                    d4c.i0(e18Var5, cd4.f, o5bVarD);
                    d4c.i0(e18Var5, cd4.e, hycVarL2);
                    d4c.i0(e18Var5, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var5, cd4.h);
                    d4c.i0(e18Var5, cd4.d, iqbVarE2);
                    if (zBooleanValue) {
                        e18Var5.a0(-976970953);
                        xuj.b(y49Var, d54.d, null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, e18Var5, 56);
                        e18Var5.p(false);
                    } else {
                        e18Var5.a0(-976746947);
                        tjh.b(d4c.j0(R.string.settings_activation_push_to_talk, e18Var5), null, gm3.a(e18Var5).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((jm3) gm3.c(e18Var5).e.E).e, e18Var5, 0, 24576, 114682);
                        e18Var5 = e18Var5;
                        e18Var5.p(false);
                    }
                    e18Var5.p(true);
                } else {
                    e18Var5.T();
                }
                return ieiVar2;
            case 5:
                go1 go1Var = (go1) obj4;
                ToolUseBlock toolUseBlock = (ToolUseBlock) obj;
                String str2 = (String) obj2;
                im2 im2Var = (im2) obj3;
                toolUseBlock.getClass();
                str2.getClass();
                im2Var.getClass();
                String id = toolUseBlock.getId();
                if (id != null) {
                    String strM1158constructorimpl = ToolUseId.m1158constructorimpl(id);
                    tn1 tn1Var = go1Var.f;
                    String name = toolUseBlock.getName();
                    String str3 = im2Var.b;
                    name.getClass();
                    strM1158constructorimpl.getClass();
                    co1 co1Var = tn1Var.n;
                    myh myhVar = (myh) co1Var.d;
                    if (myhVar.k(name)) {
                        boolean zO = myhVar.o(name);
                        l45 l45Var = (l45) co1Var.f;
                        if (zO) {
                            gb9.D(l45Var, null, null, new b9(str3, co1Var, strM1158constructorimpl, name, str2, null, 2), 3);
                        } else {
                            gb9.D(l45Var, null, null, new ky0(co1Var, name, str2, strM1158constructorimpl, str3, (tp4) null), 3);
                        }
                    }
                }
                return ieiVar2;
            case 6:
                o82 o82Var = (o82) obj4;
                ld4 ld4Var6 = (ld4) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var6 = (e18) ld4Var6;
                if (e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    fqb fqbVar2 = fqb.E;
                    iqb iqbVarK = gb9.K(b.c(fqbVar2, 1.0f), 8.0f, 12.0f);
                    cxe cxeVarA = axe.a(ko0.a, lja.P, e18Var6, 0);
                    int iHashCode3 = Long.hashCode(e18Var6.T);
                    hyc hycVarL3 = e18Var6.l();
                    iqb iqbVarE3 = kxk.E(e18Var6, iqbVarK);
                    dd4.e.getClass();
                    re4 re4Var3 = cd4.b;
                    e18Var6.e0();
                    if (e18Var6.S) {
                        e18Var6.k(re4Var3);
                    } else {
                        e18Var6.n0();
                    }
                    d4c.i0(e18Var6, cd4.f, cxeVarA);
                    d4c.i0(e18Var6, cd4.e, hycVarL3);
                    d4c.i0(e18Var6, cd4.g, Integer.valueOf(iHashCode3));
                    d4c.h0(e18Var6, cd4.h);
                    d4c.i0(e18Var6, cd4.d, iqbVarE3);
                    String strJ0 = d4c.j0(R.string.calendar_show_more, e18Var6);
                    tkh tkhVar = ((jm3) gm3.c(e18Var6).e.E).e;
                    long j = gm3.a(e18Var6).c;
                    boolean zH = e18Var6.h(o82Var);
                    Object objN3 = e18Var6.N();
                    if (zH || objN3 == lz1Var) {
                        objN3 = new d7(i2, o82Var);
                        e18Var6.k0(objN3);
                    }
                    tjh.b(strJ0, androidx.compose.foundation.b.c(fqbVar2, false, null, null, null, (zy7) objN3, 15), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var6, 0, 0, 131064);
                    e18Var6.p(true);
                } else {
                    e18Var6.T();
                }
                return ieiVar2;
            case 7:
                ((tl8) obj4).invoke((Throwable) obj);
                return ieiVar2;
            case 8:
                ed2 ed2Var = (ed2) obj;
                uub uubVar = (uub) obj2;
                xd2 xd2Var = (xd2) obj3;
                vc2 vc2Var = (vc2) ((gri) obj4).a;
                vc2Var.getClass();
                uubVar.getClass();
                xd2Var.getClass();
                if (ed2Var != null) {
                    i49 i49Var = vc2Var.q;
                    i49Var.getClass();
                    i49Var.F = uubVar;
                    i49Var.G = xd2Var;
                    vc2Var.c(ed2Var, i49Var);
                } else {
                    Iterator it = vc2Var.s.iterator();
                    while (it.hasNext()) {
                        ((pd1) it.next()).e(null, xd2Var, uubVar);
                    }
                }
                return ieiVar2;
            case 9:
                xc2 xc2Var = (xc2) obj4;
                ed2 ed2Var2 = (ed2) obj;
                xd2 xd2Var2 = (xd2) obj2;
                uub uubVar2 = (uub) obj3;
                xc2Var.getClass();
                xd2Var2.getClass();
                uubVar2.getClass();
                lsc lscVar = xc2Var.F;
                ed2 ed2Var3 = ((wc2) lscVar.getValue()).a;
                if (!x44.r(ed2Var2 != null ? Integer.valueOf(ed2Var2.b) : null, ed2Var3 != null ? Integer.valueOf(ed2Var3.b) : null)) {
                    xc2Var.E = ed2Var3;
                }
                lscVar.setValue(new wc2(ed2Var2, xc2Var.E, xd2Var2, uubVar2));
                return ieiVar2;
            case 10:
                t53 t53Var = (t53) obj4;
                ToolUseBlock toolUseBlock2 = (ToolUseBlock) obj;
                String str4 = (String) obj2;
                String str5 = ((im2) obj3).b;
                myh myhVar2 = t53Var.N;
                String id2 = toolUseBlock2.getId();
                if (id2 != null) {
                    String strM1158constructorimpl2 = ToolUseId.m1158constructorimpl(id2);
                    String name2 = toolUseBlock2.getName();
                    myhVar2.getClass();
                    name2.getClass();
                    List list = (List) myhVar2.t.getValue();
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (x44.r(((Tool.CustomTool) it2.next()).getName(), name2)) {
                                    boolean zO2 = myhVar2.o(toolUseBlock2.getName());
                                    mp4 mp4Var = t53Var.a;
                                    if (zO2) {
                                        gb9.D(mp4Var, null, null, new i43(str5, t53Var, strM1158constructorimpl2, toolUseBlock2, str4, (tp4) null), 3);
                                    } else {
                                        gb9.D(mp4Var, null, null, new i43(t53Var, toolUseBlock2, str4, strM1158constructorimpl2, str5, (tp4) null), 3);
                                    }
                                }
                            }
                        }
                    }
                }
                return ieiVar2;
            case 11:
                vm3 vm3Var = (vm3) obj4;
                ld4 ld4Var7 = (ld4) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((exe) obj).getClass();
                e18 e18Var7 = (e18) ld4Var7;
                if (e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    j50 j50Var = new j50(R.drawable.claude_spark_icon);
                    float f = vm3Var.d;
                    ytk.b(j50Var, null, new gaj(new n46(f)).d(new km8(new n46(f))), 0, null, e18Var7, 48, 24);
                    gwj.c(new gaj(new n46(vm3Var.c)), e18Var7, 0);
                    String string = ((Context) e18Var7.j(te4.b)).getString(R.string.claude_widget_chat_button);
                    string.getClass();
                    spk.b(string, null, new skh(((ni6) e18Var7.j(te4.e)).t, new clh(vm3Var.e), new cv7(), 120), 1, e18Var7, 3072);
                } else {
                    e18Var7.T();
                }
                return ieiVar2;
            case 12:
                x48 x48Var = (x48) obj4;
                ld4 ld4Var8 = (ld4) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((i4g) obj).getClass();
                e18 e18Var8 = (e18) ld4Var8;
                if (e18Var8.Q(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    xuj.a(x48Var, b.c(fqbVar, 1.0f), null, null, false, null, null, null, e18Var8, 24632, 236);
                } else {
                    e18Var8.T();
                }
                return ieiVar2;
            case 13:
                String str6 = (String) obj;
                String str7 = (String) obj2;
                String str8 = (String) obj3;
                str6.getClass();
                str7.getClass();
                str8.getClass();
                ((t4g) obj4).d(new CodeRemoteBottomSheetDestination.ApprovalDiffDetail(str6, str7, str8));
                return ieiVar2;
            case 14:
                ParsedContentBlock$Thinking parsedContentBlock$Thinking = (ParsedContentBlock$Thinking) obj4;
                i4g i4gVar = (i4g) obj;
                ld4 ld4Var9 = (ld4) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                i4gVar.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= ((e18) ld4Var9).f(i4gVar) ? 4 : 2;
                }
                e18 e18Var9 = (e18) ld4Var9;
                if (e18Var9.Q(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    urk.a(parsedContentBlock$Thinking, gb9.N(ttj.m(b.c(fqbVar, 1.0f), i4gVar), MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 5), e18Var9, 0);
                } else {
                    e18Var9.T();
                }
                return ieiVar2;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                dn5 dn5Var = (dn5) obj4;
                ld4 ld4Var10 = (ld4) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var10 = (e18) ld4Var10;
                if (e18Var10.Q(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    Object objN4 = e18Var10.N();
                    if (objN4 == lz1Var) {
                        b79 b79Var = yl5.a;
                        objN4 = new am5();
                        e18Var10.k0(objN4);
                    }
                    cn5.b(dn5Var, null, null, null, fd9.q0(672725618, new fp(27, dn5Var), e18Var10), fd9.q0(-1191491213, new t04(dn5Var, 4, (am5) objN4), e18Var10), false, null, e18Var10, 221184);
                } else {
                    e18Var10.T();
                }
                return ieiVar2;
            case 16:
                uj4 uj4Var = (uj4) obj4;
                ld4 ld4Var11 = (ld4) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var11 = (e18) ld4Var11;
                if (e18Var11.Q(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    ypk.f(uj4Var, null, e18Var11, 8);
                } else {
                    e18Var11.T();
                }
                return ieiVar2;
            case g.MAX_FIELD_NUMBER /* 17 */:
                vr4 vr4Var = (vr4) obj4;
                ld4 ld4Var12 = (ld4) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var12 = (e18) ld4Var12;
                if (e18Var12.Q(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    bsk.b(vr4Var, e18Var12, 0);
                } else {
                    e18Var12.T();
                }
                return ieiVar2;
            case g.AVG_FIELD_NUMBER /* 18 */:
                pw4 pw4Var = (pw4) obj4;
                ld4 ld4Var13 = (ld4) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var13 = (e18) ld4Var13;
                if (e18Var13.Q(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    msk.b(pw4Var, b.c, e18Var13, 48);
                } else {
                    e18Var13.T();
                }
                return ieiVar2;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                xw4 xw4Var = (xw4) obj4;
                ld4 ld4Var14 = (ld4) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var14 = (e18) ld4Var14;
                if (e18Var14.Q(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    vo1 vo1Var2 = lja.T;
                    ho0 ho0Var = new ho0(24.0f, true, new sz6(1));
                    iqb iqbVarN = gb9.N(gb9.L(b.c(fqbVar, 1.0f), 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 32.0f, 7);
                    q64 q64VarA2 = p64.a(ho0Var, vo1Var2, e18Var14, 54);
                    int iHashCode4 = Long.hashCode(e18Var14.T);
                    hyc hycVarL4 = e18Var14.l();
                    iqb iqbVarE4 = kxk.E(e18Var14, iqbVarN);
                    dd4.e.getClass();
                    re4 re4Var4 = cd4.b;
                    e18Var14.e0();
                    if (e18Var14.S) {
                        e18Var14.k(re4Var4);
                    } else {
                        e18Var14.n0();
                    }
                    z80 z80Var = cd4.f;
                    d4c.i0(e18Var14, z80Var, q64VarA2);
                    z80 z80Var2 = cd4.e;
                    d4c.i0(e18Var14, z80Var2, hycVarL4);
                    Integer numValueOf = Integer.valueOf(iHashCode4);
                    z80 z80Var3 = cd4.g;
                    d4c.i0(e18Var14, z80Var3, numValueOf);
                    bx bxVar = cd4.h;
                    d4c.h0(e18Var14, bxVar);
                    z80 z80Var4 = cd4.d;
                    d4c.i0(e18Var14, z80Var4, iqbVarE4);
                    bx4 bx4Var = xw4Var.a;
                    ud0 icon = bx4Var.getIcon();
                    ud0 ud0Var = ud0.d;
                    cv8.b(a.a(icon, e18Var14), null, b.o(fqbVar, 40.0f), gm3.a(e18Var14).a, e18Var14, 440, 0);
                    ieiVar = ieiVar2;
                    q64 q64VarA3 = p64.a(new ho0(8.0f, true, new sz6(1)), vo1Var2, e18Var14, 54);
                    int iHashCode5 = Long.hashCode(e18Var14.T);
                    hyc hycVarL5 = e18Var14.l();
                    iqb iqbVarE5 = kxk.E(e18Var14, fqbVar);
                    e18Var14.e0();
                    if (e18Var14.S) {
                        e18Var14.k(re4Var4);
                    } else {
                        e18Var14.n0();
                    }
                    d4c.i0(e18Var14, z80Var, q64VarA3);
                    d4c.i0(e18Var14, z80Var2, hycVarL5);
                    ij0.t(iHashCode5, e18Var14, z80Var3, e18Var14, bxVar);
                    d4c.i0(e18Var14, z80Var4, iqbVarE5);
                    tjh.b(d4c.j0(bx4Var.a(), e18Var14), null, gm3.a(e18Var14).M, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var14).e.E).f, e18Var14, 0, 0, 130042);
                    tjh.b(d4c.j0(R.string.conway_tool_permission_body, e18Var14), null, gm3.a(e18Var14).N, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var14).e.E).g, e18Var14, 0, 0, 130042);
                    if (bx4Var.equals(ax4.a) || bx4Var.equals(yw4.a)) {
                        strC = null;
                    } else {
                        if (!(bx4Var instanceof zw4)) {
                            wg6.i();
                            return null;
                        }
                        zw4 zw4Var = (zw4) bx4Var;
                        strC = ij0.C(zw4Var.a, " — ", zw4Var.b);
                    }
                    if (strC == null) {
                        e18Var14.a0(104764210);
                        e18Var14.p(false);
                    } else {
                        e18Var14.a0(104764211);
                        tjh.b(strC, null, gm3.a(e18Var14).O, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var14).e.E).i, e18Var14, 0, 0, 130042);
                        e18Var14.p(false);
                    }
                    e18Var14.p(true);
                    q64 q64VarA4 = p64.a(new ho0(12.0f, true, new sz6(1)), lja.S, e18Var14, 6);
                    int iHashCode6 = Long.hashCode(e18Var14.T);
                    hyc hycVarL6 = e18Var14.l();
                    iqb iqbVarE6 = kxk.E(e18Var14, fqbVar);
                    e18Var14.e0();
                    if (e18Var14.S) {
                        e18Var14.k(re4Var4);
                    } else {
                        e18Var14.n0();
                    }
                    d4c.i0(e18Var14, z80Var, q64VarA4);
                    d4c.i0(e18Var14, z80Var2, hycVarL6);
                    ij0.t(iHashCode6, e18Var14, z80Var3, e18Var14, bxVar);
                    d4c.i0(e18Var14, z80Var4, iqbVarE6);
                    String strJ02 = d4c.j0(R.string.conway_tool_permission_allow, e18Var14);
                    iqb iqbVarC = b.c(fqbVar, 1.0f);
                    boolean zF3 = e18Var14.f(xw4Var);
                    Object objN5 = e18Var14.N();
                    if (zF3 || objN5 == lz1Var) {
                        objN5 = new g15(xw4Var, 1);
                        e18Var14.k0(objN5);
                    }
                    dtj.a(strJ02, iqbVarC, false, null, e12.a, null, 0L, (zy7) objN5, e18Var14, 24624, 108);
                    String strJ03 = d4c.j0(R.string.conway_tool_permission_deny, e18Var14);
                    iqb iqbVarC2 = b.c(fqbVar, 1.0f);
                    boolean zF4 = e18Var14.f(xw4Var);
                    Object objN6 = e18Var14.N();
                    if (zF4 || objN6 == lz1Var) {
                        objN6 = new g15(xw4Var, 2);
                        e18Var14.k0(objN6);
                    }
                    dtj.a(strJ03, iqbVarC2, false, null, f12.a, null, 0L, (zy7) objN6, e18Var14, 24624, 108);
                    e18Var14.p(true);
                    e18Var14.p(true);
                } else {
                    ieiVar = ieiVar2;
                    e18Var14.T();
                }
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                z15 z15Var = (z15) obj4;
                ld4 ld4Var15 = (ld4) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var15 = (e18) ld4Var15;
                if (e18Var15.Q(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    gtk.c(z15Var, e18Var15, 0);
                } else {
                    e18Var15.T();
                }
                return ieiVar2;
            case 21:
                ((bz7) obj4).invoke(new fcc(((z7d) obj2).c));
                return ieiVar2;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return d(obj, obj2, obj3);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return e(obj, obj2, obj3);
            case 24:
                return f(obj, obj2, obj3);
            case BuildConfig.VERSION_CODE /* 25 */:
                qo8 qo8Var = (qo8) obj4;
                q5b q5bVar = (q5b) obj;
                h5b h5bVar = (h5b) obj2;
                rl4 rl4Var = (rl4) obj3;
                q5bVar.getClass();
                h5bVar.getClass();
                c3d c3dVarU = h5bVar.u(rl4.a(0, Integer.MAX_VALUE, 0, rl4.g(rl4Var.a), 5, rl4Var.a));
                int i4 = c3dVarU.E;
                long j2 = rl4Var.a;
                int iH = rl4.h(j2);
                if (i4 > iH) {
                    i4 = iH;
                }
                int i5 = c3dVarU.F;
                int iG = rl4.g(j2);
                if (i5 > iG) {
                    i5 = iG;
                }
                return q5bVar.U(i4, i5, nm6.E, new ny4(qo8Var, rl4Var, c3dVarU, 11));
            case 26:
                return g(obj, obj2, obj3);
            case 27:
                return h(obj, obj2, obj3);
            case 28:
                return n(obj, obj2, obj3);
            default:
                t3a t3aVar = (t3a) obj4;
                mnc mncVar = (mnc) obj;
                ld4 ld4Var16 = (ld4) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                xo1 xo1Var2 = lja.K;
                mncVar.getClass();
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= ((e18) ld4Var16).f(mncVar) ? 4 : 2;
                }
                e18 e18Var16 = (e18) ld4Var16;
                if (e18Var16.Q(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                    boolean zH2 = e18Var16.h(t3aVar);
                    Object objN7 = e18Var16.N();
                    if (zH2 || objN7 == lz1Var) {
                        objN7 = new s3a(t3aVar, tp4Var, i3);
                        e18Var16.k0(objN7);
                    }
                    fd9.i(e18Var16, (pz7) objN7, ieiVar2);
                    Libs libs = (Libs) t3aVar.f.getValue();
                    if (libs != null) {
                        e18Var16.a0(-15472306);
                        xvj.d(libs, mncVar, b.c, e18Var16, ((iIntValue16 << 3) & 112) | 384);
                        e18Var16.p(false);
                    } else if (((Boolean) t3aVar.d.getValue()).booleanValue()) {
                        e18Var16.a0(-15250315);
                        iqb iqbVarI = gb9.I(b.c, mncVar);
                        o5b o5bVarD2 = dw1.d(xo1Var2, false);
                        int iHashCode7 = Long.hashCode(e18Var16.T);
                        hyc hycVarL7 = e18Var16.l();
                        iqb iqbVarE7 = kxk.E(e18Var16, iqbVarI);
                        dd4.e.getClass();
                        re4 re4Var5 = cd4.b;
                        e18Var16.e0();
                        if (e18Var16.S) {
                            e18Var16.k(re4Var5);
                        } else {
                            e18Var16.n0();
                        }
                        d4c.i0(e18Var16, cd4.f, o5bVarD2);
                        d4c.i0(e18Var16, cd4.e, hycVarL7);
                        d4c.i0(e18Var16, cd4.g, Integer.valueOf(iHashCode7));
                        d4c.h0(e18Var16, cd4.h);
                        d4c.i0(e18Var16, cd4.d, iqbVarE7);
                        ez1.a(null, null, 0L, e18Var16, 0, 7);
                        e18Var16.p(true);
                        e18Var16.p(false);
                    } else if (((Boolean) t3aVar.e.getValue()).booleanValue()) {
                        e18Var16.a0(-14960155);
                        iqb iqbVarI2 = gb9.I(b.c, mncVar);
                        o5b o5bVarD3 = dw1.d(xo1Var2, false);
                        int iHashCode8 = Long.hashCode(e18Var16.T);
                        hyc hycVarL8 = e18Var16.l();
                        iqb iqbVarE8 = kxk.E(e18Var16, iqbVarI2);
                        dd4.e.getClass();
                        re4 re4Var6 = cd4.b;
                        e18Var16.e0();
                        if (e18Var16.S) {
                            e18Var16.k(re4Var6);
                        } else {
                            e18Var16.n0();
                        }
                        d4c.i0(e18Var16, cd4.f, o5bVarD3);
                        d4c.i0(e18Var16, cd4.e, hycVarL8);
                        d4c.i0(e18Var16, cd4.g, Integer.valueOf(iHashCode8));
                        d4c.h0(e18Var16, cd4.h);
                        d4c.i0(e18Var16, cd4.d, iqbVarE8);
                        tjh.b(d4c.j0(R.string.generic_error_something_went_wrong, e18Var16), null, 0L, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, null, e18Var16, 0, 0, 261118);
                        e18Var16.p(true);
                        e18Var16.p(false);
                    } else {
                        e18Var16.a0(-14582172);
                        e18Var16.p(false);
                    }
                } else {
                    e18Var16.T();
                }
                return ieiVar2;
        }
    }
}
