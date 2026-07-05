package defpackage;

import com.anthropic.claude.analytics.events.ProjectsEvents$ProjectUploadSource;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.project.knowledge.DeleteProjectDocAlertDialogParams;
import com.anthropic.claude.project.knowledge.DeleteProjectFileAlertDialogParams;
import com.anthropic.claude.types.strings.FileId;

/* JADX INFO: loaded from: classes3.dex */
public final class ky5 extends rq5 {
    public final qy5 e;
    public final wqd f;

    public ky5(qy5 qy5Var, wqd wqdVar, h86 h86Var) {
        super(h86Var);
        this.e = qy5Var;
        this.f = wqdVar;
    }

    @Override // defpackage.rq5
    public final Object O(tp4 tp4Var) {
        qy5 qy5Var = this.e;
        boolean z = qy5Var instanceof DeleteProjectDocAlertDialogParams;
        m45 m45Var = m45.E;
        wqd wqdVar = this.f;
        if (z) {
            DeleteProjectDocAlertDialogParams deleteProjectDocAlertDialogParams = (DeleteProjectDocAlertDialogParams) qy5Var;
            Object objE = wqdVar.e(deleteProjectDocAlertDialogParams.m799getProjectId5pmjbU(), deleteProjectDocAlertDialogParams.m798getDocIdH8pzoGc(), ProjectsEvents$ProjectUploadSource.PROJECT_KNOWLEDGE_UPLOAD, (vp4) tp4Var);
            return objE == m45Var ? objE : (ApiResult) objE;
        }
        if (!(qy5Var instanceof DeleteProjectFileAlertDialogParams)) {
            wg6.i();
            return null;
        }
        DeleteProjectFileAlertDialogParams deleteProjectFileAlertDialogParams = (DeleteProjectFileAlertDialogParams) qy5Var;
        Object objF = wqdVar.f(deleteProjectFileAlertDialogParams.m805getProjectId5pmjbU(), x44.W(FileId.m1014boximpl(deleteProjectFileAlertDialogParams.m804getFileIdExWXDbg())), ProjectsEvents$ProjectUploadSource.PROJECT_KNOWLEDGE_UPLOAD, (vp4) tp4Var);
        return objF == m45Var ? objF : (ApiResult) objF;
    }
}
