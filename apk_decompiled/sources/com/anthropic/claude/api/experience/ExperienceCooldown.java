package com.anthropic.claude.api.experience;

import defpackage.grc;
import defpackage.gvj;
import defpackage.mdj;
import defpackage.o97;
import defpackage.onf;
import defpackage.p97;
import defpackage.vnf;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\tJ'\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0014¨\u0006$"}, d2 = {"Lcom/anthropic/claude/api/experience/ExperienceCooldown;", "", "", "seconds", "<init>", "(I)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(IILvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/experience/ExperienceCooldown;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "copy", "(I)Lcom/anthropic/claude/api/experience/ExperienceCooldown;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getSeconds", "Companion", "o97", "p97", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ExperienceCooldown {
    public static final int $stable = 0;
    public static final p97 Companion = new p97();
    private final int seconds;

    public /* synthetic */ ExperienceCooldown(int i, int i2, vnf vnfVar) {
        if (1 == (i & 1)) {
            this.seconds = i2;
        } else {
            gvj.f(i, 1, o97.a.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ ExperienceCooldown copy$default(ExperienceCooldown experienceCooldown, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = experienceCooldown.seconds;
        }
        return experienceCooldown.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSeconds() {
        return this.seconds;
    }

    public final ExperienceCooldown copy(int seconds) {
        return new ExperienceCooldown(seconds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ExperienceCooldown) && this.seconds == ((ExperienceCooldown) other).seconds;
    }

    public final int getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        return Integer.hashCode(this.seconds);
    }

    public String toString() {
        return grc.u("ExperienceCooldown(seconds=", this.seconds, ")");
    }

    public ExperienceCooldown(int i) {
        this.seconds = i;
    }
}
