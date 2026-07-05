package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gh3 {
    public final ww7 a;
    public final ww7 b;
    public final boolean c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gh3(ww7 ww7Var, sxb sxbVar) {
        this(ww7Var, ww7.j(sxbVar), false);
        if (ww7Var == null) {
            a(3);
            throw null;
        }
        if (sxbVar != null) {
        } else {
            a(4);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r10) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gh3.a(int):void");
    }

    public static gh3 e(String str, boolean z) {
        String str2;
        if (str == null) {
            a(12);
            throw null;
        }
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf == -1) {
            str2 = "";
        } else {
            String strReplace = str.substring(0, iLastIndexOf).replace('/', '.');
            str = str.substring(iLastIndexOf + 1);
            str2 = strReplace;
        }
        return new gh3(new ww7(str2), new ww7(str), z);
    }

    public static gh3 j(ww7 ww7Var) {
        if (ww7Var != null) {
            return new gh3(ww7Var.e(), ww7Var.f());
        }
        a(0);
        throw null;
    }

    public final ww7 b() {
        ww7 ww7Var = this.a;
        boolean zD = ww7Var.d();
        ww7 ww7Var2 = this.b;
        if (zD) {
            if (ww7Var2 != null) {
                return ww7Var2;
            }
            a(9);
            throw null;
        }
        return new ww7(ww7Var.b() + "." + ww7Var2.b());
    }

    public final String c() {
        ww7 ww7Var = this.a;
        boolean zD = ww7Var.d();
        ww7 ww7Var2 = this.b;
        if (zD) {
            return ww7Var2.b();
        }
        return ww7Var.b().replace('.', '/') + "/" + ww7Var2.b();
    }

    public final gh3 d(sxb sxbVar) {
        if (sxbVar != null) {
            return new gh3(g(), this.b.c(sxbVar), this.c);
        }
        a(8);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gh3.class == obj.getClass()) {
            gh3 gh3Var = (gh3) obj;
            if (this.a.equals(gh3Var.a) && this.b.equals(gh3Var.b) && this.c == gh3Var.c) {
                return true;
            }
        }
        return false;
    }

    public final gh3 f() {
        ww7 ww7VarE = this.b.e();
        if (ww7VarE.d()) {
            return null;
        }
        return new gh3(g(), ww7VarE, this.c);
    }

    public final ww7 g() {
        ww7 ww7Var = this.a;
        if (ww7Var != null) {
            return ww7Var;
        }
        a(5);
        throw null;
    }

    public final ww7 h() {
        ww7 ww7Var = this.b;
        if (ww7Var != null) {
            return ww7Var;
        }
        a(6);
        throw null;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.c).hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final sxb i() {
        sxb sxbVarF = this.b.f();
        if (sxbVarF != null) {
            return sxbVarF;
        }
        a(7);
        throw null;
    }

    public final String toString() {
        boolean zD = this.a.d();
        String strC = c();
        return zD ? "/".concat(strC) : strC;
    }

    public gh3(ww7 ww7Var, ww7 ww7Var2, boolean z) {
        if (ww7Var != null) {
            this.a = ww7Var;
            this.b = ww7Var2;
            this.c = z;
            return;
        }
        a(1);
        throw null;
    }
}
