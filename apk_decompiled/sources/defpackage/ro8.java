package defpackage;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ro8 implements ov1 {
    public final pz7 a;
    public final e59 b;
    public final h80 c;
    public final ArrayList d;
    public final ArrayList e;
    public final RectF f;

    public ro8(pz7 pz7Var, e59 e59Var) {
        e59Var.getClass();
        this.a = pz7Var;
        this.b = e59Var;
        h80 h80Var = new h80();
        h80Var.E = pz7Var;
        ArrayList arrayList = new ArrayList();
        h80Var.F = arrayList;
        h80Var.G = arrayList;
        h80Var.H = new x2a(new ks0(1, arrayList, List.class, "add", "add(Ljava/lang/Object;)Z", 8, 2));
        this.c = h80Var;
        this.d = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        arrayList3.addAll(arrayList2);
        this.e = arrayList3;
        this.f = new RectF();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro8)) {
            return false;
        }
        ro8 ro8Var = (ro8) obj;
        return this.a.equals(ro8Var.a) && x44.r(this.b, ro8Var.b);
    }

    @Override // defpackage.ov1
    public final RectF getBounds() {
        return this.f;
    }

    public final int hashCode() {
        return this.b.hashCode() + vb7.b(16.0f, vb7.b(8.0f, vb7.b(8.0f, vb7.b(8.0f, this.a.hashCode() * 31, 31), 31), 31), 31);
    }
}
