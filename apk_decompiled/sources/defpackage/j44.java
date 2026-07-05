package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.anthropic.claude.chat.bottomsheet.CollapsedToolsSheetDestination;
import com.anthropic.claude.chat.bottomsheet.z0;
import com.anthropic.claude.chat.parse.ParsedContentBlock$McpToolInvocation;
import com.anthropic.claude.chat.parse.ParsedContentBlock$Thinking;
import com.anthropic.claude.conway.ConwayAppScreen;
import com.anthropic.claude.conway.f;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j44 implements rz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ qz7 L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    public /* synthetic */ j44(bz7 bz7Var, t4g t4gVar, bz7 bz7Var2, bz7 bz7Var3, List list, boolean z, bz7 bz7Var4, bz7 bz7Var5, bz7 bz7Var6) {
        this.G = bz7Var;
        this.M = t4gVar;
        this.H = bz7Var2;
        this.I = bz7Var3;
        this.N = list;
        this.F = z;
        this.J = bz7Var4;
        this.K = bz7Var5;
        this.L = bz7Var6;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        String messageText;
        zy7 zy7Var;
        iqb iqbVarA;
        boolean z2;
        iqb iqbVarA2;
        boolean z3;
        int i = this.E;
        iei ieiVar = iei.a;
        lz1 lz1Var = jd4.a;
        Object obj4 = this.N;
        Object obj5 = this.M;
        qz7 qz7Var = this.L;
        Object obj6 = this.K;
        Object obj7 = this.J;
        Object obj8 = this.I;
        Object obj9 = this.H;
        Object obj10 = this.G;
        switch (i) {
            case 0:
                bz7 bz7Var = (bz7) obj10;
                t4g t4gVar = (t4g) obj5;
                bz7 bz7Var2 = (bz7) obj9;
                bz7 bz7Var3 = (bz7) obj8;
                List list = (List) obj4;
                bz7 bz7Var4 = (bz7) obj7;
                bz7 bz7Var5 = (bz7) obj6;
                bz7 bz7Var6 = (bz7) qz7Var;
                CollapsedToolsSheetDestination collapsedToolsSheetDestination = (CollapsedToolsSheetDestination) obj;
                int iIntValue = ((Integer) obj3).intValue();
                collapsedToolsSheetDestination.getClass();
                e18 e18Var = (e18) ((ld4) obj2);
                e18Var.a0(-268603796);
                kwe kweVar = null;
                if (collapsedToolsSheetDestination.equals(CollapsedToolsSheetDestination.Dismissed.INSTANCE)) {
                    e18Var.a0(-451512879);
                    z = false;
                    e18Var.p(false);
                } else if (collapsedToolsSheetDestination.equals(CollapsedToolsSheetDestination.Summary.INSTANCE)) {
                    e18Var.a0(-430202724);
                    kwe kweVar2 = new kwe(d4c.j0(R.string.collapsed_tool_timeline_title, e18Var), null, null, null, null, false, fd9.q0(-1875833273, new tw(list, this.F, t4gVar, i), e18Var), 254);
                    z = false;
                    e18Var.p(false);
                    kweVar = kweVar2;
                } else if (collapsedToolsSheetDestination instanceof CollapsedToolsSheetDestination.ToolContent) {
                    e18Var.a0(-449064312);
                    ParsedContentBlock$McpToolInvocation parsedContentBlock$McpToolInvocation = (ParsedContentBlock$McpToolInvocation) bz7Var.invoke(((CollapsedToolsSheetDestination.ToolContent) collapsedToolsSheetDestination).getBlockId());
                    if (parsedContentBlock$McpToolInvocation == null) {
                        e18Var.a0(-448997352);
                        boolean zH = e18Var.h(t4gVar);
                        Object objN = e18Var.N();
                        if (zH || objN == lz1Var) {
                            objN = new zd(t4gVar, null, 1);
                            e18Var.k0(objN);
                        }
                        fd9.i(e18Var, (pz7) objN, ieiVar);
                        z = false;
                        e18Var.p(false);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(-448876266);
                        e18Var.p(false);
                        if (x44.r(parsedContentBlock$McpToolInvocation.getToolName(), "web_fetch")) {
                            messageText = vb7.n(e18Var, -448796100, R.string.web_fetch_sheet_title, e18Var, false);
                        } else {
                            e18Var.a0(-448680439);
                            e18Var.p(false);
                            messageText = parsedContentBlock$McpToolInvocation.getMessageText();
                            if (messageText == null) {
                                messageText = parsedContentBlock$McpToolInvocation.getToolName();
                            }
                        }
                        kwe kweVar3 = new kwe(messageText, null, null, null, null, false, fd9.q0(-1427717688, new ye(parsedContentBlock$McpToolInvocation, bz7Var4, bz7Var5, 27), e18Var), 126);
                        z = false;
                        e18Var.p(false);
                        kweVar = kweVar3;
                    }
                } else if (collapsedToolsSheetDestination instanceof CollapsedToolsSheetDestination.Thinking) {
                    e18Var.a0(-447214666);
                    ParsedContentBlock$Thinking parsedContentBlock$Thinking = (ParsedContentBlock$Thinking) bz7Var2.invoke(((CollapsedToolsSheetDestination.Thinking) collapsedToolsSheetDestination).getBlockId());
                    if (parsedContentBlock$Thinking == null) {
                        e18Var.a0(-447112552);
                        boolean zH2 = e18Var.h(t4gVar);
                        Object objN2 = e18Var.N();
                        if (zH2 || objN2 == lz1Var) {
                            objN2 = new zd(t4gVar, null, 2);
                            e18Var.k0(objN2);
                        }
                        fd9.i(e18Var, (pz7) objN2, ieiVar);
                        z = false;
                        e18Var.p(false);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(-446991466);
                        e18Var.p(false);
                        kwe kweVar4 = new kwe(d4c.j0(R.string.chat_thinking_sheet_title, e18Var), null, null, null, null, false, fd9.q0(-979602103, new nn(14, parsedContentBlock$Thinking), e18Var), 254);
                        z = false;
                        e18Var.p(false);
                        kweVar = kweVar4;
                    }
                } else {
                    if (!(collapsedToolsSheetDestination instanceof CollapsedToolsSheetDestination.Sources)) {
                        throw ebh.u(e18Var, -430203273, false);
                    }
                    e18Var.a0(-446390190);
                    boolean zF = e18Var.f(bz7Var3) | ((((iIntValue & 14) ^ 6) > 4 && e18Var.h(collapsedToolsSheetDestination)) || (iIntValue & 6) == 4);
                    Object objN3 = e18Var.N();
                    if (zF || objN3 == lz1Var) {
                        objN3 = new z0(bz7Var3, collapsedToolsSheetDestination, null);
                        e18Var.k0(objN3);
                    }
                    csg.g((bz7) objN3, e18Var, 0, 1);
                    kwe kweVar5 = new kwe(((CollapsedToolsSheetDestination.Sources) collapsedToolsSheetDestination).getTitle(), null, null, null, null, false, fd9.q0(-531486518, new ye(collapsedToolsSheetDestination, bz7Var6, bz7Var5, 26), e18Var), 126);
                    z = false;
                    e18Var.p(false);
                    kweVar = kweVar5;
                }
                e18Var.p(z);
                return kweVar;
            default:
                ConwayAppScreen.Extension extension = (ConwayAppScreen.Extension) obj10;
                rwe rweVar = (rwe) obj9;
                us4 us4Var = (us4) obj8;
                f fVar = (f) obj7;
                dx4 dx4Var = (dx4) obj6;
                zy7 zy7Var2 = (zy7) qz7Var;
                zy7 zy7Var3 = (zy7) obj5;
                wlg wlgVar = (wlg) obj4;
                mnc mncVar = (mnc) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                mncVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((e18) ld4Var).f(mncVar) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    e18Var2.T();
                    return ieiVar;
                }
                fqb fqbVar = fqb.E;
                iqb iqbVarS = knk.s(gb9.I(fqbVar, mncVar), mncVar);
                FillElement fillElement = b.c;
                iqb iqbVarB = iqbVarS.B(fillElement);
                xo1 xo1Var = lja.G;
                o5b o5bVarD = dw1.d(xo1Var, false);
                int iHashCode = Long.hashCode(e18Var2.T);
                hyc hycVarL = e18Var2.l();
                iqb iqbVarE = kxk.E(e18Var2, iqbVarB);
                dd4.e.getClass();
                re4 re4Var = cd4.b;
                e18Var2.e0();
                if (e18Var2.S) {
                    e18Var2.k(re4Var);
                } else {
                    e18Var2.n0();
                }
                z80 z80Var = cd4.f;
                d4c.i0(e18Var2, z80Var, o5bVarD);
                z80 z80Var2 = cd4.e;
                d4c.i0(e18Var2, z80Var2, hycVarL);
                Integer numValueOf = Integer.valueOf(iHashCode);
                z80 z80Var3 = cd4.g;
                d4c.i0(e18Var2, z80Var3, numValueOf);
                bx bxVar = cd4.h;
                d4c.h0(e18Var2, bxVar);
                z80 z80Var4 = cd4.d;
                d4c.i0(e18Var2, z80Var4, iqbVarE);
                boolean z4 = this.F;
                iqb iqbVarJ = lnk.j(fillElement, z4 ? 0.0f : 1.0f);
                if (z4) {
                    e18Var2.a0(-85096244);
                    Object objN4 = e18Var2.N();
                    if (objN4 == lz1Var) {
                        zy7Var = zy7Var2;
                        objN4 = new fc4(14);
                        e18Var2.k0(objN4);
                    } else {
                        zy7Var = zy7Var2;
                    }
                    iqbVarA = tjf.a(fqbVar, (bz7) objN4);
                    e18Var2.p(false);
                } else {
                    zy7Var = zy7Var2;
                    e18Var2.a0(-85095331);
                    e18Var2.p(false);
                    iqbVarA = fqbVar;
                }
                iqb iqbVarB2 = iqbVarJ.B(iqbVarA);
                long j = gm3.a(e18Var2).o;
                wo8 wo8Var = zni.b;
                iqb iqbVarP = yfd.p(iqbVarB2, j, wo8Var);
                o5b o5bVarD2 = dw1.d(xo1Var, false);
                int iHashCode2 = Long.hashCode(e18Var2.T);
                hyc hycVarL2 = e18Var2.l();
                iqb iqbVarE2 = kxk.E(e18Var2, iqbVarP);
                e18Var2.e0();
                if (e18Var2.S) {
                    e18Var2.k(re4Var);
                } else {
                    e18Var2.n0();
                }
                d4c.i0(e18Var2, z80Var, o5bVarD2);
                d4c.i0(e18Var2, z80Var2, hycVarL2);
                ij0.t(iHashCode2, e18Var2, z80Var3, e18Var2, bxVar);
                d4c.i0(e18Var2, z80Var4, iqbVarE2);
                mwa.l(rweVar, null, csg.q(rweVar, e18Var2, 384), fd9.q0(-1837153914, new gr4(us4Var, fVar, dx4Var, zy7Var, rweVar, zy7Var3), e18Var2), e18Var2, 3072, 2);
                e18Var2.p(true);
                if (extension != null) {
                    e18Var2.a0(1658681418);
                    iqb iqbVarJ2 = lnk.j(fillElement, z4 ? 1.0f : 0.0f);
                    if (z4) {
                        e18Var2.a0(-85035907);
                        z3 = false;
                        e18Var2.p(false);
                        iqbVarA2 = fqbVar;
                    } else {
                        e18Var2.a0(-85035156);
                        Object objN5 = e18Var2.N();
                        if (objN5 == lz1Var) {
                            objN5 = new fc4(15);
                            e18Var2.k0(objN5);
                        }
                        iqbVarA2 = tjf.a(fqbVar, (bz7) objN5);
                        z3 = false;
                        e18Var2.p(false);
                    }
                    iqb iqbVarP2 = yfd.p(iqbVarJ2.B(iqbVarA2), gm3.a(e18Var2).o, wo8Var);
                    o5b o5bVarD3 = dw1.d(xo1Var, z3);
                    int iHashCode3 = Long.hashCode(e18Var2.T);
                    hyc hycVarL3 = e18Var2.l();
                    iqb iqbVarE3 = kxk.E(e18Var2, iqbVarP2);
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var);
                    } else {
                        e18Var2.n0();
                    }
                    d4c.i0(e18Var2, z80Var, o5bVarD3);
                    d4c.i0(e18Var2, z80Var2, hycVarL3);
                    ij0.t(iHashCode3, e18Var2, z80Var3, e18Var2, bxVar);
                    d4c.i0(e18Var2, z80Var4, iqbVarE3);
                    hsf hsfVar = (hsf) wlgVar.getValue();
                    String strP0 = fVar.p0();
                    boolean zF2 = e18Var2.f(fVar);
                    Object objN6 = e18Var2.N();
                    if (zF2 || objN6 == lz1Var) {
                        objN6 = new hr4(1, fVar, f.class, "mintExtensionToken", "mintExtensionToken(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0);
                        e18Var2.k0(objN6);
                    }
                    bz7 bz7Var7 = (bz7) ((jm9) objN6);
                    boolean zF3 = e18Var2.f(fVar);
                    Object objN7 = e18Var2.N();
                    if (zF3 || objN7 == lz1Var) {
                        objN7 = new y14(0, fVar, f.class, "closeExtensionApp", "closeExtensionApp()V", 0, 13);
                        e18Var2.k0(objN7);
                    }
                    iv4.a(extension, hsfVar, strP0, z4, bz7Var7, (zy7) ((jm9) objN7), null, e18Var2, 64);
                    z2 = true;
                    e18Var2.p(true);
                    e18Var2.p(false);
                } else {
                    z2 = true;
                    e18Var2.a0(1659391597);
                    e18Var2.p(false);
                }
                e18Var2.p(z2);
                return ieiVar;
        }
    }

    public /* synthetic */ j44(boolean z, ConwayAppScreen.Extension extension, rwe rweVar, us4 us4Var, f fVar, dx4 dx4Var, zy7 zy7Var, zy7 zy7Var2, nwb nwbVar) {
        this.F = z;
        this.G = extension;
        this.H = rweVar;
        this.I = us4Var;
        this.J = fVar;
        this.K = dx4Var;
        this.L = zy7Var;
        this.M = zy7Var2;
        this.N = nwbVar;
    }
}
