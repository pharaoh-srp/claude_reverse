package defpackage;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
public final class r6d {
    public static final tv5 q = new tv5();
    public final Context a;
    public final p6d b;
    public final SparseArray c;
    public final boolean d;
    public final wv5 e;
    public final g1h f;
    public final CopyOnWriteArraySet g;
    public final long h;
    public final mui i;
    public bi0 j = new bi0();
    public k1h k;
    public Pair l;
    public int m;
    public int n;
    public long o;
    public int p;

    public r6d(m6d m6dVar) {
        this.a = m6dVar.a;
        p6d p6dVar = m6dVar.c;
        p6dVar.getClass();
        this.b = p6dVar;
        this.c = new SparseArray();
        iz8 iz8Var = nz8.F;
        vde vdeVar = vde.I;
        this.d = m6dVar.d;
        g1h g1hVar = m6dVar.e;
        this.f = g1hVar;
        long j = m6dVar.g;
        this.h = j != -9223372036854775807L ? -j : -9223372036854775807L;
        mui muiVar = m6dVar.h;
        this.i = muiVar;
        this.e = new wv5(m6dVar.b, muiVar, g1hVar);
        this.g = new CopyOnWriteArraySet();
        new jw7(new iw7());
        this.o = -9223372036854775807L;
        this.p = -1;
        this.n = 0;
    }
}
