package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lk9 implements d16 {
    public final zj9 E;
    public final zj9 F;
    public final bce G;

    public lk9(bce bceVar, ysd ysdVar, kk9 kk9Var, int i) {
        bceVar.getClass();
        ysdVar.getClass();
        kk9Var.getClass();
        zj9 zj9VarD = null;
        if (i == 0) {
            throw null;
        }
        zj9 zj9VarB = zj9.b(yae.a(bceVar.a));
        z81 z81Var = bceVar.b;
        String str = ((pr9) z81Var.d) != pr9.MULTIFILE_CLASS_PART ? null : z81Var.b;
        if (str != null && str.length() > 0) {
            zj9VarD = zj9.d(str);
        }
        this.E = zj9VarB;
        this.F = zj9VarD;
        this.G = bceVar;
        t28 t28Var = el9.m;
        t28Var.getClass();
        Integer num = (Integer) uik.i(ysdVar, t28Var);
        if (num != null) {
            kk9Var.getString(num.intValue());
        }
    }

    public final gh3 a() {
        ww7 ww7Var;
        zj9 zj9Var = this.E;
        String str = zj9Var.a;
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            ww7Var = ww7.c;
            if (ww7Var == null) {
                zj9.a(7);
                throw null;
            }
        } else {
            ww7Var = new ww7(str.substring(0, iLastIndexOf).replace('/', '.'));
        }
        String strE = zj9Var.e();
        strE.getClass();
        return new gh3(ww7Var, sxb.e(bsg.d1('/', strE, strE)));
    }

    public final zj9 b() {
        return this.F;
    }

    public final bce c() {
        return this.G;
    }

    @Override // defpackage.d16
    public final String d() {
        return "Class '" + a().b().b() + '\'';
    }

    public final String toString() {
        return lk9.class.getSimpleName() + ": " + this.E;
    }
}
