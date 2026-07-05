package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jz9 {
    public final z4f a;
    public final fg1 b;
    public final ewb c;

    public jz9(z4f z4fVar, fg1 fg1Var) {
        this.a = z4fVar;
        this.b = fg1Var;
        long[] jArr = u6f.a;
        this.c = new ewb();
    }

    public final pz7 a(Object obj, int i, Object obj2) {
        ewb ewbVar = this.c;
        iz9 iz9Var = (iz9) ewbVar.g(obj);
        int i2 = 26;
        if (iz9Var != null && iz9Var.c == i && x44.r(iz9Var.b, obj2)) {
            ta4 ta4Var = iz9Var.d;
            if (ta4Var != null) {
                return ta4Var;
            }
            ta4 ta4Var2 = new ta4(818252804, true, new ow1(iz9Var.e, i2, iz9Var));
            iz9Var.d = ta4Var2;
            return ta4Var2;
        }
        iz9 iz9Var2 = new iz9(this, i, obj, obj2);
        ewbVar.m(obj, iz9Var2);
        ta4 ta4Var3 = iz9Var2.d;
        if (ta4Var3 != null) {
            return ta4Var3;
        }
        ta4 ta4Var4 = new ta4(818252804, true, new ow1(this, i2, iz9Var2));
        iz9Var2.d = ta4Var4;
        return ta4Var4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        iz9 iz9Var = (iz9) this.c.g(obj);
        if (iz9Var != null) {
            return iz9Var.b;
        }
        kz9 kz9Var = (kz9) this.b.a();
        int iE = kz9Var.e(obj);
        if (iE != -1) {
            return kz9Var.d(iE);
        }
        return null;
    }
}
