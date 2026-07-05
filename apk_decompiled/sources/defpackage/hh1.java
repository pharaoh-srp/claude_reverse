package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class hh1 implements wi7 {
    public final File E;
    public final xi7 F;
    public final h99 G;
    public final wjb H;
    public final iuj I;
    public final AtomicInteger J;
    public final dh1 K;
    public final long L;
    public final long M;
    public File N;
    public long O;
    public long P;
    public long Q;

    public hh1(File file, xi7 xi7Var, h99 h99Var, wjb wjbVar, iuj iujVar) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        h99Var.getClass();
        wjbVar.getClass();
        iujVar.getClass();
        this.E = file;
        this.F = xi7Var;
        this.G = h99Var;
        this.H = wjbVar;
        this.I = iujVar;
        this.J = atomicInteger;
        this.K = new dh1();
        double d = xi7Var.a;
        this.L = mwa.M(1.05d * d);
        this.M = mwa.M(d * 0.95d);
    }

    public static File d(File file) {
        return new File(kgh.o(file.getPath(), "_metadata"));
    }

    public final long a(File file, boolean z) {
        h99 h99Var = this.G;
        if (!fd9.T(file, h99Var)) {
            return 0L;
        }
        long jI0 = fd9.i0(file, h99Var);
        if (!fd9.Q(file, h99Var)) {
            return 0L;
        }
        if (z) {
            this.H.r(file, lfe.x, this.J.decrementAndGet());
        }
        return jI0;
    }

    public final ArrayList b(List list) {
        this.I.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.F.e;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            String name = file.getName();
            name.getClass();
            Long lT0 = isg.t0(name);
            if ((lT0 != null ? lT0.longValue() : 0L) < jCurrentTimeMillis) {
                h99 h99Var = this.G;
                if (fd9.Q(file, h99Var)) {
                    this.H.r(file, lfe.w, this.J.decrementAndGet());
                }
                if (fd9.T(d(file), h99Var)) {
                    fd9.Q(d(file), h99Var);
                }
                file = null;
            }
            if (file != null) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    @Override // defpackage.wi7
    public final File c() {
        File file = null;
        if (!g()) {
            return null;
        }
        iuj iujVar = this.I;
        iujVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.Q;
        xi7 xi7Var = this.F;
        long j = xi7Var.g;
        h99 h99Var = this.G;
        if (jCurrentTimeMillis > j) {
            ArrayList arrayListB = b(h());
            Iterator it = arrayListB.iterator();
            long jI0 = 0;
            while (it.hasNext()) {
                jI0 += fd9.i0((File) it.next(), h99Var);
            }
            long j2 = xi7Var.f;
            long jA = jI0 - j2;
            if (jA > 0) {
                dch.I(this.G, 5, x44.X(g99.F, g99.G), new eh1(jI0, j2, jA), null, 56);
                for (File file2 : w44.h1(arrayListB)) {
                    if (jA > 0) {
                        jA = (jA - a(file2, true)) - a(d(file2), false);
                    }
                }
            }
            iujVar.getClass();
            this.Q = System.currentTimeMillis();
        }
        File file3 = (File) w44.W0(h());
        if (file3 != null) {
            File file4 = this.N;
            long j3 = this.O;
            if (x44.r(file4, file3)) {
                boolean zF = f(file3, this.M);
                boolean z = fd9.i0(file3, h99Var) < xi7Var.b;
                boolean z2 = j3 < ((long) xi7Var.d);
                if (zF && z && z2) {
                    this.O = j3 + 1;
                    iujVar.getClass();
                    this.P = System.currentTimeMillis();
                    file = file3;
                } else {
                    file = null;
                }
            }
        }
        if (file == null) {
            iujVar.getClass();
            file = new File(this.E, String.valueOf(System.currentTimeMillis()));
            File file5 = this.N;
            long j4 = this.P;
            if (file5 != null) {
                this.H.f(file5, new xg1(j4, this.O));
            }
            this.N = file;
            this.O = 1L;
            this.P = System.currentTimeMillis();
            this.J.incrementAndGet();
        }
        return file;
    }

    public final File e(Set set) {
        Object obj = null;
        if (!g()) {
            return null;
        }
        ArrayList arrayListB = b(w44.h1(h()));
        this.I.getClass();
        this.Q = System.currentTimeMillis();
        this.J.set(arrayListB.size());
        Iterator it = arrayListB.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            File file = (File) next;
            if (!set.contains(file) && !f(file, this.L)) {
                obj = next;
                break;
            }
        }
        return (File) obj;
    }

    public final boolean f(File file, long j) {
        this.I.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String name = file.getName();
        name.getClass();
        Long lT0 = isg.t0(name);
        return (lT0 != null ? lT0.longValue() : 0L) >= jCurrentTimeMillis - j;
    }

    public final boolean g() {
        boolean zT = fd9.T(this.E, this.G);
        File file = this.E;
        if (zT) {
            if (!file.isDirectory()) {
                dch.I(this.G, 5, x44.X(g99.F, g99.G), new gh1(this, 1), null, 56);
                return false;
            }
            if (fd9.y(this.E, this.G)) {
                return true;
            }
            dch.I(this.G, 5, x44.X(g99.F, g99.G), new gh1(this, 0), null, 56);
            return false;
        }
        synchronized (file) {
            if (fd9.T(this.E, this.G)) {
                return true;
            }
            if (fd9.l0(this.E, this.G)) {
                return true;
            }
            dch.I(this.G, 5, x44.X(g99.F, g99.G), new gh1(this, 2), null, 56);
            return false;
        }
    }

    public final List h() {
        File[] fileArrListFiles;
        File file = this.E;
        file.getClass();
        dh1 dh1Var = this.K;
        dh1Var.getClass();
        h99 h99Var = this.G;
        h99Var.getClass();
        g99 g99Var = g99.G;
        g99 g99Var2 = g99.F;
        try {
            fileArrListFiles = file.listFiles(dh1Var);
        } catch (SecurityException e) {
            dch.I(h99Var, 5, x44.X(g99Var2, g99Var), new fh1(file, 4), e, 48);
            fileArrListFiles = null;
        } catch (Exception e2) {
            dch.I(h99Var, 5, x44.X(g99Var2, g99Var), new fh1(file, 5), e2, 48);
            fileArrListFiles = null;
        }
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        return mp0.Y0(fileArrListFiles);
    }

    @Override // defpackage.wi7
    public final File l(File file) {
        boolean zR = x44.r(file.getParent(), this.E.getPath());
        g99 g99Var = g99.G;
        g99 g99Var2 = g99.F;
        if (!zR) {
            dch.I(this.G, 2, x44.X(g99Var2, g99Var), new xz(file, 4, this), null, 56);
        }
        String name = file.getName();
        name.getClass();
        if (isg.t0(name) != null) {
            return d(file);
        }
        dch.I(this.G, 5, x44.X(g99Var2, g99Var), new fh1(file, 0), null, 56);
        return null;
    }

    @Override // defpackage.wi7
    public final File o() {
        if (g()) {
            return this.E;
        }
        return null;
    }
}
