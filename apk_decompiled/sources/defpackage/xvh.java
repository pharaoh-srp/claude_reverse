package defpackage;

import android.text.SpannableString;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xvh implements sz7 {
    public final /* synthetic */ List E;
    public final /* synthetic */ int F;
    public final /* synthetic */ qo8 G;
    public final /* synthetic */ nwb H;

    public xvh(List list, int i, qo8 qo8Var, nwb nwbVar) {
        this.E = list;
        this.F = i;
        this.G = qo8Var;
        this.H = nwbVar;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        SpannableString spannableString;
        px9 px9Var = (px9) obj;
        int iIntValue = ((Number) obj2).intValue();
        ld4 ld4Var = (ld4) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (((e18) ld4Var).f(px9Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ((e18) ld4Var).d(iIntValue) ? 32 : 16;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(i & 1, (i & 147) != 146)) {
            String str = (String) this.E.get(iIntValue);
            e18Var.a0(1550506221);
            SpannableString[] spannableStringArr = (SpannableString[]) this.H.getValue();
            xsc.b(null, Integer.valueOf(this.F + iIntValue), (spannableStringArr == null || (spannableString = (SpannableString) mp0.I0(iIntValue, spannableStringArr)) == null) ? str : spannableString, MTTypesetterKt.kLineSkipLimitMultiplier, null, false, false, null, this.G.e, e18Var, 1572870, 184);
            e18Var.p(false);
        } else {
            e18Var.T();
        }
        return iei.a;
    }
}
