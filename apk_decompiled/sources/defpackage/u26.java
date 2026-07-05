package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u26 {
    public static final Map a;

    static {
        Map mapH0 = sta.h0(new cpc("UNKNOWN", 0), new cpc("CHEST_STRAP", 7), new cpc("FITNESS_BAND", 6), new cpc("HEAD_MOUNTED", 5), new cpc("PHONE", 2), new cpc("RING", 4), new cpc("SCALE", 3), new cpc("SMART_DISPLAY", 8), new cpc("WATCH", 1));
        a = mapH0;
        Set<Map.Entry> setEntrySet = mapH0.entrySet();
        int iD0 = tta.d0(x44.y(setEntrySet, 10));
        if (iD0 < 16) {
            iD0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(entry.getValue(), entry.getKey());
        }
    }
}
