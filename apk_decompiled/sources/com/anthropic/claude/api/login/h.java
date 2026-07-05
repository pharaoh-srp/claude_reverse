package com.anthropic.claude.api.login;

import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import defpackage.jce;
import defpackage.kce;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class h {
    public static final /* synthetic */ h a = new h();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.api.login.VerifyMagicLinkRequest.Credentials", kceVar.b(VerifyMagicLinkRequest.Credentials.class), new pl9[]{kceVar.b(VerifyMagicLinkRequest.Credentials.Code.class), kceVar.b(VerifyMagicLinkRequest.Credentials.Nonce.class)}, new KSerializer[]{e.a, i.a}, new Annotation[]{new g(VerifyMagicLinkRequest.Credentials.DISCRIMINATOR)});
    }
}
