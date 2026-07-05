package com.anthropic.claude.sessions.types;

import defpackage.gvj;
import defpackage.i26;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.to3;
import defpackage.uh9;
import defpackage.uo3;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019¨\u0006,"}, d2 = {"Lcom/anthropic/claude/sessions/types/ClientEventEnvelope;", "", "Lkotlinx/serialization/json/JsonObject;", "payload", "Lcom/anthropic/claude/sessions/types/DeviceAttestation;", "device_attestation", "<init>", "(Lkotlinx/serialization/json/JsonObject;Lcom/anthropic/claude/sessions/types/DeviceAttestation;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILkotlinx/serialization/json/JsonObject;Lcom/anthropic/claude/sessions/types/DeviceAttestation;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/ClientEventEnvelope;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lkotlinx/serialization/json/JsonObject;", "component2", "()Lcom/anthropic/claude/sessions/types/DeviceAttestation;", "copy", "(Lkotlinx/serialization/json/JsonObject;Lcom/anthropic/claude/sessions/types/DeviceAttestation;)Lcom/anthropic/claude/sessions/types/ClientEventEnvelope;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/serialization/json/JsonObject;", "getPayload", "Lcom/anthropic/claude/sessions/types/DeviceAttestation;", "getDevice_attestation", "Companion", "to3", "uo3", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ClientEventEnvelope {
    public static final uo3 Companion = new uo3();
    private final DeviceAttestation device_attestation;
    private final JsonObject payload;

    public /* synthetic */ ClientEventEnvelope(int i, JsonObject jsonObject, DeviceAttestation deviceAttestation, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, to3.a.getDescriptor());
            throw null;
        }
        this.payload = jsonObject;
        if ((i & 2) == 0) {
            this.device_attestation = null;
        } else {
            this.device_attestation = deviceAttestation;
        }
    }

    public static /* synthetic */ ClientEventEnvelope copy$default(ClientEventEnvelope clientEventEnvelope, JsonObject jsonObject, DeviceAttestation deviceAttestation, int i, Object obj) {
        if ((i & 1) != 0) {
            jsonObject = clientEventEnvelope.payload;
        }
        if ((i & 2) != 0) {
            deviceAttestation = clientEventEnvelope.device_attestation;
        }
        return clientEventEnvelope.copy(jsonObject, deviceAttestation);
    }

    public static final /* synthetic */ void write$Self$sessions(ClientEventEnvelope self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, uh9.a, self.payload);
        if (!output.E(serialDesc) && self.device_attestation == null) {
            return;
        }
        output.B(serialDesc, 1, i26.a, self.device_attestation);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JsonObject getPayload() {
        return this.payload;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DeviceAttestation getDevice_attestation() {
        return this.device_attestation;
    }

    public final ClientEventEnvelope copy(JsonObject payload, DeviceAttestation device_attestation) {
        payload.getClass();
        return new ClientEventEnvelope(payload, device_attestation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClientEventEnvelope)) {
            return false;
        }
        ClientEventEnvelope clientEventEnvelope = (ClientEventEnvelope) other;
        return x44.r(this.payload, clientEventEnvelope.payload) && x44.r(this.device_attestation, clientEventEnvelope.device_attestation);
    }

    public final DeviceAttestation getDevice_attestation() {
        return this.device_attestation;
    }

    public final JsonObject getPayload() {
        return this.payload;
    }

    public int hashCode() {
        int iHashCode = this.payload.hashCode() * 31;
        DeviceAttestation deviceAttestation = this.device_attestation;
        return iHashCode + (deviceAttestation == null ? 0 : deviceAttestation.hashCode());
    }

    public String toString() {
        return "ClientEventEnvelope(payload=" + this.payload + ", device_attestation=" + this.device_attestation + ")";
    }

    public ClientEventEnvelope(JsonObject jsonObject, DeviceAttestation deviceAttestation) {
        jsonObject.getClass();
        this.payload = jsonObject;
        this.device_attestation = deviceAttestation;
    }

    public /* synthetic */ ClientEventEnvelope(JsonObject jsonObject, DeviceAttestation deviceAttestation, int i, mq5 mq5Var) {
        this(jsonObject, (i & 2) != 0 ? null : deviceAttestation);
    }
}
