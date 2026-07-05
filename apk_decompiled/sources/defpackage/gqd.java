package defpackage;

import com.anthropic.claude.api.project.ProjectDoc;
import com.anthropic.claude.api.tasks.TaskResponse;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.FileId;
import com.anthropic.claude.types.strings.ProjectDocId;
import com.anthropic.claude.types.strings.ProjectId;
import com.anthropic.claude.types.strings.TaskId;

/* JADX INFO: loaded from: classes3.dex */
public final class gqd implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;

    public /* synthetic */ gqd(String str, int i) {
        this.E = i;
        this.F = str;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        String str = this.F;
        switch (i) {
            case 0:
                ProjectDoc projectDoc = (ProjectDoc) obj2;
                ((ProjectDocId) obj).m1078unboximpl().getClass();
                projectDoc.getClass();
                return Boolean.valueOf(ProjectId.m1082equalsimpl0(projectDoc.m413getProject_uuid5pmjbU(), str));
            case 1:
                wld wldVar = (wld) obj2;
                ((FileId) obj).m1020unboximpl().getClass();
                wldVar.getClass();
                return Boolean.valueOf(ProjectId.m1082equalsimpl0(wldVar.a, str));
            default:
                TaskResponse taskResponse = (TaskResponse) obj2;
                ((TaskId) obj).m1134unboximpl().getClass();
                taskResponse.getClass();
                return Boolean.valueOf(ChatId.m981equalsimpl0(taskResponse.m449getConversation_uuidRjYBDck(), str));
        }
    }
}
