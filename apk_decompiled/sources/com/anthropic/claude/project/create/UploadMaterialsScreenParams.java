package com.anthropic.claude.project.create;

import com.anthropic.claude.types.strings.ProjectId;
import defpackage.cod;
import defpackage.emd;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.rji;
import defpackage.sji;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u001a¨\u0006-"}, d2 = {"Lcom/anthropic/claude/project/create/UploadMaterialsScreenParams;", "", "Lcom/anthropic/claude/types/strings/ProjectId;", "projectId", "Lcom/anthropic/claude/project/create/ProjectTemplateId;", "templateId", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/project/create/ProjectTemplateId;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/project/create/ProjectTemplateId;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$project", "(Lcom/anthropic/claude/project/create/UploadMaterialsScreenParams;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-5pmjb-U", "()Ljava/lang/String;", "component1", "component2", "()Lcom/anthropic/claude/project/create/ProjectTemplateId;", "copy-E9d9s8M", "(Ljava/lang/String;Lcom/anthropic/claude/project/create/ProjectTemplateId;)Lcom/anthropic/claude/project/create/UploadMaterialsScreenParams;", "copy", "", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProjectId-5pmjb-U", "Lcom/anthropic/claude/project/create/ProjectTemplateId;", "getTemplateId", "Companion", "rji", "sji", "project"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class UploadMaterialsScreenParams {
    public static final int $stable = 0;
    public static final sji Companion = new sji();
    private final String projectId;
    private final ProjectTemplateId templateId;

    private /* synthetic */ UploadMaterialsScreenParams(int i, String str, ProjectTemplateId projectTemplateId, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, rji.a.getDescriptor());
            throw null;
        }
        this.projectId = str;
        this.templateId = projectTemplateId;
    }

    /* JADX INFO: renamed from: copy-E9d9s8M$default, reason: not valid java name */
    public static /* synthetic */ UploadMaterialsScreenParams m782copyE9d9s8M$default(UploadMaterialsScreenParams uploadMaterialsScreenParams, String str, ProjectTemplateId projectTemplateId, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uploadMaterialsScreenParams.projectId;
        }
        if ((i & 2) != 0) {
            projectTemplateId = uploadMaterialsScreenParams.templateId;
        }
        return uploadMaterialsScreenParams.m784copyE9d9s8M(str, projectTemplateId);
    }

    public static final /* synthetic */ void write$Self$project(UploadMaterialsScreenParams self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, emd.a, ProjectId.m1079boximpl(self.projectId));
        output.r(serialDesc, 1, cod.a, self.templateId);
    }

    /* JADX INFO: renamed from: component1-5pmjb-U, reason: not valid java name and from getter */
    public final String getProjectId() {
        return this.projectId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ProjectTemplateId getTemplateId() {
        return this.templateId;
    }

    /* JADX INFO: renamed from: copy-E9d9s8M, reason: not valid java name */
    public final UploadMaterialsScreenParams m784copyE9d9s8M(String projectId, ProjectTemplateId templateId) {
        projectId.getClass();
        templateId.getClass();
        return new UploadMaterialsScreenParams(projectId, templateId, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadMaterialsScreenParams)) {
            return false;
        }
        UploadMaterialsScreenParams uploadMaterialsScreenParams = (UploadMaterialsScreenParams) other;
        return ProjectId.m1082equalsimpl0(this.projectId, uploadMaterialsScreenParams.projectId) && x44.r(this.templateId, uploadMaterialsScreenParams.templateId);
    }

    /* JADX INFO: renamed from: getProjectId-5pmjb-U, reason: not valid java name */
    public final String m785getProjectId5pmjbU() {
        return this.projectId;
    }

    public final ProjectTemplateId getTemplateId() {
        return this.templateId;
    }

    public int hashCode() {
        return this.templateId.hashCode() + (ProjectId.m1083hashCodeimpl(this.projectId) * 31);
    }

    public String toString() {
        return "UploadMaterialsScreenParams(projectId=" + ProjectId.m1084toStringimpl(this.projectId) + ", templateId=" + this.templateId + ")";
    }

    public /* synthetic */ UploadMaterialsScreenParams(String str, ProjectTemplateId projectTemplateId, mq5 mq5Var) {
        this(str, projectTemplateId);
    }

    public /* synthetic */ UploadMaterialsScreenParams(int i, String str, ProjectTemplateId projectTemplateId, vnf vnfVar, mq5 mq5Var) {
        this(i, str, projectTemplateId, vnfVar);
    }

    private UploadMaterialsScreenParams(String str, ProjectTemplateId projectTemplateId) {
        str.getClass();
        projectTemplateId.getClass();
        this.projectId = str;
        this.templateId = projectTemplateId;
    }
}
