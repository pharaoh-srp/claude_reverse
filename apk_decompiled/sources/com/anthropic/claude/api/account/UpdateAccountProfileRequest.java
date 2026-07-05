package com.anthropic.claude.api.account;

import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nhi;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0015¨\u0006$"}, d2 = {"Lcom/anthropic/claude/api/account/UpdateAccountProfileRequest;", "", "", "conversation_preferences", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/account/UpdateAccountProfileRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/api/account/UpdateAccountProfileRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getConversation_preferences", "Companion", "mhi", "nhi", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class UpdateAccountProfileRequest {
    public static final int $stable = 0;
    public static final nhi Companion = new nhi();
    private final String conversation_preferences;

    public /* synthetic */ UpdateAccountProfileRequest(int i, String str, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.conversation_preferences = null;
        } else {
            this.conversation_preferences = str;
        }
    }

    public static /* synthetic */ UpdateAccountProfileRequest copy$default(UpdateAccountProfileRequest updateAccountProfileRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateAccountProfileRequest.conversation_preferences;
        }
        return updateAccountProfileRequest.copy(str);
    }

    public static final /* synthetic */ void write$Self$api(UpdateAccountProfileRequest self, vd4 output, SerialDescriptor serialDesc) {
        if (!output.E(serialDesc) && self.conversation_preferences == null) {
            return;
        }
        output.B(serialDesc, 0, srg.a, self.conversation_preferences);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConversation_preferences() {
        return this.conversation_preferences;
    }

    public final UpdateAccountProfileRequest copy(String conversation_preferences) {
        return new UpdateAccountProfileRequest(conversation_preferences);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UpdateAccountProfileRequest) && x44.r(this.conversation_preferences, ((UpdateAccountProfileRequest) other).conversation_preferences);
    }

    public final String getConversation_preferences() {
        return this.conversation_preferences;
    }

    public int hashCode() {
        String str = this.conversation_preferences;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return ij0.j("UpdateAccountProfileRequest(conversation_preferences=", this.conversation_preferences, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UpdateAccountProfileRequest() {
        this((String) null, 1, (mq5) (0 == true ? 1 : 0));
    }

    public UpdateAccountProfileRequest(String str) {
        this.conversation_preferences = str;
    }

    public /* synthetic */ UpdateAccountProfileRequest(String str, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str);
    }
}
