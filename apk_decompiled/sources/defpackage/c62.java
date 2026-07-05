package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c62 extends xn5 {
    public final /* synthetic */ int f;

    public /* synthetic */ c62(int i) {
        this.f = i;
    }

    @Override // defpackage.xn5
    public final void U(tze tzeVar, Object obj) {
        switch (this.f) {
            case 0:
                b62 b62Var = (b62) obj;
                tzeVar.getClass();
                b62Var.getClass();
                tzeVar.N(1, b62Var.c());
                tzeVar.N(2, b62Var.a());
                tzeVar.N(3, b62Var.b());
                break;
            case 1:
                jz5 jz5Var = (jz5) obj;
                tzeVar.getClass();
                jz5Var.getClass();
                tzeVar.N(1, jz5Var.a);
                tzeVar.N(2, jz5Var.b);
                break;
            case 2:
                igj igjVar = (igj) obj;
                tzeVar.getClass();
                igjVar.getClass();
                tzeVar.N(1, igjVar.a);
                tzeVar.N(2, igjVar.b);
                break;
            default:
                bhj bhjVar = (bhj) obj;
                tzeVar.getClass();
                bhjVar.getClass();
                tzeVar.N(1, bhjVar.a);
                tzeVar.N(2, bhjVar.b);
                break;
        }
    }

    @Override // defpackage.xn5
    public final String X() {
        switch (this.f) {
            case 0:
                return "INSERT INTO `cachedMessages` (`uuid`,`conversation_uuid`,`message_json`) VALUES (?,?,?)";
            case 1:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 2:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }
}
