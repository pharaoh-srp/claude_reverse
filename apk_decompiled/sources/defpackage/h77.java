package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class h77 {
    public static final int A;
    public static final boolean B;
    public final Context a;
    public final g1h b;
    public final u41 c;
    public nyg d;
    public final u41 e;
    public final u41 f;
    public final Looper g;
    public final int h;
    public p31 i;
    public boolean j;
    public boolean k;
    public final int l;
    public final boolean m;
    public final wef n;
    public final taf o;
    public final cs5 p;
    public final long q;
    public final long r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final boolean w;
    public boolean x;
    public final String y;
    public final boolean z;

    static {
        String str = tpi.a;
        String strM = auk.m(Build.DEVICE);
        A = (strM.contains("emulator") || strM.contains("emu64a") || strM.contains("emu64x") || strM.contains("generic")) ? 30000 : yr6.INVALID_OWNERSHIP;
        B = true;
    }

    public h77(Context context) {
        u41 u41Var = new u41(context, 1);
        u41 u41Var2 = new u41(context, 2);
        u41 u41Var3 = new u41(context, 3);
        u41 u41Var4 = new u41(context, 4);
        context.getClass();
        this.a = context;
        this.c = u41Var;
        this.d = u41Var2;
        this.e = u41Var3;
        this.f = u41Var4;
        String str = tpi.a;
        Looper looperMyLooper = Looper.myLooper();
        this.g = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.i = p31.b;
        this.l = 1;
        this.m = true;
        this.n = wef.d;
        this.o = taf.b;
        this.p = new cs5(tpi.C(20L), tpi.C(500L));
        this.b = g1h.a;
        this.q = 500L;
        this.r = 2000L;
        this.s = 600000;
        boolean z = B;
        this.t = z ? A : Integer.MAX_VALUE;
        this.u = z ? 60000 : Integer.MAX_VALUE;
        this.v = 600000;
        this.w = true;
        this.y = "";
        this.h = -1000;
        new yl4(3);
        this.z = true;
    }
}
