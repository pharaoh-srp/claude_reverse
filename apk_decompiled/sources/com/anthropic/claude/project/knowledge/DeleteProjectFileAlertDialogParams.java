package com.anthropic.claude.project.knowledge;

import com.anthropic.claude.types.strings.FileId;
import com.anthropic.claude.types.strings.ProjectId;
import defpackage.emd;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.ny5;
import defpackage.oi7;
import defpackage.onf;
import defpackage.oy5;
import defpackage.qy5;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J$\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b)\u0010\u0017¨\u0006-"}, d2 = {"Lcom/anthropic/claude/project/knowledge/DeleteProjectFileAlertDialogParams;", "Lqy5;", "Lcom/anthropic/claude/types/strings/ProjectId;", "projectId", "Lcom/anthropic/claude/types/strings/FileId;", "fileId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$project", "(Lcom/anthropic/claude/project/knowledge/DeleteProjectFileAlertDialogParams;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-5pmjb-U", "()Ljava/lang/String;", "component1", "component2-ExWXDbg", "component2", "copy-MhG-ZLk", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/project/knowledge/DeleteProjectFileAlertDialogParams;", "copy", "", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProjectId-5pmjb-U", "getFileId-ExWXDbg", "Companion", "ny5", "oy5", "project"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class DeleteProjectFileAlertDialogParams implements qy5 {
    public static final int $stable = 0;
    public static final oy5 Companion = new oy5();
    private final String fileId;
    private final String projectId;

    private /* synthetic */ DeleteProjectFileAlertDialogParams(int i, String str, String str2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, ny5.a.getDescriptor());
            throw null;
        }
        this.projectId = str;
        this.fileId = str2;
    }

    /* JADX INFO: renamed from: copy-MhG-ZLk$default, reason: not valid java name */
    public static /* synthetic */ DeleteProjectFileAlertDialogParams m800copyMhGZLk$default(DeleteProjectFileAlertDialogParams deleteProjectFileAlertDialogParams, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deleteProjectFileAlertDialogParams.projectId;
        }
        if ((i & 2) != 0) {
            str2 = deleteProjectFileAlertDialogParams.fileId;
        }
        return deleteProjectFileAlertDialogParams.m803copyMhGZLk(str, str2);
    }

    public static final /* synthetic */ void write$Self$project(DeleteProjectFileAlertDialogParams self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, emd.a, ProjectId.m1079boximpl(self.projectId));
        output.r(serialDesc, 1, oi7.a, FileId.m1014boximpl(self.fileId));
    }

    /* JADX INFO: renamed from: component1-5pmjb-U, reason: not valid java name and from getter */
    public final String getProjectId() {
        return this.projectId;
    }

    /* JADX INFO: renamed from: component2-ExWXDbg, reason: not valid java name and from getter */
    public final String getFileId() {
        return this.fileId;
    }

    /* JADX INFO: renamed from: copy-MhG-ZLk, reason: not valid java name */
    public final DeleteProjectFileAlertDialogParams m803copyMhGZLk(String projectId, String fileId) {
        projectId.getClass();
        fileId.getClass();
        return new DeleteProjectFileAlertDialogParams(projectId, fileId, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteProjectFileAlertDialogParams)) {
            return false;
        }
        DeleteProjectFileAlertDialogParams deleteProjectFileAlertDialogParams = (DeleteProjectFileAlertDialogParams) other;
        return ProjectId.m1082equalsimpl0(this.projectId, deleteProjectFileAlertDialogParams.projectId) && FileId.m1017equalsimpl0(this.fileId, deleteProjectFileAlertDialogParams.fileId);
    }

    /* JADX INFO: renamed from: getFileId-ExWXDbg, reason: not valid java name */
    public final String m804getFileIdExWXDbg() {
        return this.fileId;
    }

    /* JADX INFO: renamed from: getProjectId-5pmjb-U, reason: not valid java name */
    public final String m805getProjectId5pmjbU() {
        return this.projectId;
    }

    public int hashCode() {
        return FileId.m1018hashCodeimpl(this.fileId) + (ProjectId.m1083hashCodeimpl(this.projectId) * 31);
    }

    public String toString() {
        return ij0.l("DeleteProjectFileAlertDialogParams(projectId=", ProjectId.m1084toStringimpl(this.projectId), ", fileId=", FileId.m1019toStringimpl(this.fileId), ")");
    }

    public /* synthetic */ DeleteProjectFileAlertDialogParams(String str, String str2, mq5 mq5Var) {
        this(str, str2);
    }

    public /* synthetic */ DeleteProjectFileAlertDialogParams(int i, String str, String str2, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, vnfVar);
    }

    private DeleteProjectFileAlertDialogParams(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.projectId = str;
        this.fileId = str2;
    }
}
