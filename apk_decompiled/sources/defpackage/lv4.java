package defpackage;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
public final class lv4 {
    public final boolean a;
    public final bz7 b;
    public final l45 c;
    public zy7 d;
    public zy7 e;
    public zy7 f;
    public bz7 g;
    public String h;
    public int i;
    public fkg j;
    public fkg k;
    public int l;
    public final WebView m;

    public lv4(Context context, vs8 vs8Var, boolean z, bz7 bz7Var, l45 l45Var) {
        bz7Var.getClass();
        l45Var.getClass();
        this.a = z;
        this.b = bz7Var;
        this.c = l45Var;
        this.i = -1;
        WebView webView = new WebView(context);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setMixedContentMode(1);
        webView.setWebViewClient(new jv4(vs8Var, new nl1(context, 2), new ev4(this, 3), new ev4(this, 4)));
        this.m = webView;
    }

    public final void a(int i, String str) {
        if (str != null) {
            if (x44.r(this.h, str) && this.i == i) {
                return;
            }
            this.h = str;
            this.i = i;
            fkg fkgVar = this.j;
            tp4 tp4Var = null;
            if (fkgVar != null) {
                fkgVar.d(null);
            }
            fkg fkgVar2 = this.k;
            if (fkgVar2 != null) {
                fkgVar2.d(null);
            }
            this.j = gb9.D(this.c, null, null, new o41(this, str, i, tp4Var, 3), 3);
        }
    }

    public final void b() {
        String str = this.h;
        if (str == null) {
            return;
        }
        fkg fkgVar = this.k;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        this.l = 0;
        bz7 bz7Var = this.g;
        if (bz7Var != null) {
            bz7Var.invoke(Boolean.FALSE);
        }
        this.h = null;
        a(this.i, str);
    }
}
