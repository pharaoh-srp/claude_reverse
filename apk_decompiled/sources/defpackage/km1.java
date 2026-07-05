package defpackage;

import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.ThinkingEffort;

/* JADX INFO: loaded from: classes2.dex */
public final class km1 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ mj1 F;
    public final /* synthetic */ zy7 G;

    public /* synthetic */ km1(mj1 mj1Var, zy7 zy7Var, int i) {
        this.E = i;
        this.F = mj1Var;
        this.G = zy7Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        zy7 zy7Var = this.G;
        mj1 mj1Var = this.F;
        switch (i) {
            case 0:
                String strM1141unboximpl = ((ThinkingEffort) obj).m1141unboximpl();
                strM1141unboximpl.getClass();
                String strR = mj1Var.R();
                if (!(strR == null ? false : ThinkingEffort.m1138equalsimpl0(strM1141unboximpl, strR))) {
                    mj1Var.w.setValue(ThinkingEffort.m1135boximpl(strM1141unboximpl));
                    fn1 fn1Var = (fn1) mj1Var.K.getValue();
                    if (fn1Var != null) {
                        tn1 tn1Var = (tn1) fn1Var;
                        tn1Var.c.invoke(ThinkingEffort.m1135boximpl(strM1141unboximpl));
                        tn1Var.H();
                    }
                }
                zy7Var.a();
                break;
            default:
                String strM1064unboximpl = ((ModelId) obj).m1064unboximpl();
                strM1064unboximpl.getClass();
                mj1Var.V(strM1064unboximpl);
                zy7Var.a();
                break;
        }
        return ieiVar;
    }
}
