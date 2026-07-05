package com.anthropic.claude.api.login;

import defpackage.ij0;
import defpackage.qg9;
import defpackage.x44;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements qg9 {
    public final /* synthetic */ String a;

    public g(String str) {
        this.a = str;
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return qg9.class;
    }

    @Override // defpackage.qg9
    public final /* synthetic */ String discriminator() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return (obj instanceof qg9) && x44.r(discriminator(), ((qg9) obj).discriminator());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return this.a.hashCode() ^ 707790692;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return ij0.j("@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=", this.a, ")");
    }
}
