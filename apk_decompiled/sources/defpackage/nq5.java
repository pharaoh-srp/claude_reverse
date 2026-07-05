package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class nq5 implements tg5 {
    public final Context E;
    public final ArrayList F;
    public final tg5 G;
    public ci7 H;
    public ww0 I;
    public pn4 J;
    public tg5 K;
    public bdi L;
    public pg5 M;
    public h2e N;
    public tg5 O;

    public nq5(Context context, tg5 tg5Var) {
        this.E = context.getApplicationContext();
        tg5Var.getClass();
        this.G = tg5Var;
        this.F = new ArrayList();
    }

    public static void n(tg5 tg5Var, yp5 yp5Var) {
        if (tg5Var != null) {
            tg5Var.o(yp5Var);
        }
    }

    @Override // defpackage.tg5
    public final long b(ug5 ug5Var) {
        fd9.M(this.O == null);
        Uri uri = ug5Var.a;
        String scheme = uri.getScheme();
        String str = tpi.a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.E;
        if (zIsEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.H == null) {
                    ci7 ci7Var = new ci7(false);
                    this.H = ci7Var;
                    j(ci7Var);
                }
                this.O = this.H;
            } else {
                if (this.I == null) {
                    ww0 ww0Var = new ww0(context);
                    this.I = ww0Var;
                    j(ww0Var);
                }
                this.O = this.I;
            }
        } else if ("asset".equals(scheme)) {
            if (this.I == null) {
                ww0 ww0Var2 = new ww0(context);
                this.I = ww0Var2;
                j(ww0Var2);
            }
            this.O = this.I;
        } else if ("content".equals(scheme)) {
            if (this.J == null) {
                pn4 pn4Var = new pn4(context);
                this.J = pn4Var;
                j(pn4Var);
            }
            this.O = this.J;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            tg5 tg5Var = this.G;
            if (zEquals) {
                if (this.K == null) {
                    try {
                        tg5 tg5Var2 = (tg5) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.K = tg5Var2;
                        j(tg5Var2);
                    } catch (ClassNotFoundException unused) {
                        ysj.u("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        xh6.f("Error instantiating RTMP extension", e);
                        return 0L;
                    }
                    if (this.K == null) {
                        this.K = tg5Var;
                    }
                }
                this.O = this.K;
            } else if ("udp".equals(scheme)) {
                if (this.L == null) {
                    bdi bdiVar = new bdi();
                    this.L = bdiVar;
                    j(bdiVar);
                }
                this.O = this.L;
            } else if ("data".equals(scheme)) {
                if (this.M == null) {
                    pg5 pg5Var = new pg5(false);
                    this.M = pg5Var;
                    j(pg5Var);
                }
                this.O = this.M;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.N == null) {
                    h2e h2eVar = new h2e(context);
                    this.N = h2eVar;
                    j(h2eVar);
                }
                this.O = this.N;
            } else {
                this.O = tg5Var;
            }
        }
        return this.O.b(ug5Var);
    }

    @Override // defpackage.tg5
    public final void close() {
        tg5 tg5Var = this.O;
        if (tg5Var != null) {
            try {
                tg5Var.close();
            } finally {
                this.O = null;
            }
        }
    }

    @Override // defpackage.tg5
    public final Map i() {
        tg5 tg5Var = this.O;
        return tg5Var == null ? Collections.EMPTY_MAP : tg5Var.i();
    }

    public final void j(tg5 tg5Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.F;
            if (i >= arrayList.size()) {
                return;
            }
            tg5Var.o((yp5) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.tg5
    public final Uri m() {
        tg5 tg5Var = this.O;
        if (tg5Var == null) {
            return null;
        }
        return tg5Var.m();
    }

    @Override // defpackage.tg5
    public final void o(yp5 yp5Var) {
        yp5Var.getClass();
        this.G.o(yp5Var);
        this.F.add(yp5Var);
        n(this.H, yp5Var);
        n(this.I, yp5Var);
        n(this.J, yp5Var);
        n(this.K, yp5Var);
        n(this.L, yp5Var);
        n(this.M, yp5Var);
        n(this.N, yp5Var);
    }

    @Override // defpackage.og5
    public final int read(byte[] bArr, int i, int i2) {
        tg5 tg5Var = this.O;
        tg5Var.getClass();
        return tg5Var.read(bArr, i, i2);
    }
}
