package defpackage;

import java.time.Instant;
import java.time.ZoneOffset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class pcb implements i69 {
    public static final Map e;
    public final Instant a;
    public final ZoneOffset b;
    public final ijb c;
    public final int d;

    static {
        Map mapH0 = sta.h0(new cpc("light", 1), new cpc("medium", 2), new cpc("heavy", 3));
        e = mapH0;
        Set<Map.Entry> setEntrySet = mapH0.entrySet();
        int iD0 = tta.d0(x44.y(setEntrySet, 10));
        if (iD0 < 16) {
            iD0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (String) entry.getKey());
        }
    }

    public pcb(int i, ijb ijbVar, Instant instant, ZoneOffset zoneOffset) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = ijbVar;
        this.d = i;
    }

    @Override // defpackage.i69
    public final Instant a() {
        return this.a;
    }

    @Override // defpackage.i69
    public final ZoneOffset c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcb)) {
            return false;
        }
        pcb pcbVar = (pcb) obj;
        return this.d == pcbVar.d && this.a.equals(pcbVar.a) && x44.r(this.b, pcbVar.b) && this.c.equals(pcbVar.c);
    }

    public final int hashCode() {
        int i = ebh.i(this.a, this.d * 31, 31);
        ZoneOffset zoneOffset = this.b;
        return this.c.hashCode() + ((i + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31);
    }

    @Override // defpackage.y7e
    public final ijb m() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MenstruationFlowRecord(time=");
        sb.append(this.a);
        sb.append(", zoneOffset=");
        sb.append(this.b);
        sb.append(", flow=");
        sb.append(this.d);
        sb.append(", metadata=");
        return ebh.q(sb, this.c, ')');
    }
}
