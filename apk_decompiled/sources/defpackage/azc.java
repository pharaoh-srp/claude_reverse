package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class azc extends c4 implements sz8 {
    public final jyc E;

    public azc(jyc jycVar) {
        this.E = jycVar;
    }

    @Override // defpackage.w0, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.E.containsKey(obj);
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
            z6iVarArr[i] = new c7i();
        }
        return new bzc(x6iVar, z6iVarArr);
    }
}
