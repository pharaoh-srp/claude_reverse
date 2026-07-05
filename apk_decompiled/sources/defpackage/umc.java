package defpackage;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class umc {
    public final g11 a;
    public volatile long h;
    public volatile String i;
    public volatile int d = -1;
    public volatile String[] g = null;
    public final boolean b = true;
    public volatile g4h c = null;
    public volatile int e = -128;
    public volatile g4h f = null;
    public volatile g4h j = null;

    public umc(g11 g11Var) {
        this.a = g11Var;
    }

    public final void a(brd brdVar) {
        if (brdVar == brd.E) {
            this.d = -1;
        }
        String[] strArr = this.g;
        if (strArr == null) {
            return;
        }
        strArr[brdVar.ordinal()] = null;
    }

    public final int b() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        List<CharSequence> list = Collections.EMPTY_LIST;
        d4h d4hVar = tmc.a;
        a4h a4hVar = a4h.DATADOG;
        int length = 0;
        boolean z = true;
        for (CharSequence charSequence : list) {
            if (z) {
                length += 6;
            }
            z = !z;
            length = charSequence.length() + length + 1;
        }
        int iD = tmc.d(tmc.d(length != 0 ? length - 1 : 0, tmc.a, this.c), tmc.b, this.j);
        this.d = iD;
        return iD;
    }

    public final String c(brd brdVar) {
        String[] strArr = this.g;
        String string = strArr == null ? null : strArr[brdVar.ordinal()];
        if (string == null) {
            tmc tmcVar = (tmc) ((EnumMap) this.a.G).get(brdVar);
            d4h d4hVar = tmc.a;
            int iE = tmcVar.e(this);
            if (iE == 0) {
                string = "";
            } else {
                StringBuilder sb = new StringBuilder(iE);
                int iA = tmcVar.a(sb, this);
                if (this.a.F > 0) {
                    if (this.c != null) {
                        iA = tmcVar.c(sb, tmc.a, this.c, iA);
                    }
                    if (this.j != null) {
                        iA = tmcVar.c(sb, tmc.b, this.j, iA);
                    }
                    Iterator it = Collections.EMPTY_LIST.iterator();
                    while (it.hasNext() && !tmcVar.g(iA)) {
                        iA = tmcVar.c(sb, (b4h) it.next(), (b4h) it.next(), iA);
                    }
                }
                int iB = tmcVar.b(sb, this, iA);
                string = (tmcVar.g(iB) || tmcVar.f(iB, sb)) ? null : sb.toString();
            }
            String[] strArr2 = this.g;
            if (string != null) {
                if (strArr2 == null) {
                    strArr2 = new String[brd.G];
                    this.g = strArr2;
                }
                strArr2[brdVar.ordinal()] = string;
            } else {
                if (strArr2 == null) {
                    strArr2 = new String[brd.G];
                    this.g = strArr2;
                }
                strArr2[brdVar.ordinal()] = "";
            }
        }
        if (string == "") {
            return null;
        }
        return string;
    }

    public final void d(int i, int i2) {
        if ((i == -128 || !this.b) && i2 != -128) {
            return;
        }
        if (this.e != i) {
            a(brd.F);
        }
        this.e = i;
        if (i <= 0) {
            if (this.c != null) {
                a(brd.E);
                a(brd.F);
            }
            this.c = null;
            return;
        }
        if (i2 == -128) {
            i2 = 0;
        }
        if (i2 >= 0) {
            g4h g4hVarD = g4h.d("-" + i2);
            if (!g4hVarD.equals(this.c)) {
                a(brd.E);
                a(brd.F);
            }
            this.c = g4hVarD;
        }
    }
}
