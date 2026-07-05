package defpackage;

import java.util.function.BinaryOperator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vrg implements BinaryOperator {
    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        wrg wrgVar = (wrg) obj;
        wrg wrgVar2 = (wrg) obj2;
        String strK = xrg.k(wrgVar2.a);
        wrgVar2.a = null;
        pqi.p(wrgVar.a);
        wrgVar.a.append((Object) strK);
        return wrgVar;
    }
}
