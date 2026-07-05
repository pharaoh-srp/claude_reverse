package defpackage;

import android.content.Context;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.chat.menu.ChatItemMenuDialogDestination;
import com.anthropic.claude.chat.menu.b;
import com.anthropic.claude.chat.menu.d;
import com.anthropic.claude.login.WelcomeNotice;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class va0 implements sz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ va0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = obj4;
        this.J = obj5;
        this.K = obj6;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.E;
        iei ieiVar = iei.a;
        lz1 lz1Var = jd4.a;
        Object obj5 = this.K;
        Object obj6 = this.J;
        Object obj7 = this.I;
        Object obj8 = this.H;
        Object obj9 = this.G;
        Object obj10 = this.F;
        switch (i) {
            case 0:
                k3g k3gVar = (k3g) obj10;
                m9j m9jVar = (m9j) obj9;
                kja kjaVar = (kja) obj8;
                WelcomeNotice welcomeNotice = (WelcomeNotice) obj7;
                mnc mncVar = (mnc) obj6;
                Context context = (Context) obj5;
                c90 c90Var = (c90) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ld4 ld4Var = (ld4) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                c90Var.getClass();
                int i2 = (iIntValue & 6) == 0 ? ((iIntValue & 8) == 0 ? ((e18) ld4Var).f(c90Var) : ((e18) ld4Var).h(c90Var) ? 4 : 2) | iIntValue : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i2 |= ((e18) ld4Var).g(zBooleanValue) ? 32 : 16;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
                    e18Var.T();
                } else if (!zBooleanValue) {
                    e18Var.a0(256757839);
                    boolean zF = e18Var.f(m9jVar) | e18Var.h(context);
                    Object objN = e18Var.N();
                    if (zF || objN == lz1Var) {
                        objN = new l80(m9jVar, 2, context);
                        e18Var.k0(objN);
                    }
                    iuj.i(m9jVar, kjaVar, welcomeNotice, mncVar, (zy7) objN, null, e18Var, 0);
                    e18Var.p(false);
                } else {
                    e18Var.a0(256573234);
                    oq5.k(k3gVar, c90Var, null, e18Var, (i2 << 3) & 112);
                    e18Var.p(false);
                }
                break;
            default:
                ChatConversationWithProjectReference chatConversationWithProjectReference = (ChatConversationWithProjectReference) obj10;
                zy7 zy7Var = (zy7) obj9;
                zy7 zy7Var2 = (zy7) obj8;
                b bVar = (b) obj7;
                zy7 zy7Var3 = (zy7) obj6;
                zy7 zy7Var4 = (zy7) obj5;
                ChatItemMenuDialogDestination chatItemMenuDialogDestination = (ChatItemMenuDialogDestination) obj2;
                ld4 ld4Var2 = (ld4) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((ia0) obj).getClass();
                chatItemMenuDialogDestination.getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= (iIntValue2 & 64) == 0 ? ((e18) ld4Var2).f(chatItemMenuDialogDestination) : ((e18) ld4Var2).h(chatItemMenuDialogDestination) ? 32 : 16;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    e18Var2.T();
                } else {
                    String strM209getUuidRjYBDck = chatConversationWithProjectReference.m209getUuidRjYBDck();
                    boolean zF2 = e18Var2.f(bVar) | e18Var2.f(zy7Var3);
                    Object objN2 = e18Var2.N();
                    if (zF2 || objN2 == lz1Var) {
                        objN2 = new l80(bVar, 8, zy7Var3);
                        e18Var2.k0(objN2);
                    }
                    d.b(strM209getUuidRjYBDck, chatItemMenuDialogDestination, zy7Var, zy7Var2, (zy7) objN2, zy7Var4, null, null, e18Var2, iIntValue2 & 112);
                }
                break;
        }
        return ieiVar;
    }
}
