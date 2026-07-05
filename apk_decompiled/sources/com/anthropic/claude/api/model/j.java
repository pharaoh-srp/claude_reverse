package com.anthropic.claude.api.model;

import defpackage.qg9;
import defpackage.x44;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements qg9 {
    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return qg9.class;
    }

    @Override // defpackage.qg9
    public final /* synthetic */ String discriminator() {
        return "type";
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return (obj instanceof qg9) && x44.r(discriminator(), ((qg9) obj).discriminator());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 705071198;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=type)";
    }
}
