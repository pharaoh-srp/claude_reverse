package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class ye2 implements j6i {
    public final efe a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final wp3 e;
    public final wp3 f;
    public final int g;

    public ye2(Context context, wp3 wp3Var, wp3 wp3Var2) {
        xg9 xg9Var = new xg9();
        g71 g71Var = g71.a;
        xg9Var.e(jh1.class, g71Var);
        xg9Var.e(k81.class, g71Var);
        j71 j71Var = j71.a;
        xg9Var.e(tfa.class, j71Var);
        xg9Var.e(v81.class, j71Var);
        h71 h71Var = h71.a;
        xg9Var.e(yo3.class, h71Var);
        xg9Var.e(l81.class, h71Var);
        f71 f71Var = f71.a;
        xg9Var.e(lz.class, f71Var);
        xg9Var.e(h81.class, f71Var);
        i71 i71Var = i71.a;
        xg9Var.e(mfa.class, i71Var);
        xg9Var.e(u81.class, i71Var);
        k71 k71Var = k71.a;
        xg9Var.e(q0c.class, k71Var);
        xg9Var.e(x81.class, k71Var);
        xg9Var.H = true;
        this.a = new efe(18, xg9Var);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(g42.c);
        this.e = wp3Var2;
        this.f = wp3Var;
        this.g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(ij0.i("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.o81 a(defpackage.o81 r8) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye2.a(o81):o81");
    }
}
