package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class ke7 implements sz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ ke7(int i) {
        this.E = i;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.E) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                ((Number) obj4).intValue();
                ((d56) obj2).getClass();
                e18 e18Var = (e18) ((ld4) obj3);
                e18Var.a0(-1367644199);
                iqb iqbVarS = xn5.S(fqb.E, wd6.d0(1.0f - (Math.abs(fFloatValue) * 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f));
                e18Var.p(false);
                return iqbVarS;
            default:
                float fFloatValue2 = ((Number) obj).floatValue();
                ((Number) obj4).intValue();
                ((d56) obj2).getClass();
                e18 e18Var2 = (e18) ((ld4) obj3);
                e18Var2.a0(-1901975165);
                iqb iqbVarG = ztk.g(fFloatValue2 >= MTTypesetterKt.kLineSkipLimitMultiplier ? (MTTypesetterKt.kLineSkipLimitMultiplier * fFloatValue2) + 1.0f : (0.050000012f * fFloatValue2) + 1.0f);
                e18Var2.p(false);
                return iqbVarG;
        }
    }
}
