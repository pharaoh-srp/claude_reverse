package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sxb implements Comparable {
    public final String E;
    public final boolean F;

    public sxb(String str, boolean z) {
        if (str == null) {
            a(0);
            throw null;
        }
        this.E = str;
        this.F = z;
    }

    public static /* synthetic */ void a(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i == 2) {
            objArr[1] = "getIdentifier";
        } else if (i == 3 || i == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "special";
                break;
            case 8:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static sxb d(String str) {
        if (str != null) {
            return str.startsWith("<") ? g(str) : e(str);
        }
        a(8);
        throw null;
    }

    public static sxb e(String str) {
        if (str != null) {
            return new sxb(str, false);
        }
        a(5);
        throw null;
    }

    public static boolean f(String str) {
        if (str == null) {
            a(6);
            throw null;
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static sxb g(String str) {
        if (str == null) {
            a(7);
            throw null;
        }
        if (str.startsWith("<")) {
            return new sxb(str, true);
        }
        sz6.p("special name must start with '<': ".concat(str));
        return null;
    }

    public final String b() {
        String str = this.E;
        if (str != null) {
            return str;
        }
        a(1);
        throw null;
    }

    public final String c() {
        if (this.F) {
            xh6.m("not identifier: ", this);
            return null;
        }
        String strB = b();
        if (strB != null) {
            return strB;
        }
        a(2);
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.E.compareTo(((sxb) obj).E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxb)) {
            return false;
        }
        sxb sxbVar = (sxb) obj;
        return this.F == sxbVar.F && this.E.equals(sxbVar.E);
    }

    public final int hashCode() {
        return (this.E.hashCode() * 31) + (this.F ? 1 : 0);
    }

    public final String toString() {
        return this.E;
    }
}
