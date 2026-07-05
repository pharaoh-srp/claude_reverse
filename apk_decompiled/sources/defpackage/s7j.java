package defpackage;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final class s7j extends bf0 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s7j(String str, String str2, int i) {
        super(str, str2, 2);
        this.e = i;
    }

    @Override // defpackage.cf0
    public final boolean b() {
        switch (this.e) {
            case 0:
                if (!super.b()) {
                    return false;
                }
                Uri uri = j7j.a;
                PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
                return currentWebViewPackage != null && rwk.m(currentWebViewPackage) >= 636700000;
            case 1:
                if (!super.b() || !q7j.a("MULTI_PROCESS")) {
                    return false;
                }
                Uri uri2 = j7j.a;
                if (t7j.b.b()) {
                    return skk.f().getStatics().isMultiProcessEnabled();
                }
                pmf.n("This method is not supported by the current version of the framework and the current WebView APK");
                return false;
            default:
                if (q7j.a("MULTI_PROFILE")) {
                    return super.b();
                }
                return false;
        }
    }
}
