package androidx.sqlite.db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import androidx.sqlite.db.framework.a;
import defpackage.g11;
import defpackage.mhd;
import defpackage.mr9;
import defpackage.oy7;
import defpackage.qy7;
import defpackage.tk5;
import defpackage.vb7;
import defpackage.yue;
import defpackage.zyg;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a extends SQLiteOpenHelper {
    public static final /* synthetic */ int L = 0;
    public final Context E;
    public final tk5 F;
    public final g11 G;
    public final boolean H;
    public boolean I;
    public final mhd J;
    public boolean K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, String str, final tk5 tk5Var, final g11 g11Var, boolean z) {
        super(context, str, null, g11Var.F, new DatabaseErrorHandler() { // from class: py7
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = a.L;
                sQLiteDatabase.getClass();
                tk5 tk5Var2 = tk5Var;
                oy7 oy7Var = (oy7) tk5Var2.F;
                if (oy7Var == null || !oy7Var.E.equals(sQLiteDatabase)) {
                    oy7Var = new oy7(sQLiteDatabase);
                    tk5Var2.F = oy7Var;
                }
                SQLiteDatabase sQLiteDatabase2 = oy7Var.E;
                g11Var.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + oy7Var + ".path");
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        g11.k(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                obj.getClass();
                                g11.k((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                g11.k(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    oy7Var.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            }
        });
        context.getClass();
        g11Var.getClass();
        this.E = context;
        this.F = tk5Var;
        this.G = g11Var;
        this.H = z;
        this.J = new mhd(str == null ? vb7.i() : str, context.getCacheDir(), false);
    }

    public final oy7 c(boolean z) {
        mhd mhdVar = this.J;
        try {
            mhdVar.a((this.K || getDatabaseName() == null) ? false : true);
            this.I = false;
            SQLiteDatabase sQLiteDatabaseE = e(z);
            if (!this.I) {
                oy7 oy7VarD = d(sQLiteDatabaseE);
                mhdVar.b();
                return oy7VarD;
            }
            close();
            oy7 oy7VarC = c(z);
            mhdVar.b();
            return oy7VarC;
        } catch (Throwable th) {
            mhdVar.b();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        mhd mhdVar = this.J;
        try {
            mhdVar.a(mhdVar.a);
            super.close();
            this.F.F = null;
            this.K = false;
        } finally {
            mhdVar.b();
        }
    }

    public final oy7 d(SQLiteDatabase sQLiteDatabase) {
        tk5 tk5Var = this.F;
        tk5Var.getClass();
        oy7 oy7Var = (oy7) tk5Var.F;
        if (oy7Var != null && oy7Var.E.equals(sQLiteDatabase)) {
            return oy7Var;
        }
        oy7 oy7Var2 = new oy7(sQLiteDatabase);
        tk5Var.F = oy7Var2;
        return oy7Var2;
    }

    public final SQLiteDatabase e(boolean z) throws Throwable {
        SQLiteDatabase readableDatabase;
        SQLiteDatabase readableDatabase2;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.K;
        Context context = this.E;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.getClass();
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase3 = getReadableDatabase();
            readableDatabase3.getClass();
            return readableDatabase3;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z) {
                    readableDatabase2 = getWritableDatabase();
                    readableDatabase2.getClass();
                } else {
                    readableDatabase2 = getReadableDatabase();
                    readableDatabase2.getClass();
                }
                return readableDatabase2;
            } catch (Throwable th) {
                th = th;
                if (th instanceof FrameworkSQLiteOpenHelper$OpenHelper$CallbackException) {
                    FrameworkSQLiteOpenHelper$OpenHelper$CallbackException frameworkSQLiteOpenHelper$OpenHelper$CallbackException = (FrameworkSQLiteOpenHelper$OpenHelper$CallbackException) th;
                    int iOrdinal = frameworkSQLiteOpenHelper$OpenHelper$CallbackException.E.ordinal();
                    th = frameworkSQLiteOpenHelper$OpenHelper$CallbackException.F;
                    if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        throw th;
                    }
                    if (iOrdinal != 4) {
                        mr9.b();
                        return null;
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.H) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    if (z) {
                        readableDatabase = getWritableDatabase();
                        readableDatabase.getClass();
                    } else {
                        readableDatabase = getReadableDatabase();
                        readableDatabase.getClass();
                    }
                    return readableDatabase;
                } catch (FrameworkSQLiteOpenHelper$OpenHelper$CallbackException e) {
                    throw e.F;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z = this.I;
        g11 g11Var = this.G;
        if (!z && g11Var.F != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            d(sQLiteDatabase);
            g11Var.getClass();
        } catch (Throwable th) {
            throw new FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(qy7.E, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            ((yue) this.G.G).c(new zyg(d(sQLiteDatabase)));
        } catch (Throwable th) {
            throw new FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(qy7.F, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.I = true;
        try {
            this.G.o(d(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(qy7.H, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.I) {
            try {
                g11 g11Var = this.G;
                oy7 oy7VarD = d(sQLiteDatabase);
                yue yueVar = (yue) g11Var.G;
                yueVar.e(new zyg(oy7VarD));
                yueVar.h = oy7VarD;
            } catch (Throwable th) {
                throw new FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(qy7.I, th);
            }
        }
        this.K = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.I = true;
        try {
            this.G.o(d(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(qy7.G, th);
        }
    }
}
