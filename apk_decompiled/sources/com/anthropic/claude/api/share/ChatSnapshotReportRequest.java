package com.anthropic.claude.api.share;

import defpackage.ec3;
import defpackage.fc3;
import defpackage.gc3;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qy1;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!JJ\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b/\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010!¨\u00065"}, d2 = {"Lcom/anthropic/claude/api/share/ChatSnapshotReportRequest;", "", "Lcom/anthropic/claude/api/share/ChatSnapshotReportCategory;", "category", "", "notes", "reporter_email", "reporter_name", "", "opt_out_of_training", "<init>", "(Lcom/anthropic/claude/api/share/ChatSnapshotReportCategory;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/share/ChatSnapshotReportCategory;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/share/ChatSnapshotReportRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/api/share/ChatSnapshotReportCategory;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Ljava/lang/Boolean;", "copy", "(Lcom/anthropic/claude/api/share/ChatSnapshotReportCategory;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/anthropic/claude/api/share/ChatSnapshotReportRequest;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/api/share/ChatSnapshotReportCategory;", "getCategory", "Ljava/lang/String;", "getNotes", "getReporter_email", "getReporter_name", "Ljava/lang/Boolean;", "getOpt_out_of_training", "Companion", "fc3", "gc3", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatSnapshotReportRequest {
    public static final int $stable = 0;
    public static final gc3 Companion = new gc3();
    private final ChatSnapshotReportCategory category;
    private final String notes;
    private final Boolean opt_out_of_training;
    private final String reporter_email;
    private final String reporter_name;

    public /* synthetic */ ChatSnapshotReportRequest(int i, ChatSnapshotReportCategory chatSnapshotReportCategory, String str, String str2, String str3, Boolean bool, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, fc3.a.getDescriptor());
            throw null;
        }
        this.category = chatSnapshotReportCategory;
        if ((i & 2) == 0) {
            this.notes = null;
        } else {
            this.notes = str;
        }
        if ((i & 4) == 0) {
            this.reporter_email = null;
        } else {
            this.reporter_email = str2;
        }
        if ((i & 8) == 0) {
            this.reporter_name = null;
        } else {
            this.reporter_name = str3;
        }
        if ((i & 16) == 0) {
            this.opt_out_of_training = null;
        } else {
            this.opt_out_of_training = bool;
        }
    }

    public static /* synthetic */ ChatSnapshotReportRequest copy$default(ChatSnapshotReportRequest chatSnapshotReportRequest, ChatSnapshotReportCategory chatSnapshotReportCategory, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            chatSnapshotReportCategory = chatSnapshotReportRequest.category;
        }
        if ((i & 2) != 0) {
            str = chatSnapshotReportRequest.notes;
        }
        if ((i & 4) != 0) {
            str2 = chatSnapshotReportRequest.reporter_email;
        }
        if ((i & 8) != 0) {
            str3 = chatSnapshotReportRequest.reporter_name;
        }
        if ((i & 16) != 0) {
            bool = chatSnapshotReportRequest.opt_out_of_training;
        }
        Boolean bool2 = bool;
        String str4 = str2;
        return chatSnapshotReportRequest.copy(chatSnapshotReportCategory, str, str4, str3, bool2);
    }

    public static final /* synthetic */ void write$Self$api(ChatSnapshotReportRequest self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, ec3.d, self.category);
        if (output.E(serialDesc) || self.notes != null) {
            output.B(serialDesc, 1, srg.a, self.notes);
        }
        if (output.E(serialDesc) || self.reporter_email != null) {
            output.B(serialDesc, 2, srg.a, self.reporter_email);
        }
        if (output.E(serialDesc) || self.reporter_name != null) {
            output.B(serialDesc, 3, srg.a, self.reporter_name);
        }
        if (!output.E(serialDesc) && self.opt_out_of_training == null) {
            return;
        }
        output.B(serialDesc, 4, zt1.a, self.opt_out_of_training);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ChatSnapshotReportCategory getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getReporter_email() {
        return this.reporter_email;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReporter_name() {
        return this.reporter_name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getOpt_out_of_training() {
        return this.opt_out_of_training;
    }

    public final ChatSnapshotReportRequest copy(ChatSnapshotReportCategory category, String notes, String reporter_email, String reporter_name, Boolean opt_out_of_training) {
        category.getClass();
        return new ChatSnapshotReportRequest(category, notes, reporter_email, reporter_name, opt_out_of_training);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatSnapshotReportRequest)) {
            return false;
        }
        ChatSnapshotReportRequest chatSnapshotReportRequest = (ChatSnapshotReportRequest) other;
        return this.category == chatSnapshotReportRequest.category && x44.r(this.notes, chatSnapshotReportRequest.notes) && x44.r(this.reporter_email, chatSnapshotReportRequest.reporter_email) && x44.r(this.reporter_name, chatSnapshotReportRequest.reporter_name) && x44.r(this.opt_out_of_training, chatSnapshotReportRequest.opt_out_of_training);
    }

    public final ChatSnapshotReportCategory getCategory() {
        return this.category;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final Boolean getOpt_out_of_training() {
        return this.opt_out_of_training;
    }

    public final String getReporter_email() {
        return this.reporter_email;
    }

    public final String getReporter_name() {
        return this.reporter_name;
    }

    public int hashCode() {
        int iHashCode = this.category.hashCode() * 31;
        String str = this.notes;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.reporter_email;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.reporter_name;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.opt_out_of_training;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        ChatSnapshotReportCategory chatSnapshotReportCategory = this.category;
        String str = this.notes;
        String str2 = this.reporter_email;
        String str3 = this.reporter_name;
        Boolean bool = this.opt_out_of_training;
        StringBuilder sb = new StringBuilder("ChatSnapshotReportRequest(category=");
        sb.append(chatSnapshotReportCategory);
        sb.append(", notes=");
        sb.append(str);
        sb.append(", reporter_email=");
        kgh.u(sb, str2, ", reporter_name=", str3, ", opt_out_of_training=");
        return qy1.h(sb, bool, ")");
    }

    public ChatSnapshotReportRequest(ChatSnapshotReportCategory chatSnapshotReportCategory, String str, String str2, String str3, Boolean bool) {
        chatSnapshotReportCategory.getClass();
        this.category = chatSnapshotReportCategory;
        this.notes = str;
        this.reporter_email = str2;
        this.reporter_name = str3;
        this.opt_out_of_training = bool;
    }

    public /* synthetic */ ChatSnapshotReportRequest(ChatSnapshotReportCategory chatSnapshotReportCategory, String str, String str2, String str3, Boolean bool, int i, mq5 mq5Var) {
        this(chatSnapshotReportCategory, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : bool);
    }
}
