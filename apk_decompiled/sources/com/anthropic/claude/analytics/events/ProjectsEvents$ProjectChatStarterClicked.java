package com.anthropic.claude.analytics.events;

import defpackage.cpd;
import defpackage.dpd;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J<\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0019R\u0014\u0010-\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010\u0019¨\u00061"}, d2 = {"com/anthropic/claude/analytics/events/ProjectsEvents$ProjectChatStarterClicked", "Lcom/anthropic/claude/analytics/events/AnalyticsEvent;", "", "organization_uuid", "chat_starter_id", "project_type", "project_subtype", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectChatStarterClicked;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$analytics", "(Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectChatStarterClicked;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/analytics/events/ProjectsEvents$ProjectChatStarterClicked;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOrganization_uuid", "getChat_starter_id", "getProject_type", "getProject_subtype", "getEventName", "eventName", "Companion", "cpd", "dpd", "analytics"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ProjectsEvents$ProjectChatStarterClicked implements AnalyticsEvent {
    public static final int $stable = 0;
    public static final dpd Companion = new dpd();
    private final String chat_starter_id;
    private final String organization_uuid;
    private final String project_subtype;
    private final String project_type;

    public /* synthetic */ ProjectsEvents$ProjectChatStarterClicked(int i, String str, String str2, String str3, String str4, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, cpd.a.getDescriptor());
            throw null;
        }
        this.organization_uuid = str;
        this.chat_starter_id = str2;
        if ((i & 4) == 0) {
            this.project_type = null;
        } else {
            this.project_type = str3;
        }
        if ((i & 8) == 0) {
            this.project_subtype = null;
        } else {
            this.project_subtype = str4;
        }
    }

    public static /* synthetic */ ProjectsEvents$ProjectChatStarterClicked copy$default(ProjectsEvents$ProjectChatStarterClicked projectsEvents$ProjectChatStarterClicked, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = projectsEvents$ProjectChatStarterClicked.organization_uuid;
        }
        if ((i & 2) != 0) {
            str2 = projectsEvents$ProjectChatStarterClicked.chat_starter_id;
        }
        if ((i & 4) != 0) {
            str3 = projectsEvents$ProjectChatStarterClicked.project_type;
        }
        if ((i & 8) != 0) {
            str4 = projectsEvents$ProjectChatStarterClicked.project_subtype;
        }
        return projectsEvents$ProjectChatStarterClicked.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$analytics(ProjectsEvents$ProjectChatStarterClicked self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.organization_uuid);
        output.q(serialDesc, 1, self.chat_starter_id);
        if (output.E(serialDesc) || self.project_type != null) {
            output.B(serialDesc, 2, srg.a, self.project_type);
        }
        if (!output.E(serialDesc) && self.project_subtype == null) {
            return;
        }
        output.B(serialDesc, 3, srg.a, self.project_subtype);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChat_starter_id() {
        return this.chat_starter_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProject_type() {
        return this.project_type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getProject_subtype() {
        return this.project_subtype;
    }

    public final ProjectsEvents$ProjectChatStarterClicked copy(String organization_uuid, String chat_starter_id, String project_type, String project_subtype) {
        organization_uuid.getClass();
        chat_starter_id.getClass();
        return new ProjectsEvents$ProjectChatStarterClicked(organization_uuid, chat_starter_id, project_type, project_subtype);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProjectsEvents$ProjectChatStarterClicked)) {
            return false;
        }
        ProjectsEvents$ProjectChatStarterClicked projectsEvents$ProjectChatStarterClicked = (ProjectsEvents$ProjectChatStarterClicked) other;
        return x44.r(this.organization_uuid, projectsEvents$ProjectChatStarterClicked.organization_uuid) && x44.r(this.chat_starter_id, projectsEvents$ProjectChatStarterClicked.chat_starter_id) && x44.r(this.project_type, projectsEvents$ProjectChatStarterClicked.project_type) && x44.r(this.project_subtype, projectsEvents$ProjectChatStarterClicked.project_subtype);
    }

    public final String getChat_starter_id() {
        return this.chat_starter_id;
    }

    @Override // com.anthropic.claude.analytics.events.AnalyticsEvent
    public String getEventName() {
        return "mobile_project_chat_starter_clicked";
    }

    public final String getOrganization_uuid() {
        return this.organization_uuid;
    }

    public final String getProject_subtype() {
        return this.project_subtype;
    }

    public final String getProject_type() {
        return this.project_type;
    }

    public int hashCode() {
        int iL = kgh.l(this.organization_uuid.hashCode() * 31, 31, this.chat_starter_id);
        String str = this.project_type;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.project_subtype;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.organization_uuid;
        String str2 = this.chat_starter_id;
        return vb7.t(kgh.r("ProjectChatStarterClicked(organization_uuid=", str, ", chat_starter_id=", str2, ", project_type="), this.project_type, ", project_subtype=", this.project_subtype, ")");
    }

    public ProjectsEvents$ProjectChatStarterClicked(String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.organization_uuid = str;
        this.chat_starter_id = str2;
        this.project_type = str3;
        this.project_subtype = str4;
    }

    public /* synthetic */ ProjectsEvents$ProjectChatStarterClicked(String str, String str2, String str3, String str4, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
