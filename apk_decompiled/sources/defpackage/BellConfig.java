package defpackage;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000278BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBU\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010!JV\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b1\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b2\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b5\u0010!¨\u00069"}, d2 = {"LBellConfig;", "", "", "enabled", "show_tooltip", "server_interrupt_enabled", "auto_send_enabled", "", "ptt_background_stop_delay_ms", "hold_park_grace_ms", "<init>", "(ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(IZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(LBellConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/lang/Boolean;", "component3", "component4", "component5", "()Ljava/lang/Long;", "component6", "copy", "(ZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;)LBellConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEnabled", "Ljava/lang/Boolean;", "getShow_tooltip", "getServer_interrupt_enabled", "getAuto_send_enabled", "Ljava/lang/Long;", "getPtt_background_stop_delay_ms", "getHold_park_grace_ms", "Companion", "qi1", "ri1", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class BellConfig {
    public static final int $stable = 0;
    public static final ri1 Companion = new ri1();
    private final Boolean auto_send_enabled;
    private final boolean enabled;
    private final Long hold_park_grace_ms;
    private final Long ptt_background_stop_delay_ms;
    private final Boolean server_interrupt_enabled;
    private final Boolean show_tooltip;

    public /* synthetic */ BellConfig(int i, boolean z, Boolean bool, Boolean bool2, Boolean bool3, Long l, Long l2, vnf vnfVar) {
        this.enabled = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.show_tooltip = Boolean.FALSE;
        } else {
            this.show_tooltip = bool;
        }
        if ((i & 4) == 0) {
            this.server_interrupt_enabled = Boolean.FALSE;
        } else {
            this.server_interrupt_enabled = bool2;
        }
        if ((i & 8) == 0) {
            this.auto_send_enabled = Boolean.FALSE;
        } else {
            this.auto_send_enabled = bool3;
        }
        if ((i & 16) == 0) {
            this.ptt_background_stop_delay_ms = null;
        } else {
            this.ptt_background_stop_delay_ms = l;
        }
        if ((i & 32) == 0) {
            this.hold_park_grace_ms = null;
        } else {
            this.hold_park_grace_ms = l2;
        }
    }

    public static /* synthetic */ BellConfig copy$default(BellConfig bellConfig, boolean z, Boolean bool, Boolean bool2, Boolean bool3, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bellConfig.enabled;
        }
        if ((i & 2) != 0) {
            bool = bellConfig.show_tooltip;
        }
        if ((i & 4) != 0) {
            bool2 = bellConfig.server_interrupt_enabled;
        }
        if ((i & 8) != 0) {
            bool3 = bellConfig.auto_send_enabled;
        }
        if ((i & 16) != 0) {
            l = bellConfig.ptt_background_stop_delay_ms;
        }
        if ((i & 32) != 0) {
            l2 = bellConfig.hold_park_grace_ms;
        }
        Long l3 = l;
        Long l4 = l2;
        return bellConfig.copy(z, bool, bool2, bool3, l3, l4);
    }

    public static final /* synthetic */ void write$Self$models(BellConfig self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.enabled) {
            output.p(serialDesc, 0, self.enabled);
        }
        if (output.E(serialDesc) || !x44.r(self.show_tooltip, Boolean.FALSE)) {
            output.B(serialDesc, 1, zt1.a, self.show_tooltip);
        }
        if (output.E(serialDesc) || !x44.r(self.server_interrupt_enabled, Boolean.FALSE)) {
            output.B(serialDesc, 2, zt1.a, self.server_interrupt_enabled);
        }
        if (output.E(serialDesc) || !x44.r(self.auto_send_enabled, Boolean.FALSE)) {
            output.B(serialDesc, 3, zt1.a, self.auto_send_enabled);
        }
        if (output.E(serialDesc) || self.ptt_background_stop_delay_ms != null) {
            output.B(serialDesc, 4, xka.a, self.ptt_background_stop_delay_ms);
        }
        if (!output.E(serialDesc) && self.hold_park_grace_ms == null) {
            return;
        }
        output.B(serialDesc, 5, xka.a, self.hold_park_grace_ms);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getShow_tooltip() {
        return this.show_tooltip;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getServer_interrupt_enabled() {
        return this.server_interrupt_enabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getAuto_send_enabled() {
        return this.auto_send_enabled;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getPtt_background_stop_delay_ms() {
        return this.ptt_background_stop_delay_ms;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getHold_park_grace_ms() {
        return this.hold_park_grace_ms;
    }

    public final BellConfig copy(boolean enabled, Boolean show_tooltip, Boolean server_interrupt_enabled, Boolean auto_send_enabled, Long ptt_background_stop_delay_ms, Long hold_park_grace_ms) {
        return new BellConfig(enabled, show_tooltip, server_interrupt_enabled, auto_send_enabled, ptt_background_stop_delay_ms, hold_park_grace_ms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BellConfig)) {
            return false;
        }
        BellConfig bellConfig = (BellConfig) other;
        return this.enabled == bellConfig.enabled && x44.r(this.show_tooltip, bellConfig.show_tooltip) && x44.r(this.server_interrupt_enabled, bellConfig.server_interrupt_enabled) && x44.r(this.auto_send_enabled, bellConfig.auto_send_enabled) && x44.r(this.ptt_background_stop_delay_ms, bellConfig.ptt_background_stop_delay_ms) && x44.r(this.hold_park_grace_ms, bellConfig.hold_park_grace_ms);
    }

    public final Boolean getAuto_send_enabled() {
        return this.auto_send_enabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Long getHold_park_grace_ms() {
        return this.hold_park_grace_ms;
    }

    public final Long getPtt_background_stop_delay_ms() {
        return this.ptt_background_stop_delay_ms;
    }

    public final Boolean getServer_interrupt_enabled() {
        return this.server_interrupt_enabled;
    }

    public final Boolean getShow_tooltip() {
        return this.show_tooltip;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.enabled) * 31;
        Boolean bool = this.show_tooltip;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.server_interrupt_enabled;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.auto_send_enabled;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l = this.ptt_background_stop_delay_ms;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.hold_park_grace_ms;
        return iHashCode5 + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.enabled;
        Boolean bool = this.show_tooltip;
        Boolean bool2 = this.server_interrupt_enabled;
        Boolean bool3 = this.auto_send_enabled;
        Long l = this.ptt_background_stop_delay_ms;
        Long l2 = this.hold_park_grace_ms;
        StringBuilder sb = new StringBuilder("BellConfig(enabled=");
        sb.append(z);
        sb.append(", show_tooltip=");
        sb.append(bool);
        sb.append(", server_interrupt_enabled=");
        ebh.C(sb, bool2, ", auto_send_enabled=", bool3, ", ptt_background_stop_delay_ms=");
        sb.append(l);
        sb.append(", hold_park_grace_ms=");
        sb.append(l2);
        sb.append(")");
        return sb.toString();
    }

    public BellConfig() {
        this(false, (Boolean) null, (Boolean) null, (Boolean) null, (Long) null, (Long) null, 63, (mq5) null);
    }

    public BellConfig(boolean z, Boolean bool, Boolean bool2, Boolean bool3, Long l, Long l2) {
        this.enabled = z;
        this.show_tooltip = bool;
        this.server_interrupt_enabled = bool2;
        this.auto_send_enabled = bool3;
        this.ptt_background_stop_delay_ms = l;
        this.hold_park_grace_ms = l2;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ BellConfig(boolean r2, java.lang.Boolean r3, java.lang.Boolean r4, java.lang.Boolean r5, java.lang.Long r6, java.lang.Long r7, int r8, defpackage.mq5 r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L5
            r2 = 0
        L5:
            r9 = r8 & 2
            if (r9 == 0) goto Lb
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
        Lb:
            r9 = r8 & 4
            if (r9 == 0) goto L11
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
        L11:
            r9 = r8 & 8
            if (r9 == 0) goto L17
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
        L17:
            r9 = r8 & 16
            r0 = 0
            if (r9 == 0) goto L1d
            r6 = r0
        L1d:
            r8 = r8 & 32
            if (r8 == 0) goto L29
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L30
        L29:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L30:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.BellConfig.<init>(boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Long, java.lang.Long, int, mq5):void");
    }
}
