package defpackage;

import android.content.ComponentName;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;
import com.anthropic.claude.application.ClaudeApplication;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class slg {
    public static final HashSet d = new HashSet();
    public final String a;
    public final String b;
    public final /* synthetic */ int c;

    public slg(String str, String str2, int i) {
        this.c = i;
        this.a = str;
        this.b = str2;
        d.add(this);
    }

    public final boolean a(ClaudeApplication claudeApplication) {
        boolean z;
        String str;
        switch (this.c) {
            default:
                if (Build.VERSION.SDK_INT >= 28) {
                    z = true;
                    break;
                }
            case 0:
                z = false;
                break;
        }
        if (z) {
            return true;
        }
        Uri uri = j7j.a;
        PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
        Bundle bundle = null;
        if (currentWebViewPackage == null) {
            try {
                str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            currentWebViewPackage = str == null ? null : claudeApplication.getPackageManager().getPackageInfo(str, 0);
        }
        if (currentWebViewPackage != null) {
            ComponentName componentName = new ComponentName(currentWebViewPackage.packageName, "org.chromium.android_webview.services.StartupFeatureMetadataHolder");
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    bundle = claudeApplication.getPackageManager().getServiceInfo(componentName, PackageManager.ComponentInfoFlags.of(640L)).metaData;
                } else {
                    bundle = claudeApplication.getPackageManager().getServiceInfo(componentName, 640).metaData;
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        return bundle == null ? false : bundle.containsKey(this.b);
    }
}
