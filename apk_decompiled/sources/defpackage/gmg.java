package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class gmg implements Map.Entry, pm9 {
    public final Object E;
    public Object F;
    public final /* synthetic */ hmg G;

    public gmg(hmg hmgVar) {
        this.G = hmgVar;
        Map.Entry entry = hmgVar.H;
        entry.getClass();
        this.E = entry.getKey();
        Map.Entry entry2 = hmgVar.H;
        entry2.getClass();
        this.F = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.E;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.F;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        hmg hmgVar = this.G;
        mdg mdgVar = hmgVar.E;
        if (mdgVar.d().d != hmgVar.G) {
            sz6.c();
            return null;
        }
        Object obj2 = this.F;
        mdgVar.put(this.E, obj);
        this.F = obj;
        return obj2;
    }
}
