package com.anthropic.claude.sessions.types;

import defpackage.c69;
import defpackage.fp3;
import defpackage.g69;
import defpackage.gp3;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006-"}, d2 = {"Lcom/anthropic/claude/sessions/types/ClientPresenceInfo;", "", "", "platform", "client_id", "Lc69;", "last_pulse_at", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lc69;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lc69;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/ClientPresenceInfo;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lc69;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lc69;)Lcom/anthropic/claude/sessions/types/ClientPresenceInfo;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPlatform", "getClient_id", "Lc69;", "getLast_pulse_at", "Companion", "fp3", "gp3", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ClientPresenceInfo {
    public static final gp3 Companion = new gp3();
    private final String client_id;
    private final c69 last_pulse_at;
    private final String platform;

    public /* synthetic */ ClientPresenceInfo(int i, String str, String str2, c69 c69Var, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, fp3.a.getDescriptor());
            throw null;
        }
        this.platform = str;
        this.client_id = str2;
        this.last_pulse_at = c69Var;
    }

    public static /* synthetic */ ClientPresenceInfo copy$default(ClientPresenceInfo clientPresenceInfo, String str, String str2, c69 c69Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clientPresenceInfo.platform;
        }
        if ((i & 2) != 0) {
            str2 = clientPresenceInfo.client_id;
        }
        if ((i & 4) != 0) {
            c69Var = clientPresenceInfo.last_pulse_at;
        }
        return clientPresenceInfo.copy(str, str2, c69Var);
    }

    public static final /* synthetic */ void write$Self$sessions(ClientPresenceInfo self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.platform);
        output.q(serialDesc, 1, self.client_id);
        output.r(serialDesc, 2, g69.a, self.last_pulse_at);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getClient_id() {
        return this.client_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final c69 getLast_pulse_at() {
        return this.last_pulse_at;
    }

    public final ClientPresenceInfo copy(String platform, String client_id, c69 last_pulse_at) {
        platform.getClass();
        client_id.getClass();
        last_pulse_at.getClass();
        return new ClientPresenceInfo(platform, client_id, last_pulse_at);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClientPresenceInfo)) {
            return false;
        }
        ClientPresenceInfo clientPresenceInfo = (ClientPresenceInfo) other;
        return x44.r(this.platform, clientPresenceInfo.platform) && x44.r(this.client_id, clientPresenceInfo.client_id) && x44.r(this.last_pulse_at, clientPresenceInfo.last_pulse_at);
    }

    public final String getClient_id() {
        return this.client_id;
    }

    public final c69 getLast_pulse_at() {
        return this.last_pulse_at;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public int hashCode() {
        return this.last_pulse_at.hashCode() + kgh.l(this.platform.hashCode() * 31, 31, this.client_id);
    }

    public String toString() {
        String str = this.platform;
        String str2 = this.client_id;
        c69 c69Var = this.last_pulse_at;
        StringBuilder sbR = kgh.r("ClientPresenceInfo(platform=", str, ", client_id=", str2, ", last_pulse_at=");
        sbR.append(c69Var);
        sbR.append(")");
        return sbR.toString();
    }

    public ClientPresenceInfo(String str, String str2, c69 c69Var) {
        str.getClass();
        str2.getClass();
        c69Var.getClass();
        this.platform = str;
        this.client_id = str2;
        this.last_pulse_at = c69Var;
    }
}
