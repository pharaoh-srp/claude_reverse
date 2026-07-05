package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.api.chat.ProjectReference;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ey2 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    public /* synthetic */ ey2(String str, iqb iqbVar, boolean z, boolean z2, zy7 zy7Var, String str2, wl5 wl5Var, int i) {
        this.H = str;
        this.I = iqbVar;
        this.F = z;
        this.G = z2;
        this.J = zy7Var;
        this.K = str2;
        this.L = wl5Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        ta4 ta4Var;
        e18 e18Var;
        String string;
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.L;
        Object obj4 = this.K;
        Object obj5 = this.J;
        Object obj6 = this.I;
        Object obj7 = this.H;
        int i2 = 1;
        switch (i) {
            case 0:
                ChatConversationWithProjectReference chatConversationWithProjectReference = (ChatConversationWithProjectReference) obj7;
                qdf qdfVar = (qdf) obj6;
                Date date = (Date) obj5;
                tkh tkhVar = (tkh) obj4;
                tkh tkhVar2 = (tkh) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i3 = 0;
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var2.T();
                } else {
                    cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var2, 48);
                    int iHashCode = Long.hashCode(e18Var2.T);
                    hyc hycVarL = e18Var2.l();
                    fqb fqbVar = fqb.E;
                    iqb iqbVarE = kxk.E(e18Var2, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var);
                    } else {
                        e18Var2.n0();
                    }
                    d4c.i0(e18Var2, cd4.f, cxeVarA);
                    d4c.i0(e18Var2, cd4.e, hycVarL);
                    d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var2, cd4.h);
                    d4c.i0(e18Var2, cd4.d, iqbVarE);
                    wd6.K(fxe.a, this.F, null, null, null, null, fd9.q0(333292495, new yv(this.G, i2), e18Var2), e18Var2, 1572870, 30);
                    qnc qncVar = e84.a;
                    kxk.g(e18Var2, b.t(fqbVar, 12.0f));
                    String strJ0 = d4c.j0(R.string.generic_untitled, e18Var2);
                    if (chatConversationWithProjectReference.is_starred()) {
                        e18Var2.a0(1135000303);
                        ta4 ta4VarQ0 = fd9.q0(1141443517, new fy2(tkhVar, i3), e18Var2);
                        e18Var2.p(false);
                        ta4Var = ta4VarQ0;
                    } else {
                        e18Var2.a0(1135449431);
                        e18Var2.p(false);
                        ta4Var = null;
                    }
                    if (qdfVar == null) {
                        e18Var2.a0(1135535487);
                        String name = chatConversationWithProjectReference.getName();
                        if (name.length() <= 0) {
                            name = null;
                        }
                        String str = name == null ? strJ0 : name;
                        ProjectReference project = chatConversationWithProjectReference.getProject();
                        objJ = project != null ? project.getName() : null;
                        CharSequence charSequenceK = flk.k(chatConversationWithProjectReference.getUpdated_at(), date.getTime(), e18Var2);
                        if (objJ != null) {
                            e18Var2.a0(-269293963);
                            string = d4c.k0(R.string.chat_subtitle_time_and_project, new Object[]{charSequenceK, objJ}, e18Var2);
                            e18Var2.p(false);
                        } else {
                            e18Var2.a0(-269192624);
                            e18Var2.p(false);
                            string = charSequenceK.toString();
                        }
                        mwj.a(str, null, string, ta4Var, tkhVar, 0L, tkhVar2, 0L, e18Var2, 0, 418);
                        e18Var = e18Var2;
                        e18Var.p(false);
                    } else {
                        e18Var = e18Var2;
                        e18Var.a0(1135945958);
                        egg eggVar = new egg(0L, 0L, dv7.L, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531);
                        egg eggVarA = egg.a(eggVar, gm3.a(e18Var).M, 65534);
                        boolean zF = e18Var.f(chatConversationWithProjectReference.getName()) | e18Var.f(qdfVar) | e18Var.f(strJ0);
                        Object objN = e18Var.N();
                        lz1 lz1Var = jd4.a;
                        if (zF || objN == lz1Var) {
                            String name2 = chatConversationWithProjectReference.getName();
                            if (name2.length() <= 0) {
                                name2 = null;
                            }
                            objN = name2 != null ? kwj.j(name2, name2.equals(qdfVar.b) ? qdfVar.c : lm6.E, eggVar) : new zb0(strJ0);
                            e18Var.k0(objN);
                        }
                        zb0 zb0Var = (zb0) objN;
                        boolean zF2 = e18Var.f(qdfVar) | e18Var.f(eggVarA);
                        Object objN2 = e18Var.N();
                        if (zF2 || objN2 == lz1Var) {
                            pdf pdfVar = qdfVar.a;
                            if (pdfVar != null) {
                                if (pdfVar.a.length() <= 0) {
                                    pdfVar = null;
                                }
                                if (pdfVar != null) {
                                    objJ = kwj.j(pdfVar.a, pdfVar.b, eggVarA);
                                }
                            }
                            e18Var.k0(objJ);
                            objN2 = objJ;
                        }
                        mwj.b(zb0Var, null, (zb0) objN2, ta4Var, tkhVar, 0L, tkhVar2, 0L, true, e18Var, 805306368);
                        e18Var.p(false);
                    }
                    e18Var.p(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                cn5.m((String) obj7, (iqb) obj6, this.F, this.G, (zy7) obj5, (String) obj4, (wl5) obj3, (ld4) obj, x44.p0(1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ey2(boolean z, ChatConversationWithProjectReference chatConversationWithProjectReference, qdf qdfVar, Date date, tkh tkhVar, tkh tkhVar2, boolean z2) {
        this.F = z;
        this.H = chatConversationWithProjectReference;
        this.I = qdfVar;
        this.J = date;
        this.K = tkhVar;
        this.L = tkhVar2;
        this.G = z2;
    }
}
