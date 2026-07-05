package com.anthropic.claude.tool.model;

import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.yh8;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0015¨\u0006$"}, d2 = {"Lcom/anthropic/claude/tool/model/HealthConnectDataTypesV0Input;", "", "", "search_text", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/HealthConnectDataTypesV0Input;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/anthropic/claude/tool/model/HealthConnectDataTypesV0Input;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSearch_text", "Companion", "xh8", "yh8", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class HealthConnectDataTypesV0Input {
    public static final yh8 Companion = new yh8();
    private final String search_text;

    public /* synthetic */ HealthConnectDataTypesV0Input(int i, String str, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.search_text = null;
        } else {
            this.search_text = str;
        }
    }

    public static /* synthetic */ HealthConnectDataTypesV0Input copy$default(HealthConnectDataTypesV0Input healthConnectDataTypesV0Input, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = healthConnectDataTypesV0Input.search_text;
        }
        return healthConnectDataTypesV0Input.copy(str);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(HealthConnectDataTypesV0Input self, vd4 output, SerialDescriptor serialDesc) {
        if (!output.E(serialDesc) && self.search_text == null) {
            return;
        }
        output.B(serialDesc, 0, srg.a, self.search_text);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSearch_text() {
        return this.search_text;
    }

    public final HealthConnectDataTypesV0Input copy(String search_text) {
        return new HealthConnectDataTypesV0Input(search_text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HealthConnectDataTypesV0Input) && x44.r(this.search_text, ((HealthConnectDataTypesV0Input) other).search_text);
    }

    public final String getSearch_text() {
        return this.search_text;
    }

    public int hashCode() {
        String str = this.search_text;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return ij0.j("HealthConnectDataTypesV0Input(search_text=", this.search_text, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HealthConnectDataTypesV0Input() {
        this((String) null, 1, (mq5) (0 == true ? 1 : 0));
    }

    public HealthConnectDataTypesV0Input(String str) {
        this.search_text = str;
    }

    public /* synthetic */ HealthConnectDataTypesV0Input(String str, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str);
    }
}
