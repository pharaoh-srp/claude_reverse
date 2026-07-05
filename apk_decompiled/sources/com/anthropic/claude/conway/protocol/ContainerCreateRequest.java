package com.anthropic.claude.conway.protocol;

import defpackage.gvj;
import defpackage.km4;
import defpackage.lm4;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zo3;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0081\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0019¨\u0006-"}, d2 = {"Lcom/anthropic/claude/conway/protocol/ContainerCreateRequest;", "", "Lcom/anthropic/claude/conway/protocol/ClientMeta;", "client", "", "forceNew", "<init>", "(Lcom/anthropic/claude/conway/protocol/ClientMeta;Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/conway/protocol/ClientMeta;Ljava/lang/Boolean;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$conway", "(Lcom/anthropic/claude/conway/protocol/ContainerCreateRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/conway/protocol/ClientMeta;", "component2", "()Ljava/lang/Boolean;", "copy", "(Lcom/anthropic/claude/conway/protocol/ClientMeta;Ljava/lang/Boolean;)Lcom/anthropic/claude/conway/protocol/ContainerCreateRequest;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/conway/protocol/ClientMeta;", "getClient", "Ljava/lang/Boolean;", "getForceNew", "getForceNew$annotations", "()V", "Companion", "km4", "lm4", "conway"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ContainerCreateRequest {
    public static final int $stable = 0;
    public static final lm4 Companion = new lm4();
    private final ClientMeta client;
    private final Boolean forceNew;

    public /* synthetic */ ContainerCreateRequest(int i, ClientMeta clientMeta, Boolean bool, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, km4.a.getDescriptor());
            throw null;
        }
        this.client = clientMeta;
        if ((i & 2) == 0) {
            this.forceNew = null;
        } else {
            this.forceNew = bool;
        }
    }

    public static /* synthetic */ ContainerCreateRequest copy$default(ContainerCreateRequest containerCreateRequest, ClientMeta clientMeta, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            clientMeta = containerCreateRequest.client;
        }
        if ((i & 2) != 0) {
            bool = containerCreateRequest.forceNew;
        }
        return containerCreateRequest.copy(clientMeta, bool);
    }

    public static /* synthetic */ void getForceNew$annotations() {
    }

    public static final /* synthetic */ void write$Self$conway(ContainerCreateRequest self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, zo3.a, self.client);
        if (!output.E(serialDesc) && self.forceNew == null) {
            return;
        }
        output.B(serialDesc, 1, zt1.a, self.forceNew);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ClientMeta getClient() {
        return this.client;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getForceNew() {
        return this.forceNew;
    }

    public final ContainerCreateRequest copy(ClientMeta client, Boolean forceNew) {
        client.getClass();
        return new ContainerCreateRequest(client, forceNew);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContainerCreateRequest)) {
            return false;
        }
        ContainerCreateRequest containerCreateRequest = (ContainerCreateRequest) other;
        return x44.r(this.client, containerCreateRequest.client) && x44.r(this.forceNew, containerCreateRequest.forceNew);
    }

    public final ClientMeta getClient() {
        return this.client;
    }

    public final Boolean getForceNew() {
        return this.forceNew;
    }

    public int hashCode() {
        int iHashCode = this.client.hashCode() * 31;
        Boolean bool = this.forceNew;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "ContainerCreateRequest(client=" + this.client + ", forceNew=" + this.forceNew + ")";
    }

    public ContainerCreateRequest(ClientMeta clientMeta, Boolean bool) {
        clientMeta.getClass();
        this.client = clientMeta;
        this.forceNew = bool;
    }

    public /* synthetic */ ContainerCreateRequest(ClientMeta clientMeta, Boolean bool, int i, mq5 mq5Var) {
        this(clientMeta, (i & 2) != 0 ? null : bool);
    }
}
