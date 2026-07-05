package defpackage;

import com.anthropic.claude.api.chat.ChatConversation;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.api.project.ProjectActorAccount;
import com.anthropic.claude.api.project.ProjectSubtype;
import com.anthropic.claude.api.project.ProjectType;
import com.anthropic.claude.project.create.ProjectTemplateId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ald implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ild F;

    public /* synthetic */ ald(ild ildVar, int i) {
        this.E = i;
        this.F = ildVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [tp4] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    @Override // defpackage.zy7
    public final Object a() {
        Project projectC;
        ProjectSubtype projectSubtype;
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = 1;
        projectTemplateId = null;
        ProjectTemplateId projectTemplateId = null;
        ild ildVar = this.F;
        switch (i) {
            case 0:
                break;
            case 1:
                if (ildVar.S() && (projectC = ildVar.g.c(ildVar.b.m789getProjectId5pmjbU())) != null) {
                    String strM404getUuid5pmjbU = projectC.m404getUuid5pmjbU();
                    String name = projectC.getName();
                    String description = projectC.getDescription();
                    ProjectActorAccount creator = projectC.getCreator();
                    ?? full_name = creator != null ? creator.getFull_name() : 0;
                    boolean zIs_private = projectC.is_private();
                    boolean z = okk.z(projectC);
                    boolean zIs_starred = projectC.is_starred();
                    boolean canDelete = projectC.getCanDelete();
                    boolean canEditSettings = projectC.getCanEditSettings();
                    String prompt_template = projectC.getPrompt_template();
                    if (prompt_template == null) {
                        prompt_template = "";
                    }
                    String str = prompt_template;
                    Integer docs_count = projectC.getDocs_count();
                    int iIntValue = docs_count != null ? docs_count.intValue() : 0;
                    Integer files_count = projectC.getFiles_count();
                    break;
                }
                break;
            case 2:
                tkd tkdVar = (tkd) ildVar.t.getValue();
                if (tkdVar != null) {
                    ProjectType projectType = tkdVar.m;
                    if (projectType != null && (projectSubtype = tkdVar.n) != null) {
                        projectTemplateId = new ProjectTemplateId(projectType, projectSubtype);
                    }
                }
                break;
            case 3:
                d8a d8aVarE = x44.E();
                for (ChatConversation chatConversationK : (List) ildVar.v.getValue()) {
                    ChatConversationWithProjectReference chatConversationWithProjectReferenceI = ildVar.e.i(chatConversationK.m176getUuidRjYBDck());
                    if (chatConversationWithProjectReferenceI != null) {
                        chatConversationK = nkk.k(chatConversationWithProjectReferenceI);
                    }
                    d8aVarE.add(chatConversationK);
                }
                if (d8aVarE.size() > 1) {
                    a54.s0(d8aVarE, new g67(19));
                }
                break;
            case 4:
                if (((tkd) ildVar.t.getValue()) != null) {
                    gb9.D(ildVar.a, null, null, new hld(ildVar, !r1.g, , i2), 3);
                }
                break;
            default:
                ildVar.o();
                break;
        }
        return ieiVar;
    }
}
