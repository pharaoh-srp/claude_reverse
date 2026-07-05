package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class bkd {
    public final Uri a;
    public final ymg b;
    public final xv8 c;
    public final ekd d;
    public final hf4 e;
    public volatile boolean g;
    public long i;
    public ug5 j;
    public y3i k;
    public boolean l;
    public final /* synthetic */ ekd m;
    public final xm7 f = new xm7();
    public boolean h = true;

    public bkd(ekd ekdVar, Uri uri, tg5 tg5Var, xv8 xv8Var, ekd ekdVar2, hf4 hf4Var) {
        this.m = ekdVar;
        this.a = uri;
        this.b = new ymg(tg5Var);
        this.c = xv8Var;
        this.d = ekdVar2;
        this.e = hf4Var;
        uba.a.getAndIncrement();
        this.j = a(0L, null);
    }

    public final ug5 a(long j, String str) {
        Map mapD = ekd.v0;
        if (str != null && !str.startsWith("W/")) {
            s20 s20Var = new s20(4);
            s20Var.m(mapD.entrySet());
            s20Var.l("If-Range", str);
            mapD = s20Var.d(false);
        }
        Map map = Collections.EMPTY_MAP;
        Uri uri = this.a;
        fd9.I("The uri must be set.", uri);
        return new ug5(uri, 1, null, mapD, j, -1L, 6);
    }

    public final void b() {
        tg5 ev8Var;
        wd7 wd7Var;
        int i;
        int iB = 0;
        String str = null;
        while (iB == 0 && !this.g) {
            try {
                long j = this.f.a;
                ug5 ug5VarA = a(j, str);
                this.j = ug5VarA;
                long jB = this.b.b(ug5VarA);
                if (this.g) {
                    if (iB != 1 && this.c.o() != -1) {
                        this.f.a = this.c.o();
                    }
                    ymg ymgVar = this.b;
                    if (ymgVar != null) {
                        try {
                            ymgVar.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    return;
                }
                List list = (List) this.b.E.i().get("ETag");
                str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                if (jB != -1) {
                    jB += j;
                    ekd ekdVar = this.m;
                    ekdVar.U.post(new xjd(ekdVar, 0));
                }
                long j2 = jB;
                this.m.W = gv8.d(this.b.E.i());
                ymg ymgVar2 = this.b;
                gv8 gv8Var = this.m.W;
                if (gv8Var == null || (i = gv8Var.f) == -1) {
                    ev8Var = ymgVar2;
                } else {
                    ev8Var = new ev8(ymgVar2, i, this);
                    y3i y3iVarZ = this.m.z(new dkd(0, true));
                    this.k = y3iVarZ;
                    y3iVarZ.g(ekd.w0);
                }
                this.c.t(ev8Var, this.a, this.b.E.i(), j, j2, this.d);
                if (this.m.W != null && (wd7Var = (wd7) this.c.G) != null && (wd7Var instanceof rsb)) {
                    ((rsb) wd7Var).r = true;
                }
                if (this.h) {
                    xv8 xv8Var = this.c;
                    long j3 = this.i;
                    wd7 wd7Var2 = (wd7) xv8Var.G;
                    wd7Var2.getClass();
                    wd7Var2.d(j, j3);
                    this.h = false;
                }
                while (iB == 0 && !this.g) {
                    try {
                        hf4 hf4Var = this.e;
                        synchronized (hf4Var) {
                            while (!hf4Var.b) {
                                hf4Var.a.getClass();
                                hf4Var.wait();
                            }
                        }
                        xv8 xv8Var2 = this.c;
                        xm7 xm7Var = this.f;
                        wd7 wd7Var3 = (wd7) xv8Var2.G;
                        wd7Var3.getClass();
                        fr5 fr5Var = (fr5) xv8Var2.H;
                        fr5Var.getClass();
                        iB = wd7Var3.b(fr5Var, xm7Var);
                        long jO = this.c.o();
                        if (jO > this.m.M + j) {
                            hf4 hf4Var2 = this.e;
                            synchronized (hf4Var2) {
                                hf4Var2.b = false;
                            }
                            ekd ekdVar2 = this.m;
                            ekdVar2.U.post(ekdVar2.T);
                            j = jO;
                        }
                    } catch (InterruptedException unused2) {
                        throw new InterruptedIOException();
                    }
                }
                if (iB == 1) {
                    iB = 0;
                } else if (this.c.o() != -1) {
                    this.f.a = this.c.o();
                }
                ymg ymgVar3 = this.b;
                if (ymgVar3 != null) {
                    try {
                        ymgVar3.close();
                    } catch (IOException unused3) {
                    }
                }
            } catch (Throwable th) {
                if (iB != 1 && this.c.o() != -1) {
                    this.f.a = this.c.o();
                }
                ymg ymgVar4 = this.b;
                if (ymgVar4 != null) {
                    try {
                        ymgVar4.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        }
    }
}
