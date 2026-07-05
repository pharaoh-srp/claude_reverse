package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class o0g implements co4 {
    public final String a;
    public final List b;
    public final boolean c;

    public o0g(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // defpackage.co4
    public final ym4 a(pna pnaVar, bna bnaVar, le1 le1Var) {
        return new sn4(pnaVar, le1Var, this, bnaVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
