package com.anthropic.claude.project.details;

import com.anthropic.claude.types.strings.ProjectId;
import defpackage.emd;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.mld;
import defpackage.mq5;
import defpackage.nld;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b\u0005\u0010\u001a¨\u0006+"}, d2 = {"Lcom/anthropic/claude/project/details/ProjectDetailsScreenParams;", "", "Lcom/anthropic/claude/types/strings/ProjectId;", "projectId", "", "isRootScreen", "<init>", "(Ljava/lang/String;ZLmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;ZLvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$project", "(Lcom/anthropic/claude/project/details/ProjectDetailsScreenParams;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-5pmjb-U", "()Ljava/lang/String;", "component1", "component2", "()Z", "copy-E9d9s8M", "(Ljava/lang/String;Z)Lcom/anthropic/claude/project/details/ProjectDetailsScreenParams;", "copy", "", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProjectId-5pmjb-U", "Z", "Companion", "mld", "nld", "project"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ProjectDetailsScreenParams {
    public static final int $stable = 0;
    public static final nld Companion = new nld();
    private final boolean isRootScreen;
    private final String projectId;

    private /* synthetic */ ProjectDetailsScreenParams(int i, String str, boolean z, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, mld.a.getDescriptor());
            throw null;
        }
        this.projectId = str;
        if ((i & 2) == 0) {
            this.isRootScreen = false;
        } else {
            this.isRootScreen = z;
        }
    }

    /* JADX INFO: renamed from: copy-E9d9s8M$default, reason: not valid java name */
    public static /* synthetic */ ProjectDetailsScreenParams m786copyE9d9s8M$default(ProjectDetailsScreenParams projectDetailsScreenParams, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = projectDetailsScreenParams.projectId;
        }
        if ((i & 2) != 0) {
            z = projectDetailsScreenParams.isRootScreen;
        }
        return projectDetailsScreenParams.m788copyE9d9s8M(str, z);
    }

    public static final /* synthetic */ void write$Self$project(ProjectDetailsScreenParams self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, emd.a, ProjectId.m1079boximpl(self.projectId));
        if (output.E(serialDesc) || self.isRootScreen) {
            output.p(serialDesc, 1, self.isRootScreen);
        }
    }

    /* JADX INFO: renamed from: component1-5pmjb-U, reason: not valid java name and from getter */
    public final String getProjectId() {
        return this.projectId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsRootScreen() {
        return this.isRootScreen;
    }

    /* JADX INFO: renamed from: copy-E9d9s8M, reason: not valid java name */
    public final ProjectDetailsScreenParams m788copyE9d9s8M(String projectId, boolean isRootScreen) {
        projectId.getClass();
        return new ProjectDetailsScreenParams(projectId, isRootScreen, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProjectDetailsScreenParams)) {
            return false;
        }
        ProjectDetailsScreenParams projectDetailsScreenParams = (ProjectDetailsScreenParams) other;
        return ProjectId.m1082equalsimpl0(this.projectId, projectDetailsScreenParams.projectId) && this.isRootScreen == projectDetailsScreenParams.isRootScreen;
    }

    /* JADX INFO: renamed from: getProjectId-5pmjb-U, reason: not valid java name */
    public final String m789getProjectId5pmjbU() {
        return this.projectId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isRootScreen) + (ProjectId.m1083hashCodeimpl(this.projectId) * 31);
    }

    public final boolean isRootScreen() {
        return this.isRootScreen;
    }

    public String toString() {
        return "ProjectDetailsScreenParams(projectId=" + ProjectId.m1084toStringimpl(this.projectId) + ", isRootScreen=" + this.isRootScreen + ")";
    }

    public /* synthetic */ ProjectDetailsScreenParams(String str, boolean z, mq5 mq5Var) {
        this(str, z);
    }

    public /* synthetic */ ProjectDetailsScreenParams(int i, String str, boolean z, vnf vnfVar, mq5 mq5Var) {
        this(i, str, z, vnfVar);
    }

    private ProjectDetailsScreenParams(String str, boolean z) {
        str.getClass();
        this.projectId = str;
        this.isRootScreen = z;
    }

    public /* synthetic */ ProjectDetailsScreenParams(String str, boolean z, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? false : z, null);
    }
}
