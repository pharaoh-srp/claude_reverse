package com.anthropic.claude.analytics.events;

import defpackage.gpd;
import defpackage.gvj;
import defpackage.hpd;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.rod;
import defpackage.vb7;
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
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<=B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%JN\u0010&\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b)\u0010!J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010%R\u0014\u0010:\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u001d¨\u0006>"}, d2 = {"com/anthropic/claude/analytics/events/ProjectsEvents$ProjectDocumentAdded", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "project_uuid", "document_uuid", "", "document_length", "Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectDocumentSource;", "source", "Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectUploadSource;", "upload_source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectDocumentSource;Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectUploadSource;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectDocumentSource;Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectUploadSource;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectDocumentAdded;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectDocumentAdded;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()I", "component5", "()Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectDocumentSource;", "component6", "()Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectUploadSource;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectDocumentSource;Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectUploadSource;)Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectDocumentAdded;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getProject_uuid", "getDocument_uuid", "I", "getDocument_length", "Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectDocumentSource;", "getSource", "Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectUploadSource;", "getUpload_source", "getEventName", "eventName", "Companion", "gpd", "hpd", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ProjectsEvents$ProjectDocumentAdded implements AnalyticsEvent {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final hpd Companion = new hpd();
    private final int document_length;
    private final String document_uuid;
    private final String organization_uuid;
    private final String project_uuid;
    private final ProjectsEvents$ProjectDocumentSource source;
    private final ProjectsEvents$ProjectUploadSource upload_source;

    static {
        rod rodVar = new rod(2);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, null, yb5.w(w1aVar, rodVar), yb5.w(w1aVar, new rod(3))};
    }

    public /* synthetic */ ProjectsEvents$ProjectDocumentAdded(int i, String str, String str2, String str3, int i2, ProjectsEvents$ProjectDocumentSource projectsEvents$ProjectDocumentSource, ProjectsEvents$ProjectUploadSource projectsEvents$ProjectUploadSource, vnf vnfVar) {
        if (31 != (i & 31)) {
            gvj.f(i, 31, gpd.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.project_uuid = str2;
        this.document_uuid = str3;
        this.document_length = i2;
        this.source = projectsEvents$ProjectDocumentSource;
        if ((i & 32) == 0) {
            this.upload_source = null;
        } else {
            this.upload_source = projectsEvents$ProjectUploadSource;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ProjectsEvents$ProjectDocumentSource.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return ProjectsEvents$ProjectUploadSource.Companion.serializer();
    }

    public static /* synthetic */ ProjectsEvents$ProjectDocumentAdded copy$default(ProjectsEvents$ProjectDocumentAdded projectsEvents$ProjectDocumentAdded, String str, String str2, String str3, int i, ProjectsEvents$ProjectDocumentSource projectsEvents$ProjectDocumentSource, ProjectsEvents$ProjectUploadSource projectsEvents$ProjectUploadSource, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = projectsEvents$ProjectDocumentAdded.organization_uuid;
        }
        if ((i2 & 2) != 0) {
            str2 = projectsEvents$ProjectDocumentAdded.project_uuid;
        }
        if ((i2 & 4) != 0) {
            str3 = projectsEvents$ProjectDocumentAdded.document_uuid;
        }
        if ((i2 & 8) != 0) {
            i = projectsEvents$ProjectDocumentAdded.document_length;
        }
        if ((i2 & 16) != 0) {
            projectsEvents$ProjectDocumentSource = projectsEvents$ProjectDocumentAdded.source;
        }
        if ((i2 & 32) != 0) {
            projectsEvents$ProjectUploadSource = projectsEvents$ProjectDocumentAdded.upload_source;
        }
        ProjectsEvents$ProjectDocumentSource projectsEvents$ProjectDocumentSource2 = projectsEvents$ProjectDocumentSource;
        ProjectsEvents$ProjectUploadSource projectsEvents$ProjectUploadSource2 = projectsEvents$ProjectUploadSource;
        return projectsEvents$ProjectDocumentAdded.copy(str, str2, str3, i, projectsEvents$ProjectDocumentSource2, projectsEvents$ProjectUploadSource2);
    }

    public static final /* synthetic */ void write$Self$analytics(ProjectsEvents$ProjectDocumentAdded self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.project_uuid);
        output.q(serialDesc, 2, self.document_uuid);
        output.l(3, self.document_length, serialDesc);
        output.r(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.source);
        if (!output.E(serialDesc) && self.upload_source == null) {
            return;
        }
        output.B(serialDesc, 5, (znf) kw9VarArr[5].getValue(), self.upload_source);
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
    public final int getDocument_length() {
        return this.document_length;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ProjectsEvents$ProjectDocumentSource getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ProjectsEvents$ProjectUploadSource getUpload_source() {
        return this.upload_source;
    }

    public final ProjectsEvents$ProjectDocumentAdded copy(String organization_uuid, String project_uuid, String document_uuid, int document_length, ProjectsEvents$ProjectDocumentSource source, ProjectsEvents$ProjectUploadSource upload_source) {
        organization_uuid.getClass();
        project_uuid.getClass();
        document_uuid.getClass();
        source.getClass();
        return new ProjectsEvents$ProjectDocumentAdded(organization_uuid, project_uuid, document_uuid, document_length, source, upload_source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProjectsEvents$ProjectDocumentAdded)) {
            return false;
        }
        ProjectsEvents$ProjectDocumentAdded projectsEvents$ProjectDocumentAdded = (ProjectsEvents$ProjectDocumentAdded) other;
        return x44.r(this.organization_uuid, projectsEvents$ProjectDocumentAdded.organization_uuid) && x44.r(this.project_uuid, projectsEvents$ProjectDocumentAdded.project_uuid) && x44.r(this.document_uuid, projectsEvents$ProjectDocumentAdded.document_uuid) && this.document_length == projectsEvents$ProjectDocumentAdded.document_length && this.source == projectsEvents$ProjectDocumentAdded.source && this.upload_source == projectsEvents$ProjectDocumentAdded.upload_source;
    }

    public final int getDocument_length() {
        return this.document_length;
    }

    public final String getDocument_uuid() {
        return this.document_uuid;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_project_document_added";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getProject_uuid() {
        return this.project_uuid;
    }

    public final ProjectsEvents$ProjectDocumentSource getSource() {
        return this.source;
    }

    public final ProjectsEvents$ProjectUploadSource getUpload_source() {
        return this.upload_source;
    }

    public int hashCode() {
        int iHashCode = (this.source.hashCode() + vb7.c(this.document_length, kgh.l(kgh.l(this.organization_uuid.hashCode() * 31, 31, this.project_uuid), 31, this.document_uuid), 31)) * 31;
        ProjectsEvents$ProjectUploadSource projectsEvents$ProjectUploadSource = this.upload_source;
        return iHashCode + (projectsEvents$ProjectUploadSource == null ? 0 : projectsEvents$ProjectUploadSource.hashCode());
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.project_uuid;
        String str3 = this.document_uuid;
        int i = this.document_length;
        ProjectsEvents$ProjectDocumentSource projectsEvents$ProjectDocumentSource = this.source;
        ProjectsEvents$ProjectUploadSource projectsEvents$ProjectUploadSource = this.upload_source;
        StringBuilder sbR = kgh.r("ProjectDocumentAdded(organization_uuid=", str, ", project_uuid=", str2, ", document_uuid=");
        sbR.append(str3);
        sbR.append(", document_length=");
        sbR.append(i);
        sbR.append(", source=");
        sbR.append(projectsEvents$ProjectDocumentSource);
        sbR.append(", upload_source=");
        sbR.append(projectsEvents$ProjectUploadSource);
        sbR.append(")");
        return sbR.toString();
    }

    public ProjectsEvents$ProjectDocumentAdded(String str, String str2, String str3, int i, ProjectsEvents$ProjectDocumentSource projectsEvents$ProjectDocumentSource, ProjectsEvents$ProjectUploadSource projectsEvents$ProjectUploadSource) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        projectsEvents$ProjectDocumentSource.getClass();
        this.organization_uuid = str;
        this.project_uuid = str2;
        this.document_uuid = str3;
        this.document_length = i;
        this.source = projectsEvents$ProjectDocumentSource;
        this.upload_source = projectsEvents$ProjectUploadSource;
    }

    public /* synthetic */ ProjectsEvents$ProjectDocumentAdded(String str, String str2, String str3, int i, ProjectsEvents$ProjectDocumentSource projectsEvents$ProjectDocumentSource, ProjectsEvents$ProjectUploadSource projectsEvents$ProjectUploadSource, int i2, mq5 mq5Var) {
        this(str, str2, str3, i, projectsEvents$ProjectDocumentSource, (i2 & 32) != 0 ? null : projectsEvents$ProjectUploadSource);
    }
}
