package com.anthropic.claude.api.account;

import com.anthropic.claude.api.notification.Preferences;
import defpackage.akc;
import defpackage.bc9;
import defpackage.ebh;
import defpackage.gvj;
import defpackage.iab;
import defpackage.jab;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vbd;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import java.util.Date;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;<BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0019\u0010\u000b\u001a\u00150\u0006j\u0002`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u0019\u0010\f\u001a\u00150\u0006j\u0002`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010BM\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J#\u0010#\u001a\u00150\u0006j\u0002`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0004\b#\u0010$J#\u0010%\u001a\u00150\u0006j\u0002`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b&\u0010'Jj\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001b\b\u0002\u0010\u000b\u001a\u00150\u0006j\u0002`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\u001b\b\u0002\u0010\f\u001a\u00150\u0006j\u0002`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010\"J\u0010\u0010+\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010\"R*\u0010\u000b\u001a\u00150\u0006j\u0002`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010$R*\u0010\f\u001a\u00150\u0006j\u0002`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b7\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\b9\u0010'¨\u0006="}, d2 = {"Lcom/anthropic/claude/api/account/Membership;", "", "Lcom/anthropic/claude/api/account/Organization;", "organization", "", "role", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "created_at", "updated_at", "Lcom/anthropic/claude/api/notification/Preferences;", "notification_preferences", "<init>", "(Lcom/anthropic/claude/api/account/Organization;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lcom/anthropic/claude/api/notification/Preferences;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/account/Organization;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lcom/anthropic/claude/api/notification/Preferences;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/account/Membership;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/account/Organization;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/Date;", "component4", "component5", "()Lcom/anthropic/claude/api/notification/Preferences;", "copy", "(Lcom/anthropic/claude/api/account/Organization;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lcom/anthropic/claude/api/notification/Preferences;)Lcom/anthropic/claude/api/account/Membership;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/account/Organization;", "getOrganization", "Ljava/lang/String;", "getRole", "Ljava/util/Date;", "getCreated_at", "getUpdated_at", "Lcom/anthropic/claude/api/notification/Preferences;", "getNotification_preferences", "Companion", "iab", "jab", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class Membership {
    public static final int $stable = 0;
    public static final jab Companion = new jab();
    private final Date created_at;
    private final Preferences notification_preferences;
    private final Organization organization;
    private final String role;
    private final Date updated_at;

    public /* synthetic */ Membership(int i, Organization organization, String str, Date date, Date date2, Preferences preferences, vnf vnfVar) {
        if (31 != (i & 31)) {
            gvj.f(i, 31, iab.a.getDescriptor());
            throw null;
        }
        this.organization = organization;
        this.role = str;
        this.created_at = date;
        this.updated_at = date2;
        this.notification_preferences = preferences;
    }

    public static /* synthetic */ Membership copy$default(Membership membership, Organization organization, String str, Date date, Date date2, Preferences preferences, int i, Object obj) {
        if ((i & 1) != 0) {
            organization = membership.organization;
        }
        if ((i & 2) != 0) {
            str = membership.role;
        }
        if ((i & 4) != 0) {
            date = membership.created_at;
        }
        if ((i & 8) != 0) {
            date2 = membership.updated_at;
        }
        if ((i & 16) != 0) {
            preferences = membership.notification_preferences;
        }
        Preferences preferences2 = preferences;
        Date date3 = date;
        return membership.copy(organization, str, date3, date2, preferences2);
    }

    public static final /* synthetic */ void write$Self$api(Membership self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, akc.a, self.organization);
        output.q(serialDesc, 1, self.role);
        bc9 bc9Var = bc9.a;
        output.r(serialDesc, 2, bc9Var, self.created_at);
        output.r(serialDesc, 3, bc9Var, self.updated_at);
        output.B(serialDesc, 4, vbd.a, self.notification_preferences);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Organization getOrganization() {
        return this.organization;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Preferences getNotification_preferences() {
        return this.notification_preferences;
    }

    public final Membership copy(Organization organization, String role, Date created_at, Date updated_at, Preferences notification_preferences) {
        organization.getClass();
        role.getClass();
        created_at.getClass();
        updated_at.getClass();
        return new Membership(organization, role, created_at, updated_at, notification_preferences);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Membership)) {
            return false;
        }
        Membership membership = (Membership) other;
        return x44.r(this.organization, membership.organization) && x44.r(this.role, membership.role) && x44.r(this.created_at, membership.created_at) && x44.r(this.updated_at, membership.updated_at) && x44.r(this.notification_preferences, membership.notification_preferences);
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final Preferences getNotification_preferences() {
        return this.notification_preferences;
    }

    public final Organization getOrganization() {
        return this.organization;
    }

    public final String getRole() {
        return this.role;
    }

    public final Date getUpdated_at() {
        return this.updated_at;
    }

    public int hashCode() {
        int iJ = ebh.j(this.updated_at, ebh.j(this.created_at, kgh.l(this.organization.hashCode() * 31, 31, this.role), 31), 31);
        Preferences preferences = this.notification_preferences;
        return iJ + (preferences == null ? 0 : preferences.hashCode());
    }

    public String toString() {
        return "Membership(organization=" + this.organization + ", role=" + this.role + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ", notification_preferences=" + this.notification_preferences + ")";
    }

    public Membership(Organization organization, String str, Date date, Date date2, Preferences preferences) {
        organization.getClass();
        str.getClass();
        date.getClass();
        date2.getClass();
        this.organization = organization;
        this.role = str;
        this.created_at = date;
        this.updated_at = date2;
        this.notification_preferences = preferences;
    }
}
