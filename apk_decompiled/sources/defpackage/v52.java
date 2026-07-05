package defpackage;

import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class v52 extends sf5 {
    public final /* synthetic */ int g;

    public /* synthetic */ v52(int i, Object obj) {
        this.g = i;
    }

    @Override // defpackage.sf5
    public final void j(tze tzeVar, Object obj) {
        switch (this.g) {
            case 0:
                s52 s52Var = (s52) obj;
                tzeVar.getClass();
                s52Var.getClass();
                String str = s52Var.a;
                tzeVar.N(1, str);
                Date date = s52Var.b;
                date.getClass();
                tzeVar.o(2, date.getTime());
                tzeVar.N(3, s52Var.c);
                tzeVar.N(4, str);
                break;
            case 1:
                g62 g62Var = (g62) obj;
                tzeVar.getClass();
                g62Var.getClass();
                tzeVar.N(1, g62Var.c());
                Date dateB = g62Var.b();
                dateB.getClass();
                tzeVar.o(2, dateB.getTime());
                tzeVar.N(3, g62Var.a());
                tzeVar.N(4, g62Var.c());
                break;
            case 2:
                at2 at2Var = (at2) obj;
                tzeVar.getClass();
                at2Var.getClass();
                ft2 ft2Var = at2Var.a;
                tzeVar.N(1, vz8.F(ft2Var));
                String str2 = at2Var.b;
                tzeVar.N(2, str2);
                tzeVar.N(3, vz8.F(ft2Var));
                tzeVar.N(4, str2);
                break;
            default:
                jmd jmdVar = (jmd) obj;
                tzeVar.getClass();
                jmdVar.getClass();
                tzeVar.N(1, imd.a(jmdVar.b()));
                tzeVar.N(2, jmdVar.a());
                tzeVar.N(3, imd.a(jmdVar.b()));
                tzeVar.N(4, jmdVar.a());
                break;
        }
    }

    @Override // defpackage.sf5
    public final String w() {
        switch (this.g) {
            case 0:
                return "UPDATE `cachedConversations` SET `uuid` = ?,`updated_at` = ?,`conversation_json` = ? WHERE `uuid` = ?";
            case 1:
                return "UPDATE `cachedProjects` SET `uuid` = ?,`updated_at` = ?,`project_json` = ? WHERE `uuid` = ?";
            case 2:
                return "UPDATE `chatIdListEntries` SET `source` = ?,`chat_uuid` = ? WHERE `source` = ? AND `chat_uuid` = ?";
            default:
                return "UPDATE `projectIdListEntries` SET `source` = ?,`project_uuid` = ? WHERE `source` = ? AND `project_uuid` = ?";
        }
    }
}
