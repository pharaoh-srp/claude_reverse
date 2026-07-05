package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class eh3 extends ikk {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Class d;

    public eh3(Method method, Object obj, Class cls) {
        this.b = method;
        this.c = obj;
        this.d = cls;
    }

    @Override // defpackage.ikk
    public final Object m() {
        return this.b.invoke(this.c, this.d);
    }

    public final String toString() {
        return this.d.getName();
    }
}
