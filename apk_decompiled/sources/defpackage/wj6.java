package defpackage;

import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wj6 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wj6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((Class) obj2).isInstance((c5c) obj);
            case 1:
                return ((String) obj2).equals((String) obj);
            default:
                return ((Boolean) ((sm5) obj2).invoke(obj)).booleanValue();
        }
    }
}
