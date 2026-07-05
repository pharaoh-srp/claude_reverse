package defpackage;

import android.database.Cursor;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d61 implements hba, qze {
    public final /* synthetic */ long E;

    public /* synthetic */ d61(long j) {
        this.E = j;
    }

    @Override // defpackage.qze
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        cursor.moveToNext();
        return new fqh(cursor.getLong(0), this.E);
    }

    @Override // defpackage.hba
    public void invoke(Object obj) {
        ax5 ax5Var;
        sp5 sp5Var = (sp5) obj;
        vp5 vp5Var = sp5Var.b;
        if (sp5Var == vp5Var.j && (ax5Var = vp5Var.n) != null) {
            e6b e6bVar = (e6b) ax5Var.F;
            e6bVar.x1 = true;
            i49 i49Var = e6bVar.m1;
            Handler handler = (Handler) i49Var.F;
            if (handler != null) {
                handler.post(new n51(i49Var, this.E));
            }
        }
    }
}
