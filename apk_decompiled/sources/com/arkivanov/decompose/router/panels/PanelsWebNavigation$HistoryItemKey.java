package com.arkivanov.decompose.router.panels;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.rqc;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 0*\n\b\u0006\u0010\u0002 \u0001*\u00020\u0001*\n\b\u0007\u0010\u0003 \u0001*\u00020\u0001*\n\b\b\u0010\u0004 \u0001*\u00020\u00012\u00020\u0001:\u000212B#\u0012\u0006\u0010\u0005\u001a\u00028\u0006\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0007\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\b¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0006\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0007\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ\u0087\u0001\u0010\u001c\u001a\u00020\u0019\"\n\b\t\u0010\u0002*\u0004\u0018\u00010\u0001\"\n\b\n\u0010\u0003*\u0004\u0018\u00010\u0001\"\n\b\u000b\u0010\u0004*\u0004\u0018\u00010\u00012\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n\u0012\u0004\u0012\u00028\u000b0\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\t0\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\n0\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u000b0\u0015H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00028\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00018\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00018\bHÆ\u0003¢\u0006\u0004\b \u0010\u001eJD\u0010!\u001a\u0014\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b0\u000f2\b\b\u0002\u0010\u0005\u001a\u00028\u00062\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u00072\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0005\u001a\u00028\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00078\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00018\b8\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b/\u0010\u001e¨\u00063"}, d2 = {"com/arkivanov/decompose/router/panels/PanelsWebNavigation$HistoryItemKey", "", "MC", "DC", "EC", "main", "details", "extra", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lvnf;)V", "Lcom/arkivanov/decompose/router/panels/PanelsWebNavigation$HistoryItemKey;", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "typeSerial1", "typeSerial2", "Liei;", "write$Self$decompose_release", "(Lcom/arkivanov/decompose/router/panels/PanelsWebNavigation$HistoryItemKey;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "write$Self", "component1", "()Ljava/lang/Object;", "component2", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/arkivanov/decompose/router/panels/PanelsWebNavigation$HistoryItemKey;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getMain", "getDetails", "getExtra", "Companion", "qqc", "rqc", "decompose_release"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
@onf
public final /* data */ class PanelsWebNavigation$HistoryItemKey<MC, DC, EC> {
    private static final SerialDescriptor $cachedDescriptor;
    public static final rqc Companion = new rqc();
    private final DC details;
    private final EC extra;
    private final MC main;

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.arkivanov.decompose.router.panels.PanelsWebNavigation.HistoryItemKey", null, 3);
        pluginGeneratedSerialDescriptor.j("main", false);
        pluginGeneratedSerialDescriptor.j("details", false);
        pluginGeneratedSerialDescriptor.j("extra", false);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ PanelsWebNavigation$HistoryItemKey(int i, Object obj, Object obj2, Object obj3, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, $cachedDescriptor);
            throw null;
        }
        this.main = obj;
        this.details = obj2;
        this.extra = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PanelsWebNavigation$HistoryItemKey copy$default(PanelsWebNavigation$HistoryItemKey panelsWebNavigation$HistoryItemKey, Object obj, Object obj2, Object obj3, int i, Object obj4) {
        if ((i & 1) != 0) {
            obj = panelsWebNavigation$HistoryItemKey.main;
        }
        if ((i & 2) != 0) {
            obj2 = panelsWebNavigation$HistoryItemKey.details;
        }
        if ((i & 4) != 0) {
            obj3 = panelsWebNavigation$HistoryItemKey.extra;
        }
        return panelsWebNavigation$HistoryItemKey.copy(obj, obj2, obj3);
    }

    public static final /* synthetic */ void write$Self$decompose_release(PanelsWebNavigation$HistoryItemKey self, vd4 output, SerialDescriptor serialDesc, KSerializer typeSerial0, KSerializer typeSerial1, KSerializer typeSerial2) {
        output.r(serialDesc, 0, typeSerial0, self.main);
        output.B(serialDesc, 1, typeSerial1, self.details);
        output.B(serialDesc, 2, typeSerial2, self.extra);
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

    public final PanelsWebNavigation$HistoryItemKey<MC, DC, EC> copy(MC main, DC details, EC extra) {
        main.getClass();
        return new PanelsWebNavigation$HistoryItemKey<>(main, details, extra);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PanelsWebNavigation$HistoryItemKey)) {
            return false;
        }
        PanelsWebNavigation$HistoryItemKey panelsWebNavigation$HistoryItemKey = (PanelsWebNavigation$HistoryItemKey) other;
        return x44.r(this.main, panelsWebNavigation$HistoryItemKey.main) && x44.r(this.details, panelsWebNavigation$HistoryItemKey.details) && x44.r(this.extra, panelsWebNavigation$HistoryItemKey.extra);
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

    public int hashCode() {
        int iHashCode = this.main.hashCode() * 31;
        DC dc = this.details;
        int iHashCode2 = (iHashCode + (dc == null ? 0 : dc.hashCode())) * 31;
        EC ec = this.extra;
        return iHashCode2 + (ec != null ? ec.hashCode() : 0);
    }

    public String toString() {
        return "HistoryItemKey(main=" + this.main + ", details=" + this.details + ", extra=" + this.extra + ')';
    }

    public PanelsWebNavigation$HistoryItemKey(MC mc, DC dc, EC ec) {
        mc.getClass();
        this.main = mc;
        this.details = dc;
        this.extra = ec;
    }
}
