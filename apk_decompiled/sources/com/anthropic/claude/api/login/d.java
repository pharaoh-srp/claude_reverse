package com.anthropic.claude.api.login;

import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import defpackage.d4c;
import defpackage.kw9;
import defpackage.qo3;
import defpackage.s06;
import defpackage.srg;
import defpackage.sz6;
import defpackage.ud4;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w28;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements w28 {
    public static final d a;
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        a = dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.login.VerifyMagicLinkRequest", dVar, 6);
        pluginGeneratedSerialDescriptor.j("credentials", false);
        pluginGeneratedSerialDescriptor.j("recaptcha_token", true);
        pluginGeneratedSerialDescriptor.j("recaptcha_site_key", true);
        pluginGeneratedSerialDescriptor.j("source", true);
        pluginGeneratedSerialDescriptor.j("play_integrity_token", false);
        pluginGeneratedSerialDescriptor.j("client_attestation", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{VerifyMagicLinkRequest.$childSerializers[0].getValue(), srgVar, srgVar, srgVar, d4c.S(srgVar), d4c.S(qo3.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = VerifyMagicLinkRequest.$childSerializers;
        boolean z = true;
        int i = 0;
        VerifyMagicLinkRequest.Credentials credentials = null;
        String strV = null;
        String strV2 = null;
        String strV3 = null;
        String str = null;
        ClientAttestation clientAttestation = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    credentials = (VerifyMagicLinkRequest.Credentials) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), credentials);
                    i |= 1;
                    break;
                case 1:
                    strV = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strV2 = ud4VarC.v(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strV3 = ud4VarC.v(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str);
                    i |= 16;
                    break;
                case 5:
                    clientAttestation = (ClientAttestation) ud4VarC.m(serialDescriptor, 5, qo3.a, clientAttestation);
                    i |= 32;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new VerifyMagicLinkRequest(i, credentials, strV, strV2, strV3, str, clientAttestation, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        VerifyMagicLinkRequest verifyMagicLinkRequest = (VerifyMagicLinkRequest) obj;
        encoder.getClass();
        verifyMagicLinkRequest.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        VerifyMagicLinkRequest.write$Self$api(verifyMagicLinkRequest, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
