package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ma9 implements q92 {
    public final Method a;
    public final List b;
    public final Class c;

    public ma9(Method method, List list) {
        this.a = method;
        this.b = list;
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        this.c = returnType;
    }

    @Override // defpackage.q92
    public final List a() {
        return this.b;
    }

    @Override // defpackage.q92
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // defpackage.q92
    public final Type getReturnType() {
        return this.c;
    }
}
