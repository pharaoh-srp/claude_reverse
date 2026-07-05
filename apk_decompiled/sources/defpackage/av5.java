package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class av5 extends d4i {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final SparseArray D;
    public final SparseBooleanArray E;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public av5(bv5 bv5Var) {
        a(bv5Var);
        this.w = bv5Var.w;
        this.x = bv5Var.x;
        this.y = bv5Var.y;
        this.z = bv5Var.z;
        this.A = bv5Var.A;
        this.B = bv5Var.B;
        this.C = bv5Var.C;
        SparseArray sparseArray = bv5Var.D;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.D = sparseArray2;
        this.E = bv5Var.E.clone();
    }

    public av5() {
        this.D = new SparseArray();
        this.E = new SparseBooleanArray();
        this.w = true;
        this.x = true;
        this.y = true;
        this.z = true;
        this.A = true;
        this.B = true;
        this.C = true;
    }
}
