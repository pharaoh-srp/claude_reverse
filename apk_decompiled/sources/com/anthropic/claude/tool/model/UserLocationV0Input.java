package com.anthropic.claude.tool.model;

import defpackage.gvj;
import defpackage.ini;
import defpackage.jni;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vnf;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, d2 = {"Lcom/anthropic/claude/tool/model/UserLocationV0Input;", "", "Lcom/anthropic/claude/tool/model/UserLocationV0InputAccuracy;", "accuracy", "<init>", "(Lcom/anthropic/claude/tool/model/UserLocationV0InputAccuracy;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/tool/model/UserLocationV0InputAccuracy;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$Claude_tool_model", "(Lcom/anthropic/claude/tool/model/UserLocationV0Input;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/anthropic/claude/tool/model/UserLocationV0InputAccuracy;", "copy", "(Lcom/anthropic/claude/tool/model/UserLocationV0InputAccuracy;)Lcom/anthropic/claude/tool/model/UserLocationV0Input;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/anthropic/claude/tool/model/UserLocationV0InputAccuracy;", "getAccuracy", "Companion", "ini", "jni", "Claude.tool:model"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class UserLocationV0Input {
    public static final jni Companion = new jni();
    private final UserLocationV0InputAccuracy accuracy;

    public /* synthetic */ UserLocationV0Input(int i, UserLocationV0InputAccuracy userLocationV0InputAccuracy, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.accuracy = userLocationV0InputAccuracy;
        } else {
            gvj.f(i, 1, ini.a.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ UserLocationV0Input copy$default(UserLocationV0Input userLocationV0Input, UserLocationV0InputAccuracy userLocationV0InputAccuracy, int i, Object obj) {
        if ((i & 1) != 0) {
            userLocationV0InputAccuracy = userLocationV0Input.accuracy;
        }
        return userLocationV0Input.copy(userLocationV0InputAccuracy);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UserLocationV0InputAccuracy getAccuracy() {
        return this.accuracy;
    }

    public final UserLocationV0Input copy(UserLocationV0InputAccuracy accuracy) {
        accuracy.getClass();
        return new UserLocationV0Input(accuracy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UserLocationV0Input) && this.accuracy == ((UserLocationV0Input) other).accuracy;
    }

    public final UserLocationV0InputAccuracy getAccuracy() {
        return this.accuracy;
    }

    public int hashCode() {
        return this.accuracy.hashCode();
    }

    public String toString() {
        return "UserLocationV0Input(accuracy=" + this.accuracy + ")";
    }

    public UserLocationV0Input(UserLocationV0InputAccuracy userLocationV0InputAccuracy) {
        userLocationV0InputAccuracy.getClass();
        this.accuracy = userLocationV0InputAccuracy;
    }
}
