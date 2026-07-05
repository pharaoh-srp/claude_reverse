package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a41 implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ a41(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return Integer.valueOf(Integer.bitCount(((Integer) obj).intValue()));
            case 1:
                return Collections.unmodifiableList((List) obj);
            case 2:
                c5c c5cVar = (c5c) obj;
                return c5cVar instanceof ikh ? ((ikh) c5cVar).O() : c5cVar.w("br") ? "\n" : "";
            case 3:
                return ((c5c) obj).D();
            case 4:
                return new HashSet();
            case 5:
                return new HashMap();
            case 6:
                return new HashSet();
            case 7:
                wrg wrgVar = (wrg) obj;
                String strK = xrg.k(wrgVar.a);
                wrgVar.a = null;
                return strK;
            case 8:
                return new WeakHashMap();
            default:
                return new HashMap();
        }
    }
}
