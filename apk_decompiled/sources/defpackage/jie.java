package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jie {
    public vs8 a;
    public tie d;
    public j8 e = zm6.j;
    public String b = "GET";
    public gmf c = new gmf(16);

    public final void a(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.c.s(str, str2);
    }

    public final void b(y42 y42Var) {
        y42Var.getClass();
        String string = y42Var.toString();
        if (string.length() == 0) {
            this.c.J("Cache-Control");
        } else {
            d("Cache-Control", string);
        }
    }

    public final void c() {
        e("GET", null);
    }

    public final void d(String str, String str2) {
        str.getClass();
        str2.getClass();
        gmf gmfVar = this.c;
        gmfVar.getClass();
        skj.c(str);
        skj.d(str2, str);
        gmfVar.J(str);
        skj.a(gmfVar, str, str2);
    }

    public final void e(String str, tie tieVar) {
        str.getClass();
        if (str.length() <= 0) {
            sz6.p("method.isEmpty() == true");
            return;
        }
        if (tieVar == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                mr9.q(ij0.j("method ", str, " must have a request body."));
                return;
            }
        } else if (!iv1.C(str)) {
            mr9.q(ij0.j("method ", str, " must not have a request body."));
            return;
        }
        this.b = str;
        this.d = tieVar;
    }

    public final void f(Class cls, Object obj) {
        cls.getClass();
        this.e = this.e.a0(jce.a.b(cls), obj);
    }

    public final void g(String str) {
        str.getClass();
        if (isg.q0(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (isg.q0(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        us8 us8Var = new us8();
        us8Var.h(null, str);
        this.a = us8Var.c();
    }
}
