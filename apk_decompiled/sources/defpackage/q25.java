package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class q25 extends xjk implements x5c {
    public final c61 c;
    public final ir8 d;

    public q25(c61 c61Var) {
        this.c = c61Var;
        this.d = (ir8) c61Var.F;
    }

    @Override // defpackage.xjk
    public final void A(tjc tjcVar) {
        int i = tjcVar.h;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (i != 1) {
            linkedHashMap.put("start", String.valueOf(i));
        }
        J(tjcVar, "ol", this.c.o(linkedHashMap));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // defpackage.xjk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(defpackage.arc r6) {
        /*
            r5 = this;
            b5c r0 = r6.a
            jr1 r0 = (defpackage.jr1) r0
            r1 = 0
            if (r0 == 0) goto L14
            b5c r0 = r0.a
            jr1 r0 = (defpackage.jr1) r0
            boolean r2 = r0 instanceof defpackage.y7a
            if (r2 == 0) goto L14
            y7a r0 = (defpackage.y7a) r0
            boolean r0 = r0.g
            goto L15
        L14:
            r0 = r1
        L15:
            ir8 r2 = r5.d
            if (r0 != 0) goto L25
            r2.b()
            java.util.LinkedHashMap r3 = r5.H()
            java.lang.String r4 = "p"
            r2.d(r4, r3, r1)
        L25:
            r5.G(r6)
            if (r0 != 0) goto L32
            java.lang.String r5 = "/p"
            r2.c(r5)
            r2.b()
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q25.B(arc):void");
    }

    @Override // defpackage.xjk
    public final void C(aeg aegVar) {
        this.d.a(((gq8) this.c.I).a);
    }

    @Override // defpackage.xjk
    public final void D(msg msgVar) {
        LinkedHashMap linkedHashMapH = H();
        ir8 ir8Var = this.d;
        ir8Var.d("strong", linkedHashMapH, false);
        G(msgVar);
        ir8Var.c("/strong");
    }

    @Override // defpackage.xjk
    public final void E(edh edhVar) {
        String str = edhVar.g;
        ir8 ir8Var = this.d;
        ir8Var.getClass();
        ir8Var.a(pu6.a(str));
    }

    @Override // defpackage.xjk
    public final void F(klh klhVar) {
        ir8 ir8Var = this.d;
        ir8Var.b();
        ir8Var.d("hr", H(), true);
        ir8Var.b();
    }

    @Override // defpackage.xjk
    public final void G(b5c b5cVar) {
        b5c b5cVar2 = b5cVar.b;
        while (b5cVar2 != null) {
            b5c b5cVar3 = b5cVar2.e;
            this.c.F(b5cVar2);
            b5cVar2 = b5cVar3;
        }
    }

    public final LinkedHashMap H() {
        return this.c.o(Collections.EMPTY_MAP);
    }

    public final void I(String str, Map map) {
        ir8 ir8Var = this.d;
        ir8Var.b();
        ir8Var.d("pre", H(), false);
        ir8Var.d("code", this.c.o(map), false);
        ir8Var.a(pu6.a(str));
        ir8Var.c("/code");
        ir8Var.c("/pre");
        ir8Var.b();
    }

    public final void J(y7a y7aVar, String str, LinkedHashMap linkedHashMap) {
        ir8 ir8Var = this.d;
        ir8Var.b();
        ir8Var.d(str, linkedHashMap, false);
        ir8Var.b();
        G(y7aVar);
        ir8Var.b();
        ir8Var.c("/".concat(str));
        ir8Var.b();
    }

    @Override // defpackage.x5c
    public final Set a() {
        return new HashSet(Arrays.asList(p96.class, yg8.class, arc.class, qr1.class, c02.class, bh7.class, wp8.class, klh.class, u09.class, l6a.class, i9a.class, tjc.class, vv8.class, bm6.class, msg.class, edh.class, kq3.class, yp8.class, aeg.class, lf8.class));
    }

    @Override // defpackage.x5c
    public final void b(b5c b5cVar) {
        b5cVar.a(this);
    }

    @Override // defpackage.xjk
    public final void m(qr1 qr1Var) {
        ir8 ir8Var = this.d;
        ir8Var.b();
        ir8Var.d("blockquote", H(), false);
        ir8Var.b();
        G(qr1Var);
        ir8Var.b();
        ir8Var.c("/blockquote");
        ir8Var.b();
    }

    @Override // defpackage.xjk
    public final void n(c02 c02Var) {
        J(c02Var, "ul", H());
    }

    @Override // defpackage.xjk
    public final void o(kq3 kq3Var) {
        LinkedHashMap linkedHashMapH = H();
        ir8 ir8Var = this.d;
        ir8Var.d("code", linkedHashMapH, false);
        ir8Var.a(pu6.a(kq3Var.g));
        ir8Var.c("/code");
    }

    @Override // defpackage.xjk
    public final void p(p96 p96Var) {
        G(p96Var);
    }

    @Override // defpackage.xjk
    public final void q(bm6 bm6Var) {
        LinkedHashMap linkedHashMapH = H();
        ir8 ir8Var = this.d;
        ir8Var.d("em", linkedHashMapH, false);
        G(bm6Var);
        ir8Var.c("/em");
    }

    @Override // defpackage.xjk
    public final void r(bh7 bh7Var) {
        String str = bh7Var.k;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strSubstring = bh7Var.j;
        if (strSubstring != null && !strSubstring.isEmpty()) {
            int iIndexOf = strSubstring.indexOf(" ");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(0, iIndexOf);
            }
            linkedHashMap.put("class", "language-".concat(strSubstring));
        }
        I(str, linkedHashMap);
    }

    @Override // defpackage.xjk
    public final void s(lf8 lf8Var) {
        LinkedHashMap linkedHashMapH = H();
        ir8 ir8Var = this.d;
        ir8Var.d("br", linkedHashMapH, true);
        ir8Var.b();
    }

    @Override // defpackage.xjk
    public final void t(yg8 yg8Var) {
        String str = "h" + yg8Var.g;
        ir8 ir8Var = this.d;
        ir8Var.b();
        ir8Var.d(str, H(), false);
        G(yg8Var);
        ir8Var.c("/".concat(str));
        ir8Var.b();
    }

    @Override // defpackage.xjk
    public final void u(wp8 wp8Var) {
        ir8 ir8Var = this.d;
        ir8Var.b();
        if (((gq8) this.c.I).b) {
            ir8Var.d("p", H(), false);
            ir8Var.a(pu6.a(wp8Var.g));
            ir8Var.c("/p");
        } else {
            ir8Var.a(wp8Var.g);
        }
        ir8Var.b();
    }

    @Override // defpackage.xjk
    public final void v(yp8 yp8Var) {
        boolean z = ((gq8) this.c.I).b;
        String str = yp8Var.g;
        ir8 ir8Var = this.d;
        if (!z) {
            ir8Var.a(str);
        } else {
            ir8Var.getClass();
            ir8Var.a(pu6.a(str));
        }
    }

    @Override // defpackage.xjk
    public final void w(vv8 vv8Var) {
        String str = vv8Var.g;
        p25 p25Var = new p25();
        p25Var.w(vv8Var);
        String string = ((StringBuilder) p25Var.d).toString();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c61 c61Var = this.c;
        gq8 gq8Var = (gq8) c61Var.I;
        gq8Var.getClass();
        gq8Var.getClass();
        linkedHashMap.put("src", str);
        linkedHashMap.put("alt", string);
        String str2 = vv8Var.h;
        if (str2 != null) {
            linkedHashMap.put("title", str2);
        }
        this.d.d("img", c61Var.o(linkedHashMap), true);
    }

    @Override // defpackage.xjk
    public final void x(u09 u09Var) {
        I(u09Var.g, Collections.EMPTY_MAP);
    }

    @Override // defpackage.xjk
    public final void y(l6a l6aVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = l6aVar.g;
        c61 c61Var = this.c;
        gq8 gq8Var = (gq8) c61Var.I;
        gq8Var.getClass();
        gq8Var.getClass();
        linkedHashMap.put("href", str);
        String str2 = l6aVar.h;
        if (str2 != null) {
            linkedHashMap.put("title", str2);
        }
        LinkedHashMap linkedHashMapO = c61Var.o(linkedHashMap);
        ir8 ir8Var = this.d;
        ir8Var.d("a", linkedHashMapO, false);
        G(l6aVar);
        ir8Var.c("/a");
    }

    @Override // defpackage.xjk
    public final void z(i9a i9aVar) {
        LinkedHashMap linkedHashMapH = H();
        ir8 ir8Var = this.d;
        ir8Var.d("li", linkedHashMapH, false);
        G(i9aVar);
        ir8Var.c("/li");
        ir8Var.b();
    }
}
