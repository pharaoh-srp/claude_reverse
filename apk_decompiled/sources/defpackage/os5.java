package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class os5 implements y7b {
    public final ns5 a;
    public final qg5 b;
    public bm4 c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;
    public boolean i;

    public os5(qg5 qg5Var, gr5 gr5Var) {
        bm4 bm4Var = new bm4();
        this.b = qg5Var;
        this.c = bm4Var;
        ns5 ns5Var = new ns5(gr5Var, bm4Var);
        this.a = ns5Var;
        if (qg5Var != ((qg5) ns5Var.f)) {
            ns5Var.f = qg5Var;
            ((HashMap) ns5Var.d).clear();
            ((HashMap) ns5Var.e).clear();
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = true;
    }

    public static y7b e(Class cls, qg5 qg5Var) {
        try {
            return (y7b) cls.getConstructor(qg5.class).newInstance(qg5Var);
        } catch (Exception e) {
            pmf.m(e);
            return null;
        }
    }

    @Override // defpackage.y7b
    public final void a(bm4 bm4Var) {
        this.c = bm4Var;
        ns5 ns5Var = this.a;
        ns5Var.g = bm4Var;
        gr5 gr5Var = (gr5) ns5Var.c;
        synchronized (gr5Var) {
            gr5Var.G = bm4Var;
        }
        Iterator it = ((HashMap) ns5Var.e).values().iterator();
        while (it.hasNext()) {
            ((y7b) it.next()).a(bm4Var);
        }
    }

    @Override // defpackage.y7b
    public final void b(boolean z) {
        this.i = z;
        ns5 ns5Var = this.a;
        ns5Var.b = z;
        gr5 gr5Var = (gr5) ns5Var.c;
        synchronized (gr5Var) {
            gr5Var.F = z;
        }
        Iterator it = ((HashMap) ns5Var.e).values().iterator();
        while (it.hasNext()) {
            ((y7b) it.next()).b(z);
        }
    }

    @Override // defpackage.y7b
    public final me1 c(j7b j7bVar) {
        int i;
        j7b j7bVar2;
        Uri uri;
        String str;
        List list;
        long j;
        j7bVar.b.getClass();
        String scheme = j7bVar.b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        boolean zEquals = Objects.equals(j7bVar.b.b, "application/x-image-uri");
        g7b g7bVar = j7bVar.b;
        if (zEquals) {
            long j2 = g7bVar.e;
            String str2 = tpi.a;
            throw null;
        }
        int iV = tpi.v(g7bVar.a, g7bVar.b);
        if (j7bVar.b.e != -9223372036854775807L) {
            gr5 gr5Var = (gr5) this.a.c;
            synchronized (gr5Var) {
                gr5Var.I = 1;
            }
            gr5 gr5Var2 = (gr5) this.a.c;
            synchronized (gr5Var2) {
                gr5Var2.J = 1;
            }
        }
        try {
            y7b y7bVarE = this.a.e(iV);
            e7b e7bVarA = j7bVar.c.a();
            f7b f7bVar = j7bVar.c;
            if (f7bVar.a == -9223372036854775807L) {
                e7bVarA.a = this.d;
            }
            if (f7bVar.d == -3.4028235E38f) {
                e7bVarA.d = this.g;
            }
            if (f7bVar.e == -3.4028235E38f) {
                e7bVarA.e = this.h;
            }
            if (f7bVar.b == -9223372036854775807L) {
                e7bVarA.b = this.e;
            }
            if (f7bVar.c == -9223372036854775807L) {
                e7bVarA.c = this.f;
            }
            f7b f7bVar2 = new f7b(e7bVarA);
            if (f7bVar2.equals(j7bVar.c)) {
                i = 1;
                j7bVar2 = j7bVar;
            } else {
                new yl4(13);
                List list2 = Collections.EMPTY_LIST;
                nz8 nz8Var = vde.I;
                h7b h7bVar = h7b.a;
                d7b d7bVar = j7bVar.e;
                xm7 xm7Var = new xm7();
                xm7Var.a = d7bVar.a;
                String str3 = j7bVar.a;
                n7b n7bVar = j7bVar.d;
                j7bVar.c.a();
                h7b h7bVar2 = j7bVar.f;
                g7b g7bVar2 = j7bVar.b;
                if (g7bVar2 != null) {
                    String str4 = g7bVar2.b;
                    Uri uri2 = g7bVar2.a;
                    List list3 = g7bVar2.c;
                    nz8Var = g7bVar2.d;
                    new yl4(13);
                    i = 1;
                    str = str4;
                    j = g7bVar2.e;
                    list = list3;
                    uri = uri2;
                } else {
                    i = 1;
                    uri = null;
                    str = null;
                    list = list2;
                    j = -9223372036854775807L;
                }
                nz8 nz8Var2 = nz8Var;
                e7b e7bVarA2 = f7bVar2.a();
                g7b g7bVar3 = uri != null ? new g7b(uri, str, null, list, nz8Var2, j) : null;
                if (str3 == null) {
                    str3 = "";
                }
                String str5 = str3;
                d7b d7bVar2 = new d7b(xm7Var);
                f7b f7bVar3 = new f7b(e7bVarA2);
                if (n7bVar == null) {
                    n7bVar = n7b.B;
                }
                j7bVar2 = new j7b(str5, d7bVar2, g7bVar3, f7bVar3, n7bVar, h7bVar2);
            }
            me1 me1VarC = y7bVarE.c(j7bVar2);
            nz8 nz8Var3 = j7bVar2.b.d;
            if (!nz8Var3.isEmpty()) {
                me1[] me1VarArr = new me1[nz8Var3.size() + i];
                me1VarArr[0] = me1VarC;
                if (nz8Var3.size() > 0) {
                    if (!this.i) {
                        this.b.getClass();
                        i7b i7bVar = (i7b) nz8Var3.get(0);
                        new ArrayList(i);
                        new HashSet(i);
                        new CopyOnWriteArrayList();
                        new CopyOnWriteArrayList();
                        iz8 iz8Var = nz8.F;
                        vde vdeVar = vde.I;
                        List list4 = Collections.EMPTY_LIST;
                        vde vdeVar2 = vde.I;
                        h7b h7bVar3 = h7b.a;
                        Uri uri3 = Uri.EMPTY;
                        i7bVar.getClass();
                        throw null;
                    }
                    iw7 iw7Var = new iw7();
                    ((i7b) nz8Var3.get(0)).getClass();
                    ArrayList arrayList = gkb.a;
                    iw7Var.n = null;
                    ((i7b) nz8Var3.get(0)).getClass();
                    iw7Var.d = null;
                    ((i7b) nz8Var3.get(0)).getClass();
                    iw7Var.e = 0;
                    ((i7b) nz8Var3.get(0)).getClass();
                    iw7Var.f = 0;
                    ((i7b) nz8Var3.get(0)).getClass();
                    iw7Var.b = null;
                    ((i7b) nz8Var3.get(0)).getClass();
                    iw7Var.a = null;
                    jw7 jw7Var = new jw7(iw7Var);
                    new g6();
                    if (this.c.a(jw7Var)) {
                        iw7 iw7VarA = jw7Var.a();
                        iw7VarA.n = gkb.k("application/x-media3-cues");
                        iw7VarA.j = jw7Var.o;
                        iw7VarA.L = this.c.e(jw7Var);
                        new jw7(iw7VarA);
                    }
                    ((i7b) nz8Var3.get(0)).getClass();
                    throw null;
                }
                me1VarC = new jeb(me1VarArr);
            }
            d7b d7bVar3 = j7bVar2.e;
            if (d7bVar3.a != Long.MIN_VALUE) {
                tp3 tp3Var = new tp3(me1VarC);
                fd9.M(!tp3Var.d);
                long j3 = d7bVar3.a;
                fd9.M(!tp3Var.d);
                tp3Var.b = j3;
                fd9.M(!tp3Var.d);
                tp3Var.c = true;
                fd9.M(!tp3Var.d);
                fd9.M(!tp3Var.d);
                fd9.M(!tp3Var.d);
                fd9.M(!tp3Var.d);
                tp3Var.d = true;
                me1VarC = new vp3(tp3Var);
            }
            j7bVar2.b.getClass();
            j7bVar2.b.getClass();
            return me1VarC;
        } catch (ClassNotFoundException e) {
            pmf.m(e);
            return null;
        }
    }

    @Override // defpackage.y7b
    public final void d(int i) {
        ns5 ns5Var = this.a;
        ns5Var.a = i;
        gr5 gr5Var = (gr5) ns5Var.c;
        synchronized (gr5Var) {
            gr5Var.H = i;
        }
    }
}
