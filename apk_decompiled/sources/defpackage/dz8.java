package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class dz8 extends y2 implements Serializable {
    public final Object E;
    public final Object F;

    public dz8(Object obj, Object obj2) {
        this.E = obj;
        this.F = obj2;
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
        throw new UnsupportedOperationException();
    }
}
