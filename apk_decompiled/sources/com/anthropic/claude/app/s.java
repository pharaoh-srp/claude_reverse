package com.anthropic.claude.app;

import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.claude.project.details.ProjectDetailsScreenParams;
import defpackage.mld;
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

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements w28 {
    public static final s a;
    private static final SerialDescriptor descriptor;

    static {
        s sVar = new s();
        a = sVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.app.ClaudeAppDestination.List.ProjectDetails", sVar, 1);
        pluginGeneratedSerialDescriptor.j("params", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{mld.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        ProjectDetailsScreenParams projectDetailsScreenParams = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                projectDetailsScreenParams = (ProjectDetailsScreenParams) ud4VarC.l(serialDescriptor, 0, mld.a, projectDetailsScreenParams);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new ClaudeAppDestination.List.ProjectDetails(i, projectDetailsScreenParams, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        ClaudeAppDestination.List.ProjectDetails projectDetails = (ClaudeAppDestination.List.ProjectDetails) obj;
        encoder.getClass();
        projectDetails.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, mld.a, projectDetails.params);
        vd4VarC.b(serialDescriptor);
    }
}
