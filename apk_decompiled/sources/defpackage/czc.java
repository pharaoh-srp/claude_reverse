package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class czc extends w0 {
    public final iyc E;

    public czc(iyc iycVar) {
        this.E = iycVar;
    }

    @Override // defpackage.w0, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.E.containsValue(obj);
    }

    @Override // defpackage.w0
    public final int getSize() {
        return this.E.F;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        w6i w6iVar = this.E.E;
        w6iVar.getClass();
        y6i[] y6iVarArr = new y6i[8];
        for (int i = 0; i < 8; i++) {
            y6iVarArr[i] = new a7i(2);
        }
        return new yyc(w6iVar, y6iVarArr);
    }
}
