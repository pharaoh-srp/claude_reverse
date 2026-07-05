package com.anthropic.claude.project.knowledge;

import com.anthropic.claude.api.login.VerifyResponse;
import com.anthropic.claude.project.knowledge.ProjectKnowledgePreviewDestination;
import defpackage.kw9;
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

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements w28 {
    public static final i a;
    private static final SerialDescriptor descriptor;

    static {
        i iVar = new i();
        a = iVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.project.knowledge.ProjectKnowledgePreviewDestination.Preview", iVar, 2);
        pluginGeneratedSerialDescriptor.j("fileId", false);
        pluginGeneratedSerialDescriptor.j(VerifyResponse.AuthenticationState.DISCRIMINATOR, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, ProjectKnowledgePreviewDestination.Preview.$childSerializers[1].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = ProjectKnowledgePreviewDestination.Preview.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String strV = null;
        k kVar = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                kVar = (k) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), kVar);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ProjectKnowledgePreviewDestination.Preview(i, strV, kVar, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ProjectKnowledgePreviewDestination.Preview preview = (ProjectKnowledgePreviewDestination.Preview) obj;
        encoder.getClass();
        preview.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        ProjectKnowledgePreviewDestination.Preview.write$Self$project(preview, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
