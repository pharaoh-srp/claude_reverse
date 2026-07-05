package defpackage;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.webkit.WebView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class r7j extends cf0 {
    public final Pattern d;

    public r7j() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.d = Pattern.compile("\\A\\d+");
    }

    @Override // defpackage.cf0
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // defpackage.cf0
    public final boolean b() {
        boolean zB = super.b();
        if (!zB || Build.VERSION.SDK_INT >= 29) {
            return zB;
        }
        Uri uri = j7j.a;
        PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
        if (currentWebViewPackage == null) {
            return false;
        }
        Matcher matcher = this.d.matcher(currentWebViewPackage.versionName);
        return matcher.find() && Integer.parseInt(currentWebViewPackage.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}
