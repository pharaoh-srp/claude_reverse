package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class im4 implements InvocationHandler {
    public final pl9 a;
    public final bd7 b;

    public im4(pl9 pl9Var, bd7 bd7Var) {
        pl9Var.getClass();
        this.a = pl9Var;
        this.b = bd7Var;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        obj.getClass();
        method.getClass();
        boolean zR = x44.r(method.getName(), "accept");
        bd7 bd7Var = this.b;
        if (zR && objArr != null && objArr.length == 1) {
            Object obj2 = objArr[0];
            uj5.f(this.a, obj2);
            bd7Var.invoke(obj2);
            return iei.a;
        }
        if (x44.r(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(obj == objArr[0]);
        }
        if (x44.r(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(bd7Var.hashCode());
        }
        if (x44.r(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
            return bd7Var.toString();
        }
        throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
    }
}
