package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tw5 implements bx5, t0h {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ long G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ tw5(wk wkVar, Iterable iterable, g91 g91Var, long j) {
        this.E = 2;
        this.F = wkVar;
        this.I = iterable;
        this.H = g91Var;
        this.G = j;
    }

    @Override // defpackage.bx5
    public ScheduledFuture a(ax5 ax5Var) {
        int i = this.E;
        Object obj = this.H;
        long j = this.G;
        Object obj2 = this.I;
        zw5 zw5Var = (zw5) this.F;
        switch (i) {
            case 0:
                return zw5Var.F.schedule(new ww5(zw5Var, (Runnable) obj2, ax5Var, 1), j, (TimeUnit) obj);
            default:
                return zw5Var.F.schedule(new xw5(zw5Var, (Callable) obj2, ax5Var, 0), j, (TimeUnit) obj);
        }
    }

    @Override // defpackage.t0h
    public Object execute() {
        wk wkVar = (wk) this.F;
        Iterable iterable = (Iterable) this.I;
        g91 g91Var = (g91) this.H;
        sze szeVar = (sze) wkVar.a;
        szeVar.getClass();
        if (iterable.iterator().hasNext()) {
            String strConcat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(sze.n(iterable));
            SQLiteDatabase sQLiteDatabaseC = szeVar.c();
            sQLiteDatabaseC.beginTransaction();
            try {
                sQLiteDatabaseC.compileStatement(strConcat).execute();
                Cursor cursorRawQuery = sQLiteDatabaseC.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        szeVar.i(cursorRawQuery.getInt(0), nfa.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseC.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseC.setTransactionSuccessful();
            } finally {
                sQLiteDatabaseC.endTransaction();
            }
        }
        szeVar.e(new nze(((wp3) wkVar.b).a() + this.G, g91Var));
        return null;
    }

    public /* synthetic */ tw5(zw5 zw5Var, Object obj, long j, TimeUnit timeUnit, int i) {
        this.E = i;
        this.F = zw5Var;
        this.I = obj;
        this.G = j;
        this.H = timeUnit;
    }
}
