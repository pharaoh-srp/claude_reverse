package com.anthropic.claude.api.login;

import com.anthropic.claude.api.login.VerifyResponse;
import defpackage.jce;
import defpackage.kce;
import defpackage.odf;
import defpackage.pl9;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class n {
    public static final /* synthetic */ n a = new n();

    public final KSerializer serializer() {
        kce kceVar = jce.a;
        return new odf("com.anthropic.claude.api.login.VerifyResponse.AuthenticationState", kceVar.b(VerifyResponse.AuthenticationState.class), new pl9[]{kceVar.b(VerifyResponse.AuthenticationState.Authenticated.class), kceVar.b(VerifyResponse.AuthenticationState.MagicLink.class)}, new KSerializer[]{l.a, o.a}, new Annotation[]{new g(VerifyResponse.AuthenticationState.DISCRIMINATOR)});
    }
}
