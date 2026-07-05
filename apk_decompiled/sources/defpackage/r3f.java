package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes.dex */
public final class r3f {
    public final ClassLoader a;
    public final n78 b;
    public final kbe c;

    public r3f(ClassLoader classLoader, n78 n78Var) {
        this.a = classLoader;
        this.b = n78Var;
        this.c = new kbe(classLoader);
    }

    public static final boolean d(r3f r3fVar) throws NoSuchMethodException, ClassNotFoundException {
        Class<?> clsLoadClass = r3fVar.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        clsLoadClass.getClass();
        Method method = clsLoadClass.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
        Method method2 = clsLoadClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
        method.getClass();
        if (!Modifier.isPublic(method.getModifiers())) {
            return false;
        }
        method2.getClass();
        return Modifier.isPublic(method2.getModifiers());
    }

    public final WindowLayoutComponent a() {
        int iA;
        kbe kbeVar = this.c;
        kbeVar.getClass();
        boolean zC = false;
        zC = false;
        zC = false;
        zC = false;
        zC = false;
        zC = false;
        zC = false;
        zC = false;
        zC = false;
        try {
            kbeVar.a.loadClass("androidx.window.extensions.WindowExtensionsProvider").getClass();
            if (zni.e0(new p3f(0, kbeVar), "WindowExtensionsProvider#getWindowExtensions is not valid") && zni.e0(new q3f(this, zC ? 1 : 0), "WindowExtensions#getWindowLayoutComponent is not valid") && zni.e0(new q3f(this, 1), "FoldingFeature class is not valid") && (iA = hd7.a()) >= 1) {
                if (iA == 1) {
                    zC = b();
                } else if (iA < 5) {
                    zC = c();
                } else if (c() && zni.e0(new q3f(this, 3), "DisplayFoldFeature is not valid") && zni.e0(new q3f(this, 2), "SupportedWindowFeatures is not valid") && zni.e0(new q3f(this, 4), "WindowLayoutComponent#getSupportedWindowFeatures is not valid")) {
                    zC = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!zC) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        return zni.e0(new q3f(this, 5), "WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid");
    }

    public final boolean c() {
        if (!b()) {
            return false;
        }
        StringBuilder sb = new StringBuilder("WindowLayoutComponent#addWindowLayoutInfoListener(");
        sb.append(Context.class.getName());
        sb.append(", androidx.window.extensions.core.util.function.Consumer) is not valid");
        return zni.e0(new q3f(this, 6), sb.toString());
    }
}
