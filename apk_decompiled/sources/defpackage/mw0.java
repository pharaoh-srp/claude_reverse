package defpackage;

import android.app.RemoteAction;
import android.graphics.drawable.Drawable;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.ThinkingEffort;
import com.anthropic.claude.types.strings.ThinkingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class mw0 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ mw0(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj4 = this.F;
        switch (i) {
            case 0:
                ((Number) obj3).intValue();
                ((a12) obj).getClass();
                e18 e18Var = (e18) ((ld4) obj2);
                e18Var.a0(877499248);
                long j = ((jl3) obj4).O;
                e18Var.p(false);
                break;
            case 1:
                ModelId modelId = (ModelId) obj;
                String strM1064unboximpl = modelId != null ? modelId.m1064unboximpl() : null;
                ThinkingEffort thinkingEffort = (ThinkingEffort) obj2;
                String strM1141unboximpl = thinkingEffort != null ? thinkingEffort.m1141unboximpl() : null;
                ThinkingMode thinkingMode = (ThinkingMode) obj3;
                String strM1149unboximpl = thinkingMode != null ? thinkingMode.m1149unboximpl() : null;
                fn1 fn1Var = (fn1) ((xc3) obj4).h.r.getValue();
                if (fn1Var != null) {
                    ((tn1) fn1Var).K(strM1064unboximpl, strM1141unboximpl, strM1149unboximpl);
                }
                break;
            case 2:
                long j2 = ((d54) obj).a;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).e(j2) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    e18Var2.T();
                } else {
                    ou5.b(((heh) obj4).c, j2, e18Var2, (iIntValue << 3) & 112);
                }
                break;
            case 3:
                long j3 = ((d54) obj).a;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                e18 e18Var3 = (e18) ld4Var2;
                if (!e18Var3.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var3.T();
                } else {
                    c0l.V.d((Drawable) obj4, e18Var3, 48);
                }
                break;
            default:
                long j4 = ((d54) obj).a;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                e18 e18Var4 = (e18) ld4Var3;
                if (!e18Var4.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e18Var4.T();
                } else {
                    c0l.V.f(((RemoteAction) obj4).getIcon(), e18Var4, 48);
                }
                break;
        }
        return ieiVar;
    }
}
