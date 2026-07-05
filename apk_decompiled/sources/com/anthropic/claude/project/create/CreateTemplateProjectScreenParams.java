package com.anthropic.claude.project.create;

import com.anthropic.claude.api.project.ProjectType;
import defpackage.c95;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.xod;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, d2 = {"Lcom/anthropic/claude/project/create/CreateTemplateProjectScreenParams;", "", "Lcom/anthropic/claude/api/project/ProjectType;", "projectType", "<init>", "(Lcom/anthropic/claude/api/project/ProjectType;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/project/ProjectType;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$project", "(Lcom/anthropic/claude/project/create/CreateTemplateProjectScreenParams;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/project/ProjectType;", "copy", "(Lcom/anthropic/claude/api/project/ProjectType;)Lcom/anthropic/claude/project/create/CreateTemplateProjectScreenParams;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/project/ProjectType;", "getProjectType", "Companion", "b95", "c95", "project"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CreateTemplateProjectScreenParams {
    public static final int $stable = 0;
    public static final c95 Companion = new c95();
    private final ProjectType projectType;

    public /* synthetic */ CreateTemplateProjectScreenParams(int i, ProjectType projectType, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.projectType = null;
        } else {
            this.projectType = projectType;
        }
    }

    public static /* synthetic */ CreateTemplateProjectScreenParams copy$default(CreateTemplateProjectScreenParams createTemplateProjectScreenParams, ProjectType projectType, int i, Object obj) {
        if ((i & 1) != 0) {
            projectType = createTemplateProjectScreenParams.projectType;
        }
        return createTemplateProjectScreenParams.copy(projectType);
    }

    public static final /* synthetic */ void write$Self$project(CreateTemplateProjectScreenParams self, vd4 output, SerialDescriptor serialDesc) {
        if (!output.E(serialDesc) && self.projectType == null) {
            return;
        }
        output.B(serialDesc, 0, xod.d, self.projectType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ProjectType getProjectType() {
        return this.projectType;
    }

    public final CreateTemplateProjectScreenParams copy(ProjectType projectType) {
        return new CreateTemplateProjectScreenParams(projectType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CreateTemplateProjectScreenParams) && this.projectType == ((CreateTemplateProjectScreenParams) other).projectType;
    }

    public final ProjectType getProjectType() {
        return this.projectType;
    }

    public int hashCode() {
        ProjectType projectType = this.projectType;
        if (projectType == null) {
            return 0;
        }
        return projectType.hashCode();
    }

    public String toString() {
        return "CreateTemplateProjectScreenParams(projectType=" + this.projectType + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CreateTemplateProjectScreenParams() {
        this((ProjectType) null, 1, (mq5) (0 == true ? 1 : 0));
    }

    public CreateTemplateProjectScreenParams(ProjectType projectType) {
        this.projectType = projectType;
    }

    public /* synthetic */ CreateTemplateProjectScreenParams(ProjectType projectType, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : projectType);
    }
}
