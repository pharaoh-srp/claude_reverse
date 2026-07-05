package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vn3 extends ave {
    public final a5 a;

    public vn3(a5 a5Var) {
        a5Var.getClass();
        this.a = a5Var;
    }

    @Override // defpackage.ave
    public final void a(oy7 oy7Var) {
        oy7Var.getClass();
        oy7Var.c();
        try {
            StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
            this.a.getClass();
            sb.append(System.currentTimeMillis() - 86400000);
            sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            oy7Var.i(sb.toString());
            oy7Var.n();
        } finally {
            oy7Var.f();
        }
    }
}
