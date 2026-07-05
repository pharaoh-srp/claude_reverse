package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class hce extends vz8 {
    @Override // defpackage.vz8
    public final Object H(Method method, Class cls, Object obj, Object[] objArr) {
        return dwk.g(method, cls, obj, objArr);
    }

    @Override // defpackage.vz8
    public final boolean I(Method method) {
        return method.isDefault();
    }
}
