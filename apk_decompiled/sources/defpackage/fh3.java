package defpackage;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class fh3 extends ikk {
    public final /* synthetic */ Method b;
    public final /* synthetic */ Class c;
    public final /* synthetic */ int d;

    public fh3(Method method, Class cls, int i) {
        this.b = method;
        this.c = cls;
        this.d = i;
    }

    @Override // defpackage.ikk
    public final Object m() {
        return this.b.invoke(null, this.c, Integer.valueOf(this.d));
    }

    public final String toString() {
        return this.c.getName();
    }
}
