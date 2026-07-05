package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d62 extends sf5 {
    @Override // defpackage.sf5
    public final void j(tze tzeVar, Object obj) {
        b62 b62Var = (b62) obj;
        tzeVar.getClass();
        b62Var.getClass();
        tzeVar.N(1, b62Var.c());
        tzeVar.N(2, b62Var.a());
        tzeVar.N(3, b62Var.b());
        tzeVar.N(4, b62Var.c());
    }

    @Override // defpackage.sf5
    public final String w() {
        return "UPDATE `cachedMessages` SET `uuid` = ?,`conversation_uuid` = ?,`message_json` = ? WHERE `uuid` = ?";
    }
}
