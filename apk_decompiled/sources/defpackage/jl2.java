package defpackage;

import java.util.function.BiFunction;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jl2 implements BiFunction {
    public final /* synthetic */ int a;

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return (Integer) yl2.E.invoke(obj, obj2);
            case 1:
                return (Integer) px4.E.invoke(obj, obj2);
            default:
                return (Integer) qx4.E.invoke(obj, obj2);
        }
    }
}
