package defpackage;

import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ka9 extends ma9 implements kv1 {
    public final Object d;

    public ka9(Method method, Object obj) {
        super(method, lm6.E);
        this.d = obj;
    }

    @Override // defpackage.q92
    public final Object call(Object[] objArr) {
        objArr.getClass();
        tvj.b(this, objArr);
        return this.a.invoke(this.d, Arrays.copyOf(objArr, objArr.length));
    }
}
