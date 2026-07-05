package defpackage;

import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.api.chat.tool.ImageGalleryItem;
import com.anthropic.claude.api.chat.tool.ImageGalleryItemId;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.api.project.ProjectDoc;
import com.anthropic.claude.api.tasks.TaskResponse;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.FileId;
import com.anthropic.claude.types.strings.OrganizationId;
import com.anthropic.claude.types.strings.ProjectDocId;
import com.anthropic.claude.types.strings.ProjectId;
import com.anthropic.claude.types.strings.TaskId;

/* JADX INFO: loaded from: classes.dex */
public final class wl0 implements bz7 {
    public static final wl0 F = new wl0(0);
    public static final wl0 G = new wl0(1);
    public static final wl0 H = new wl0(2);
    public static final wl0 I = new wl0(3);
    public static final wl0 J = new wl0(4);
    public static final wl0 K = new wl0(5);
    public static final wl0 L = new wl0(6);
    public static final wl0 M = new wl0(7);
    public static final wl0 N = new wl0(8);
    public static final wl0 O = new wl0(9);
    public static final wl0 P = new wl0(10);
    public static final wl0 Q = new wl0(11);
    public final /* synthetic */ int E;

    public /* synthetic */ wl0(int i) {
        this.E = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        switch (this.E) {
            case 0:
                ((OrganizationId) obj).m1071unboximpl().getClass();
                return new wbb();
            case 1:
                ((OrganizationId) obj).m1071unboximpl().getClass();
                return new qf7();
            case 2:
                ImageGalleryItem imageGalleryItem = (ImageGalleryItem) obj;
                imageGalleryItem.getClass();
                return ImageGalleryItemId.m304boximpl(imageGalleryItem.m303getIdivCCbqw());
            case 3:
                ChatConversationWithProjectReference chatConversationWithProjectReference = (ChatConversationWithProjectReference) obj;
                chatConversationWithProjectReference.getClass();
                return ChatId.m978boximpl(chatConversationWithProjectReference.m209getUuidRjYBDck());
            case 4:
                Project project = (Project) obj;
                project.getClass();
                return ProjectId.m1079boximpl(project.m404getUuid5pmjbU());
            case 5:
                ProjectDoc projectDoc = (ProjectDoc) obj;
                projectDoc.getClass();
                return ProjectDocId.m1072boximpl(projectDoc.m414getUuidH8pzoGc());
            case 6:
                wld wldVar = (wld) obj;
                wldVar.getClass();
                return FileId.m1014boximpl(wldVar.a().mo236getFile_uuidExWXDbg());
            case 7:
                if (x44.r(obj, Boolean.FALSE)) {
                    return new d54(d54.h);
                }
                obj.getClass();
                return new d54(d4c.m(((Integer) obj).intValue()));
            case 8:
                ((bf3) obj).getClass();
                return null;
            case 9:
                ((bf3) obj).getClass();
                return null;
            case 10:
                TaskResponse taskResponse = (TaskResponse) obj;
                taskResponse.getClass();
                return TaskId.m1128boximpl(taskResponse.m450getUuidFxcw9s());
            case 11:
                return null;
            case 12:
                return sxb.d((String) obj);
            default:
                return ((bfa) obj).b.a();
        }
    }
}
