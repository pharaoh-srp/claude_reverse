package com.anthropic.claude.api.share;

import com.anthropic.claude.types.strings.ChatSnapshotId;
import com.anthropic.claude.types.strings.ProjectId;
import defpackage.bc3;
import defpackage.bc9;
import defpackage.e79;
import defpackage.ebh;
import defpackage.emd;
import defpackage.gvj;
import defpackage.hc3;
import defpackage.ic3;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import java.util.Date;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?@Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0019\u0010\u000b\u001a\u00150\u0006j\u0002`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\u0019\u0010\f\u001a\u00150\u0006j\u0002`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012BW\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010!J#\u0010$\u001a\u00150\u0006j\u0002`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0004\b$\u0010%J#\u0010&\u001a\u00150\u0006j\u0002`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010(\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b'\u0010!J\u0012\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b)\u0010*Jv\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u001b\b\u0002\u0010\u000b\u001a\u00150\u0006j\u0002`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\u001b\b\u0002\u0010\f\u001a\u00150\u0006j\u0002`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b.\u0010!J\u0010\u0010/\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b7\u0010!R*\u0010\u000b\u001a\u00150\u0006j\u0002`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010%R*\u0010\f\u001a\u00150\u0006j\u0002`\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b:\u0010%R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b;\u0010!R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\b=\u0010*¨\u0006A"}, d2 = {"Lcom/anthropic/claude/api/share/ChatSnapshotSummary;", "", "Lcom/anthropic/claude/types/strings/ChatSnapshotId;", "uuid", "", "snapshot_name", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "created_at", "updated_at", "Lcom/anthropic/claude/types/strings/ProjectId;", "project_uuid", "", "last_message_index", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Integer;Lmq5;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Integer;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/share/ChatSnapshotSummary;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-N1vkeFQ", "()Ljava/lang/String;", "component1", "component2", "component3", "()Ljava/util/Date;", "component4", "component5-v-f-JkQ", "component5", "component6", "()Ljava/lang/Integer;", "copy-vsdPMJA", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/Integer;)Lcom/anthropic/claude/api/share/ChatSnapshotSummary;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid-N1vkeFQ", "getSnapshot_name", "Ljava/util/Date;", "getCreated_at", "getUpdated_at", "getProject_uuid-v-f-JkQ", "Ljava/lang/Integer;", "getLast_message_index", "Companion", "hc3", "ic3", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatSnapshotSummary {
    public static final int $stable = 0;
    public static final ic3 Companion = new ic3();
    private final Date created_at;
    private final Integer last_message_index;
    private final String project_uuid;
    private final String snapshot_name;
    private final Date updated_at;
    private final String uuid;

    private /* synthetic */ ChatSnapshotSummary(int i, String str, String str2, Date date, Date date2, String str3, Integer num, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, hc3.a.getDescriptor());
            throw null;
        }
        this.uuid = str;
        this.snapshot_name = str2;
        this.created_at = date;
        this.updated_at = date2;
        if ((i & 16) == 0) {
            this.project_uuid = null;
        } else {
            this.project_uuid = str3;
        }
        if ((i & 32) == 0) {
            this.last_message_index = null;
        } else {
            this.last_message_index = num;
        }
    }

    /* JADX INFO: renamed from: copy-vsdPMJA$default, reason: not valid java name */
    public static /* synthetic */ ChatSnapshotSummary m421copyvsdPMJA$default(ChatSnapshotSummary chatSnapshotSummary, String str, String str2, Date date, Date date2, String str3, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatSnapshotSummary.uuid;
        }
        if ((i & 2) != 0) {
            str2 = chatSnapshotSummary.snapshot_name;
        }
        if ((i & 4) != 0) {
            date = chatSnapshotSummary.created_at;
        }
        if ((i & 8) != 0) {
            date2 = chatSnapshotSummary.updated_at;
        }
        if ((i & 16) != 0) {
            str3 = chatSnapshotSummary.project_uuid;
        }
        if ((i & 32) != 0) {
            num = chatSnapshotSummary.last_message_index;
        }
        String str4 = str3;
        Integer num2 = num;
        return chatSnapshotSummary.m424copyvsdPMJA(str, str2, date, date2, str4, num2);
    }

    public static final /* synthetic */ void write$Self$api(ChatSnapshotSummary self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, bc3.a, ChatSnapshotId.m985boximpl(self.uuid));
        output.q(serialDesc, 1, self.snapshot_name);
        bc9 bc9Var = bc9.a;
        output.r(serialDesc, 2, bc9Var, self.created_at);
        output.r(serialDesc, 3, bc9Var, self.updated_at);
        if (output.E(serialDesc) || self.project_uuid != null) {
            emd emdVar = emd.a;
            String str = self.project_uuid;
            output.B(serialDesc, 4, emdVar, str != null ? ProjectId.m1079boximpl(str) : null);
        }
        if (!output.E(serialDesc) && self.last_message_index == null) {
            return;
        }
        output.B(serialDesc, 5, e79.a, self.last_message_index);
    }

    /* JADX INFO: renamed from: component1-N1vkeFQ, reason: not valid java name and from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSnapshot_name() {
        return this.snapshot_name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: component5-v-f-JkQ, reason: not valid java name and from getter */
    public final String getProject_uuid() {
        return this.project_uuid;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getLast_message_index() {
        return this.last_message_index;
    }

    /* JADX INFO: renamed from: copy-vsdPMJA, reason: not valid java name */
    public final ChatSnapshotSummary m424copyvsdPMJA(String uuid, String snapshot_name, Date created_at, Date updated_at, String project_uuid, Integer last_message_index) {
        uuid.getClass();
        snapshot_name.getClass();
        created_at.getClass();
        updated_at.getClass();
        return new ChatSnapshotSummary(uuid, snapshot_name, created_at, updated_at, project_uuid, last_message_index, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.anthropic.claude.api.share.ChatSnapshotSummary
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.api.share.ChatSnapshotSummary r5 = (com.anthropic.claude.api.share.ChatSnapshotSummary) r5
            java.lang.String r1 = r4.uuid
            java.lang.String r3 = r5.uuid
            boolean r1 = com.anthropic.claude.types.strings.ChatSnapshotId.m988equalsimpl0(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.snapshot_name
            java.lang.String r3 = r5.snapshot_name
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.util.Date r1 = r4.created_at
            java.util.Date r3 = r5.created_at
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.util.Date r1 = r4.updated_at
            java.util.Date r3 = r5.updated_at
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.project_uuid
            java.lang.String r3 = r5.project_uuid
            if (r1 != 0) goto L44
            if (r3 != 0) goto L42
            r1 = r0
            goto L4b
        L42:
            r1 = r2
            goto L4b
        L44:
            if (r3 != 0) goto L47
            goto L42
        L47:
            boolean r1 = com.anthropic.claude.types.strings.ProjectId.m1082equalsimpl0(r1, r3)
        L4b:
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.lang.Integer r4 = r4.last_message_index
            java.lang.Integer r5 = r5.last_message_index
            boolean r4 = defpackage.x44.r(r4, r5)
            if (r4 != 0) goto L59
            return r2
        L59:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.api.share.ChatSnapshotSummary.equals(java.lang.Object):boolean");
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final Integer getLast_message_index() {
        return this.last_message_index;
    }

    /* JADX INFO: renamed from: getProject_uuid-v-f-JkQ, reason: not valid java name */
    public final String m425getProject_uuidvfJkQ() {
        return this.project_uuid;
    }

    public final String getSnapshot_name() {
        return this.snapshot_name;
    }

    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: getUuid-N1vkeFQ, reason: not valid java name */
    public final String m426getUuidN1vkeFQ() {
        return this.uuid;
    }

    public int hashCode() {
        int iJ = ebh.j(this.updated_at, ebh.j(this.created_at, kgh.l(ChatSnapshotId.m989hashCodeimpl(this.uuid) * 31, 31, this.snapshot_name), 31), 31);
        String str = this.project_uuid;
        int iM1083hashCodeimpl = (iJ + (str == null ? 0 : ProjectId.m1083hashCodeimpl(str))) * 31;
        Integer num = this.last_message_index;
        return iM1083hashCodeimpl + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String strM990toStringimpl = ChatSnapshotId.m990toStringimpl(this.uuid);
        String str = this.snapshot_name;
        Date date = this.created_at;
        Date date2 = this.updated_at;
        String str2 = this.project_uuid;
        String strM1084toStringimpl = str2 == null ? "null" : ProjectId.m1084toStringimpl(str2);
        Integer num = this.last_message_index;
        StringBuilder sbR = kgh.r("ChatSnapshotSummary(uuid=", strM990toStringimpl, ", snapshot_name=", str, ", created_at=");
        sbR.append(date);
        sbR.append(", updated_at=");
        sbR.append(date2);
        sbR.append(", project_uuid=");
        sbR.append(strM1084toStringimpl);
        sbR.append(", last_message_index=");
        sbR.append(num);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ ChatSnapshotSummary(String str, String str2, Date date, Date date2, String str3, Integer num, mq5 mq5Var) {
        this(str, str2, date, date2, str3, num);
    }

    public /* synthetic */ ChatSnapshotSummary(int i, String str, String str2, Date date, Date date2, String str3, Integer num, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, date, date2, str3, num, vnfVar);
    }

    private ChatSnapshotSummary(String str, String str2, Date date, Date date2, String str3, Integer num) {
        str.getClass();
        str2.getClass();
        date.getClass();
        date2.getClass();
        this.uuid = str;
        this.snapshot_name = str2;
        this.created_at = date;
        this.updated_at = date2;
        this.project_uuid = str3;
        this.last_message_index = num;
    }

    public /* synthetic */ ChatSnapshotSummary(String str, String str2, Date date, Date date2, String str3, Integer num, int i, mq5 mq5Var) {
        this(str, str2, date, date2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : num, null);
    }
}
