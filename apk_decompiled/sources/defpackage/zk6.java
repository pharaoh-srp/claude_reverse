package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zk6 implements qk6 {
    public int a;
    public final ArrayList b;

    public zk6(int i, int i2) {
        this.a = (i2 & 1) != 0 ? Integer.MAX_VALUE : i;
        this.b = new ArrayList();
    }

    public final String d() {
        return csg.I(w44.S0(this.b, ",\n", null, null, null, 62), "  ");
    }
}
