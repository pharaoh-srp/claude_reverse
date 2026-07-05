package defpackage;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class aoa {
    public final LinkedHashMap a;

    public aoa(int i) {
        switch (i) {
            case 1:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    public void a(ekb ekbVar) {
        ekbVar.getClass();
        int i = ekbVar.a;
        int i2 = ekbVar.b;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.a;
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(i2))) {
            Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + ekbVar);
        }
        treeMap2.put(Integer.valueOf(i2), ekbVar);
    }
}
