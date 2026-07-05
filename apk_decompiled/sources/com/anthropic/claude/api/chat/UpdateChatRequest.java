package com.anthropic.claude.api.chat;

import defpackage.ihi;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.thi;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ4\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b\u0005\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001d¨\u0006."}, d2 = {"Lcom/anthropic/claude/api/chat/UpdateChatRequest;", "", "", "name", "", "is_starred", "Lcom/anthropic/claude/api/chat/UpdatableChatConversationSettings;", "settings", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/anthropic/claude/api/chat/UpdatableChatConversationSettings;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Boolean;Lcom/anthropic/claude/api/chat/UpdatableChatConversationSettings;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/UpdateChatRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Lcom/anthropic/claude/api/chat/UpdatableChatConversationSettings;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/anthropic/claude/api/chat/UpdatableChatConversationSettings;)Lcom/anthropic/claude/api/chat/UpdateChatRequest;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Ljava/lang/Boolean;", "Lcom/anthropic/claude/api/chat/UpdatableChatConversationSettings;", "getSettings", "Companion", "shi", "thi", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class UpdateChatRequest {
    public static final int $stable = 0;
    public static final thi Companion = new thi();
    private final Boolean is_starred;
    private final String name;
    private final UpdatableChatConversationSettings settings;

    public /* synthetic */ UpdateChatRequest(int i, String str, Boolean bool, UpdatableChatConversationSettings updatableChatConversationSettings, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.is_starred = null;
        } else {
            this.is_starred = bool;
        }
        if ((i & 4) == 0) {
            this.settings = null;
        } else {
            this.settings = updatableChatConversationSettings;
        }
    }

    public static /* synthetic */ UpdateChatRequest copy$default(UpdateChatRequest updateChatRequest, String str, Boolean bool, UpdatableChatConversationSettings updatableChatConversationSettings, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateChatRequest.name;
        }
        if ((i & 2) != 0) {
            bool = updateChatRequest.is_starred;
        }
        if ((i & 4) != 0) {
            updatableChatConversationSettings = updateChatRequest.settings;
        }
        return updateChatRequest.copy(str, bool, updatableChatConversationSettings);
    }

    public static final /* synthetic */ void write$Self$api(UpdateChatRequest self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.name != null) {
            output.B(serialDesc, 0, srg.a, self.name);
        }
        if (output.E(serialDesc) || self.is_starred != null) {
            output.B(serialDesc, 1, zt1.a, self.is_starred);
        }
        if (!output.E(serialDesc) && self.settings == null) {
            return;
        }
        output.B(serialDesc, 2, ihi.a, self.settings);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIs_starred() {
        return this.is_starred;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UpdatableChatConversationSettings getSettings() {
        return this.settings;
    }

    public final UpdateChatRequest copy(String name, Boolean is_starred, UpdatableChatConversationSettings settings) {
        return new UpdateChatRequest(name, is_starred, settings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateChatRequest)) {
            return false;
        }
        UpdateChatRequest updateChatRequest = (UpdateChatRequest) other;
        return x44.r(this.name, updateChatRequest.name) && x44.r(this.is_starred, updateChatRequest.is_starred) && x44.r(this.settings, updateChatRequest.settings);
    }

    public final String getName() {
        return this.name;
    }

    public final UpdatableChatConversationSettings getSettings() {
        return this.settings;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.is_starred;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        UpdatableChatConversationSettings updatableChatConversationSettings = this.settings;
        return iHashCode2 + (updatableChatConversationSettings != null ? updatableChatConversationSettings.hashCode() : 0);
    }

    public final Boolean is_starred() {
        return this.is_starred;
    }

    public String toString() {
        return "UpdateChatRequest(name=" + this.name + ", is_starred=" + this.is_starred + ", settings=" + this.settings + ")";
    }

    public UpdateChatRequest() {
        this((String) null, (Boolean) null, (UpdatableChatConversationSettings) null, 7, (mq5) null);
    }

    public UpdateChatRequest(String str, Boolean bool, UpdatableChatConversationSettings updatableChatConversationSettings) {
        this.name = str;
        this.is_starred = bool;
        this.settings = updatableChatConversationSettings;
    }

    public /* synthetic */ UpdateChatRequest(String str, Boolean bool, UpdatableChatConversationSettings updatableChatConversationSettings, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : updatableChatConversationSettings);
    }
}
