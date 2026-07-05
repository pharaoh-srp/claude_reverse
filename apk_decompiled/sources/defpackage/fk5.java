package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class fk5 extends ts9 implements pz7 {
    public final /* synthetic */ gk5 F;
    public final /* synthetic */ String G;
    public final /* synthetic */ String H;
    public final /* synthetic */ Long I;
    public final /* synthetic */ Long J;
    public final /* synthetic */ String K;
    public final /* synthetic */ String L;
    public final /* synthetic */ mxi M;
    public final /* synthetic */ hi5 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk5(gk5 gk5Var, String str, String str2, Long l, Long l2, String str3, String str4, mxi mxiVar, hi5 hi5Var) {
        super(2);
        this.F = gk5Var;
        this.G = str;
        this.H = str2;
        this.I = l;
        this.J = l2;
        this.K = str3;
        this.L = str4;
        this.M = mxiVar;
        this.N = hi5Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        lj5 lj5Var = (lj5) obj;
        bz7 bz7Var = (bz7) obj2;
        lj5Var.getClass();
        bz7Var.getClass();
        gk5 gk5Var = this.F;
        String str = this.G;
        int i = 7;
        if (str != null) {
            try {
                for (int i2 : sq6.H(13)) {
                    if (ms6.j(i2).equals(str)) {
                        i = i2;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            } catch (NoSuchElementException e) {
                dch.H(gk5Var.a.t(), 5, g99.G, new rb1(str, 11), e, false, 48);
            }
        }
        long jLongValue = this.I.longValue();
        String str2 = this.L;
        String str3 = this.H;
        Long l = this.J;
        String str4 = this.K;
        mxi mxiVar = this.M;
        bz7Var.invoke(new ek5(this.N, gk5.a(gk5Var, lj5Var, i, 3, str3, jLongValue, l, str4, str2, null, mxiVar), gk5Var, mxiVar, 0));
        return iei.a;
    }
}
