package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class sa1 {
    public static final /* synthetic */ wn9[] f;
    public final ArrayList a = new ArrayList(4);
    public final ive b;
    public final ive c;
    public final ive d;
    public final ive e;

    static {
        bwb bwbVar = new bwb(sa1.class, "startAxis", "getStartAxis()Lcom/patrykandpatrick/vico/core/cartesian/axis/Axis;", 0);
        kce kceVar = jce.a;
        f = new wn9[]{kceVar.e(bwbVar), kceVar.e(new bwb(sa1.class, "topAxis", "getTopAxis()Lcom/patrykandpatrick/vico/core/cartesian/axis/Axis;", 0)), kceVar.e(new bwb(sa1.class, "endAxis", "getEndAxis()Lcom/patrykandpatrick/vico/core/cartesian/axis/Axis;", 0)), kceVar.e(new bwb(sa1.class, "bottomAxis", "getBottomAxis()Lcom/patrykandpatrick/vico/core/cartesian/axis/Axis;", 0))};
    }

    public sa1() {
        int i = 9;
        boolean z = false;
        this.b = new ive(i, z);
        this.c = new ive(i, z);
        this.d = new ive(i, z);
        this.e = new ive(i, z);
    }

    public final od1 a() {
        wn9 wn9Var = f[3];
        ive iveVar = this.e;
        iveVar.getClass();
        wn9Var.getClass();
        return (od1) iveVar.F;
    }

    public final od1 b() {
        wn9 wn9Var = f[2];
        ive iveVar = this.d;
        iveVar.getClass();
        wn9Var.getClass();
        return (od1) iveVar.F;
    }

    public final od1 c() {
        wn9 wn9Var = f[0];
        ive iveVar = this.b;
        iveVar.getClass();
        wn9Var.getClass();
        return (od1) iveVar.F;
    }

    public final od1 d() {
        wn9 wn9Var = f[1];
        ive iveVar = this.c;
        iveVar.getClass();
        wn9Var.getClass();
        return (od1) iveVar.F;
    }
}
