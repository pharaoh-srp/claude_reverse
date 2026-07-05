package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yki implements t0h {
    public final /* synthetic */ int E;
    public final /* synthetic */ sze F;

    public /* synthetic */ yki(sze szeVar, int i) {
        this.E = i;
        this.F = szeVar;
    }

    @Override // defpackage.t0h
    public final Object execute() {
        SQLiteDatabase sQLiteDatabaseC;
        int i = this.E;
        sze szeVar = this.F;
        boolean z = false;
        switch (i) {
            case 0:
                szeVar.getClass();
                int i2 = bp3.e;
                int i3 = 7;
                c61 c61Var = new c61(i3, z);
                c61Var.F = null;
                c61Var.G = new ArrayList();
                c61Var.H = null;
                c61Var.I = "";
                HashMap map = new HashMap();
                sQLiteDatabaseC = szeVar.c();
                sQLiteDatabaseC.beginTransaction();
                try {
                    bp3 bp3Var = (bp3) sze.x(sQLiteDatabaseC.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new et5(szeVar, map, c61Var, i3));
                    sQLiteDatabaseC.setTransactionSuccessful();
                    return bp3Var;
                } finally {
                }
            default:
                long jA = szeVar.F.a() - szeVar.H.d;
                sQLiteDatabaseC = szeVar.c();
                sQLiteDatabaseC.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jA)};
                    Cursor cursorRawQuery = sQLiteDatabaseC.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            szeVar.i(cursorRawQuery.getInt(0), nfa.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseC.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseC.setTransactionSuccessful();
                    sQLiteDatabaseC.endTransaction();
                    return Integer.valueOf(iDelete);
                } finally {
                }
        }
    }
}
