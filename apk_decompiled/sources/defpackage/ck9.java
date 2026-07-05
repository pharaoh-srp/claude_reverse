package defpackage;

import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ck9 extends wb5 {
    public final List G;

    public ck9(Class cls) {
        cls.getClass();
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        this.G = mp0.U0(declaredMethods, new g67(10));
    }

    @Override // defpackage.wb5
    public final String f() {
        return w44.S0(this.G, "", "<init>(", ")V", f06.T, 24);
    }
}
