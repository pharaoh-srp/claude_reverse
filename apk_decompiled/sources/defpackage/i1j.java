package defpackage;

import com.anthropic.claude.api.chat.ChatFeedbackType;
import com.anthropic.claude.types.strings.MessageId;

/* JADX INFO: loaded from: classes2.dex */
public final class i1j implements rz7 {
    public final /* synthetic */ fn1 E;
    public final /* synthetic */ y0j F;

    public i1j(fn1 fn1Var, y0j y0jVar) {
        this.E = fn1Var;
        this.F = y0jVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ld4 ld4Var = (ld4) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ia0) obj).getClass();
        int i = 0;
        int i2 = 1;
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
            fn1 fn1Var = this.E;
            mdg mdgVar = (mdg) ((tn1) fn1Var).o.g;
            y0j y0jVar = this.F;
            ChatFeedbackType chatFeedbackType = (ChatFeedbackType) mdgVar.get(MessageId.m1051boximpl(y0jVar.b));
            boolean zF = e18Var.f(fn1Var) | e18Var.h(y0jVar);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                objN = new h1j(fn1Var, y0jVar, i);
                e18Var.k0(objN);
            }
            zy7 zy7Var = (zy7) objN;
            boolean zF2 = e18Var.f(fn1Var) | e18Var.h(y0jVar);
            Object objN2 = e18Var.N();
            if (zF2 || objN2 == lz1Var) {
                objN2 = new h1j(fn1Var, y0jVar, i2);
                e18Var.k0(objN2);
            }
            wjk.g(chatFeedbackType, zy7Var, (zy7) objN2, null, e18Var, 0);
        } else {
            e18Var.T();
        }
        return iei.a;
    }
}
