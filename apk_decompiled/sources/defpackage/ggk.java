package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class ggk extends yak {
    public final ftj G;
    public boolean H;

    public ggk(umk umkVar) {
        super(umkVar);
        this.G = new ftj(this, ((umk) this.E).E);
    }

    public static long R0(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return -1L;
            }
            long j = cursorQuery.getLong(0);
            cursorQuery.close();
            return j;
        } finally {
        }
    }

    @Override // defpackage.yak
    public final boolean Q0() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean S0(byte[] r18, int r19) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ggk.S0(byte[], int):boolean");
    }

    public final void T0() {
        int iDelete;
        K0();
        try {
            SQLiteDatabase sQLiteDatabaseV0 = V0();
            if (sQLiteDatabaseV0 == null || (iDelete = sQLiteDatabaseV0.delete("messages", null, null)) <= 0) {
                return;
            }
            b0().R.c("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e) {
            b0().J.c("Error resetting local analytics data. error", e);
        }
    }

    public final boolean U0() {
        K0();
        if (!this.H && ((umk) this.E).E.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i = 5;
            for (int i2 = 0; i2 < 5; i2++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabaseV0 = V0();
                            if (sQLiteDatabaseV0 != null) {
                                sQLiteDatabaseV0.beginTransaction();
                                sQLiteDatabaseV0.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                                sQLiteDatabaseV0.setTransactionSuccessful();
                                sQLiteDatabaseV0.endTransaction();
                                sQLiteDatabaseV0.close();
                                return true;
                            }
                            this.H = true;
                            if (sQLiteDatabaseV0 != null) {
                                sQLiteDatabaseV0.close();
                            }
                        } catch (SQLiteException e) {
                            if (0 != 0) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th) {
                                    if (0 != 0) {
                                        sQLiteDatabase.close();
                                    }
                                    throw th;
                                }
                            }
                            b0().J.c("Error deleting app launch break from local database", e);
                            this.H = true;
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                        }
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i);
                        i += 20;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteFullException e2) {
                    b0().J.c("Error deleting app launch break from local database", e2);
                    this.H = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            b0().M.b("Error deleting app launch break from local database in reasonable time");
            return false;
        }
        return false;
    }

    public final SQLiteDatabase V0() {
        if (this.H) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.G.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.H = true;
        return null;
    }
}
