package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class ba2 extends aa2 implements kv1 {
    public final Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba2(Method method, Object obj) {
        super(method, false, 4);
        method.getClass();
        this.g = obj;
    }

    @Override // defpackage.aa2, defpackage.q92
    public final Object call(Object[] objArr) {
        objArr.getClass();
        tvj.b(this, objArr);
        return e(this.g, objArr);
    }
}
