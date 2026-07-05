package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class da2 extends aa2 implements kv1 {
    public final Object g;

    /* JADX WARN: Illegal instructions before constructor call */
    public da2(Method method, Object obj) {
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        genericParameterTypes.getClass();
        super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : mp0.y0(genericParameterTypes, 1, genericParameterTypes.length)));
        this.g = obj;
    }

    @Override // defpackage.aa2, defpackage.q92
    public final Object call(Object[] objArr) {
        objArr.getClass();
        tvj.b(this, objArr);
        wig wigVar = new wig(2);
        wigVar.a(this.g);
        wigVar.b(objArr);
        ArrayList arrayList = wigVar.a;
        return e(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
