package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.NotImplementedError;

/* JADX INFO: loaded from: classes.dex */
public final class yue {
    public boolean a;
    public boolean b;
    public final ji5 c;
    public final cl6 d;
    public final List e;
    public final dh4 f;
    public final bzg g;
    public oy7 h;

    public yue(ji5 ji5Var, cl6 cl6Var, wv2 wv2Var) {
        int i;
        dh4 gh4Var;
        bve bveVar = ji5Var.g;
        azg azgVar = ji5Var.c;
        mze mzeVar = ji5Var.p;
        String str = ji5Var.b;
        this.c = ji5Var;
        this.d = cl6Var;
        List list = ji5Var.e;
        this.e = list == null ? lm6.E : list;
        if (mzeVar != null) {
            this.g = null;
            if (mzeVar.B()) {
                gh4Var = new luc(new nyj(this, mzeVar), str == null ? ":memory:" : str, wv2Var);
            } else if (str == null) {
                gh4Var = new gh4(new nyj(this, mzeVar));
            } else {
                nyj nyjVar = new nyj(this, mzeVar);
                int iOrdinal = bveVar.ordinal();
                if (iOrdinal == 1) {
                    i = 1;
                } else {
                    if (iOrdinal != 2) {
                        mr9.w("Can't get max number of reader for journal mode '", bveVar);
                        throw null;
                    }
                    i = 4;
                }
                int iOrdinal2 = bveVar.ordinal();
                if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                    mr9.w("Can't get max number of writers for journal mode '", bveVar);
                    throw null;
                }
                gh4Var = new gh4(nyjVar, str, i);
            }
            this.f = gh4Var;
        } else {
            if (azgVar == null) {
                sz6.p("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
            Context context = ji5Var.a;
            context.getClass();
            bzg bzgVarJ = azgVar.j(new w47(context, str, new g11(this, cl6Var.a), false, false));
            this.g = bzgVarJ;
            this.f = new luc(new n78(bzgVarJ), str == null ? ":memory:" : str, wv2Var);
        }
        boolean z = bveVar == bve.G;
        bzg bzgVar = this.g;
        if (bzgVar != null) {
            bzgVar.setWriteAheadLoggingEnabled(z);
        }
    }

    public static final void a(yue yueVar, lze lzeVar) throws Exception {
        Object hreVar;
        cl6 cl6Var = yueVar.d;
        b(lzeVar);
        ji5 ji5Var = yueVar.c;
        bve bveVar = ji5Var.g;
        bve bveVar2 = bve.G;
        if (bveVar == bveVar2) {
            u00.r(lzeVar, "PRAGMA journal_mode = WAL");
        } else {
            u00.r(lzeVar, "PRAGMA journal_mode = TRUNCATE");
        }
        if (ji5Var.g == bveVar2) {
            u00.r(lzeVar, "PRAGMA synchronous = NORMAL");
        } else {
            u00.r(lzeVar, "PRAGMA synchronous = FULL");
        }
        tze tzeVarL0 = lzeVar.L0("PRAGMA user_version");
        try {
            tzeVarL0.H0();
            int i = (int) tzeVarL0.getLong(0);
            csg.o(tzeVarL0, null);
            if (i != cl6Var.a) {
                u00.r(lzeVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        yueVar.c(lzeVar);
                    } else {
                        yueVar.d(lzeVar, i, cl6Var.a);
                    }
                    u00.r(lzeVar, "PRAGMA user_version = " + cl6Var.a);
                    hreVar = iei.a;
                } catch (Throwable th) {
                    hreVar = new hre(th);
                }
                if (!(hreVar instanceof hre)) {
                    u00.r(lzeVar, "END TRANSACTION");
                }
                Throwable thA = jre.a(hreVar);
                if (thA != null) {
                    u00.r(lzeVar, "ROLLBACK TRANSACTION");
                    throw thA;
                }
            }
            yueVar.e(lzeVar);
        } finally {
        }
    }

    public static void b(lze lzeVar) throws Exception {
        tze tzeVarL0 = lzeVar.L0("PRAGMA busy_timeout");
        try {
            tzeVarL0.H0();
            long j = tzeVarL0.getLong(0);
            csg.o(tzeVarL0, null);
            if (j < 3000) {
                u00.r(lzeVar, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                csg.o(tzeVarL0, th);
                throw th2;
            }
        }
    }

    public final void c(lze lzeVar) throws Exception {
        lzeVar.getClass();
        tze tzeVarL0 = lzeVar.L0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (tzeVarL0.H0()) {
                if (tzeVarL0.getLong(0) == 0) {
                    z = true;
                }
            }
            csg.o(tzeVarL0, null);
            cl6 cl6Var = this.d;
            cl6Var.a(lzeVar);
            if (!z) {
                jf jfVarG = cl6Var.g(lzeVar);
                if (!jfVarG.b) {
                    sz6.k("Pre-packaged database has an invalid schema: ", jfVarG.c);
                    return;
                }
            }
            f(lzeVar);
            cl6Var.c(lzeVar);
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((ave) it.next()).getClass();
                if (lzeVar instanceof zyg) {
                    ((zyg) lzeVar).E.getClass();
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.lze r7, int r8, int r9) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yue.d(lze, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.lze r10) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yue.e(lze):void");
    }

    public final void f(lze lzeVar) {
        u00.r(lzeVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        u00.r(lzeVar, wsk.g((String) this.d.b));
    }

    public yue(ji5 ji5Var, u9e u9eVar, sm smVar) {
        this.c = ji5Var;
        this.d = new wue();
        List list = ji5Var.e;
        lm6 lm6Var = lm6.E;
        this.e = list == null ? lm6Var : list;
        w44.b1(list == null ? lm6Var : list, new xue(new d6d(10, this)));
        Context context = ji5Var.a;
        aoa aoaVar = ji5Var.d;
        Executor executor = ji5Var.h;
        Executor executor2 = ji5Var.i;
        List list2 = ji5Var.m;
        List list3 = ji5Var.n;
        context.getClass();
        aoaVar.getClass();
        executor.getClass();
        executor2.getClass();
        list2.getClass();
        list3.getClass();
        throw new NotImplementedError(0);
    }
}
