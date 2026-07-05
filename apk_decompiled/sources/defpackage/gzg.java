package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class gzg extends hzg {
    public int[] H;
    public long[] I;
    public double[] J;
    public String[] K;
    public byte[][] L;
    public Cursor M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzg(oy7 oy7Var, String str) {
        super(oy7Var, str);
        oy7Var.getClass();
        str.getClass();
        this.H = new int[0];
        this.I = new long[0];
        this.J = new double[0];
        this.K = new String[0];
        this.L = new byte[0][];
    }

    public static void f(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            u00.N(25, "column index out of range");
            throw null;
        }
    }

    @Override // defpackage.tze
    public final boolean H0() {
        c();
        e();
        Cursor cursor = this.M;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        sz6.j("Required value was null.");
        return false;
    }

    @Override // defpackage.tze
    public final void N(int i, String str) {
        str.getClass();
        c();
        d(3, i);
        this.H[i] = 3;
        this.K[i] = str;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.G) {
            r();
            reset();
        }
        this.G = true;
    }

    public final void d(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.H;
        if (iArr.length < i3) {
            this.H = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.I;
            if (jArr.length < i3) {
                this.I = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.J;
            if (dArr.length < i3) {
                this.J = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.K;
            if (strArr.length < i3) {
                this.K = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.L;
        if (bArr.length < i3) {
            this.L = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }

    public final void e() {
        if (this.M == null) {
            efe efeVar = new efe(29, this);
            oy7 oy7Var = this.E;
            oy7Var.getClass();
            final a40 a40Var = new a40(1, efeVar);
            Cursor cursorRawQueryWithFactory = oy7Var.E.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: ny7
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    return (Cursor) a40Var.i(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                }
            }, ((gzg) efeVar.F).F, oy7.G, null);
            cursorRawQueryWithFactory.getClass();
            this.M = cursorRawQueryWithFactory;
        }
    }

    @Override // defpackage.tze
    public final String g0(int i) {
        c();
        Cursor cursorI = i();
        f(cursorI, i);
        String string = cursorI.getString(i);
        string.getClass();
        return string;
    }

    @Override // defpackage.tze
    public final byte[] getBlob(int i) {
        c();
        Cursor cursorI = i();
        f(cursorI, i);
        byte[] blob = cursorI.getBlob(i);
        blob.getClass();
        return blob;
    }

    @Override // defpackage.tze
    public final int getColumnCount() {
        c();
        e();
        Cursor cursor = this.M;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.tze
    public final String getColumnName(int i) {
        c();
        e();
        Cursor cursor = this.M;
        if (cursor == null) {
            sz6.j("Required value was null.");
            return null;
        }
        f(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // defpackage.tze
    public final long getLong(int i) {
        c();
        Cursor cursorI = i();
        f(cursorI, i);
        return cursorI.getLong(i);
    }

    public final Cursor i() {
        Cursor cursor = this.M;
        if (cursor != null) {
            return cursor;
        }
        u00.N(21, "no row");
        throw null;
    }

    @Override // defpackage.tze
    public final boolean isNull(int i) {
        c();
        Cursor cursorI = i();
        f(cursorI, i);
        return cursorI.isNull(i);
    }

    @Override // defpackage.tze
    public final void o(int i, long j) {
        c();
        d(1, i);
        this.H[i] = 1;
        this.I[i] = j;
    }

    @Override // defpackage.tze
    public final void p(byte[] bArr, int i) {
        c();
        d(4, i);
        this.H[i] = 4;
        this.L[i] = bArr;
    }

    @Override // defpackage.tze
    public final void q(int i) {
        c();
        d(5, i);
        this.H[i] = 5;
    }

    @Override // defpackage.hzg, defpackage.tze
    public final void r() {
        c();
        this.H = new int[0];
        this.I = new long[0];
        this.J = new double[0];
        this.K = new String[0];
        this.L = new byte[0][];
    }

    @Override // defpackage.hzg, defpackage.tze
    public final void reset() {
        c();
        Cursor cursor = this.M;
        if (cursor != null) {
            cursor.close();
        }
        this.M = null;
    }
}
