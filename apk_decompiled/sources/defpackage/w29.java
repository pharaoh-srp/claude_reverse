package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w29 implements q92 {
    public final q92 a;
    public final boolean b;
    public final xv8 c;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w29(defpackage.e92 r9, defpackage.q92 r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w29.<init>(e92, q92, boolean):void");
    }

    @Override // defpackage.q92
    public final List a() {
        return this.a.a();
    }

    @Override // defpackage.q92
    public final Member b() {
        return this.a.b();
    }

    @Override // defpackage.q92
    public final Object call(Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        objArr.getClass();
        xv8 xv8Var = this.c;
        b79 b79Var = (b79) xv8Var.F;
        Method[] methodArr = (Method[]) xv8Var.G;
        Method method = (Method) xv8Var.H;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        int i = b79Var.E;
        int i2 = b79Var.F;
        if (i <= i2) {
            while (true) {
                Method method2 = methodArr[i];
                Object objE = objArr[i];
                if (method2 != null) {
                    if (objE != null) {
                        objE = method2.invoke(objE, null);
                    } else {
                        Class<?> returnType = method2.getReturnType();
                        returnType.getClass();
                        objE = vpi.e(returnType);
                    }
                }
                objArrCopyOf[i] = objE;
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        Object objCall = this.a.call(objArrCopyOf);
        return (method == null || (objInvoke = method.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    @Override // defpackage.q92
    public final Type getReturnType() {
        return this.a.getReturnType();
    }
}
