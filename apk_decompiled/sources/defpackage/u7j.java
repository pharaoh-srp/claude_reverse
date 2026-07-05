package defpackage;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u7j {
    public static final d8j a;

    static {
        d8j c0lVar;
        try {
            c0lVar = new xzd(20, (WebViewProviderFactoryBoundaryInterface) nv1.b(WebViewProviderFactoryBoundaryInterface.class, skk.c()));
        } catch (ClassNotFoundException unused) {
            c0lVar = new c0l(8);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            xh6.h(e);
            return;
        }
        a = c0lVar;
    }
}
