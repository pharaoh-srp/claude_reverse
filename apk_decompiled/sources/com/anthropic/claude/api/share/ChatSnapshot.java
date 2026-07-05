package com.anthropic.claude.api.share;

import com.anthropic.claude.api.chat.ChatMessage;
import com.anthropic.claude.types.strings.ChatSnapshotId;
import com.anthropic.claude.types.strings.ProjectId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.ac3;
import defpackage.bc3;
import defpackage.bc9;
import defpackage.ebh;
import defpackage.emd;
import defpackage.fsh;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qkd;
import defpackage.ty2;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wy2;
import defpackage.yb5;
import defpackage.zb3;
import defpackage.znf;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002KLB{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0019\u0010\r\u001a\u00150\bj\u0002`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\u0019\u0010\u000e\u001a\u00150\bj\u0002`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017Bo\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ'\u0010%\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010'J\u0010\u0010*\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b*\u0010+J#\u0010,\u001a\u00150\bj\u0002`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\fHÆ\u0003¢\u0006\u0004\b,\u0010-J#\u0010.\u001a\u00150\bj\u0002`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\fHÆ\u0003¢\u0006\u0004\b.\u0010-J\u0012\u00100\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b/\u0010'J\u0010\u00101\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b3\u00104J\u0090\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001b\b\u0002\u0010\r\u001a\u00150\bj\u0002`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f2\u001b\b\u0002\u0010\u000e\u001a\u00150\bj\u0002`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00108\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b8\u0010'J\u0010\u00109\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010<\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\b@\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010A\u001a\u0004\b\u0007\u0010+R*\u0010\r\u001a\u00150\bj\u0002`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bC\u0010-R*\u0010\u000e\u001a\u00150\bj\u0002`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\bD\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\bE\u0010'R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010F\u001a\u0004\bG\u00102R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010H\u001a\u0004\bI\u00104¨\u0006M"}, d2 = {"Lcom/anthropic/claude/api/share/ChatSnapshot;", "", "Lcom/anthropic/claude/types/strings/ChatSnapshotId;", "uuid", "", "snapshot_name", "", "is_public", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "created_at", "updated_at", "Lcom/anthropic/claude/types/strings/ProjectId;", "project_uuid", "Lcom/anthropic/claude/api/share/ProjectCreator;", "creator", "", "Lcom/anthropic/claude/api/chat/ChatMessage;", "chat_messages", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/anthropic/claude/api/share/ProjectCreator;Ljava/util/List;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/anthropic/claude/api/share/ProjectCreator;Ljava/util/List;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/share/ChatSnapshot;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-N1vkeFQ", "()Ljava/lang/String;", "component1", "component2", "component3", "()Z", "component4", "()Ljava/util/Date;", "component5", "component6-v-f-JkQ", "component6", "component7", "()Lcom/anthropic/claude/api/share/ProjectCreator;", "component8", "()Ljava/util/List;", "copy-rgTLIsE", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/anthropic/claude/api/share/ProjectCreator;Ljava/util/List;)Lcom/anthropic/claude/api/share/ChatSnapshot;", "copy", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid-N1vkeFQ", "getSnapshot_name", "Z", "Ljava/util/Date;", "getCreated_at", "getUpdated_at", "getProject_uuid-v-f-JkQ", "Lcom/anthropic/claude/api/share/ProjectCreator;", "getCreator", "Ljava/util/List;", "getChat_messages", "Companion", "zb3", "ac3", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatSnapshot {
    public static final int $stable = 0;
    private final List<ChatMessage> chat_messages;
    private final Date created_at;
    private final ProjectCreator creator;
    private final boolean is_public;
    private final String project_uuid;
    private final String snapshot_name;
    private final Date updated_at;
    private final String uuid;
    public static final ac3 Companion = new ac3();
    private static final kw9[] $childSerializers = {null, null, null, null, null, null, null, yb5.w(w1a.F, new wy2(17))};

    private /* synthetic */ ChatSnapshot(int i, String str, String str2, boolean z, Date date, Date date2, String str3, ProjectCreator projectCreator, List list, vnf vnfVar) {
        if (95 != (i & 95)) {
            gvj.f(i, 95, zb3.a.getDescriptor());
            throw null;
        }
        this.uuid = str;
        this.snapshot_name = str2;
        this.is_public = z;
        this.created_at = date;
        this.updated_at = date2;
        if ((i & 32) == 0) {
            this.project_uuid = null;
        } else {
            this.project_uuid = str3;
        }
        this.creator = projectCreator;
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.chat_messages = null;
        } else {
            this.chat_messages = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(ty2.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-rgTLIsE$default, reason: not valid java name */
    public static /* synthetic */ ChatSnapshot m415copyrgTLIsE$default(ChatSnapshot chatSnapshot, String str, String str2, boolean z, Date date, Date date2, String str3, ProjectCreator projectCreator, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatSnapshot.uuid;
        }
        if ((i & 2) != 0) {
            str2 = chatSnapshot.snapshot_name;
        }
        if ((i & 4) != 0) {
            z = chatSnapshot.is_public;
        }
        if ((i & 8) != 0) {
            date = chatSnapshot.created_at;
        }
        if ((i & 16) != 0) {
            date2 = chatSnapshot.updated_at;
        }
        if ((i & 32) != 0) {
            str3 = chatSnapshot.project_uuid;
        }
        if ((i & 64) != 0) {
            projectCreator = chatSnapshot.creator;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            list = chatSnapshot.chat_messages;
        }
        ProjectCreator projectCreator2 = projectCreator;
        List list2 = list;
        Date date3 = date2;
        String str4 = str3;
        return chatSnapshot.m418copyrgTLIsE(str, str2, z, date, date3, str4, projectCreator2, list2);
    }

    public static final /* synthetic */ void write$Self$api(ChatSnapshot self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.r(serialDesc, 0, bc3.a, ChatSnapshotId.m985boximpl(self.uuid));
        output.q(serialDesc, 1, self.snapshot_name);
        output.p(serialDesc, 2, self.is_public);
        bc9 bc9Var = bc9.a;
        output.r(serialDesc, 3, bc9Var, self.created_at);
        output.r(serialDesc, 4, bc9Var, self.updated_at);
        if (output.E(serialDesc) || self.project_uuid != null) {
            emd emdVar = emd.a;
            String str = self.project_uuid;
            output.B(serialDesc, 5, emdVar, str != null ? ProjectId.m1079boximpl(str) : null);
        }
        output.r(serialDesc, 6, qkd.a, self.creator);
        if (!output.E(serialDesc) && self.chat_messages == null) {
            return;
        }
        output.B(serialDesc, 7, (znf) kw9VarArr[7].getValue(), self.chat_messages);
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
    public final boolean getIs_public() {
        return this.is_public;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: component6-v-f-JkQ, reason: not valid java name and from getter */
    public final String getProject_uuid() {
        return this.project_uuid;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ProjectCreator getCreator() {
        return this.creator;
    }

    public final List<ChatMessage> component8() {
        return this.chat_messages;
    }

    /* JADX INFO: renamed from: copy-rgTLIsE, reason: not valid java name */
    public final ChatSnapshot m418copyrgTLIsE(String uuid, String snapshot_name, boolean is_public, Date created_at, Date updated_at, String project_uuid, ProjectCreator creator, List<ChatMessage> chat_messages) {
        uuid.getClass();
        snapshot_name.getClass();
        created_at.getClass();
        updated_at.getClass();
        creator.getClass();
        return new ChatSnapshot(uuid, snapshot_name, is_public, created_at, updated_at, project_uuid, creator, chat_messages, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
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
            boolean r1 = r5 instanceof com.anthropic.claude.api.share.ChatSnapshot
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.api.share.ChatSnapshot r5 = (com.anthropic.claude.api.share.ChatSnapshot) r5
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
            boolean r1 = r4.is_public
            boolean r3 = r5.is_public
            if (r1 == r3) goto L29
            return r2
        L29:
            java.util.Date r1 = r4.created_at
            java.util.Date r3 = r5.created_at
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L34
            return r2
        L34:
            java.util.Date r1 = r4.updated_at
            java.util.Date r3 = r5.updated_at
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L3f
            return r2
        L3f:
            java.lang.String r1 = r4.project_uuid
            java.lang.String r3 = r5.project_uuid
            if (r1 != 0) goto L4b
            if (r3 != 0) goto L49
            r1 = r0
            goto L52
        L49:
            r1 = r2
            goto L52
        L4b:
            if (r3 != 0) goto L4e
            goto L49
        L4e:
            boolean r1 = com.anthropic.claude.types.strings.ProjectId.m1082equalsimpl0(r1, r3)
        L52:
            if (r1 != 0) goto L55
            return r2
        L55:
            com.anthropic.claude.api.share.ProjectCreator r1 = r4.creator
            com.anthropic.claude.api.share.ProjectCreator r3 = r5.creator
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L60
            return r2
        L60:
            java.util.List<com.anthropic.claude.api.chat.ChatMessage> r4 = r4.chat_messages
            java.util.List<com.anthropic.claude.api.chat.ChatMessage> r5 = r5.chat_messages
            boolean r4 = defpackage.x44.r(r4, r5)
            if (r4 != 0) goto L6b
            return r2
        L6b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.api.share.ChatSnapshot.equals(java.lang.Object):boolean");
    }

    public final List<ChatMessage> getChat_messages() {
        return this.chat_messages;
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    public final ProjectCreator getCreator() {
        return this.creator;
    }

    /* JADX INFO: renamed from: getProject_uuid-v-f-JkQ, reason: not valid java name */
    public final String m419getProject_uuidvfJkQ() {
        return this.project_uuid;
    }

    public final String getSnapshot_name() {
        return this.snapshot_name;
    }

    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: getUuid-N1vkeFQ, reason: not valid java name */
    public final String m420getUuidN1vkeFQ() {
        return this.uuid;
    }

    public int hashCode() {
        int iJ = ebh.j(this.updated_at, ebh.j(this.created_at, fsh.p(kgh.l(ChatSnapshotId.m989hashCodeimpl(this.uuid) * 31, 31, this.snapshot_name), 31, this.is_public), 31), 31);
        String str = this.project_uuid;
        int iHashCode = (this.creator.hashCode() + ((iJ + (str == null ? 0 : ProjectId.m1083hashCodeimpl(str))) * 31)) * 31;
        List<ChatMessage> list = this.chat_messages;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final boolean is_public() {
        return this.is_public;
    }

    public String toString() {
        String strM990toStringimpl = ChatSnapshotId.m990toStringimpl(this.uuid);
        String str = this.snapshot_name;
        boolean z = this.is_public;
        Date date = this.created_at;
        Date date2 = this.updated_at;
        String str2 = this.project_uuid;
        String strM1084toStringimpl = str2 == null ? "null" : ProjectId.m1084toStringimpl(str2);
        ProjectCreator projectCreator = this.creator;
        List<ChatMessage> list = this.chat_messages;
        StringBuilder sbR = kgh.r("ChatSnapshot(uuid=", strM990toStringimpl, ", snapshot_name=", str, ", is_public=");
        sbR.append(z);
        sbR.append(", created_at=");
        sbR.append(date);
        sbR.append(", updated_at=");
        sbR.append(date2);
        sbR.append(", project_uuid=");
        sbR.append(strM1084toStringimpl);
        sbR.append(", creator=");
        sbR.append(projectCreator);
        sbR.append(", chat_messages=");
        sbR.append(list);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ ChatSnapshot(String str, String str2, boolean z, Date date, Date date2, String str3, ProjectCreator projectCreator, List list, mq5 mq5Var) {
        this(str, str2, z, date, date2, str3, projectCreator, list);
    }

    public /* synthetic */ ChatSnapshot(int i, String str, String str2, boolean z, Date date, Date date2, String str3, ProjectCreator projectCreator, List list, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, z, date, date2, str3, projectCreator, list, vnfVar);
    }

    private ChatSnapshot(String str, String str2, boolean z, Date date, Date date2, String str3, ProjectCreator projectCreator, List<ChatMessage> list) {
        str.getClass();
        str2.getClass();
        date.getClass();
        date2.getClass();
        projectCreator.getClass();
        this.uuid = str;
        this.snapshot_name = str2;
        this.is_public = z;
        this.created_at = date;
        this.updated_at = date2;
        this.project_uuid = str3;
        this.creator = projectCreator;
        this.chat_messages = list;
    }

    public /* synthetic */ ChatSnapshot(String str, String str2, boolean z, Date date, Date date2, String str3, ProjectCreator projectCreator, List list, int i, mq5 mq5Var) {
        this(str, str2, z, date, date2, (i & 32) != 0 ? null : str3, projectCreator, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : list, null);
    }
}
