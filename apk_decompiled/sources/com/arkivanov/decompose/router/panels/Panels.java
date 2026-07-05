package com.arkivanov.decompose.router.panels;

import defpackage.gvj;
import defpackage.lq6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pqc;
import defpackage.se3;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 5*\n\b\u0000\u0010\u0002 \u0001*\u00020\u0001*\n\b\u0001\u0010\u0003 \u0001*\u00020\u0001*\n\b\u0002\u0010\u0004 \u0001*\u00020\u00012\u00020\u0001:\u000267B1\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0001\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J\u0087\u0001\u0010\u001d\u001a\u00020\u001a\"\n\b\u0003\u0010\u0002*\u0004\u0018\u00010\u0001\"\n\b\u0004\u0010\u0003*\u0004\u0018\u00010\u0001\"\n\b\u0005\u0010\u0004*\u0004\u0018\u00010\u00012\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00030\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00040\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00050\u0016H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00018\u0001HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00018\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#JN\u0010$\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b1\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b2\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010#¨\u00068"}, d2 = {"Lcom/arkivanov/decompose/router/panels/Panels;", "", "MC", "DC", "EC", "main", "details", "extra", "Lse3;", "mode", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lse3;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lse3;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "typeSerial1", "typeSerial2", "Liei;", "write$Self$decompose_release", "(Lcom/arkivanov/decompose/router/panels/Panels;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "write$Self", "component1", "()Ljava/lang/Object;", "component2", "component3", "component4", "()Lse3;", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lse3;)Lcom/arkivanov/decompose/router/panels/Panels;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getMain", "getDetails", "getExtra", "Lse3;", "getMode", "Companion", "oqc", "pqc", "decompose_release"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
@onf
public final /* data */ class Panels<MC, DC, EC> {
    private static final SerialDescriptor $cachedDescriptor;
    private static final KSerializer[] $childSerializers;
    public static final pqc Companion = new pqc();
    private final DC details;
    private final EC extra;
    private final MC main;
    private final se3 mode;

    static {
        se3[] se3VarArrValues = se3.values();
        se3VarArrValues.getClass();
        $childSerializers = new KSerializer[]{null, null, null, new lq6("com.arkivanov.decompose.router.panels.ChildPanelsMode", (Enum[]) se3VarArrValues)};
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.arkivanov.decompose.router.panels.Panels", null, 4);
        pluginGeneratedSerialDescriptor.j("main", false);
        pluginGeneratedSerialDescriptor.j("details", true);
        pluginGeneratedSerialDescriptor.j("extra", true);
        pluginGeneratedSerialDescriptor.j("mode", true);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Panels(int i, Object obj, Object obj2, Object obj3, se3 se3Var, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, $cachedDescriptor);
            throw null;
        }
        this.main = obj;
        if ((i & 2) == 0) {
            this.details = null;
        } else {
            this.details = obj2;
        }
        if ((i & 4) == 0) {
            this.extra = null;
        } else {
            this.extra = obj3;
        }
        if ((i & 8) == 0) {
            this.mode = se3.E;
        } else {
            this.mode = se3Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Panels copy$default(Panels panels, Object obj, Object obj2, Object obj3, se3 se3Var, int i, Object obj4) {
        if ((i & 1) != 0) {
            obj = panels.main;
        }
        if ((i & 2) != 0) {
            obj2 = panels.details;
        }
        if ((i & 4) != 0) {
            obj3 = panels.extra;
        }
        if ((i & 8) != 0) {
            se3Var = panels.mode;
        }
        return panels.copy(obj, obj2, obj3, se3Var);
    }

    public static final /* synthetic */ void write$Self$decompose_release(Panels self, vd4 output, SerialDescriptor serialDesc, KSerializer typeSerial0, KSerializer typeSerial1, KSerializer typeSerial2) {
        KSerializer[] kSerializerArr = $childSerializers;
        output.r(serialDesc, 0, typeSerial0, self.main);
        if (output.E(serialDesc) || self.details != null) {
            output.B(serialDesc, 1, typeSerial1, self.details);
        }
        if (output.E(serialDesc) || self.extra != null) {
            output.B(serialDesc, 2, typeSerial2, self.extra);
        }
        if (!output.E(serialDesc) && self.mode == se3.E) {
            return;
        }
        output.r(serialDesc, 3, kSerializerArr[3], self.mode);
    }

    public final MC component1() {
        return this.main;
    }

    public final DC component2() {
        return this.details;
    }

    public final EC component3() {
        return this.extra;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final se3 getMode() {
        return this.mode;
    }

    public final Panels<MC, DC, EC> copy(MC main, DC details, EC extra, se3 mode) {
        main.getClass();
        mode.getClass();
        return new Panels<>(main, details, extra, mode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Panels)) {
            return false;
        }
        Panels panels = (Panels) other;
        return x44.r(this.main, panels.main) && x44.r(this.details, panels.details) && x44.r(this.extra, panels.extra) && this.mode == panels.mode;
    }

    public final DC getDetails() {
        return this.details;
    }

    public final EC getExtra() {
        return this.extra;
    }

    public final MC getMain() {
        return this.main;
    }

    public final se3 getMode() {
        return this.mode;
    }

    public int hashCode() {
        int iHashCode = this.main.hashCode() * 31;
        DC dc = this.details;
        int iHashCode2 = (iHashCode + (dc == null ? 0 : dc.hashCode())) * 31;
        EC ec = this.extra;
        return this.mode.hashCode() + ((iHashCode2 + (ec != null ? ec.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "Panels(main=" + this.main + ", details=" + this.details + ", extra=" + this.extra + ", mode=" + this.mode + ')';
    }

    public Panels(MC mc, DC dc, EC ec, se3 se3Var) {
        mc.getClass();
        se3Var.getClass();
        this.main = mc;
        this.details = dc;
        this.extra = ec;
        this.mode = se3Var;
    }

    public /* synthetic */ Panels(Object obj, Object obj2, Object obj3, se3 se3Var, int i, mq5 mq5Var) {
        this(obj, (i & 2) != 0 ? null : obj2, (i & 4) != 0 ? null : obj3, (i & 8) != 0 ? se3.E : se3Var);
    }
}
