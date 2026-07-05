package com.anthropic.claude.tool.model;

import defpackage.ay8;
import defpackage.by8;
import defpackage.e79;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0018¨\u0006)"}, d2 = {"Lcom/anthropic/claude/tool/model/ImageSearchInput;", "", "", "max_results", "", "query", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/ImageSearchInput;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/anthropic/claude/tool/model/ImageSearchInput;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getMax_results", "Ljava/lang/String;", "getQuery", "Companion", "ay8", "by8", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ImageSearchInput {
    public static final by8 Companion = new by8();
    private final Integer max_results;
    private final String query;

    public /* synthetic */ ImageSearchInput(int i, Integer num, String str, vnf vnfVar) {
        if (2 != (i & 2)) {
            gvj.f(i, 2, ay8.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.max_results = null;
        } else {
            this.max_results = num;
        }
        this.query = str;
    }

    public static /* synthetic */ ImageSearchInput copy$default(ImageSearchInput imageSearchInput, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = imageSearchInput.max_results;
        }
        if ((i & 2) != 0) {
            str = imageSearchInput.query;
        }
        return imageSearchInput.copy(num, str);
    }

    public static final /* synthetic */ void write$Self$Claude_tool_model(ImageSearchInput self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.max_results != null) {
            output.B(serialDesc, 0, e79.a, self.max_results);
        }
        output.q(serialDesc, 1, self.query);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getMax_results() {
        return this.max_results;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    public final ImageSearchInput copy(Integer max_results, String query) {
        query.getClass();
        return new ImageSearchInput(max_results, query);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageSearchInput)) {
            return false;
        }
        ImageSearchInput imageSearchInput = (ImageSearchInput) other;
        return x44.r(this.max_results, imageSearchInput.max_results) && x44.r(this.query, imageSearchInput.query);
    }

    public final Integer getMax_results() {
        return this.max_results;
    }

    public final String getQuery() {
        return this.query;
    }

    public int hashCode() {
        Integer num = this.max_results;
        return this.query.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public String toString() {
        return "ImageSearchInput(max_results=" + this.max_results + ", query=" + this.query + ")";
    }

    public ImageSearchInput(Integer num, String str) {
        str.getClass();
        this.max_results = num;
        this.query = str;
    }

    public /* synthetic */ ImageSearchInput(Integer num, String str, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : num, str);
    }
}
