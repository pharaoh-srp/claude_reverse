package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class sze implements Closeable {
    public static final en6 J = new en6("proto");
    public final i7f E;
    public final wp3 F;
    public final wp3 G;
    public final p81 H;
    public final ivd I;

    public sze(wp3 wp3Var, wp3 wp3Var2, p81 p81Var, i7f i7fVar, ivd ivdVar) {
        this.E = i7fVar;
        this.F = wp3Var;
        this.G = wp3Var2;
        this.H = p81Var;
        this.I = ivdVar;
    }

    public static Long d(SQLiteDatabase sQLiteDatabase, g91 g91Var) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(g91Var.a, String.valueOf(bgd.a(g91Var.c))));
        byte[] bArr = g91Var.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String n(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((y81) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object x(Cursor cursor, qze qzeVar) {
        try {
            return qzeVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase c() {
        i7f i7fVar = this.E;
        Objects.requireNonNull(i7fVar);
        wp3 wp3Var = this.G;
        long jA = wp3Var.a();
        while (true) {
            try {
                return i7fVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (wp3Var.a() >= ((long) this.H.c) + jA) {
                    throw new SynchronizationException("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.E.close();
    }

    public final Object e(qze qzeVar) {
        SQLiteDatabase sQLiteDatabaseC = c();
        sQLiteDatabaseC.beginTransaction();
        try {
            Object objApply = qzeVar.apply(sQLiteDatabaseC);
            sQLiteDatabaseC.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseC.endTransaction();
        }
    }

    public final ArrayList f(SQLiteDatabase sQLiteDatabase, g91 g91Var, int i) {
        ArrayList arrayList = new ArrayList();
        Long lD = d(sQLiteDatabase, g91Var);
        if (lD == null) {
            return arrayList;
        }
        x(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lD.toString()}, null, null, null, String.valueOf(i)), new et5(this, arrayList, g91Var));
        return arrayList;
    }

    public final void i(long j, nfa nfaVar, String str) {
        e(new oze(j, str, nfaVar));
    }

    public final Object j(t0h t0hVar) {
        SQLiteDatabase sQLiteDatabaseC = c();
        wp3 wp3Var = this.G;
        long jA = wp3Var.a();
        while (true) {
            try {
                sQLiteDatabaseC.beginTransaction();
                try {
                    Object objExecute = t0hVar.execute();
                    sQLiteDatabaseC.setTransactionSuccessful();
                    return objExecute;
                } finally {
                    sQLiteDatabaseC.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (wp3Var.a() >= ((long) this.H.c) + jA) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
