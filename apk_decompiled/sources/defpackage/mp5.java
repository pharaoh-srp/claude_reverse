package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mp5 implements t20 {
    public final jz1 E;
    public final kw9 F;
    public final kw9 G;
    public final kw9 H;
    public final kw9 I;
    public final kw9 J;
    public final kw9 K;
    public final String L;
    public final String M;
    public final String N;
    public final String O;
    public final kw9 P;
    public final kw9 Q;
    public final kw9 R;
    public final u0h S;
    public final u0h T;
    public final u0h U;

    public mp5(Context context) {
        context.getClass();
        String str = Build.BRAND;
        str = str == null ? "" : str;
        String str2 = Build.MODEL;
        str2 = str2 == null ? "" : str2;
        String str3 = Build.ID;
        str3 = str3 == null ? "" : str3;
        String str4 = Build.VERSION.RELEASE;
        String str5 = str4 != null ? str4 : "";
        jz1.a.getClass();
        this.E = iz1.b;
        mx1 mx1Var = new mx1(str2, 4, context);
        w1a w1aVar = w1a.F;
        this.F = yb5.w(w1aVar, mx1Var);
        this.G = yb5.w(w1aVar, new kp5(this, 0));
        this.H = yb5.w(w1aVar, new ip5(context, this, 1));
        this.I = yb5.w(w1aVar, new ip5(context, this, 0));
        this.J = yb5.w(w1aVar, re4.Q);
        this.K = yb5.w(w1aVar, new jp5(str, 0));
        this.L = str2;
        this.M = str3;
        this.N = "Android";
        this.O = str5;
        this.P = yb5.w(w1aVar, new kp5(this, 1));
        this.Q = yb5.w(w1aVar, re4.O);
        this.R = yb5.w(w1aVar, new lp5(context, 1));
        this.S = new u0h(re4.P);
        this.T = new u0h(new lp5(context, 2));
        this.U = new u0h(new lp5(context, 0));
    }

    @Override // defpackage.t20
    public final Integer c() {
        return (Integer) this.R.getValue();
    }

    @Override // defpackage.t20
    public final int e() {
        return ((Number) this.S.getValue()).intValue();
    }

    @Override // defpackage.t20
    public final String g() {
        return (String) this.K.getValue();
    }

    @Override // defpackage.t20
    public final List j() {
        return (List) this.H.getValue();
    }

    @Override // defpackage.t20
    public final String k() {
        return (String) this.P.getValue();
    }

    @Override // defpackage.t20
    public final String l() {
        return (String) this.Q.getValue();
    }

    @Override // defpackage.t20
    public final String m() {
        Object value = this.J.getValue();
        value.getClass();
        return (String) value;
    }

    @Override // defpackage.t20
    public final String n() {
        Object value = this.I.getValue();
        value.getClass();
        return (String) value;
    }

    @Override // defpackage.t20
    public final String o() {
        return (String) this.G.getValue();
    }

    @Override // defpackage.t20
    public final String p() {
        return this.M;
    }

    @Override // defpackage.t20
    public final String q() {
        return this.N;
    }

    @Override // defpackage.t20
    public final Boolean r() {
        return (Boolean) this.U.getValue();
    }

    @Override // defpackage.t20
    public final String u() {
        return this.L;
    }

    @Override // defpackage.t20
    public final String x() {
        return this.O;
    }

    @Override // defpackage.t20
    public final Integer y() {
        return (Integer) this.T.getValue();
    }

    @Override // defpackage.t20
    public final t26 z() {
        return (t26) this.F.getValue();
    }
}
