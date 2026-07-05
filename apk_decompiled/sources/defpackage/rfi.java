package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class rfi extends ufi {
    public final /* synthetic */ Method b;
    public final /* synthetic */ int c;

    public rfi(int i, Method method) {
        this.b = method;
        this.c = i;
    }

    @Override // defpackage.ufi
    public final Object a(Class cls) {
        String strA = nyj.A(cls);
        if (strA == null) {
            return this.b.invoke(null, cls, Integer.valueOf(this.c));
        }
        sz6.h("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        return null;
    }
}
