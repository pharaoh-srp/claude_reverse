package androidx.sqlite.db.framework;

import defpackage.mdj;
import defpackage.qy7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"androidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackException", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
final class FrameworkSQLiteOpenHelper$OpenHelper$CallbackException extends RuntimeException {
    public final qy7 E;
    public final Throwable F;

    public FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(qy7 qy7Var, Throwable th) {
        super(th);
        this.E = qy7Var;
        this.F = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.F;
    }
}
