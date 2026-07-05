package com.anthropic.claude.conway.protocol;

import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.y65;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006'"}, d2 = {"Lcom/anthropic/claude/conway/protocol/CreateForkRequest;", "", "", "label", "firstMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/CreateForkRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/conway/protocol/CreateForkRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "getFirstMessage", "Companion", "x65", "y65", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CreateForkRequest {
    public static final int $stable = 0;
    public static final y65 Companion = new y65();
    private final String firstMessage;
    private final String label;

    public /* synthetic */ CreateForkRequest(int i, String str, String str2, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.label = null;
        } else {
            this.label = str;
        }
        if ((i & 2) == 0) {
            this.firstMessage = null;
        } else {
            this.firstMessage = str2;
        }
    }

    public static /* synthetic */ CreateForkRequest copy$default(CreateForkRequest createForkRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createForkRequest.label;
        }
        if ((i & 2) != 0) {
            str2 = createForkRequest.firstMessage;
        }
        return createForkRequest.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$conway(CreateForkRequest self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.label != null) {
            output.B(serialDesc, 0, srg.a, self.label);
        }
        if (!output.E(serialDesc) && self.firstMessage == null) {
            return;
        }
        output.B(serialDesc, 1, srg.a, self.firstMessage);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirstMessage() {
        return this.firstMessage;
    }

    public final CreateForkRequest copy(String label, String firstMessage) {
        return new CreateForkRequest(label, firstMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateForkRequest)) {
            return false;
        }
        CreateForkRequest createForkRequest = (CreateForkRequest) other;
        return x44.r(this.label, createForkRequest.label) && x44.r(this.firstMessage, createForkRequest.firstMessage);
    }

    public final String getFirstMessage() {
        return this.firstMessage;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        String str = this.label;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.firstMessage;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return ij0.l("CreateForkRequest(label=", this.label, ", firstMessage=", this.firstMessage, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CreateForkRequest() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public CreateForkRequest(String str, String str2) {
        this.label = str;
        this.firstMessage = str2;
    }

    public /* synthetic */ CreateForkRequest(String str, String str2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
