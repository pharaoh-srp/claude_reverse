package com.anthropic.claude.mcpapps.transport;

import defpackage.l26;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0016¨\u0006("}, d2 = {"Lcom/anthropic/claude/mcpapps/transport/DeviceCapabilities;", "", "", "touch", "hover", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Boolean;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_mcpapp", "(Lcom/anthropic/claude/mcpapps/transport/DeviceCapabilities;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Boolean;", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/anthropic/claude/mcpapps/transport/DeviceCapabilities;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getTouch", "getHover", "Companion", "k26", "l26", "Claude:mcpapp"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class DeviceCapabilities {
    public static final int $stable = 0;
    public static final l26 Companion = new l26();
    private final Boolean hover;
    private final Boolean touch;

    public /* synthetic */ DeviceCapabilities(int i, Boolean bool, Boolean bool2, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.touch = null;
        } else {
            this.touch = bool;
        }
        if ((i & 2) == 0) {
            this.hover = null;
        } else {
            this.hover = bool2;
        }
    }

    public static /* synthetic */ DeviceCapabilities copy$default(DeviceCapabilities deviceCapabilities, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = deviceCapabilities.touch;
        }
        if ((i & 2) != 0) {
            bool2 = deviceCapabilities.hover;
        }
        return deviceCapabilities.copy(bool, bool2);
    }

    public static final /* synthetic */ void write$Self$Claude_mcpapp(DeviceCapabilities self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.touch != null) {
            output.B(serialDesc, 0, zt1.a, self.touch);
        }
        if (!output.E(serialDesc) && self.hover == null) {
            return;
        }
        output.B(serialDesc, 1, zt1.a, self.hover);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getTouch() {
        return this.touch;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getHover() {
        return this.hover;
    }

    public final DeviceCapabilities copy(Boolean touch, Boolean hover) {
        return new DeviceCapabilities(touch, hover);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceCapabilities)) {
            return false;
        }
        DeviceCapabilities deviceCapabilities = (DeviceCapabilities) other;
        return x44.r(this.touch, deviceCapabilities.touch) && x44.r(this.hover, deviceCapabilities.hover);
    }

    public final Boolean getHover() {
        return this.hover;
    }

    public final Boolean getTouch() {
        return this.touch;
    }

    public int hashCode() {
        Boolean bool = this.touch;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.hover;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "DeviceCapabilities(touch=" + this.touch + ", hover=" + this.hover + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceCapabilities() {
        this((Boolean) null, (Boolean) (0 == true ? 1 : 0), 3, (mq5) (0 == true ? 1 : 0));
    }

    public DeviceCapabilities(Boolean bool, Boolean bool2) {
        this.touch = bool;
        this.hover = bool2;
    }

    public /* synthetic */ DeviceCapabilities(Boolean bool, Boolean bool2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
    }
}
