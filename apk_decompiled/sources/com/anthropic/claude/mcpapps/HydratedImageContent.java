package com.anthropic.claude.mcpapps;

import defpackage.bt8;
import defpackage.grc;
import defpackage.gvj;
import defpackage.ij0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0083\b\u0018\u0000 )2\u00020\u0001:\u0002*+B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J.\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b(\u0010\u0017¨\u0006,"}, d2 = {"Lcom/anthropic/claude/mcpapps/HydratedImageContent;", "", "", "type", "mimeType", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_mcpapp", "(Lcom/anthropic/claude/mcpapps/HydratedImageContent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/mcpapps/HydratedImageContent;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "getType$annotations", "()V", "getMimeType", "getData", "Companion", "com/anthropic/claude/mcpapps/a", "bt8", "Claude:mcpapp"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
final /* data */ class HydratedImageContent {
    public static final bt8 Companion = new bt8();
    private final String data;
    private final String mimeType;
    private final String type;

    public /* synthetic */ HydratedImageContent(int i, String str, String str2, String str3, vnf vnfVar) {
        if (6 != (i & 6)) {
            gvj.f(i, 6, a.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.type = "image";
        } else {
            this.type = str;
        }
        this.mimeType = str2;
        this.data = str3;
    }

    public static /* synthetic */ HydratedImageContent copy$default(HydratedImageContent hydratedImageContent, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hydratedImageContent.type;
        }
        if ((i & 2) != 0) {
            str2 = hydratedImageContent.mimeType;
        }
        if ((i & 4) != 0) {
            str3 = hydratedImageContent.data;
        }
        return hydratedImageContent.copy(str, str2, str3);
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static final /* synthetic */ void write$Self$Claude_mcpapp(HydratedImageContent self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || !x44.r(self.type, "image")) {
            output.q(serialDesc, 0, self.type);
        }
        output.q(serialDesc, 1, self.mimeType);
        output.q(serialDesc, 2, self.data);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getData() {
        return this.data;
    }

    public final HydratedImageContent copy(String type, String mimeType, String data) {
        type.getClass();
        mimeType.getClass();
        data.getClass();
        return new HydratedImageContent(type, mimeType, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HydratedImageContent)) {
            return false;
        }
        HydratedImageContent hydratedImageContent = (HydratedImageContent) other;
        return x44.r(this.type, hydratedImageContent.type) && x44.r(this.mimeType, hydratedImageContent.mimeType) && x44.r(this.data, hydratedImageContent.data);
    }

    public final String getData() {
        return this.data;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.data.hashCode() + kgh.l(this.type.hashCode() * 31, 31, this.mimeType);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.mimeType;
        return ij0.m(kgh.r("HydratedImageContent(type=", str, ", mimeType=", str2, ", data="), this.data, ")");
    }

    public HydratedImageContent(String str, String str2, String str3) {
        grc.B(str, str2, str3);
        this.type = str;
        this.mimeType = str2;
        this.data = str3;
    }

    public /* synthetic */ HydratedImageContent(String str, String str2, String str3, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? "image" : str, str2, str3);
    }
}
