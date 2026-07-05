package com.anthropic.claude.app.appstart;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.y52;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 +*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002,-B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJG\u0010\u0017\u001a\u00020\u0014\"\n\b\u0001\u0010\u0001*\u0004\u0018\u00010\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ*\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001b¨\u0006."}, d2 = {"Lcom/anthropic/claude/app/appstart/CachedData;", "T", "", "response", "", "cachedAtMillis", "<init>", "(Ljava/lang/Object;J)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Object;JLvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "Liei;", "write$Self$app_start", "(Lcom/anthropic/claude/app/appstart/CachedData;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/KSerializer;)V", "write$Self", "component1", "()Ljava/lang/Object;", "component2", "()J", "copy", "(Ljava/lang/Object;J)Lcom/anthropic/claude/app/appstart/CachedData;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getResponse", "J", "getCachedAtMillis", "Companion", "x52", "y52", "app-start"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CachedData<T> {
    private static final SerialDescriptor $cachedDescriptor;
    public static final y52 Companion = new y52();
    private final long cachedAtMillis;
    private final T response;

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.app.appstart.CachedData", null, 2);
        pluginGeneratedSerialDescriptor.j("response", false);
        pluginGeneratedSerialDescriptor.j("cachedAtMillis", false);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ CachedData(int i, Object obj, long j, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, $cachedDescriptor);
            throw null;
        }
        this.response = obj;
        this.cachedAtMillis = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CachedData copy$default(CachedData cachedData, Object obj, long j, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = cachedData.response;
        }
        if ((i & 2) != 0) {
            j = cachedData.cachedAtMillis;
        }
        return cachedData.copy(obj, j);
    }

    public static final /* synthetic */ void write$Self$app_start(CachedData self, vd4 output, SerialDescriptor serialDesc, KSerializer typeSerial0) {
        output.r(serialDesc, 0, typeSerial0, self.response);
        output.D(serialDesc, 1, self.cachedAtMillis);
    }

    public final T component1() {
        return this.response;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getCachedAtMillis() {
        return this.cachedAtMillis;
    }

    public final CachedData<T> copy(T response, long cachedAtMillis) {
        return new CachedData<>(response, cachedAtMillis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CachedData)) {
            return false;
        }
        CachedData cachedData = (CachedData) other;
        return x44.r(this.response, cachedData.response) && this.cachedAtMillis == cachedData.cachedAtMillis;
    }

    public final long getCachedAtMillis() {
        return this.cachedAtMillis;
    }

    public final T getResponse() {
        return this.response;
    }

    public int hashCode() {
        T t = this.response;
        return Long.hashCode(this.cachedAtMillis) + ((t == null ? 0 : t.hashCode()) * 31);
    }

    public String toString() {
        return "CachedData(response=" + this.response + ", cachedAtMillis=" + this.cachedAtMillis + ")";
    }

    public CachedData(T t, long j) {
        this.response = t;
        this.cachedAtMillis = j;
    }
}
