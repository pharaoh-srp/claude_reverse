package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class th3 {
    public final int a;
    public final Method b;

    public th3(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th3)) {
            return false;
        }
        th3 th3Var = (th3) obj;
        return this.a == th3Var.a && this.b.getName().equals(th3Var.b.getName());
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}
