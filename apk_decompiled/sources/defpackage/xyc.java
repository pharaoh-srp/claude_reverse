package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xyc extends c4 implements sz8 {
    public final jyc E;

    public xyc(jyc jycVar) {
        this.E = jycVar;
    }

    @Override // defpackage.w0, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        jyc jycVar = this.E;
        Object obj2 = jycVar.get(key);
        return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && jycVar.containsKey(entry.getKey());
    }

    @Override // defpackage.w0
    public final int getSize() {
        return this.E.F;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        x6i x6iVar = this.E.E;
        z6i[] z6iVarArr = new z6i[8];
        for (int i = 0; i < 8; i++) {
            z6iVarArr[i] = new b7i(0);
        }
        return new zyc(x6iVar, z6iVarArr);
    }
}
