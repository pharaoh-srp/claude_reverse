package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gv7 implements yt7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gv7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yt7
    public final xt7 a(float f) {
        int i = this.a;
        Object next = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (cu7) obj;
            case 1:
                Map map = (Map) obj;
                xt7 xt7Var = (xt7) map.get(Float.valueOf(f));
                if (xt7Var != null) {
                    return xt7Var;
                }
                Iterator it = map.entrySet().iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        float fAbs = Math.abs(((Number) ((Map.Entry) next).getKey()).floatValue() - f);
                        do {
                            Object next2 = it.next();
                            float fAbs2 = Math.abs(((Number) ((Map.Entry) next2).getKey()).floatValue() - f);
                            if (Float.compare(fAbs, fAbs2) > 0) {
                                next = next2;
                                fAbs = fAbs2;
                            }
                        } while (it.hasNext());
                    }
                }
                next.getClass();
                return (xt7) ((Map.Entry) next).getValue();
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                xt7 xt7Var2 = (xt7) linkedHashMap.get(Float.valueOf(f));
                if (xt7Var2 != null) {
                    return xt7Var2;
                }
                Iterator it2 = linkedHashMap.entrySet().iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        float fAbs3 = Math.abs(((Number) ((Map.Entry) next).getKey()).floatValue() - f);
                        do {
                            Object next3 = it2.next();
                            float fAbs4 = Math.abs(((Number) ((Map.Entry) next3).getKey()).floatValue() - f);
                            if (Float.compare(fAbs3, fAbs4) > 0) {
                                next = next3;
                                fAbs3 = fAbs4;
                            }
                        } while (it2.hasNext());
                    }
                }
                next.getClass();
                return (xt7) ((Map.Entry) next).getValue();
        }
    }
}
