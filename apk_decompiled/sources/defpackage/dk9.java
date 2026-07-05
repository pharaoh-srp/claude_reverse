package defpackage;

import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes3.dex */
public final class dk9 extends wb5 {
    public final Constructor G;

    public dk9(Constructor constructor) {
        constructor.getClass();
        this.G = constructor;
    }

    @Override // defpackage.wb5
    public final String f() {
        Class<?>[] parameterTypes = this.G.getParameterTypes();
        parameterTypes.getClass();
        return mp0.M0(parameterTypes, "", "<init>(", ")V", f06.U, 24);
    }
}
