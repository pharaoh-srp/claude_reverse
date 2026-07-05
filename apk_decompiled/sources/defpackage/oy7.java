package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class oy7 implements Closeable {
    public static final String[] F = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] G = new String[0];
    public static final kw9 H;
    public static final kw9 I;
    public final SQLiteDatabase E;

    static {
        jd7 jd7Var = new jd7(10);
        w1a w1aVar = w1a.F;
        H = yb5.w(w1aVar, jd7Var);
        I = yb5.w(w1aVar, new jd7(11));
    }

    public oy7(SQLiteDatabase sQLiteDatabase) {
        this.E = sQLiteDatabase;
    }

    public final void c() {
        this.E.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.E.close();
    }

    public final void d() {
        this.E.beginTransactionNonExclusive();
    }

    public final ty7 e(String str) {
        str.getClass();
        SQLiteStatement sQLiteStatementCompileStatement = this.E.compileStatement(str);
        sQLiteStatementCompileStatement.getClass();
        return new ty7(sQLiteStatementCompileStatement);
    }

    public final void f() {
        this.E.endTransaction();
    }

    public final void i(String str) {
        this.E.execSQL(str);
    }

    public final boolean isOpen() {
        return this.E.isOpen();
    }

    public final void j(Object[] objArr) {
        this.E.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    public final void n() {
        this.E.setTransactionSuccessful();
    }

    public final boolean s0() {
        return this.E.inTransaction();
    }
}
