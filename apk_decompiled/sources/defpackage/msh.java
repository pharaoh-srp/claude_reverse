package defpackage;

import java.util.Arrays;
import org.jsoup.helper.ValidationException;

/* JADX INFO: loaded from: classes3.dex */
public final class msh {
    public static final char[] u;
    public static final int[] v = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, 8211, 8212, 732, 8482, 353, 8250, 339, 157, 382, 376};
    public final vi2 a;
    public final vsc b;
    public final dsh h;
    public final csh i;
    public esh j;
    public final gsh n;
    public String o;
    public String p;
    public int q;
    public evh c = evh.E;
    public hsh d = null;
    public boolean e = false;
    public final ire f = new ire(4, false);
    public final yrh k = new yrh();
    public final ash l = new ash();
    public final zrh m = new zrh();
    public int r = 0;
    public final int[] s = new int[1];
    public final int[] t = new int[2];
    public final int g = 1;

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        u = cArr;
        Arrays.sort(cArr);
    }

    public msh(iq8 iq8Var) {
        dsh dshVar = new dsh(2, iq8Var);
        this.h = dshVar;
        this.j = dshVar;
        this.i = new csh(3, iq8Var);
        gsh gshVar = new gsh(6, iq8Var);
        gshVar.k = true;
        this.n = gshVar;
        this.a = iq8Var.b;
        this.b = iq8Var.a.F;
    }

    public final void a(evh evhVar) {
        o(evhVar);
        this.a.c();
    }

    public final void b(String str, Object... objArr) {
        vsc vscVar = this.b;
        if (vscVar.a()) {
            vscVar.add(new c88(this.a, String.format("Invalid character reference: ".concat(str), objArr)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01dc, code lost:
    
        if (r0.x0('=', '-', '_') == false) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] c(java.lang.Character r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.msh.c(java.lang.Character, boolean):int[]");
    }

    public final esh d(boolean z) {
        esh eshVar;
        if (z) {
            eshVar = this.h;
            eshVar.f();
        } else {
            eshVar = this.i;
            eshVar.f();
        }
        this.j = eshVar;
        return eshVar;
    }

    public final void e() {
        this.f.p();
    }

    public final void f(char c) {
        yrh yrhVar = this.k;
        yrhVar.d.c(c);
        yrhVar.b = this.r;
        yrhVar.c = this.a.P0();
    }

    public final void g(hsh hshVar) {
        if (this.e) {
            throw new ValidationException("Must be false");
        }
        this.d = hshVar;
        this.e = true;
        hshVar.b = this.q;
        vi2 vi2Var = this.a;
        hshVar.c = vi2Var.P0();
        this.r = vi2Var.P0();
        int i = hshVar.a;
        if (i == 2) {
            this.o = ((dsh) hshVar).d.s();
            this.p = null;
        } else if (i == 3) {
            csh cshVar = (csh) hshVar;
            if (cshVar.g != null) {
                Object[] objArr = {cshVar.l()};
                vsc vscVar = this.b;
                if (vscVar.a()) {
                    vscVar.add(new c88(vi2Var, "Attributes incorrectly present on end tag [/%s]", objArr));
                }
            }
        }
    }

    public final void h(String str) {
        yrh yrhVar = this.k;
        yrhVar.d.d(str);
        yrhVar.b = this.r;
        yrhVar.c = this.a.P0();
    }

    public final void i() {
        g(this.m);
    }

    public final void j() {
        g(this.l);
    }

    public final void k() {
        esh eshVar = this.j;
        if (eshVar.h.k()) {
            eshVar.k();
        }
        g(this.j);
    }

    public final void l(evh evhVar) {
        vsc vscVar = this.b;
        if (vscVar.a()) {
            vscVar.add(new c88(this.a, "Unexpectedly reached end of file (EOF) in input state [%s]", new Object[]{evhVar}));
        }
    }

    public final void m(evh evhVar) {
        vsc vscVar = this.b;
        if (vscVar.a()) {
            vi2 vi2Var = this.a;
            vscVar.add(new c88(vi2Var, "Unexpected character '%s' in input state [%s]", new Object[]{Character.valueOf(vi2Var.R()), evhVar}));
        }
    }

    public final boolean n() {
        return this.o != null && this.j.d.s().equalsIgnoreCase(this.o);
    }

    public final void o(evh evhVar) {
        if (evhVar == evh.L) {
            this.q = this.a.P0();
        }
        this.c = evhVar;
    }
}
