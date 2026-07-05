package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oze implements qze, t0h {
    public final /* synthetic */ long E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ oze(long j, Object obj, Object obj2) {
        this.F = obj;
        this.G = obj2;
        this.E = j;
    }

    @Override // defpackage.qze
    public Object apply(Object obj) {
        String str = (String) this.F;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((nfa) this.G).E;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            boolean z = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.E;
            if (z) {
                sQLiteDatabase.execSQL(grc.q(j, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // defpackage.t0h
    public Object execute() {
        wk wkVar = (wk) this.F;
        g91 g91Var = (g91) this.G;
        sze szeVar = (sze) wkVar.a;
        long jA = ((wp3) wkVar.b).a() + this.E;
        szeVar.getClass();
        szeVar.e(new nze(jA, g91Var));
        return null;
    }
}
