package com.anthropic.claude.api.conway;

import defpackage.d95;
import defpackage.e95;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006'"}, d2 = {"Lcom/anthropic/claude/api/conway/CreateWebhookRequest;", "", "", "trigger_word", "label", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/conway/CreateWebhookRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/conway/CreateWebhookRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTrigger_word", "getLabel", "Companion", "d95", "e95", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CreateWebhookRequest {
    public static final int $stable = 0;
    public static final e95 Companion = new e95();
    private final String label;
    private final String trigger_word;

    public /* synthetic */ CreateWebhookRequest(int i, String str, String str2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, d95.a.getDescriptor());
            throw null;
        }
        this.trigger_word = str;
        this.label = str2;
    }

    public static /* synthetic */ CreateWebhookRequest copy$default(CreateWebhookRequest createWebhookRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createWebhookRequest.trigger_word;
        }
        if ((i & 2) != 0) {
            str2 = createWebhookRequest.label;
        }
        return createWebhookRequest.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$api(CreateWebhookRequest self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.trigger_word);
        output.q(serialDesc, 1, self.label);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTrigger_word() {
        return this.trigger_word;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final CreateWebhookRequest copy(String trigger_word, String label) {
        trigger_word.getClass();
        label.getClass();
        return new CreateWebhookRequest(trigger_word, label);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateWebhookRequest)) {
            return false;
        }
        CreateWebhookRequest createWebhookRequest = (CreateWebhookRequest) other;
        return x44.r(this.trigger_word, createWebhookRequest.trigger_word) && x44.r(this.label, createWebhookRequest.label);
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getTrigger_word() {
        return this.trigger_word;
    }

    public int hashCode() {
        return this.label.hashCode() + (this.trigger_word.hashCode() * 31);
    }

    public String toString() {
        return ij0.l("CreateWebhookRequest(trigger_word=", this.trigger_word, ", label=", this.label, ")");
    }

    public CreateWebhookRequest(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.trigger_word = str;
        this.label = str2;
    }
}
