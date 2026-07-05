package defpackage;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes.dex */
public final class ece extends gce implements zy7 {
    public final zy7 F;
    public volatile SoftReference G;

    public ece(Object obj, zy7 zy7Var) {
        if (zy7Var == null) {
            sz6.p("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
            throw null;
        }
        this.G = null;
        this.F = zy7Var;
        if (obj != null) {
            this.G = new SoftReference(obj);
        }
    }

    @Override // defpackage.zy7
    public final Object a() {
        Object obj;
        Object obj2 = gce.E;
        SoftReference softReference = this.G;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object objA = this.F.a();
        if (objA != null) {
            obj2 = objA;
        }
        this.G = new SoftReference(obj2);
        return objA;
    }
}
