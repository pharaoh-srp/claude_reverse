package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class vs8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final List g;
    public final String h;
    public final String i;

    public vs8(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = str5;
        this.i = str6;
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(bsg.F0(str, ':', length, 4) + 1, bsg.F0(str, '@', 0, 6));
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.i;
        int iF0 = bsg.F0(str, '/', length, 4);
        return str.substring(iF0, zkj.c(iF0, str.length(), str, "?#"));
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.i;
        int iF0 = bsg.F0(str, '/', length, 4);
        int iC = zkj.c(iF0, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iF0 < iC) {
            int i = iF0 + 1;
            int iD = zkj.d(str, '/', i, iC);
            arrayList.add(str.substring(i, iD));
            iF0 = iD;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int iF0 = bsg.F0(str, '?', 0, 6) + 1;
        return str.substring(iF0, zkj.d(str, '#', iF0, str.length()));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(length, zkj.c(length, str.length(), str, ":@"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof vs8) && ((vs8) obj).i.equals(this.i);
    }

    public final us8 f() {
        us8 us8Var = new us8();
        ArrayList arrayList = (ArrayList) us8Var.h;
        String str = this.a;
        us8Var.c = str;
        us8Var.d = e();
        us8Var.e = a();
        us8Var.f = this.d;
        str.getClass();
        int i = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
        int i2 = this.e;
        us8Var.b = i2 != i ? i2 : -1;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        String strSubstring = null;
        us8Var.i = strD != null ? us8.l(kxk.m(0, 0, 83, strD, " \"'<>#", true)) : null;
        if (this.h != null) {
            String str2 = this.i;
            strSubstring = str2.substring(bsg.F0(str2, '#', 0, 6) + 1);
        }
        us8Var.g = strSubstring;
        return us8Var;
    }

    public final String g(String str) {
        List list = this.g;
        if (list == null) {
            return null;
        }
        z69 z69VarA0 = wd6.A0(wd6.H0(0, list.size()), 2);
        int i = z69VarA0.E;
        int i2 = z69VarA0.F;
        int i3 = z69VarA0.G;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return null;
        }
        while (!str.equals(list.get(i))) {
            if (i == i2) {
                return null;
            }
            i += i3;
        }
        return (String) list.get(i + 1);
    }

    public final String h() {
        us8 us8Var;
        try {
            us8Var = new us8();
            us8Var.h(this, "/...");
        } catch (IllegalArgumentException unused) {
            us8Var = null;
        }
        us8Var.getClass();
        us8Var.d = kxk.m(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#", false);
        us8Var.e = kxk.m(0, 0, 123, "", " \"':;<=>@[]^`{}|/\\?#", false);
        return us8Var.c().i;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final vs8 i(String str) {
        us8 us8Var;
        str.getClass();
        try {
            us8Var = new us8();
            us8Var.h(this, str);
        } catch (IllegalArgumentException unused) {
            us8Var = null;
        }
        if (us8Var != null) {
            return us8Var.c();
        }
        return null;
    }

    public final URI j() {
        String strReplaceAll;
        us8 us8VarF = f();
        ArrayList arrayList = (ArrayList) us8VarF.h;
        String str = (String) us8VarF.f;
        if (str != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            patternCompile.getClass();
            strReplaceAll = patternCompile.matcher(str).replaceAll("");
            strReplaceAll.getClass();
        } else {
            strReplaceAll = null;
        }
        us8VarF.f = strReplaceAll;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, kxk.m(0, 0, 99, (String) arrayList.get(i), "[]", true));
        }
        ArrayList arrayList2 = (ArrayList) us8VarF.i;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? kxk.m(0, 0, 67, str2, "\\^`{|}", true) : null);
            }
        }
        String str3 = (String) us8VarF.g;
        us8VarF.g = str3 != null ? kxk.m(0, 0, 35, str3, " \"#<>\\^`{|}", true) : null;
        String string = us8VarF.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                patternCompile2.getClass();
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                strReplaceAll2.getClass();
                URI uriCreate = URI.create(strReplaceAll2);
                uriCreate.getClass();
                return uriCreate;
            } catch (Exception unused) {
                xh6.h(e);
                return null;
            }
        }
    }

    public final String toString() {
        return this.i;
    }
}
