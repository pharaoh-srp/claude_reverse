package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class btj {
    public static vwi a(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("name").m();
            String strM2 = qh9Var.s("version").m();
            bh9 bh9VarS = qh9Var.s("build");
            String strM3 = bh9VarS != null ? bh9VarS.m() : null;
            String strM4 = qh9Var.s("version_major").m();
            strM.getClass();
            strM2.getClass();
            strM4.getClass();
            return new vwi(strM, strM2, strM3, strM4);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Os", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Os", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Os", e3);
            return null;
        }
    }

    public static HashSet b(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
            return hashSet;
        } finally {
            cursorRawQuery.close();
        }
    }

    public static void c(qgk qgkVar, SQLiteDatabase sQLiteDatabase) {
        ygk ygkVar = qgkVar.M;
        String path = sQLiteDatabase.getPath();
        int i = uzj.c;
        File file = new File(path);
        if (!file.setReadable(false, false)) {
            ygkVar.b("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            ygkVar.b("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            ygkVar.b("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        ygkVar.b("Failed to turn on database write permission for owner");
    }

    public static void d(qgk qgkVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        boolean zMoveToFirst;
        ygk ygkVar = qgkVar.M;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                zMoveToFirst = cursorQuery.moveToFirst();
                cursorQuery.close();
            } catch (SQLiteException e) {
                ygkVar.a(str, e, "Error querying for table");
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                zMoveToFirst = false;
            }
            if (!zMoveToFirst) {
                sQLiteDatabase.execSQL(str2);
            }
            try {
                HashSet hashSetB = b(sQLiteDatabase, str);
                for (String str4 : str3.split(",")) {
                    if (!hashSetB.remove(str4)) {
                        throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                    }
                }
                if (strArr != null) {
                    for (int i = 0; i < strArr.length; i += 2) {
                        if (!hashSetB.remove(strArr[i])) {
                            sQLiteDatabase.execSQL(strArr[i + 1]);
                        }
                    }
                }
                if (hashSetB.isEmpty()) {
                    return;
                }
                ygkVar.a(str, TextUtils.join(", ", hashSetB), "Table has extra columns. table, columns");
            } catch (SQLiteException e2) {
                qgkVar.J.c("Failed to verify columns on table that was just created", str);
                throw e2;
            }
        } finally {
        }
    }
}
