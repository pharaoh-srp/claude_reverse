package defpackage;

import androidx.health.platform.client.proto.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class xw7 {
    public static final sxb e = sxb.g("<root>");
    public static final Pattern f = Pattern.compile("\\.");
    public static final wl0 g = new wl0(12);
    public final String a;
    public transient ww7 b;
    public transient xw7 c;
    public transient sxb d;

    public xw7(String str, xw7 xw7Var, sxb sxbVar) {
        if (str == null) {
            a(3);
            throw null;
        }
        this.a = str;
        this.c = xw7Var;
        this.d = sxbVar;
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case g.MAX_FIELD_NUMBER /* 17 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case g.MAX_FIELD_NUMBER /* 17 */:
                i2 = 2;
                break;
            case 9:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        if (i != 1) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case g.MAX_FIELD_NUMBER /* 17 */:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                objArr[1] = "toString";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case g.MAX_FIELD_NUMBER /* 17 */:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case g.MAX_FIELD_NUMBER /* 17 */:
                throw new IllegalStateException(str2);
            case 9:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public final xw7 b(sxb sxbVar) {
        String strB;
        if (sxbVar == null) {
            a(9);
            throw null;
        }
        String str = this.a;
        if (str.isEmpty()) {
            strB = sxbVar.b();
        } else {
            strB = str + "." + sxbVar.b();
        }
        return new xw7(strB, this, sxbVar);
    }

    public final void c() {
        String str = this.a;
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            this.d = sxb.d(str.substring(iLastIndexOf + 1));
            this.c = new xw7(str.substring(0, iLastIndexOf));
        } else {
            this.d = sxb.d(str);
            this.c = ww7.c.i();
        }
    }

    public final boolean d() {
        if (this.b != null) {
            return true;
        }
        String str = this.a;
        if (str != null) {
            return str.indexOf(60) < 0;
        }
        a(4);
        throw null;
    }

    public final List e() {
        List list;
        String str = this.a;
        if (str.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            String[] strArrSplit = f.split(str);
            strArrSplit.getClass();
            g.getClass();
            ArrayList arrayList = new ArrayList(strArrSplit.length);
            for (String str2 : strArrSplit) {
                arrayList.add(sxb.d(str2));
            }
            list = arrayList;
        }
        if (list != null) {
            return list;
        }
        a(14);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xw7) && this.a.equals(((xw7) obj).a);
    }

    public final sxb f() {
        sxb sxbVar = this.d;
        if (sxbVar != null) {
            if (sxbVar != null) {
                return sxbVar;
            }
            a(10);
            throw null;
        }
        if (this.a.isEmpty()) {
            sz6.j("root");
            return null;
        }
        c();
        sxb sxbVar2 = this.d;
        if (sxbVar2 != null) {
            return sxbVar2;
        }
        a(11);
        throw null;
    }

    public final ww7 g() {
        ww7 ww7Var = this.b;
        if (ww7Var != null) {
            return ww7Var;
        }
        ww7 ww7Var2 = new ww7(this);
        this.b = ww7Var2;
        return ww7Var2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String strB = this.a;
        if (strB.isEmpty()) {
            strB = e.b();
        }
        if (strB != null) {
            return strB;
        }
        a(17);
        throw null;
    }

    public xw7(String str) {
        this.a = str;
    }

    public xw7(String str, ww7 ww7Var) {
        if (str != null) {
            this.a = str;
            this.b = ww7Var;
        } else {
            a(0);
            throw null;
        }
    }
}
