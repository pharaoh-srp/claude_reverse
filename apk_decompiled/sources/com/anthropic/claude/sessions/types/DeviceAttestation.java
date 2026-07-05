package com.anthropic.claude.sessions.types;

import defpackage.gvj;
import defpackage.i26;
import defpackage.ij0;
import defpackage.j26;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006'"}, d2 = {"Lcom/anthropic/claude/sessions/types/DeviceAttestation;", "", "", "kid", "signature", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/DeviceAttestation;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/sessions/types/DeviceAttestation;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKid", "getSignature", "Companion", "i26", "j26", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class DeviceAttestation {
    public static final j26 Companion = new j26();
    private final String kid;
    private final String signature;

    public /* synthetic */ DeviceAttestation(int i, String str, String str2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, i26.a.getDescriptor());
            throw null;
        }
        this.kid = str;
        this.signature = str2;
    }

    public static /* synthetic */ DeviceAttestation copy$default(DeviceAttestation deviceAttestation, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceAttestation.kid;
        }
        if ((i & 2) != 0) {
            str2 = deviceAttestation.signature;
        }
        return deviceAttestation.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$sessions(DeviceAttestation self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.kid);
        output.q(serialDesc, 1, self.signature);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKid() {
        return this.kid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    public final DeviceAttestation copy(String kid, String signature) {
        kid.getClass();
        signature.getClass();
        return new DeviceAttestation(kid, signature);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceAttestation)) {
            return false;
        }
        DeviceAttestation deviceAttestation = (DeviceAttestation) other;
        return x44.r(this.kid, deviceAttestation.kid) && x44.r(this.signature, deviceAttestation.signature);
    }

    public final String getKid() {
        return this.kid;
    }

    public final String getSignature() {
        return this.signature;
    }

    public int hashCode() {
        return this.signature.hashCode() + (this.kid.hashCode() * 31);
    }

    public String toString() {
        return ij0.l("DeviceAttestation(kid=", this.kid, ", signature=", this.signature, ")");
    }

    public DeviceAttestation(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.kid = str;
        this.signature = str2;
    }
}
