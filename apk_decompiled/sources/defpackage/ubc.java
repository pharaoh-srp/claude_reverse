package defpackage;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class ubc extends m3f {
    public final /* synthetic */ Set d;
    public final /* synthetic */ nwb e;
    public final /* synthetic */ hdc f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Long h;
    public final /* synthetic */ nwb i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ubc(o3f o3fVar, nwb nwbVar, nwb nwbVar2, Set set, nwb nwbVar3, hdc hdcVar, String str, Long l, nwb nwbVar4) {
        super(o3fVar);
        this.d = set;
        this.e = nwbVar3;
        this.f = hdcVar;
        this.g = str;
        this.h = l;
        this.i = nwbVar4;
        this.b = new t22(nwbVar, nwbVar2, 2);
    }

    @Override // defpackage.m3f
    public final WebResourceResponse a(Uri uri) {
        if (!x44.r(uri.toString(), "https://officeproxy.local/file")) {
            return null;
        }
        return ulk.i(this.f, this.g, "application/octet-stream", this.h);
    }

    @Override // defpackage.m3f
    public final boolean b(Uri uri) {
        String string = uri.toString();
        string.getClass();
        return this.d.contains(string) || isg.q0(string, rtk.d("text/html"), false) || ((Boolean) ((bz7) this.e.getValue()).invoke(uri)).booleanValue();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.i.setValue(Boolean.TRUE);
    }
}
