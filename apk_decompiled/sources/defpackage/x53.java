package defpackage;

import com.anthropic.claude.app.main.loggedout.LoggedOutAppDestination;
import com.anthropic.claude.artifact.dialog.PublishArtifactParams;
import com.anthropic.claude.chat.ChatScreenParams;
import com.anthropic.claude.chat.dialogs.ChatScreenDialog;
import com.anthropic.claude.login.LoginScreens;
import com.anthropic.claude.login.MagicLinkSentConfig;
import com.anthropic.claude.login.WelcomeNotice;
import com.anthropic.claude.login.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x53 implements sz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ qz7 F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ x53(zy7 zy7Var, zy7 zy7Var2, rz7 rz7Var, zy7 zy7Var3, WelcomeNotice welcomeNotice) {
        this.F = zy7Var;
        this.G = zy7Var2;
        this.H = rz7Var;
        this.I = zy7Var3;
        this.J = welcomeNotice;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2 = this.E;
        tp4 tp4Var = null;
        lz1 lz1Var = jd4.a;
        iei ieiVar = iei.a;
        Object obj5 = this.J;
        Object obj6 = this.I;
        qz7 qz7Var = this.F;
        Object obj7 = this.G;
        Object obj8 = this.H;
        int i3 = 1;
        switch (i2) {
            case 0:
                ChatScreenParams chatScreenParams = (ChatScreenParams) obj7;
                rwe rweVar = (rwe) obj8;
                zy7 zy7Var = (zy7) qz7Var;
                t53 t53Var = (t53) obj6;
                lq0 lq0Var = (lq0) obj5;
                ChatScreenDialog chatScreenDialog = (ChatScreenDialog) obj2;
                ld4 ld4Var = (ld4) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((ia0) obj).getClass();
                chatScreenDialog.getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= (iIntValue & 64) == 0 ? ((e18) ld4Var).f(chatScreenDialog) : ((e18) ld4Var).h(chatScreenDialog) ? 32 : 16;
                }
                int i4 = iIntValue;
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(i4 & 1, (i4 & 145) != 144)) {
                    e18Var.T();
                } else if (chatScreenDialog.equals(ChatScreenDialog.Dismissed.INSTANCE)) {
                    e18Var.a0(-1756194331);
                    e18Var.p(false);
                } else if (chatScreenDialog.equals(ChatScreenDialog.Rename.INSTANCE)) {
                    e18Var.a0(-1756144421);
                    nfe nfeVarH = kxk.H(chatScreenParams.m591getChatIdRjYBDck(), e18Var, 0);
                    boolean zH = e18Var.h(rweVar);
                    Object objN = e18Var.N();
                    if (zH || objN == lz1Var) {
                        objN = new f13(rweVar, 8);
                        e18Var.k0(objN);
                    }
                    bz7 bz7Var = (bz7) objN;
                    boolean zH2 = e18Var.h(rweVar);
                    Object objN2 = e18Var.N();
                    if (zH2 || objN2 == lz1Var) {
                        objN2 = new g13(rweVar, 3);
                        e18Var.k0(objN2);
                    }
                    kxk.f(nfeVarH, bz7Var, (zy7) objN2, e18Var, 0);
                    e18Var.p(false);
                } else if (chatScreenDialog.equals(ChatScreenDialog.Delete.INSTANCE)) {
                    e18Var.a0(-1755831197);
                    vx5 vx5VarJ = csg.J(chatScreenParams.m591getChatIdRjYBDck(), e18Var, 0);
                    boolean zH3 = e18Var.h(rweVar);
                    Object objN3 = e18Var.N();
                    if (zH3 || objN3 == lz1Var) {
                        objN3 = new g13(rweVar, i);
                        e18Var.k0(objN3);
                    }
                    zy7 zy7Var2 = (zy7) objN3;
                    boolean zH4 = e18Var.h(rweVar);
                    Object objN4 = e18Var.N();
                    if (zH4 || objN4 == lz1Var) {
                        objN4 = new g13(rweVar, 5);
                        e18Var.k0(objN4);
                    }
                    csg.d(vx5VarJ, zy7Var2, (zy7) objN4, e18Var, 0);
                    e18Var.p(false);
                } else if (chatScreenDialog.equals(ChatScreenDialog.VoiceShortcut.INSTANCE)) {
                    e18Var.a0(-1755311482);
                    boolean zH5 = e18Var.h(rweVar) | e18Var.f(zy7Var);
                    Object objN5 = e18Var.N();
                    if (zH5 || objN5 == lz1Var) {
                        objN5 = new y53(rweVar, zy7Var);
                        e18Var.k0(objN5);
                    }
                    kkk.c((zy7) objN5, e18Var, 0);
                    e18Var.p(false);
                } else if (chatScreenDialog.equals(ChatScreenDialog.StopResearch.INSTANCE)) {
                    e18Var.a0(-1755040232);
                    boolean zF = e18Var.f(t53Var) | e18Var.h(rweVar);
                    Object objN6 = e18Var.N();
                    if (zF || objN6 == lz1Var) {
                        objN6 = new h13(t53Var, rweVar, i3);
                        e18Var.k0(objN6);
                    }
                    zy7 zy7Var3 = (zy7) objN6;
                    boolean zH6 = e18Var.h(rweVar);
                    Object objN7 = e18Var.N();
                    if (zH6 || objN7 == lz1Var) {
                        objN7 = new g13(rweVar, 6);
                        e18Var.k0(objN7);
                    }
                    thk.d(zy7Var3, (zy7) objN7, e18Var, 0);
                    e18Var.p(false);
                } else {
                    if (!(chatScreenDialog instanceof ChatScreenDialog.ShareArtifact)) {
                        throw kgh.s(e18Var, -1026481973, false);
                    }
                    e18Var.a0(-1754695264);
                    ChatScreenDialog.ShareArtifact shareArtifact = (ChatScreenDialog.ShareArtifact) chatScreenDialog;
                    String artifactUuid = shareArtifact.getParams().getArtifactUuid();
                    lq0Var.getClass();
                    artifactUuid.getClass();
                    kq0 kq0Var = (kq0) ((mdg) lq0Var.a.G).get(artifactUuid);
                    if (kq0Var != null) {
                        e18Var.a0(-1754589740);
                        PublishArtifactParams publishArtifactParams = new PublishArtifactParams(shareArtifact.getParams().m550getMessageIdPStrttk(), kq0Var.b(), kq0Var.a(), t53Var.L0, shareArtifact.getParams().getVersionIndex(), shareArtifact.getParams().isWiggleArtifact(), null);
                        boolean zH7 = e18Var.h(rweVar);
                        Object objN8 = e18Var.N();
                        if (zH7 || objN8 == lz1Var) {
                            objN8 = new g13(rweVar, 7);
                            e18Var.k0(objN8);
                        }
                        ntk.a(publishArtifactParams, (zy7) objN8, null, e18Var, 0);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(-1753941313);
                        boolean zH8 = e18Var.h(rweVar);
                        Object objN9 = e18Var.N();
                        if (zH8 || objN9 == lz1Var) {
                            objN9 = new kk0(rweVar, tp4Var, 11);
                            e18Var.k0(objN9);
                        }
                        fd9.i(e18Var, (pz7) objN9, ieiVar);
                        e18Var.p(false);
                    }
                    e18Var.p(false);
                }
                return ieiVar;
            case 1:
                zy7 zy7Var4 = (zy7) qz7Var;
                zy7 zy7Var5 = (zy7) obj7;
                rz7 rz7Var = (rz7) obj8;
                zy7 zy7Var6 = (zy7) obj6;
                WelcomeNotice welcomeNotice = (WelcomeNotice) obj5;
                LoggedOutAppDestination loggedOutAppDestination = (LoggedOutAppDestination) obj2;
                ld4 ld4Var2 = (ld4) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((ia0) obj).getClass();
                loggedOutAppDestination.getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= (iIntValue2 & 64) == 0 ? ((e18) ld4Var2).f(loggedOutAppDestination) : ((e18) ld4Var2).h(loggedOutAppDestination) ? 32 : 16;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    e18Var2.T();
                } else {
                    if (!(loggedOutAppDestination instanceof LoggedOutAppDestination.LoginApp)) {
                        throw kgh.s(e18Var2, 206773407, false);
                    }
                    e18Var2.a0(2115084645);
                    boolean zF2 = e18Var2.f(zy7Var4);
                    Object objN10 = e18Var2.N();
                    if (zF2 || objN10 == lz1Var) {
                        objN10 = new bu5(zy7Var4, null, 1);
                        e18Var2.k0(objN10);
                    }
                    fd9.i(e18Var2, (pz7) objN10, ieiVar);
                    boolean zF3 = e18Var2.f(zy7Var5) | e18Var2.f(rz7Var);
                    Object objN11 = e18Var2.N();
                    if (zF3 || objN11 == lz1Var) {
                        objN11 = new cu5(i3, rz7Var, zy7Var5);
                        e18Var2.k0(objN11);
                    }
                    b.a((rz7) objN11, zy7Var6, null, welcomeNotice, null, null, e18Var2, 0, 52);
                    e18Var2.p(false);
                }
                return ieiVar;
            default:
                final rwe rweVar2 = (rwe) obj8;
                final k3g k3gVar = (k3g) obj7;
                final rz7 rz7Var2 = (rz7) qz7Var;
                final hj hjVar = (hj) obj6;
                final nwb nwbVar = (nwb) obj5;
                final mnc mncVar = (mnc) obj;
                final ybg ybgVar = (ybg) obj2;
                ld4 ld4Var3 = (ld4) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                mncVar.getClass();
                ybgVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    i = iIntValue3 | (((e18) ld4Var3).f(mncVar) ? 4 : 2);
                } else {
                    i = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i |= ((e18) ld4Var3).f(ybgVar) ? 32 : 16;
                }
                e18 e18Var3 = (e18) ld4Var3;
                if (e18Var3.Q(i & 1, (i & 147) != 146)) {
                    kxk.h(rweVar2, "login.screens", null, csg.q(rweVar2, e18Var3, 384), null, fd9.q0(-729611990, new sz7() { // from class: uga
                        @Override // defpackage.sz7
                        public final Object i(Object obj9, Object obj10, Object obj11, Object obj12) {
                            wo8 wo8Var = zni.b;
                            LoginScreens loginScreens = (LoginScreens) obj10;
                            ld4 ld4Var4 = (ld4) obj11;
                            int iIntValue4 = ((Integer) obj12).intValue();
                            ((ia0) obj9).getClass();
                            loginScreens.getClass();
                            if ((iIntValue4 & 48) == 0) {
                                iIntValue4 |= (iIntValue4 & 64) == 0 ? ((e18) ld4Var4).f(loginScreens) : ((e18) ld4Var4).h(loginScreens) ? 32 : 16;
                            }
                            e18 e18Var4 = (e18) ld4Var4;
                            if (e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                                boolean z = loginScreens instanceof LoginScreens.Welcome;
                                rwe rweVar3 = rweVar2;
                                rz7 rz7Var3 = rz7Var2;
                                ybg ybgVar2 = ybgVar;
                                mnc mncVar2 = mncVar;
                                lz1 lz1Var2 = jd4.a;
                                if (z) {
                                    e18Var4.a0(959058690);
                                    nwb nwbVar2 = nwbVar;
                                    boolean zBooleanValue = ((Boolean) nwbVar2.getValue()).booleanValue();
                                    WelcomeNotice notice = ((LoginScreens.Welcome) loginScreens).getNotice();
                                    iqb iqbVarP = yfd.p(androidx.compose.foundation.layout.b.c, ((gwa) e18Var4.j(jwa.a)).a.n, wo8Var);
                                    Object objN12 = e18Var4.N();
                                    if (objN12 == lz1Var2) {
                                        objN12 = new fg1(19, nwbVar2);
                                        e18Var4.k0(objN12);
                                    }
                                    zy7 zy7Var7 = (zy7) objN12;
                                    boolean zH9 = e18Var4.h(rweVar3);
                                    Object objN13 = e18Var4.N();
                                    if (zH9 || objN13 == lz1Var2) {
                                        objN13 = new f13(rweVar3, 12);
                                        e18Var4.k0(objN13);
                                    }
                                    bz7 bz7Var2 = (bz7) objN13;
                                    boolean zH10 = e18Var4.h(rweVar3);
                                    Object objN14 = e18Var4.N();
                                    if (zH10 || objN14 == lz1Var2) {
                                        objN14 = new kj3(rweVar3, 25);
                                        e18Var4.k0(objN14);
                                    }
                                    knk.b(k3gVar, zBooleanValue, zy7Var7, bz7Var2, rz7Var3, (zy7) objN14, ybgVar2, iqbVarP, null, null, notice, mncVar2, e18Var4, 384);
                                    e18Var4.p(false);
                                } else if (loginScreens instanceof LoginScreens.MagicLinkSent) {
                                    e18Var4.a0(960169234);
                                    MagicLinkSentConfig sentConfig = ((LoginScreens.MagicLinkSent) loginScreens).getSentConfig();
                                    iqb iqbVarP2 = yfd.p(androidx.compose.foundation.layout.b.c, ((gwa) e18Var4.j(jwa.a)).a.n, wo8Var);
                                    boolean zH11 = e18Var4.h(rweVar3);
                                    Object objN15 = e18Var4.N();
                                    if (zH11 || objN15 == lz1Var2) {
                                        objN15 = new kj3(rweVar3, 26);
                                        e18Var4.k0(objN15);
                                    }
                                    zy7 zy7Var8 = (zy7) objN15;
                                    boolean zH12 = e18Var4.h(rweVar3);
                                    Object objN16 = e18Var4.N();
                                    if (zH12 || objN16 == lz1Var2) {
                                        objN16 = new kj3(rweVar3, 27);
                                        e18Var4.k0(objN16);
                                    }
                                    zoa.a(sentConfig, rz7Var3, zy7Var8, (zy7) objN16, ybgVar2, iqbVarP2, null, mncVar2, e18Var4, 0);
                                    e18Var4.p(false);
                                } else {
                                    if (!(loginScreens instanceof LoginScreens.MinorBlocked)) {
                                        throw kgh.s(e18Var4, -1077449468, false);
                                    }
                                    e18Var4.a0(960947210);
                                    hj hjVar2 = hjVar;
                                    boolean zH13 = e18Var4.h(hjVar2) | e18Var4.h(rweVar3);
                                    Object objN17 = e18Var4.N();
                                    if (zH13 || objN17 == lz1Var2) {
                                        objN17 = new vc8(hjVar2, 12, rweVar3);
                                        e18Var4.k0(objN17);
                                    }
                                    lsk.b(48, 0, e18Var4, (zy7) objN17, androidx.compose.foundation.layout.b.c);
                                    e18Var4.p(false);
                                }
                            } else {
                                e18Var4.T();
                            }
                            return iei.a;
                        }
                    }, e18Var3), e18Var3, 196656, 20);
                } else {
                    e18Var3.T();
                }
                return ieiVar;
        }
    }

    public /* synthetic */ x53(rwe rweVar, k3g k3gVar, rz7 rz7Var, hj hjVar, nwb nwbVar) {
        this.H = rweVar;
        this.G = k3gVar;
        this.F = rz7Var;
        this.I = hjVar;
        this.J = nwbVar;
    }

    public /* synthetic */ x53(ChatScreenParams chatScreenParams, rwe rweVar, zy7 zy7Var, t53 t53Var, lq0 lq0Var) {
        this.G = chatScreenParams;
        this.H = rweVar;
        this.F = zy7Var;
        this.I = t53Var;
        this.J = lq0Var;
    }
}
