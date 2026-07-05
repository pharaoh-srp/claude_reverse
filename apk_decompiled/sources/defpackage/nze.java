package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nze implements qze {
    public final /* synthetic */ long E;
    public final /* synthetic */ g91 F;

    public /* synthetic */ nze(long j, g91 g91Var) {
        this.E = j;
        this.F = g91Var;
    }

    @Override // defpackage.qze
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.E));
        g91 g91Var = this.F;
        String str = g91Var.a;
        agd agdVar = g91Var.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(bgd.a(agdVar))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(bgd.a(agdVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
