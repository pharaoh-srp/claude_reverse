package com.segment.analytics.kotlin.core;

import com.anthropic.claude.api.experience.ExperienceToggle;
import defpackage.ebh;
import defpackage.f7a;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.lz5;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBc\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÇ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\\\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0019J\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010\u001cJ\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0019R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001c\"\u0004\b-\u0010.R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001eR%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b1\u0010\u001e¨\u00064"}, d2 = {"Lcom/segment/analytics/kotlin/core/RemoteMetric;", "", "", "type", "metric", "", ExperienceToggle.DEFAULT_PARAM_KEY, "", "tags", "log", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/util/Map;)V", "seen1", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/util/Map;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self", "(Lcom/segment/analytics/kotlin/core/RemoteMetric;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "()Ljava/util/Map;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/util/Map;)Lcom/segment/analytics/kotlin/core/RemoteMetric;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getMetric", "I", "getValue", "setValue", "(I)V", "Ljava/util/Map;", "getTags", "getLog", "Companion", "$serializer", "core"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
@onf
public final /* data */ class RemoteMetric {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final Map<String, String> log;
    private final String metric;
    private final Map<String, String> tags;
    private final String type;
    private int value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/segment/analytics/kotlin/core/RemoteMetric$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/segment/analytics/kotlin/core/RemoteMetric;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
    public static final class Companion {
        public final KSerializer serializer() {
            return RemoteMetric$$serializer.INSTANCE;
        }
    }

    @lz5
    public /* synthetic */ RemoteMetric(int i, String str, String str2, int i2, Map map, Map map2, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, RemoteMetric$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = str;
        this.metric = str2;
        this.value = i2;
        this.tags = map;
        if ((i & 16) == 0) {
            this.log = null;
        } else {
            this.log = map2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RemoteMetric copy$default(RemoteMetric remoteMetric, String str, String str2, int i, Map map, Map map2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = remoteMetric.type;
        }
        if ((i2 & 2) != 0) {
            str2 = remoteMetric.metric;
        }
        if ((i2 & 4) != 0) {
            i = remoteMetric.value;
        }
        if ((i2 & 8) != 0) {
            map = remoteMetric.tags;
        }
        if ((i2 & 16) != 0) {
            map2 = remoteMetric.log;
        }
        Map map3 = map2;
        int i3 = i;
        return remoteMetric.copy(str, str2, i3, map, map3);
    }

    public static final void write$Self(RemoteMetric self, vd4 output, SerialDescriptor serialDesc) {
        self.getClass();
        output.getClass();
        serialDesc.getClass();
        output.q(serialDesc, 0, self.type);
        output.q(serialDesc, 1, self.metric);
        output.l(2, self.value, serialDesc);
        srg srgVar = srg.a;
        output.r(serialDesc, 3, new f7a(srgVar, srgVar), self.tags);
        if (!output.E(serialDesc) && self.log == null) {
            return;
        }
        output.B(serialDesc, 4, new f7a(srgVar, srgVar), self.log);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMetric() {
        return this.metric;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    public final Map<String, String> component4() {
        return this.tags;
    }

    public final Map<String, String> component5() {
        return this.log;
    }

    public final RemoteMetric copy(String type, String metric, int value, Map<String, String> tags, Map<String, String> log) {
        type.getClass();
        metric.getClass();
        tags.getClass();
        return new RemoteMetric(type, metric, value, tags, log);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteMetric)) {
            return false;
        }
        RemoteMetric remoteMetric = (RemoteMetric) other;
        return x44.r(this.type, remoteMetric.type) && x44.r(this.metric, remoteMetric.metric) && this.value == remoteMetric.value && x44.r(this.tags, remoteMetric.tags) && x44.r(this.log, remoteMetric.log);
    }

    public final Map<String, String> getLog() {
        return this.log;
    }

    public final String getMetric() {
        return this.metric;
    }

    public final Map<String, String> getTags() {
        return this.tags;
    }

    public final String getType() {
        return this.type;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        int iG = ebh.g(vb7.c(this.value, kgh.l(this.type.hashCode() * 31, 31, this.metric), 31), 31, this.tags);
        Map<String, String> map = this.log;
        return iG + (map == null ? 0 : map.hashCode());
    }

    public final void setValue(int i) {
        this.value = i;
    }

    public String toString() {
        return "RemoteMetric(type=" + this.type + ", metric=" + this.metric + ", value=" + this.value + ", tags=" + this.tags + ", log=" + this.log + ')';
    }

    public RemoteMetric(String str, String str2, int i, Map<String, String> map, Map<String, String> map2) {
        str.getClass();
        str2.getClass();
        map.getClass();
        this.type = str;
        this.metric = str2;
        this.value = i;
        this.tags = map;
        this.log = map2;
    }

    public /* synthetic */ RemoteMetric(String str, String str2, int i, Map map, Map map2, int i2, mq5 mq5Var) {
        this(str, str2, i, map, (i2 & 16) != 0 ? null : map2);
    }
}
