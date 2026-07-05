package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gf7 extends kf7 {
    public final boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf7(List list, boolean z) {
        super(list);
        list.getClass();
        this.b = z;
    }

    @Override // defpackage.kf7
    public final kf7 a(s7d s7dVar) {
        d8a d8aVarE = x44.E();
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            d8aVarE.add(((zc5) list.get(i)).c(s7dVar));
        }
        return new gf7(x44.v(d8aVarE), this.b);
    }

    public final String toString() {
        return "Corner: cubics=" + w44.S0(this.a, ", ", null, null, new hz6(7), 30) + " convex=" + this.b;
    }
}
