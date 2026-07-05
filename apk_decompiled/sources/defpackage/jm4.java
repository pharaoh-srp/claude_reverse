package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class jm4 {
    public final /* synthetic */ Method a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public jm4(Method method, Object obj, Object obj2) {
        this.a = method;
        this.b = obj;
        this.c = obj2;
    }

    public final void a() throws IllegalAccessException, InvocationTargetException {
        this.a.invoke(this.b, this.c);
    }
}
