package com.anthropic.claude.sessions.types;

import defpackage.qg9;
import defpackage.x44;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d0 implements qg9 {
    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return qg9.class;
    }

    @Override // defpackage.qg9
    public final /* synthetic */ String discriminator() {
        return "environment_type";
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return (obj instanceof qg9) && x44.r(discriminator(), ((qg9) obj).discriminator());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 198930050;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=environment_type)";
    }
}
