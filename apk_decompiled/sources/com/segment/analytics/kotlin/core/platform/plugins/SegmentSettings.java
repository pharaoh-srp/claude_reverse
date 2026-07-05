package com.segment.analytics.kotlin.core.platform.plugins;

import defpackage.gvj;
import defpackage.lz5;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J&\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010#R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010 \u001a\u0004\b$\u0010\u0015\"\u0004\b%\u0010#¨\u0006("}, d2 = {"Lcom/segment/analytics/kotlin/core/platform/plugins/SegmentSettings;", "", "", "apiKey", "apiHost", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self", "(Lcom/segment/analytics/kotlin/core/platform/plugins/SegmentSettings;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/segment/analytics/kotlin/core/platform/plugins/SegmentSettings;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getApiKey", "setApiKey", "(Ljava/lang/String;)V", "getApiHost", "setApiHost", "Companion", "$serializer", "core"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
@onf
public final /* data */ class SegmentSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private String apiHost;
    private String apiKey;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/segment/analytics/kotlin/core/platform/plugins/SegmentSettings$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/segment/analytics/kotlin/core/platform/plugins/SegmentSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final class Companion {
        public final KSerializer serializer() {
            return SegmentSettings$$serializer.INSTANCE;
        }
    }

    @lz5
    public /* synthetic */ SegmentSettings(int i, String str, String str2, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, SegmentSettings$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.apiKey = str;
        if ((i & 2) == 0) {
            this.apiHost = null;
        } else {
            this.apiHost = str2;
        }
    }

    public static /* synthetic */ SegmentSettings copy$default(SegmentSettings segmentSettings, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = segmentSettings.apiKey;
        }
        if ((i & 2) != 0) {
            str2 = segmentSettings.apiHost;
        }
        return segmentSettings.copy(str, str2);
    }

    public static final void write$Self(SegmentSettings self, vd4 output, SerialDescriptor serialDesc) {
        self.getClass();
        output.getClass();
        serialDesc.getClass();
        output.q(serialDesc, 0, self.apiKey);
        if (!output.E(serialDesc) && self.apiHost == null) {
            return;
        }
        output.B(serialDesc, 1, srg.a, self.apiHost);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getApiHost() {
        return this.apiHost;
    }

    public final SegmentSettings copy(String apiKey, String apiHost) {
        apiKey.getClass();
        return new SegmentSettings(apiKey, apiHost);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentSettings)) {
            return false;
        }
        SegmentSettings segmentSettings = (SegmentSettings) other;
        return x44.r(this.apiKey, segmentSettings.apiKey) && x44.r(this.apiHost, segmentSettings.apiHost);
    }

    public final String getApiHost() {
        return this.apiHost;
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public int hashCode() {
        int iHashCode = this.apiKey.hashCode() * 31;
        String str = this.apiHost;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setApiHost(String str) {
        this.apiHost = str;
    }

    public final void setApiKey(String str) {
        str.getClass();
        this.apiKey = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SegmentSettings(apiKey=");
        sb.append(this.apiKey);
        sb.append(", apiHost=");
        return vb7.s(sb, this.apiHost, ')');
    }

    public SegmentSettings(String str, String str2) {
        str.getClass();
        this.apiKey = str;
        this.apiHost = str2;
    }

    public /* synthetic */ SegmentSettings(String str, String str2, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
