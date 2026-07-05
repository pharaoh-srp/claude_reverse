package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class we7 extends h3f {
    public final HashMap I = new HashMap();

    @Override // defpackage.h3f
    public final e3f a(Object obj) {
        return (e3f) this.I.get(obj);
    }

    @Override // defpackage.h3f
    public final Object b(Object obj) {
        Object objB = super.b(obj);
        this.I.remove(obj);
        return objB;
    }
}
