package defpackage;

import kotlin.NotImplementedError;

/* JADX INFO: loaded from: classes.dex */
public abstract class ekb {
    public final int a;
    public final int b;

    public ekb(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void a(oy7 oy7Var) {
        oy7Var.getClass();
        throw new NotImplementedError("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }

    public void b(lze lzeVar) {
        lzeVar.getClass();
        if (!(lzeVar instanceof zyg)) {
            throw new NotImplementedError("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        a(((zyg) lzeVar).E);
    }
}
