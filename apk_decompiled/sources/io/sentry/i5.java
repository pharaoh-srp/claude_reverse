package io.sentry;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class i5 implements m2 {
    public final String E;
    public final Integer F;
    public final String G;
    public final String H;
    public final s5 I;
    public final int J;
    public final Callable K;
    public final String L;
    public HashMap M;

    public i5(s5 s5Var, Callable callable, String str, String str2, String str3, String str4, Integer num) {
        p.v("type is required", s5Var);
        this.I = s5Var;
        this.E = str;
        this.J = -1;
        this.G = str2;
        this.K = callable;
        this.L = str3;
        this.H = str4;
        this.F = num;
    }

    public final int a() {
        Callable callable = this.K;
        if (callable == null) {
            return this.J;
        }
        try {
            return ((Integer) callable.call()).intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // io.sentry.m2
    public final void serialize(q3 q3Var, a1 a1Var) throws IOException {
        y yVar = (y) q3Var;
        yVar.n();
        String str = this.E;
        if (str != null) {
            yVar.r("content_type");
            yVar.A(str);
        }
        String str2 = this.G;
        if (str2 != null) {
            yVar.r("filename");
            yVar.A(str2);
        }
        yVar.r("type");
        yVar.x(a1Var, this.I);
        String str3 = this.L;
        if (str3 != null) {
            yVar.r("attachment_type");
            yVar.A(str3);
        }
        String str4 = this.H;
        if (str4 != null) {
            yVar.r("platform");
            yVar.A(str4);
        }
        Integer num = this.F;
        if (num != null) {
            yVar.r("item_count");
            yVar.z(num);
        }
        yVar.r("length");
        yVar.w(a());
        HashMap map = this.M;
        if (map != null) {
            for (String str5 : map.keySet()) {
                e.a(this.M, str5, yVar, str5, a1Var);
            }
        }
        yVar.p();
    }

    public i5(s5 s5Var, Callable callable, String str, String str2, String str3) {
        this(s5Var, callable, str, str2, str3, (String) null, (Integer) null);
    }

    public i5(s5 s5Var, int i, String str, String str2, String str3, String str4, Integer num) {
        this.I = s5Var;
        this.E = str;
        this.J = i;
        this.G = str2;
        this.K = null;
        this.L = str3;
        this.H = str4;
        this.F = num;
    }
}
