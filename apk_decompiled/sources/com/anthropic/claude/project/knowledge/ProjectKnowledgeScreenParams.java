package com.anthropic.claude.project.knowledge;

import com.anthropic.claude.types.strings.ProjectId;
import defpackage.and;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vnf;
import defpackage.zmd;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006'"}, d2 = {"Lcom/anthropic/claude/project/knowledge/ProjectKnowledgeScreenParams;", "", "Lcom/anthropic/claude/types/strings/ProjectId;", "projectId", "<init>", "(Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$project", "(Lcom/anthropic/claude/project/knowledge/ProjectKnowledgeScreenParams;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-5pmjb-U", "()Ljava/lang/String;", "component1", "copy-t-MNgBs", "(Ljava/lang/String;)Lcom/anthropic/claude/project/knowledge/ProjectKnowledgeScreenParams;", "copy", "", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProjectId-5pmjb-U", "Companion", "zmd", "and", "project"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ProjectKnowledgeScreenParams {
    public static final int $stable = 0;
    public static final and Companion = new and();
    private final String projectId;

    private /* synthetic */ ProjectKnowledgeScreenParams(int i, String str, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.projectId = str;
        } else {
            gvj.f(i, 1, zmd.a.getDescriptor());
            throw null;
        }
    }

    /* JADX INFO: renamed from: copy-t-MNgBs$default, reason: not valid java name */
    public static /* synthetic */ ProjectKnowledgeScreenParams m806copytMNgBs$default(ProjectKnowledgeScreenParams projectKnowledgeScreenParams, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = projectKnowledgeScreenParams.projectId;
        }
        return projectKnowledgeScreenParams.m808copytMNgBs(str);
    }

    /* JADX INFO: renamed from: component1-5pmjb-U, reason: not valid java name and from getter */
    public final String getProjectId() {
        return this.projectId;
    }

    /* JADX INFO: renamed from: copy-t-MNgBs, reason: not valid java name */
    public final ProjectKnowledgeScreenParams m808copytMNgBs(String projectId) {
        projectId.getClass();
        return new ProjectKnowledgeScreenParams(projectId, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ProjectKnowledgeScreenParams) && ProjectId.m1082equalsimpl0(this.projectId, ((ProjectKnowledgeScreenParams) other).projectId);
    }

    /* JADX INFO: renamed from: getProjectId-5pmjb-U, reason: not valid java name */
    public final String m809getProjectId5pmjbU() {
        return this.projectId;
    }

    public int hashCode() {
        return ProjectId.m1083hashCodeimpl(this.projectId);
    }

    public String toString() {
        return ij0.j("ProjectKnowledgeScreenParams(projectId=", ProjectId.m1084toStringimpl(this.projectId), ")");
    }

    public /* synthetic */ ProjectKnowledgeScreenParams(String str, mq5 mq5Var) {
        this(str);
    }

    public /* synthetic */ ProjectKnowledgeScreenParams(int i, String str, vnf vnfVar, mq5 mq5Var) {
        this(i, str, vnfVar);
    }

    private ProjectKnowledgeScreenParams(String str) {
        str.getClass();
        this.projectId = str;
    }
}
