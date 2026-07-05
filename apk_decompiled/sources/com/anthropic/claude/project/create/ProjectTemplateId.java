package com.anthropic.claude.project.create;

import com.anthropic.claude.api.project.ProjectSubtype;
import com.anthropic.claude.api.project.ProjectType;
import defpackage.cod;
import defpackage.dod;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.xod;
import defpackage.ynd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006,"}, d2 = {"Lcom/anthropic/claude/project/create/ProjectTemplateId;", "", "Lcom/anthropic/claude/api/project/ProjectType;", "type", "Lcom/anthropic/claude/api/project/ProjectSubtype;", "subtype", "<init>", "(Lcom/anthropic/claude/api/project/ProjectType;Lcom/anthropic/claude/api/project/ProjectSubtype;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/project/ProjectType;Lcom/anthropic/claude/api/project/ProjectSubtype;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$project", "(Lcom/anthropic/claude/project/create/ProjectTemplateId;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/project/ProjectType;", "component2", "()Lcom/anthropic/claude/api/project/ProjectSubtype;", "copy", "(Lcom/anthropic/claude/api/project/ProjectType;Lcom/anthropic/claude/api/project/ProjectSubtype;)Lcom/anthropic/claude/project/create/ProjectTemplateId;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/project/ProjectType;", "getType", "Lcom/anthropic/claude/api/project/ProjectSubtype;", "getSubtype", "Companion", "cod", "dod", "project"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ProjectTemplateId {
    public static final int $stable = 0;
    public static final dod Companion = new dod();
    private final ProjectSubtype subtype;
    private final ProjectType type;

    public /* synthetic */ ProjectTemplateId(int i, ProjectType projectType, ProjectSubtype projectSubtype, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, cod.a.getDescriptor());
            throw null;
        }
        this.type = projectType;
        this.subtype = projectSubtype;
    }

    public static /* synthetic */ ProjectTemplateId copy$default(ProjectTemplateId projectTemplateId, ProjectType projectType, ProjectSubtype projectSubtype, int i, Object obj) {
        if ((i & 1) != 0) {
            projectType = projectTemplateId.type;
        }
        if ((i & 2) != 0) {
            projectSubtype = projectTemplateId.subtype;
        }
        return projectTemplateId.copy(projectType, projectSubtype);
    }

    public static final /* synthetic */ void write$Self$project(ProjectTemplateId self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, xod.d, self.type);
        output.r(serialDesc, 1, ynd.d, self.subtype);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ProjectType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ProjectSubtype getSubtype() {
        return this.subtype;
    }

    public final ProjectTemplateId copy(ProjectType type, ProjectSubtype subtype) {
        type.getClass();
        subtype.getClass();
        return new ProjectTemplateId(type, subtype);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProjectTemplateId)) {
            return false;
        }
        ProjectTemplateId projectTemplateId = (ProjectTemplateId) other;
        return this.type == projectTemplateId.type && this.subtype == projectTemplateId.subtype;
    }

    public final ProjectSubtype getSubtype() {
        return this.subtype;
    }

    public final ProjectType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.subtype.hashCode() + (this.type.hashCode() * 31);
    }

    public String toString() {
        return "ProjectTemplateId(type=" + this.type + ", subtype=" + this.subtype + ")";
    }

    public ProjectTemplateId(ProjectType projectType, ProjectSubtype projectSubtype) {
        projectType.getClass();
        projectSubtype.getClass();
        this.type = projectType;
        this.subtype = projectSubtype;
    }
}
