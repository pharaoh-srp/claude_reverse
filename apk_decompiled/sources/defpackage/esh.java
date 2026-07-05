package defpackage;

import org.jsoup.helper.ValidationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class esh extends hsh {
    public final ire d;
    public String e;
    public boolean f;
    public n31 g;
    public final ire h;
    public final ire i;
    public boolean j;

    public esh(int i, iq8 iq8Var) {
        super(i);
        this.d = new ire(4, false);
        this.f = false;
        int i2 = 4;
        boolean z = false;
        this.h = new ire(i2, z);
        this.i = new ire(i2, z);
        this.j = false;
        iq8Var.getClass();
    }

    public final void g(int i, int i2, char c) {
        this.i.c(c);
    }

    public final void h(int i, int i2, int[] iArr) {
        for (int i3 : iArr) {
            ire ireVar = this.i;
            StringBuilder sb = (StringBuilder) ireVar.G;
            if (sb != null) {
                sb.appendCodePoint(i3);
            } else if (((String) ireVar.F) != null) {
                StringBuilder sbB = xrg.b();
                ireVar.G = sbB;
                sbB.append((String) ireVar.F);
                ireVar.F = null;
                ((StringBuilder) ireVar.G).appendCodePoint(i3);
            } else {
                ireVar.F = String.valueOf(Character.toChars(i3));
            }
        }
    }

    public final void i(String str) {
        String strReplace = str.replace((char) 0, (char) 65533);
        ire ireVar = this.d;
        ireVar.d(strReplace);
        this.e = ouk.h(ireVar.s());
    }

    public final void j(String str) {
        ire ireVar = this.d;
        ireVar.p();
        ireVar.F = str;
        this.e = ouk.h(ireVar.s());
    }

    public final void k() {
        if (this.g == null) {
            this.g = new n31();
        }
        ire ireVar = this.h;
        boolean zK = ireVar.k();
        ire ireVar2 = this.i;
        if (zK && this.g.size() < 512) {
            String strTrim = ireVar.s().trim();
            if (!strTrim.isEmpty()) {
                this.g.b(strTrim, ireVar2.k() ? ireVar2.s() : this.j ? "" : null);
            }
        }
        ireVar.p();
        ireVar2.p();
        this.j = false;
    }

    public final String l() {
        String str = this.e;
        if (str == null || str.isEmpty()) {
            throw new ValidationException("Must be false");
        }
        return this.e;
    }

    @Override // defpackage.hsh
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public esh f() {
        this.b = -1;
        this.c = -1;
        this.d.p();
        this.e = null;
        this.f = false;
        this.g = null;
        this.h.p();
        this.i.p();
        this.j = false;
        return this;
    }

    public final String n() {
        String strS = this.d.s();
        return strS.isEmpty() ? "[unset]" : strS;
    }
}
