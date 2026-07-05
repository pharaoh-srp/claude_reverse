package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hf7 extends kf7 {
    @Override // defpackage.kf7
    public final kf7 a(s7d s7dVar) {
        d8a d8aVarE = x44.E();
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            d8aVarE.add(((zc5) list.get(i)).c(s7dVar));
        }
        d8a d8aVarV = x44.v(d8aVarE);
        d8aVarV.getClass();
        return new hf7(d8aVarV);
    }

    public final String toString() {
        return "Edge";
    }
}
