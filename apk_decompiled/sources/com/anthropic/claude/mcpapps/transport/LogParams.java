package com.anthropic.claude.mcpapps.transport;

import defpackage.eh9;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.qfa;
import defpackage.rfa;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0019¨\u0006*"}, d2 = {"Lcom/anthropic/claude/mcpapps/transport/LogParams;", "", "", "level", "Lkotlinx/serialization/json/JsonElement;", "data", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonElement;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_mcpapp", "(Lcom/anthropic/claude/mcpapps/transport/LogParams;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lkotlinx/serialization/json/JsonElement;", "copy", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Lcom/anthropic/claude/mcpapps/transport/LogParams;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLevel", "Lkotlinx/serialization/json/JsonElement;", "getData", "Companion", "qfa", "rfa", "Claude:mcpapp"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class LogParams {
    public static final int $stable = 8;
    public static final rfa Companion = new rfa();
    private final JsonElement data;
    private final String level;

    public /* synthetic */ LogParams(int i, String str, JsonElement jsonElement, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, qfa.a.getDescriptor());
            throw null;
        }
        this.level = str;
        this.data = jsonElement;
    }

    public static /* synthetic */ LogParams copy$default(LogParams logParams, String str, JsonElement jsonElement, int i, Object obj) {
        if ((i & 1) != 0) {
            str = logParams.level;
        }
        if ((i & 2) != 0) {
            jsonElement = logParams.data;
        }
        return logParams.copy(str, jsonElement);
    }

    public static final /* synthetic */ void write$Self$Claude_mcpapp(LogParams self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.level);
        output.r(serialDesc, 1, eh9.a, self.data);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final JsonElement getData() {
        return this.data;
    }

    public final LogParams copy(String level, JsonElement data) {
        level.getClass();
        data.getClass();
        return new LogParams(level, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogParams)) {
            return false;
        }
        LogParams logParams = (LogParams) other;
        return x44.r(this.level, logParams.level) && x44.r(this.data, logParams.data);
    }

    public final JsonElement getData() {
        return this.data;
    }

    public final String getLevel() {
        return this.level;
    }

    public int hashCode() {
        return this.data.hashCode() + (this.level.hashCode() * 31);
    }

    public String toString() {
        return "LogParams(level=" + this.level + ", data=" + this.data + ")";
    }

    public LogParams(String str, JsonElement jsonElement) {
        str.getClass();
        jsonElement.getClass();
        this.level = str;
        this.data = jsonElement;
    }
}
