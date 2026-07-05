package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.ModelSelection;
import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.types.strings.SessionId;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sn implements rz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ bz7 F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ zy7 H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;

    public /* synthetic */ sn(an anVar, bz7 bz7Var, fk0 fk0Var, nwb nwbVar, ml3 ml3Var, zy7 zy7Var, gh2 gh2Var, zy7 zy7Var2, wlg wlgVar) {
        this.I = anVar;
        this.F = bz7Var;
        this.J = fk0Var;
        this.K = nwbVar;
        this.L = ml3Var;
        this.G = zy7Var;
        this.M = gh2Var;
        this.H = zy7Var2;
        this.N = wlgVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        vm vmVar;
        bx bxVar;
        z80 z80Var;
        gh2 gh2Var;
        mnc mncVar;
        an anVar;
        e18 e18Var;
        xo1 xo1Var;
        z80 z80Var2;
        Context context;
        e18 e18Var2;
        nwb nwbVar;
        wxc wxcVar;
        e18 e18Var3;
        boolean z;
        vm vmVar2;
        int i = this.E;
        iei ieiVar = iei.a;
        eo0 eo0Var = ko0.c;
        fqb fqbVar = fqb.E;
        lz1 lz1Var = jd4.a;
        Object obj4 = this.N;
        Object obj5 = this.M;
        Object obj6 = this.L;
        Object obj7 = this.K;
        Object obj8 = this.J;
        Object obj9 = this.I;
        switch (i) {
            case 0:
                an anVar2 = (an) obj9;
                lsc lscVar = anVar2.f;
                sl slVar = anVar2.b;
                fk0 fk0Var = (fk0) obj8;
                nwb nwbVar2 = (nwb) obj7;
                ml3 ml3Var = (ml3) obj6;
                gh2 gh2Var2 = (gh2) obj5;
                wlg wlgVar = (wlg) obj4;
                mnc mncVar2 = (mnc) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                mncVar2.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(mncVar2) ? 4 : 2;
                }
                boolean z2 = (iIntValue & 19) != 18;
                int i2 = iIntValue & 1;
                e18 e18Var4 = (e18) ld4Var;
                if (!e18Var4.Q(i2, z2)) {
                    e18Var4.T();
                } else {
                    Object objN = e18Var4.N();
                    if (objN == lz1Var) {
                        objN = vb7.g(0, e18Var4);
                    }
                    isc iscVar = (isc) objN;
                    float fC0 = ((cz5) e18Var4.j(ve4.h)).c0(iscVar.h());
                    FillElement fillElement = b.c;
                    iqb iqbVarK0 = mpk.k0(wp.e(fillElement, e18Var4), mpk.n);
                    xo1 xo1Var2 = lja.G;
                    o5b o5bVarD = dw1.d(xo1Var2, false);
                    int iHashCode = Long.hashCode(e18Var4.T);
                    hyc hycVarL = e18Var4.l();
                    iqb iqbVarE = kxk.E(e18Var4, iqbVarK0);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var4.e0();
                    if (e18Var4.S) {
                        e18Var4.k(re4Var);
                    } else {
                        e18Var4.n0();
                    }
                    z80 z80Var3 = cd4.f;
                    d4c.i0(e18Var4, z80Var3, o5bVarD);
                    z80 z80Var4 = cd4.e;
                    d4c.i0(e18Var4, z80Var4, hycVarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    z80 z80Var5 = cd4.g;
                    d4c.i0(e18Var4, z80Var5, numValueOf);
                    bx bxVar2 = cd4.h;
                    d4c.h0(e18Var4, bxVar2);
                    z80 z80Var6 = cd4.d;
                    d4c.i0(e18Var4, z80Var6, iqbVarE);
                    vm vmVar3 = (vm) slVar;
                    if (((Boolean) vmVar3.m.getValue()).booleanValue() && ((vm) slVar).n.isEmpty()) {
                        e18Var4.a0(973219579);
                        kzj.a(0, e18Var4);
                        e18Var4.p(false);
                        mncVar = mncVar2;
                        vmVar = vmVar3;
                        z80Var = z80Var5;
                        gh2Var = gh2Var2;
                        e18Var = e18Var4;
                        bxVar = bxVar2;
                        anVar = anVar2;
                    } else {
                        e18Var4.a0(973291344);
                        vmVar = vmVar3;
                        bxVar = bxVar2;
                        z80Var = z80Var5;
                        gh2Var = gh2Var2;
                        mncVar = mncVar2;
                        cok.a(anVar2, this.F, new qnc(16.0f, mncVar2.d() + n2i.b + 8.0f, 16.0f, fC0 + 16.0f), fillElement, e18Var4, 3072);
                        anVar = anVar2;
                        e18Var = e18Var4;
                        e18Var.p(false);
                    }
                    Object objN2 = e18Var.N();
                    if (objN2 == lz1Var) {
                        objN2 = mpk.P(Boolean.FALSE);
                        e18Var.k0(objN2);
                    }
                    nwb nwbVar3 = (nwb) objN2;
                    Context context2 = (Context) e18Var.j(w00.b);
                    SessionResource sessionResourceD = ((vm) slVar).d();
                    String strM875getIdOcx55TE = sessionResourceD != null ? sessionResourceD.m875getIdOcx55TE() : null;
                    SessionId sessionIdM1114boximpl = strM875getIdOcx55TE != null ? SessionId.m1114boximpl(strM875getIdOcx55TE) : null;
                    boolean zF = e18Var.f(strM875getIdOcx55TE != null ? SessionId.m1114boximpl(strM875getIdOcx55TE) : null) | e18Var.h(context2);
                    Object objN3 = e18Var.N();
                    if (zF || objN3 == lz1Var) {
                        xo1Var = xo1Var2;
                        objN3 = new g9((tp4) null, context2, strM875getIdOcx55TE);
                        e18Var.k0(objN3);
                    } else {
                        xo1Var = xo1Var2;
                    }
                    fd9.i(e18Var, (pz7) objN3, sessionIdM1114boximpl);
                    wxc wxcVarO = oq5.O(e18Var);
                    Object objN4 = e18Var.N();
                    if (objN4 == lz1Var) {
                        objN4 = mpk.P(Boolean.FALSE);
                        e18Var.k0(objN4);
                    }
                    nwb nwbVar4 = (nwb) objN4;
                    zxc zxcVarE = wxcVarO.e();
                    boolean zF2 = e18Var.f(wxcVarO) | e18Var.f(anVar);
                    e18 e18Var5 = e18Var;
                    Object objN5 = e18Var5.N();
                    if (zF2 || objN5 == lz1Var) {
                        z80Var2 = z80Var6;
                        context = context2;
                        e18Var2 = e18Var5;
                        objN5 = new zn(wxcVarO, anVar, nwbVar4, null, 0);
                        nwbVar = nwbVar4;
                        wxcVar = wxcVarO;
                        e18Var2.k0(objN5);
                    } else {
                        z80Var2 = z80Var6;
                        nwbVar = nwbVar4;
                        context = context2;
                        e18Var2 = e18Var5;
                        wxcVar = wxcVarO;
                    }
                    fd9.i(e18Var2, (pz7) objN5, zxcVarE);
                    iqb iqbVarA = nw1.a.a(fqbVar, lja.N);
                    Object objN6 = e18Var2.N();
                    if (objN6 == lz1Var) {
                        objN6 = new tn(iscVar, 0);
                        e18Var2.k0(objN6);
                    }
                    iqb iqbVarN = gb9.N(wd6.v0(iqbVarA, (bz7) objN6), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, mncVar.a(), 7);
                    q64 q64VarA = p64.a(eo0Var, lja.S, e18Var2, 0);
                    an anVar3 = anVar;
                    int iHashCode2 = Long.hashCode(e18Var2.T);
                    hyc hycVarL2 = e18Var2.l();
                    iqb iqbVarE2 = kxk.E(e18Var2, iqbVarN);
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var);
                    } else {
                        e18Var2.n0();
                    }
                    d4c.i0(e18Var2, z80Var3, q64VarA);
                    d4c.i0(e18Var2, z80Var4, hycVarL2);
                    ij0.t(iHashCode2, e18Var2, z80Var, e18Var2, bxVar);
                    z80 z80Var7 = z80Var2;
                    d4c.i0(e18Var2, z80Var7, iqbVarE2);
                    boolean zG = e18Var2.g(anVar3.P());
                    Object objN7 = e18Var2.N();
                    if (zG || objN7 == lz1Var) {
                        objN7 = mpk.P(Boolean.valueOf(anVar3.P()));
                        e18Var2.k0(objN7);
                    }
                    nwb nwbVar5 = (nwb) objN7;
                    boolean z3 = ((Boolean) nwbVar5.getValue()).booleanValue() && !((Boolean) lscVar.getValue()).booleanValue();
                    wp6 wp6VarA = gp6.e(null, 3).a(gp6.d(null, null, 15));
                    d77 d77VarA = gp6.f(null, 3).a(gp6.l(null, null, 15));
                    ta4 ta4VarQ0 = fd9.q0(-1311331870, new xe(nwbVar5, wxcVar, anVar3, context, nwbVar, 2), e18Var2);
                    s64 s64Var = s64.a;
                    e18 e18Var6 = e18Var2;
                    wd6.H(s64Var, z3, null, wp6VarA, d77VarA, null, ta4VarQ0, e18Var6, 1600518, 18);
                    o5b o5bVarD2 = dw1.d(xo1Var, false);
                    int iHashCode3 = Long.hashCode(e18Var6.T);
                    hyc hycVarL3 = e18Var6.l();
                    iqb iqbVarE3 = kxk.E(e18Var6, fqbVar);
                    e18Var6.e0();
                    if (e18Var6.S) {
                        e18Var6.k(re4Var);
                    } else {
                        e18Var6.n0();
                    }
                    d4c.i0(e18Var6, z80Var3, o5bVarD2);
                    d4c.i0(e18Var6, z80Var4, hycVarL3);
                    ij0.t(iHashCode3, e18Var6, z80Var, e18Var6, bxVar);
                    d4c.i0(e18Var6, z80Var7, iqbVarE3);
                    boolean zBooleanValue = ((Boolean) lscVar.getValue()).booleanValue();
                    Object objN8 = e18Var6.N();
                    if (objN8 == lz1Var) {
                        objN8 = new q6(13);
                        e18Var6.k0(objN8);
                    }
                    int i3 = 1;
                    wp6 wp6VarN = gp6.n(1, (bz7) objN8);
                    Object objN9 = e18Var6.N();
                    if (objN9 == lz1Var) {
                        objN9 = new q6(14);
                        e18Var6.k0(objN9);
                    }
                    wd6.H(s64Var, zBooleanValue, null, wp6VarN, gp6.p(1, (bz7) objN9), null, fd9.q0(114748392, new ii(anVar3, i3, gh2Var), e18Var6), e18Var6, 1600518, 18);
                    boolean z4 = !((Boolean) lscVar.getValue()).booleanValue();
                    Object objN10 = e18Var6.N();
                    if (objN10 == lz1Var) {
                        objN10 = new q6(15);
                        e18Var6.k0(objN10);
                    }
                    wp6 wp6VarN2 = gp6.n(1, (bz7) objN10);
                    Object objN11 = e18Var6.N();
                    if (objN11 == lz1Var) {
                        objN11 = new q6(16);
                        e18Var6.k0(objN11);
                    }
                    wd6.H(s64Var, z4, null, wp6VarN2, gp6.p(1, (bz7) objN11), null, fd9.q0(1061765087, new bn(anVar3, this.H, nwbVar3, wlgVar, 0), e18Var6), e18Var6, 1600518, 18);
                    e18Var6.p(true);
                    e18Var6.p(true);
                    if (((Boolean) nwbVar3.getValue()).booleanValue()) {
                        e18Var6.a0(982345638);
                        int size = ((vm) slVar).T.size();
                        Object objN12 = e18Var6.N();
                        if (objN12 == lz1Var) {
                            objN12 = new ve(1, nwbVar3);
                            e18Var6.k0(objN12);
                        }
                        zy7 zy7Var = (zy7) objN12;
                        boolean zF3 = e18Var6.f(anVar3);
                        Object objN13 = e18Var6.N();
                        if (zF3 || objN13 == lz1Var) {
                            yb ybVar = new yb(1, anVar3, an.class, "addUploads", "addUploads(Ljava/util/List;)V", 0, 7);
                            e18Var6.k0(ybVar);
                            objN13 = ybVar;
                        }
                        zp.a(size, zy7Var, (bz7) ((jm9) objN13), null, e18Var6, 48);
                        e18Var3 = e18Var6;
                        z = false;
                        e18Var3.p(false);
                    } else {
                        e18Var3 = e18Var6;
                        z = false;
                        e18Var3.a0(982599342);
                        e18Var3.p(false);
                    }
                    vm vmVar4 = vmVar;
                    jk jkVar = (jk) vmVar4.V.j.getValue();
                    if (jkVar == null) {
                        e18Var3.a0(982650243);
                        e18Var3.p(z);
                    } else {
                        e18Var3.a0(982650244);
                        boolean zF4 = e18Var3.f(anVar3);
                        Object objN14 = e18Var3.N();
                        if (zF4 || objN14 == lz1Var) {
                            yb ybVar2 = new yb(1, anVar3, an.class, "downloadAttachment", "downloadAttachment(Lcom/anthropic/claude/sessions/api/AgentChatAttachment;)V", 0, 8);
                            e18Var3.k0(ybVar2);
                            objN14 = ybVar2;
                        }
                        bz7 bz7Var = (bz7) ((jm9) objN14);
                        boolean zF5 = e18Var3.f(anVar3);
                        Object objN15 = e18Var3.N();
                        if (zF5 || objN15 == lz1Var) {
                            xn xnVar = new xn(0, anVar3, an.class, "dismissAttachmentViewer", "dismissAttachmentViewer()V", 0, 3);
                            e18Var3.k0(xnVar);
                            objN15 = xnVar;
                        }
                        qk.a(jkVar, bz7Var, (zy7) ((jm9) objN15), e18Var3, 0);
                        e18Var3.p(false);
                    }
                    if (((Boolean) anVar3.g.getValue()).booleanValue()) {
                        e18Var3.a0(982986284);
                        boolean zH = e18Var3.h(fk0Var) | e18Var3.f(anVar3) | e18Var3.f(nwbVar2);
                        Object objN16 = e18Var3.N();
                        if (zH || objN16 == lz1Var) {
                            objN16 = new cn(fk0Var, anVar3, nwbVar2, 0);
                            e18Var3.k0(objN16);
                        }
                        zy7 zy7Var2 = (zy7) objN16;
                        boolean zF6 = e18Var3.f(anVar3);
                        Object objN17 = e18Var3.N();
                        if (zF6 || objN17 == lz1Var) {
                            objN17 = new hn(anVar3, 1);
                            e18Var3.k0(objN17);
                        }
                        kik.c(zy7Var2, (zy7) objN17, e18Var3, 0);
                        e18Var3.p(false);
                    } else {
                        e18Var3.a0(983418734);
                        e18Var3.p(false);
                    }
                    String str = (String) ((lsc) vmVar4.w.b).getValue();
                    ArrayList arrayListA1 = w44.a1(vmVar4.r, x44.Y(vmVar4.f()));
                    SessionResource sessionResourceD2 = ((vm) slVar).d();
                    SessionResource sessionResourceF = vmVar4.f();
                    String strM875getIdOcx55TE2 = sessionResourceF != null ? sessionResourceF.m875getIdOcx55TE() : null;
                    rk rkVarC = vmVar4.c();
                    Boolean bool = (Boolean) vmVar4.E.getValue();
                    boolean zF7 = e18Var3.f(anVar3);
                    Object objN18 = e18Var3.N();
                    if (zF7 || objN18 == lz1Var) {
                        yb ybVar3 = new yb(1, anVar3, an.class, "selectSession", "selectSession-45aRAwg(Ljava/lang/String;)V", 0, 5);
                        e18Var3.k0(ybVar3);
                        objN18 = ybVar3;
                    }
                    bz7 bz7Var2 = (bz7) ((jm9) objN18);
                    boolean zF8 = e18Var3.f(anVar3);
                    Object objN19 = e18Var3.N();
                    if (zF8 || objN19 == lz1Var) {
                        vmVar2 = vmVar4;
                        xn xnVar2 = new xn(0, anVar3, an.class, "selectRemoteSession", "selectRemoteSession()V", 0, 1);
                        e18Var3.k0(xnVar2);
                        objN19 = xnVar2;
                    } else {
                        vmVar2 = vmVar4;
                    }
                    jm9 jm9Var = (jm9) objN19;
                    qzb qzbVar = anVar3.c;
                    if (!qzbVar.b() || !((Boolean) qzbVar.k.getValue()).booleanValue() || vmVar2.f() != null) {
                        jm9Var = null;
                    }
                    int i4 = ml3.f;
                    e18 e18Var7 = e18Var3;
                    cok.e(ml3Var, str, arrayListA1, sessionResourceD2, strM875getIdOcx55TE2, rkVarC, bool, bz7Var2, (zy7) jm9Var, this.G, null, e18Var7, 0);
                    e18Var7.p(true);
                }
                break;
            default:
                String strN = (String) obj9;
                ModelSelection modelSelection = (ModelSelection) obj8;
                String str2 = (String) obj7;
                String str3 = (String) obj6;
                qi3 qi3Var = (qi3) obj5;
                eli eliVar = (eli) obj4;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var8 = (e18) ld4Var2;
                if (!e18Var8.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var8.T();
                } else {
                    iqb iqbVarJ = gb9.J(yfd.p(b.c(fqbVar, 1.0f), gm3.a(e18Var8).n, xve.b(8.0f)), 16.0f);
                    q64 q64VarA2 = p64.a(eo0Var, lja.T, e18Var8, 48);
                    int iHashCode4 = Long.hashCode(e18Var8.T);
                    hyc hycVarL4 = e18Var8.l();
                    iqb iqbVarE4 = kxk.E(e18Var8, iqbVarJ);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var8.e0();
                    if (e18Var8.S) {
                        e18Var8.k(re4Var2);
                    } else {
                        e18Var8.n0();
                    }
                    d4c.i0(e18Var8, cd4.f, q64VarA2);
                    d4c.i0(e18Var8, cd4.e, hycVarL4);
                    d4c.i0(e18Var8, cd4.g, Integer.valueOf(iHashCode4));
                    d4c.h0(e18Var8, cd4.h);
                    d4c.i0(e18Var8, cd4.d, iqbVarE4);
                    tjh.b(d4c.j0(R.string.chat_refusal_notice_header, e18Var8), null, gm3.a(e18Var8).M, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var8).e.E).d, e18Var8, 0, 0, 130042);
                    kxk.g(e18Var8, b.e(fqbVar, 12.0f));
                    if (strN == null) {
                        strN = vb7.n(e18Var8, -1777813248, R.string.chat_refusal_notice_body, e18Var8, false);
                    } else {
                        e18Var8.a0(-1777813713);
                        e18Var8.p(false);
                    }
                    boolean zF9 = e18Var8.f(strN);
                    Object objN20 = e18Var8.N();
                    if (zF9 || objN20 == lz1Var) {
                        objN20 = p39.c(strN);
                        e18Var8.k0(objN20);
                    }
                    tjh.c((zb0) objN20, null, gm3.a(e18Var8).M, 0L, 0L, new fdh(3), 0L, 0, false, 0, 0, null, null, ((jm3) gm3.c(e18Var8).e.E).g, e18Var8, 0, 0, 261114);
                    kxk.g(e18Var8, b.e(fqbVar, 16.0f));
                    e12 e12Var = e12.a;
                    if (modelSelection == null || str2 == null) {
                        e18Var8.a0(723279499);
                        dtj.a(d4c.j0(R.string.chat_refusal_button_new_chat, e18Var8), b.c(fqbVar, 1.0f), false, null, e12Var, null, 0L, this.G, e18Var8, 24624, 108);
                        e18Var8.p(false);
                    } else {
                        e18Var8.a0(722878483);
                        String strK0 = d4c.k0(R.string.chat_refusal_button_retry_with_model, new Object[]{str2}, e18Var8);
                        iqb iqbVarC = b.c(fqbVar, 1.0f);
                        bz7 bz7Var3 = this.F;
                        boolean zF10 = e18Var8.f(bz7Var3) | e18Var8.f(modelSelection);
                        Object objN21 = e18Var8.N();
                        if (zF10 || objN21 == lz1Var) {
                            objN21 = new aac(bz7Var3, 18, modelSelection);
                            e18Var8.k0(objN21);
                        }
                        dtj.a(strK0, iqbVarC, false, null, e12Var, null, 0L, (zy7) objN21, e18Var8, 24624, 108);
                        e18Var8.p(false);
                    }
                    String strP = gid.p(8.0f, R.string.chat_refusal_button_let_us_know, e18Var8, e18Var8, fqbVar);
                    iqb iqbVarC2 = b.c(fqbVar, 1.0f);
                    f12 f12Var = f12.a;
                    dtj.a(strP, iqbVarC2, false, null, f12Var, null, 0L, this.H, e18Var8, 24624, 108);
                    if (str3 == null || bsg.I0(str3)) {
                        e18Var8.a0(724825779);
                        e18Var8.p(false);
                    } else {
                        sq6.A(8.0f, 724028149, e18Var8, e18Var8, fqbVar);
                        String strJ0 = d4c.j0(R.string.generic_learn_more, e18Var8);
                        iqb iqbVarC3 = b.c(fqbVar, 1.0f);
                        boolean zH2 = e18Var8.h(qi3Var) | e18Var8.h(eliVar) | e18Var8.f(str3);
                        Object objN22 = e18Var8.N();
                        if (zH2 || objN22 == lz1Var) {
                            objN22 = new wb2(qi3Var, eliVar, str3, 2);
                            e18Var8.k0(objN22);
                        }
                        dtj.a(strJ0, iqbVarC3, false, null, f12Var, null, 0L, (zy7) objN22, e18Var8, 24624, 108);
                        e18Var8.p(false);
                    }
                    e18Var8.p(true);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ sn(String str, ModelSelection modelSelection, String str2, bz7 bz7Var, zy7 zy7Var, zy7 zy7Var2, String str3, qi3 qi3Var, eli eliVar) {
        this.I = str;
        this.J = modelSelection;
        this.K = str2;
        this.F = bz7Var;
        this.G = zy7Var;
        this.H = zy7Var2;
        this.L = str3;
        this.M = qi3Var;
        this.N = eliVar;
    }
}
