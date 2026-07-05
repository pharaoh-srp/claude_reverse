package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class qfi extends ufi {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;

    public qfi(Method method, Object obj) {
        this.b = method;
        this.c = obj;
    }

    @Override // defpackage.ufi
    public final Object a(Class cls) {
        String strA = nyj.A(cls);
        if (strA == null) {
            return this.b.invoke(this.c, cls);
        }
        sz6.h("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        return null;
    }
}
