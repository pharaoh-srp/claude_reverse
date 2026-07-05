package defpackage;

import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qp implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ String F;
    public final /* synthetic */ iqb G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;

    public /* synthetic */ qp(yk ykVar, bz7 bz7Var, bz7 bz7Var2, bz7 bz7Var3, iqb iqbVar, boolean z, boolean z2, String str, int i, int i2) {
        this.L = ykVar;
        this.M = bz7Var;
        this.N = bz7Var2;
        this.O = bz7Var3;
        this.G = iqbVar;
        this.H = z;
        this.I = z2;
        this.F = str;
        this.J = i;
        this.K = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.J;
        Object obj3 = this.O;
        Object obj4 = this.N;
        Object obj5 = this.M;
        Object obj6 = this.L;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                wp.c((yk) obj6, (bz7) obj5, (bz7) obj4, (bz7) obj3, this.G, this.H, this.I, this.F, (ld4) obj, iP0, this.K);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                grk.a(this.F, this.G, (String) obj6, (String) obj5, (String) obj4, (WebViewClient) obj3, this.H, this.I, (ld4) obj, iP02, this.K);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ qp(String str, iqb iqbVar, String str2, String str3, String str4, WebViewClient webViewClient, boolean z, boolean z2, int i, int i2) {
        this.F = str;
        this.G = iqbVar;
        this.L = str2;
        this.M = str3;
        this.N = str4;
        this.O = webViewClient;
        this.H = z;
        this.I = z2;
        this.J = i;
        this.K = i2;
    }
}
