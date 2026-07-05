package com.anthropic.claude.mcpapps.transport;

import defpackage.gvj;
import defpackage.mdj;
import defpackage.onf;
import defpackage.v2f;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w2f;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J8\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0017J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b)\u0010\u0017¨\u0006-"}, d2 = {"Lcom/anthropic/claude/mcpapps/transport/SafeAreaInsets;", "", "", "top", "right", "bottom", "left", "<init>", "(IIII)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IIIIILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_mcpapp", "(Lcom/anthropic/claude/mcpapps/transport/SafeAreaInsets;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "component3", "component4", "copy", "(IIII)Lcom/anthropic/claude/mcpapps/transport/SafeAreaInsets;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTop", "getRight", "getBottom", "getLeft", "Companion", "v2f", "w2f", "Claude:mcpapp"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class SafeAreaInsets {
    public static final int $stable = 0;
    public static final w2f Companion = new w2f();
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    public /* synthetic */ SafeAreaInsets(int i, int i2, int i3, int i4, int i5, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, v2f.a.getDescriptor());
            throw null;
        }
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
        this.left = i5;
    }

    public static /* synthetic */ SafeAreaInsets copy$default(SafeAreaInsets safeAreaInsets, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = safeAreaInsets.top;
        }
        if ((i5 & 2) != 0) {
            i2 = safeAreaInsets.right;
        }
        if ((i5 & 4) != 0) {
            i3 = safeAreaInsets.bottom;
        }
        if ((i5 & 8) != 0) {
            i4 = safeAreaInsets.left;
        }
        return safeAreaInsets.copy(i, i2, i3, i4);
    }

    public static final /* synthetic */ void write$Self$Claude_mcpapp(SafeAreaInsets self, vd4 output, SerialDescriptor serialDesc) {
        output.l(0, self.top, serialDesc);
        output.l(1, self.right, serialDesc);
        output.l(2, self.bottom, serialDesc);
        output.l(3, self.left, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    public final SafeAreaInsets copy(int top, int right, int bottom, int left) {
        return new SafeAreaInsets(top, right, bottom, left);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SafeAreaInsets)) {
            return false;
        }
        SafeAreaInsets safeAreaInsets = (SafeAreaInsets) other;
        return this.top == safeAreaInsets.top && this.right == safeAreaInsets.right && this.bottom == safeAreaInsets.bottom && this.left == safeAreaInsets.left;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getTop() {
        return this.top;
    }

    public int hashCode() {
        return Integer.hashCode(this.left) + vb7.c(this.bottom, vb7.c(this.right, Integer.hashCode(this.top) * 31, 31), 31);
    }

    public String toString() {
        int i = this.top;
        int i2 = this.right;
        int i3 = this.bottom;
        int i4 = this.left;
        StringBuilder sbV = vb7.v("SafeAreaInsets(top=", ", right=", i, i2, ", bottom=");
        sbV.append(i3);
        sbV.append(", left=");
        sbV.append(i4);
        sbV.append(")");
        return sbV.toString();
    }

    public SafeAreaInsets(int i, int i2, int i3, int i4) {
        this.top = i;
        this.right = i2;
        this.bottom = i3;
        this.left = i4;
    }
}
