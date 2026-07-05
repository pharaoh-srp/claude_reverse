package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class sfi extends ufi {
    public final /* synthetic */ Method b;

    public sfi(Method method) {
        this.b = method;
    }

    @Override // defpackage.ufi
    public final Object a(Class cls) {
        String strA = nyj.A(cls);
        if (strA == null) {
            return this.b.invoke(null, cls, Object.class);
        }
        sz6.h("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        return null;
    }
}
