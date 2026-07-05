package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class po0 {
    public int a;
    public long b;
    public Object c;
    public int d;

    public po0(kr7 kr7Var, long j, int i, int i2) {
        this.c = kr7Var;
        this.b = j;
        this.a = i;
        this.d = i2;
    }

    public tnk a(wsc wscVar, boolean z, int i, int i2, int i3, int i4) {
        if (!wscVar.b) {
            return null;
        }
        ((kr7) this.c).getClass();
        return null;
    }

    public wsc b(boolean z, int i, long j, t69 t69Var, int i2, int i3, int i4, boolean z2, boolean z3) {
        int i5 = this.a;
        int i6 = this.d;
        long j2 = this.b;
        kr7 kr7Var = (kr7) this.c;
        int i7 = i3 + i4;
        if (t69Var == null) {
            return new wsc(true, true);
        }
        long j3 = t69Var.a;
        kr7Var.getClass();
        if (i2 >= Integer.MAX_VALUE || ((int) (j & 4294967295L)) - ((int) (j3 & 4294967295L)) < 0) {
            return new wsc(true, true);
        }
        if (i != 0 && (i >= Integer.MAX_VALUE || ((int) (j >> 32)) - ((int) (j3 >> 32)) < 0)) {
            return z2 ? new wsc(true, true) : new wsc(true, b(z, 0, t69.a(rl4.h(j2), (((int) (j & 4294967295L)) - i6) - i4), new t69(t69.a(((int) (j3 >> 32)) - i5, (int) (j3 & 4294967295L))), i2 + 1, i7, 0, true, false).b);
        }
        Math.max(i4, (int) (j3 & 4294967295L));
        return new wsc(false, false);
    }

    public po0(eck eckVar) {
        eckVar.getClass();
    }
}
