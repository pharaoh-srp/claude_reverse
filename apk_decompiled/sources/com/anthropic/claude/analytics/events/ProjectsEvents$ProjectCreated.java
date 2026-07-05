package com.anthropic.claude.analytics.events;

import defpackage.epd;
import defpackage.fpd;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qy1;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000267B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBS\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJP\u0010\"\u001a\u00020\u00102\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b%\u0010\u001eJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b0\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b1\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b2\u0010\u001bR\u0014\u00104\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u001b¨\u00068"}, d2 = {"com/anthropic/claude/analytics/events/ProjectsEvents$ProjectCreated", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "project_uuid", "", "project_name_length", "project_description_length", "project_type", "project_subtype", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectCreated;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectCreated;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectCreated;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getProject_uuid", "I", "getProject_name_length", "getProject_description_length", "getProject_type", "getProject_subtype", "getEventName", "eventName", "Companion", "epd", "fpd", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ProjectsEvents$ProjectCreated implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final fpd Companion = new fpd();
    private final String organization_uuid;
    private final int project_description_length;
    private final int project_name_length;
    private final String project_subtype;
    private final String project_type;
    private final String project_uuid;

    public /* synthetic */ ProjectsEvents$ProjectCreated(int i, String str, String str2, int i2, int i3, String str3, String str4, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, epd.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.project_uuid = str2;
        this.project_name_length = i2;
        this.project_description_length = i3;
        if ((i & 16) == 0) {
            this.project_type = null;
        } else {
            this.project_type = str3;
        }
        if ((i & 32) == 0) {
            this.project_subtype = null;
        } else {
            this.project_subtype = str4;
        }
    }

    public static /* synthetic */ ProjectsEvents$ProjectCreated copy$default(ProjectsEvents$ProjectCreated projectsEvents$ProjectCreated, String str, String str2, int i, int i2, String str3, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = projectsEvents$ProjectCreated.organization_uuid;
        }
        if ((i3 & 2) != 0) {
            str2 = projectsEvents$ProjectCreated.project_uuid;
        }
        if ((i3 & 4) != 0) {
            i = projectsEvents$ProjectCreated.project_name_length;
        }
        if ((i3 & 8) != 0) {
            i2 = projectsEvents$ProjectCreated.project_description_length;
        }
        if ((i3 & 16) != 0) {
            str3 = projectsEvents$ProjectCreated.project_type;
        }
        if ((i3 & 32) != 0) {
            str4 = projectsEvents$ProjectCreated.project_subtype;
        }
        String str5 = str3;
        String str6 = str4;
        return projectsEvents$ProjectCreated.copy(str, str2, i, i2, str5, str6);
    }

    public static final /* synthetic */ void write$Self$analytics(ProjectsEvents$ProjectCreated self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.project_uuid);
        output.l(2, self.project_name_length, serialDesc);
        output.l(3, self.project_description_length, serialDesc);
        if (output.E(serialDesc) || self.project_type != null) {
            output.B(serialDesc, 4, srg.a, self.project_type);
        }
        if (!output.E(serialDesc) && self.project_subtype == null) {
            return;
        }
        output.B(serialDesc, 5, srg.a, self.project_subtype);
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
    public final int getProject_name_length() {
        return this.project_name_length;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getProject_description_length() {
        return this.project_description_length;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getProject_type() {
        return this.project_type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getProject_subtype() {
        return this.project_subtype;
    }

    public final ProjectsEvents$ProjectCreated copy(String organization_uuid, String project_uuid, int project_name_length, int project_description_length, String project_type, String project_subtype) {
        organization_uuid.getClass();
        project_uuid.getClass();
        return new ProjectsEvents$ProjectCreated(organization_uuid, project_uuid, project_name_length, project_description_length, project_type, project_subtype);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProjectsEvents$ProjectCreated)) {
            return false;
        }
        ProjectsEvents$ProjectCreated projectsEvents$ProjectCreated = (ProjectsEvents$ProjectCreated) other;
        return x44.r(this.organization_uuid, projectsEvents$ProjectCreated.organization_uuid) && x44.r(this.project_uuid, projectsEvents$ProjectCreated.project_uuid) && this.project_name_length == projectsEvents$ProjectCreated.project_name_length && this.project_description_length == projectsEvents$ProjectCreated.project_description_length && x44.r(this.project_type, projectsEvents$ProjectCreated.project_type) && x44.r(this.project_subtype, projectsEvents$ProjectCreated.project_subtype);
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_project_created";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final int getProject_description_length() {
        return this.project_description_length;
    }

    public final int getProject_name_length() {
        return this.project_name_length;
    }

    public final String getProject_subtype() {
        return this.project_subtype;
    }

    public final String getProject_type() {
        return this.project_type;
    }

    public final String getProject_uuid() {
        return this.project_uuid;
    }

    public int hashCode() {
        int iC = vb7.c(this.project_description_length, vb7.c(this.project_name_length, kgh.l(this.organization_uuid.hashCode() * 31, 31, this.project_uuid), 31), 31);
        String str = this.project_type;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.project_subtype;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.project_uuid;
        int i = this.project_name_length;
        int i2 = this.project_description_length;
        String str3 = this.project_type;
        String str4 = this.project_subtype;
        StringBuilder sbR = kgh.r("ProjectCreated(organization_uuid=", str, ", project_uuid=", str2, ", project_name_length=");
        qy1.k(i, i2, ", project_description_length=", ", project_type=", sbR);
        return vb7.t(sbR, str3, ", project_subtype=", str4, ")");
    }

    public ProjectsEvents$ProjectCreated(String str, String str2, int i, int i2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.organization_uuid = str;
        this.project_uuid = str2;
        this.project_name_length = i;
        this.project_description_length = i2;
        this.project_type = str3;
        this.project_subtype = str4;
    }

    public /* synthetic */ ProjectsEvents$ProjectCreated(String str, String str2, int i, int i2, String str3, String str4, int i3, mq5 mq5Var) {
        this(str, str2, i, i2, (i3 & 16) != 0 ? null : str3, (i3 & 32) != 0 ? null : str4);
    }
}
