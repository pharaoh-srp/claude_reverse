package defpackage;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes.dex */
public final class rh3 extends ClassValue {
    @Override // java.lang.ClassValue
    public final Object computeValue(Class cls) {
        cls.getClass();
        lwb lwbVar = new lwb();
        lwbVar.a = new SoftReference(null);
        return lwbVar;
    }
}
