package com.anthropic.claude.analytics.events;

import defpackage.grc;
import defpackage.gvj;
import defpackage.ipd;
import defpackage.jpd;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.rod;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ:\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001eR\u0014\u00100\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u001a¨\u00064"}, d2 = {"com/anthropic/claude/analytics/events/ProjectsEvents$ProjectDocumentDeleted", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "project_uuid", "document_uuid", "Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectUploadSource;", "upload_source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectUploadSource;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectUploadSource;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectDocumentDeleted;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectDocumentDeleted;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectUploadSource;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectUploadSource;)Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectDocumentDeleted;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getProject_uuid", "getDocument_uuid", "Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectUploadSource;", "getUpload_source", "getEventName", "eventName", "Companion", "ipd", "jpd", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ProjectsEvents$ProjectDocumentDeleted implements AnalyticsEvent {
    public static final int $stable = 0;
    private final String document_uuid;
    private final String organization_uuid;
    private final String project_uuid;
    private final ProjectsEvents$ProjectUploadSource upload_source;
    public static final jpd Companion = new jpd();
    private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new rod(4))};

    public /* synthetic */ ProjectsEvents$ProjectDocumentDeleted(int i, String str, String str2, String str3, ProjectsEvents$ProjectUploadSource projectsEvents$ProjectUploadSource, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, ipd.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.project_uuid = str2;
        this.document_uuid = str3;
        if ((i & 8) == 0) {
            this.upload_source = null;
        } else {
            this.upload_source = projectsEvents$ProjectUploadSource;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ProjectsEvents$ProjectUploadSource.Companion.serializer();
    }

    public static /* synthetic */ ProjectsEvents$ProjectDocumentDeleted copy$default(ProjectsEvents$ProjectDocumentDeleted projectsEvents$ProjectDocumentDeleted, String str, String str2, String str3, ProjectsEvents$ProjectUploadSource projectsEvents$ProjectUploadSource, int i, Object obj) {
        if ((i & 1) != 0) {
            str = projectsEvents$ProjectDocumentDeleted.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = projectsEvents$ProjectDocumentDeleted.project_uuid;
        }
        if ((i & 4) != 0) {
            str3 = projectsEvents$ProjectDocumentDeleted.document_uuid;
        }
        if ((i & 8) != 0) {
            projectsEvents$ProjectUploadSource = projectsEvents$ProjectDocumentDeleted.upload_source;
        }
        return projectsEvents$ProjectDocumentDeleted.copy(str, str2, str3, projectsEvents$ProjectUploadSource);
    }

    public static final /* synthetic */ void write$Self$analytics(ProjectsEvents$ProjectDocumentDeleted self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.project_uuid);
        output.q(serialDesc, 2, self.document_uuid);
        if (!output.E(serialDesc) && self.upload_source == null) {
            return;
        }
        output.B(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.upload_source);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProject_uuid() {
        return this.project_uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDocument_uuid() {
        return this.document_uuid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ProjectsEvents$ProjectUploadSource getUpload_source() {
        return this.upload_source;
    }

    public final ProjectsEvents$ProjectDocumentDeleted copy(String organization_uuid, String project_uuid, String document_uuid, ProjectsEvents$ProjectUploadSource upload_source) {
        organization_uuid.getClass();
        project_uuid.getClass();
        document_uuid.getClass();
        return new ProjectsEvents$ProjectDocumentDeleted(organization_uuid, project_uuid, document_uuid, upload_source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProjectsEvents$ProjectDocumentDeleted)) {
            return false;
        }
        ProjectsEvents$ProjectDocumentDeleted projectsEvents$ProjectDocumentDeleted = (ProjectsEvents$ProjectDocumentDeleted) other;
        return x44.r(this.organization_uuid, projectsEvents$ProjectDocumentDeleted.organization_uuid) && x44.r(this.project_uuid, projectsEvents$ProjectDocumentDeleted.project_uuid) && x44.r(this.document_uuid, projectsEvents$ProjectDocumentDeleted.document_uuid) && this.upload_source == projectsEvents$ProjectDocumentDeleted.upload_source;
    }

    public final String getDocument_uuid() {
        return this.document_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_project_document_deleted";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getProject_uuid() {
        return this.project_uuid;
    }

    public final ProjectsEvents$ProjectUploadSource getUpload_source() {
        return this.upload_source;
    }

    public int hashCode() {
        int iL = kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.project_uuid), 31, this.document_uuid);
        ProjectsEvents$ProjectUploadSource projectsEvents$ProjectUploadSource = this.upload_source;
        return iL + (projectsEvents$ProjectUploadSource == null ? 0 : projectsEvents$ProjectUploadSource.hashCode());
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.project_uuid;
        String str3 = this.document_uuid;
        ProjectsEvents$ProjectUploadSource projectsEvents$ProjectUploadSource = this.upload_source;
        StringBuilder sbR = kgh.r("ProjectDocumentDeleted(organization_uuid=", str, ", project_uuid=", str2, ", document_uuid=");
        sbR.append(str3);
        sbR.append(", upload_source=");
        sbR.append(projectsEvents$ProjectUploadSource);
        sbR.append(")");
        return sbR.toString();
    }

    public ProjectsEvents$ProjectDocumentDeleted(String str, String str2, String str3, ProjectsEvents$ProjectUploadSource projectsEvents$ProjectUploadSource) {
        grc.B(str, str2, str3);
        this.organization_uuid = str;
        this.project_uuid = str2;
        this.document_uuid = str3;
        this.upload_source = projectsEvents$ProjectUploadSource;
    }

    public /* synthetic */ ProjectsEvents$ProjectDocumentDeleted(String str, String str2, String str3, ProjectsEvents$ProjectUploadSource projectsEvents$ProjectUploadSource, int i, mq5 mq5Var) {
        this(str, str2, str3, (i & 8) != 0 ? null : projectsEvents$ProjectUploadSource);
    }
}
