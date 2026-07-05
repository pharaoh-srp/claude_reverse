package com.anthropic.claude.sessions.types;

import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.m1g;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.n1g;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import defpackage.ztf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ:\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001f¨\u00063"}, d2 = {"Lcom/anthropic/claude/sessions/types/ShareRecord;", "", "", "share_id", "Lcom/anthropic/claude/sessions/types/ShareStatus;", "status", "created_at", "Lcom/anthropic/claude/sessions/types/ShareVisibilityType;", "visibility_type", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/ShareStatus;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/ShareVisibilityType;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/sessions/types/ShareStatus;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/ShareVisibilityType;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/ShareRecord;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/sessions/types/ShareStatus;", "component3", "component4", "()Lcom/anthropic/claude/sessions/types/ShareVisibilityType;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/sessions/types/ShareStatus;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/ShareVisibilityType;)Lcom/anthropic/claude/sessions/types/ShareRecord;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getShare_id", "Lcom/anthropic/claude/sessions/types/ShareStatus;", "getStatus", "getCreated_at", "Lcom/anthropic/claude/sessions/types/ShareVisibilityType;", "getVisibility_type", "Companion", "m1g", "n1g", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ShareRecord {
    private static final kw9[] $childSerializers;
    public static final n1g Companion = new n1g();
    private final String created_at;
    private final String share_id;
    private final ShareStatus status;
    private final ShareVisibilityType visibility_type;

    static {
        ztf ztfVar = new ztf(25);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, yb5.w(w1aVar, ztfVar), null, yb5.w(w1aVar, new ztf(26))};
    }

    public /* synthetic */ ShareRecord(int i, String str, ShareStatus shareStatus, String str2, ShareVisibilityType shareVisibilityType, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, m1g.a.getDescriptor());
            throw null;
        }
        this.share_id = str;
        this.status = shareStatus;
        this.created_at = str2;
        if ((i & 8) == 0) {
            this.visibility_type = null;
        } else {
            this.visibility_type = shareVisibilityType;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return ShareStatus.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return ShareVisibilityType.Companion.serializer();
    }

    public static /* synthetic */ ShareRecord copy$default(ShareRecord shareRecord, String str, ShareStatus shareStatus, String str2, ShareVisibilityType shareVisibilityType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareRecord.share_id;
        }
        if ((i & 2) != 0) {
            shareStatus = shareRecord.status;
        }
        if ((i & 4) != 0) {
            str2 = shareRecord.created_at;
        }
        if ((i & 8) != 0) {
            shareVisibilityType = shareRecord.visibility_type;
        }
        return shareRecord.copy(str, shareStatus, str2, shareVisibilityType);
    }

    public static final /* synthetic */ void write$Self$sessions(ShareRecord self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.share_id);
        output.r(serialDesc, 1, (znf) kw9VarArr[1].getValue(), self.status);
        output.q(serialDesc, 2, self.created_at);
        if (!output.E(serialDesc) && self.visibility_type == null) {
            return;
        }
        output.B(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.visibility_type);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getShare_id() {
        return this.share_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ShareStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ShareVisibilityType getVisibility_type() {
        return this.visibility_type;
    }

    public final ShareRecord copy(String share_id, ShareStatus status, String created_at, ShareVisibilityType visibility_type) {
        share_id.getClass();
        status.getClass();
        created_at.getClass();
        return new ShareRecord(share_id, status, created_at, visibility_type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareRecord)) {
            return false;
        }
        ShareRecord shareRecord = (ShareRecord) other;
        return x44.r(this.share_id, shareRecord.share_id) && this.status == shareRecord.status && x44.r(this.created_at, shareRecord.created_at) && this.visibility_type == shareRecord.visibility_type;
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    public final String getShare_id() {
        return this.share_id;
    }

    public final ShareStatus getStatus() {
        return this.status;
    }

    public final ShareVisibilityType getVisibility_type() {
        return this.visibility_type;
    }

    public int hashCode() {
        int iL = kgh.l((this.status.hashCode() + (this.share_id.hashCode() * 31)) * 31, 31, this.created_at);
        ShareVisibilityType shareVisibilityType = this.visibility_type;
        return iL + (shareVisibilityType == null ? 0 : shareVisibilityType.hashCode());
    }

    public String toString() {
        return "ShareRecord(share_id=" + this.share_id + ", status=" + this.status + ", created_at=" + this.created_at + ", visibility_type=" + this.visibility_type + ")";
    }

    public ShareRecord(String str, ShareStatus shareStatus, String str2, ShareVisibilityType shareVisibilityType) {
        str.getClass();
        shareStatus.getClass();
        str2.getClass();
        this.share_id = str;
        this.status = shareStatus;
        this.created_at = str2;
        this.visibility_type = shareVisibilityType;
    }

    public /* synthetic */ ShareRecord(String str, ShareStatus shareStatus, String str2, ShareVisibilityType shareVisibilityType, int i, mq5 mq5Var) {
        this(str, shareStatus, str2, (i & 8) != 0 ? null : shareVisibilityType);
    }
}
