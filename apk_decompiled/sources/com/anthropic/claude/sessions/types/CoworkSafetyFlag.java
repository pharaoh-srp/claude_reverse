package com.anthropic.claude.sessions.types;

import com.anthropic.claude.api.chat.messages.ApiHelpline;
import defpackage.ef0;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.n55;
import defpackage.o55;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lcom/anthropic/claude/sessions/types/CoworkSafetyFlag;", "", "", "type", "Lcom/anthropic/claude/api/chat/messages/ApiHelpline;", "helpline", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/api/chat/messages/ApiHelpline;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/api/chat/messages/ApiHelpline;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/CoworkSafetyFlag;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/anthropic/claude/api/chat/messages/ApiHelpline;", "copy", "(Ljava/lang/String;Lcom/anthropic/claude/api/chat/messages/ApiHelpline;)Lcom/anthropic/claude/sessions/types/CoworkSafetyFlag;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "Lcom/anthropic/claude/api/chat/messages/ApiHelpline;", "getHelpline", "Companion", "n55", "o55", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CoworkSafetyFlag {
    public static final o55 Companion = new o55();
    private final ApiHelpline helpline;
    private final String type;

    public /* synthetic */ CoworkSafetyFlag(int i, String str, ApiHelpline apiHelpline, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, n55.a.getDescriptor());
            throw null;
        }
        this.type = str;
        if ((i & 2) == 0) {
            this.helpline = null;
        } else {
            this.helpline = apiHelpline;
        }
    }

    public static /* synthetic */ CoworkSafetyFlag copy$default(CoworkSafetyFlag coworkSafetyFlag, String str, ApiHelpline apiHelpline, int i, Object obj) {
        if ((i & 1) != 0) {
            str = coworkSafetyFlag.type;
        }
        if ((i & 2) != 0) {
            apiHelpline = coworkSafetyFlag.helpline;
        }
        return coworkSafetyFlag.copy(str, apiHelpline);
    }

    public static final /* synthetic */ void write$Self$sessions(CoworkSafetyFlag self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.type);
        if (!output.E(serialDesc) && self.helpline == null) {
            return;
        }
        output.B(serialDesc, 1, ef0.a, self.helpline);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ApiHelpline getHelpline() {
        return this.helpline;
    }

    public final CoworkSafetyFlag copy(String type, ApiHelpline helpline) {
        type.getClass();
        return new CoworkSafetyFlag(type, helpline);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoworkSafetyFlag)) {
            return false;
        }
        CoworkSafetyFlag coworkSafetyFlag = (CoworkSafetyFlag) other;
        return x44.r(this.type, coworkSafetyFlag.type) && x44.r(this.helpline, coworkSafetyFlag.helpline);
    }

    public final ApiHelpline getHelpline() {
        return this.helpline;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        ApiHelpline apiHelpline = this.helpline;
        return iHashCode + (apiHelpline == null ? 0 : apiHelpline.hashCode());
    }

    public String toString() {
        return "CoworkSafetyFlag(type=" + this.type + ", helpline=" + this.helpline + ")";
    }

    public CoworkSafetyFlag(String str, ApiHelpline apiHelpline) {
        str.getClass();
        this.type = str;
        this.helpline = apiHelpline;
    }

    public /* synthetic */ CoworkSafetyFlag(String str, ApiHelpline apiHelpline, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : apiHelpline);
    }
}
