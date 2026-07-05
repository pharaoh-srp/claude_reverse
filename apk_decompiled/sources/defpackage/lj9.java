package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lj9 {
    public static final ww7 a;
    public static final gh3 b;

    static {
        ww7 ww7Var = new ww7("kotlin.jvm.JvmField");
        a = ww7Var;
        gh3.j(ww7Var);
        gh3.j(new ww7("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        b = gh3.e("kotlin/jvm/internal/RepeatableContainer", false);
    }

    public static final String a(String str) {
        str.getClass();
        return c(str) ? str : "get".concat(mwj.f(str));
    }

    public static final String b(String str) {
        return "set".concat(c(str) ? str.substring(2) : mwj.f(str));
    }

    public static final boolean c(String str) {
        str.getClass();
        if (isg.q0(str, "is", false) && str.length() != 2) {
            char cCharAt = str.charAt(2);
            if (x44.z(97, cCharAt) > 0 || x44.z(cCharAt, ModuleDescriptor.MODULE_VERSION) > 0) {
                return true;
            }
        }
        return false;
    }
}
