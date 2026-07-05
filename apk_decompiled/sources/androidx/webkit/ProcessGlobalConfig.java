package androidx.webkit;

import com.anthropic.claude.application.ClaudeApplication;
import defpackage.pmf;
import defpackage.sz6;
import defpackage.t7j;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.support_lib_boundary.ProcessGlobalConfigConstants;

/* JADX INFO: loaded from: classes3.dex */
public class ProcessGlobalConfig {
    public int a = -1;
    private static final AtomicReference<HashMap<String, Object>> sProcessGlobalConfig = new AtomicReference<>();
    public static final Object b = new Object();
    public static boolean c = false;

    public static void a(ProcessGlobalConfig processGlobalConfig) {
        synchronized (b) {
            if (c) {
                throw new IllegalStateException("ProcessGlobalConfig#apply was called more than once, which is an illegal operation. The configuration settings provided by ProcessGlobalConfig take effect only once, when WebView is first loaded into the current process. Every process should only ever create a single instance of ProcessGlobalConfig and apply it once, before any calls to android.webkit APIs, such as during early app startup.");
            }
            c = true;
        }
        HashMap<String, Object> map = new HashMap<>();
        try {
            Field declaredField = Class.forName("android.webkit.WebViewFactory").getDeclaredField("sProviderInstance");
            declaredField.setAccessible(true);
            if (declaredField.get(null) != null) {
                sz6.j("WebView has already been loaded in the current process, so any attempt to apply the settings in ProcessGlobalConfig will have no effect. ProcessGlobalConfig#apply needs to be called before any calls to android.webkit APIs, such as during early app startup.");
                return;
            }
        } catch (Exception unused) {
        }
        int i = processGlobalConfig.a;
        if (i != -1) {
            map.put(ProcessGlobalConfigConstants.UI_THREAD_STARTUP_MODE, Integer.valueOf(i));
        }
        AtomicReference<HashMap<String, Object>> atomicReference = sProcessGlobalConfig;
        while (!atomicReference.compareAndSet(null, map)) {
            if (atomicReference.get() != null) {
                pmf.o("Attempting to set ProcessGlobalConfig#sProcessGlobalConfig when it was already set");
                return;
            }
        }
    }

    public final void b(ClaudeApplication claudeApplication) {
        if (t7j.h.a(claudeApplication)) {
            this.a = 3;
        } else {
            pmf.n("This method is not supported by the current version of the framework and the current WebView APK");
        }
    }
}
