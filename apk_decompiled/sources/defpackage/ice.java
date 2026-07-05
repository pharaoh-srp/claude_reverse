package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: loaded from: classes3.dex */
public final class ice extends vz8 {
    public ice() {
        super(26);
    }

    @Override // defpackage.vz8
    public final String D(int i, Method method) {
        Parameter parameter = method.getParameters()[i];
        if (!parameter.isNamePresent()) {
            return super.D(i, method);
        }
        return "parameter '" + parameter.getName() + '\'';
    }

    @Override // defpackage.vz8
    public final Object H(Method method, Class cls, Object obj, Object[] objArr) {
        return dwk.g(method, cls, obj, objArr);
    }

    @Override // defpackage.vz8
    public final boolean I(Method method) {
        return method.isDefault();
    }
}
