package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ww7 {
    public static final ww7 c = new ww7("");
    public final xw7 a;
    public transient ww7 b;

    public ww7(String str) {
        if (str != null) {
            this.a = new xw7(str, this);
        } else {
            a(1);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i2 = 2;
                break;
            case 8:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = "name";
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(str2);
            case 8:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static ww7 j(sxb sxbVar) {
        if (sxbVar != null) {
            return new ww7(new xw7(sxbVar.b(), c.i(), sxbVar));
        }
        a(13);
        throw null;
    }

    public final String b() {
        String str = this.a.a;
        if (str != null) {
            return str;
        }
        xw7.a(4);
        throw null;
    }

    public final ww7 c(sxb sxbVar) {
        if (sxbVar != null) {
            return new ww7(this.a.b(sxbVar), this);
        }
        a(8);
        throw null;
    }

    public final boolean d() {
        return this.a.a.isEmpty();
    }

    public final ww7 e() {
        ww7 ww7Var = this.b;
        if (ww7Var != null) {
            return ww7Var;
        }
        if (d()) {
            sz6.j("root");
            return null;
        }
        xw7 xw7Var = this.a;
        xw7 xw7Var2 = xw7Var.c;
        if (xw7Var2 == null) {
            if (xw7Var.a.isEmpty()) {
                sz6.j("root");
                return null;
            }
            xw7Var.c();
            xw7Var2 = xw7Var.c;
            if (xw7Var2 == null) {
                xw7.a(8);
                throw null;
            }
        }
        ww7 ww7Var2 = new ww7(xw7Var2);
        this.b = ww7Var2;
        return ww7Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ww7) && this.a.equals(((ww7) obj).a);
    }

    public final sxb f() {
        sxb sxbVarF = this.a.f();
        if (sxbVarF != null) {
            return sxbVarF;
        }
        a(9);
        throw null;
    }

    public final sxb g() {
        xw7 xw7Var = this.a;
        if (xw7Var.a.isEmpty()) {
            sxb sxbVar = xw7.e;
            if (sxbVar != null) {
                return sxbVar;
            }
            xw7.a(12);
            throw null;
        }
        sxb sxbVarF = xw7Var.f();
        if (sxbVarF != null) {
            return sxbVarF;
        }
        xw7.a(13);
        throw null;
    }

    public final boolean h(sxb sxbVar) {
        if (sxbVar == null) {
            a(12);
            throw null;
        }
        String str = this.a.a;
        if (str.isEmpty()) {
            return false;
        }
        int iIndexOf = str.indexOf(46);
        String strB = sxbVar.b();
        if (iIndexOf == -1) {
            iIndexOf = Math.max(str.length(), strB.length());
        }
        return str.regionMatches(0, strB, 0, iIndexOf);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final xw7 i() {
        xw7 xw7Var = this.a;
        if (xw7Var != null) {
            return xw7Var;
        }
        a(5);
        throw null;
    }

    public final String toString() {
        return this.a.toString();
    }

    public ww7(xw7 xw7Var) {
        this.a = xw7Var;
    }

    public ww7(xw7 xw7Var, ww7 ww7Var) {
        this.a = xw7Var;
        this.b = ww7Var;
    }
}
