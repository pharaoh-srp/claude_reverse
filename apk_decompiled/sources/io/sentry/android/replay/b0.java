package io.sentry.android.replay;

import android.util.Log;
import defpackage.kw9;
import defpackage.ts9;
import defpackage.zy7;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends ts9 implements zy7 {
    public static final b0 G;
    public static final b0 H;
    public static final b0 I;
    public static final b0 J;
    public static final b0 K;
    public final /* synthetic */ int F;

    static {
        int i = 0;
        G = new b0(i, 0);
        H = new b0(i, 1);
        I = new b0(i, 2);
        J = new b0(i, 3);
        K = new b0(i, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i, int i2) {
        super(i);
        this.F = i2;
    }

    @Override // defpackage.zy7
    public final Object a() throws NoSuchFieldException {
        Method method;
        switch (this.F) {
            case 0:
                kw9 kw9Var = c0.a;
                Class cls = (Class) c0.a.getValue();
                if (cls == null) {
                    return null;
                }
                Field declaredField = cls.getDeclaredField("mViews");
                declaredField.setAccessible(true);
                return declaredField;
            case 1:
                try {
                    return Class.forName("android.view.WindowManagerGlobal");
                } catch (Throwable th) {
                    Log.w("WindowManagerSpy", th);
                    return null;
                }
            case 2:
                kw9 kw9Var2 = c0.a;
                Class cls2 = (Class) c0.a.getValue();
                if (cls2 == null || (method = cls2.getMethod("getInstance", null)) == null) {
                    return null;
                }
                return method.invoke(null, null);
            case 3:
                try {
                    return Class.forName("com.android.internal.policy.DecorView");
                } catch (Throwable unused) {
                    return null;
                }
            default:
                Class cls3 = (Class) i0.a.getValue();
                if (cls3 == null) {
                    return null;
                }
                try {
                    Field declaredField2 = cls3.getDeclaredField("mWindow");
                    declaredField2.setAccessible(true);
                    return declaredField2;
                } catch (NoSuchFieldException unused2) {
                    cls3.toString();
                    return null;
                }
        }
    }
}
